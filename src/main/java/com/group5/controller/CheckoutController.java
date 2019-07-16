package com.group5.controller;

import com.google.gson.Gson;
import com.group5.dao.GuestDao;
import com.group5.model.BillingInfo;
import com.group5.model.CheckinReturnModel;
import com.group5.model.Guest;
import com.group5.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;


@WebServlet("/checkout")
public class CheckoutController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private GuestDao guestDao;
    Gson mapper = new Gson();


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        request.setAttribute("products", dao.getAllProducts());
        RequestDispatcher view = request.getRequestDispatcher("login");
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String jsonSting = request.getParameter("billingInfo");
        BillingInfo billingInfo = mapper.fromJson(request.getParameter("billingInfo"), BillingInfo.class);
        String guestId = billingInfo.getId();
        GuestDao guestDao = (GuestDao) request.getSession().getAttribute("guestDAO");
        Guest guest = guestDao.getGuestById(Integer.parseInt(guestId));
        CheckinReturnModel checkinReturnModel = new CheckinReturnModel();
        PrintWriter out = response.getWriter();
        if(guest.isCheckedin()) {
            guestDao.removeGuest(guest);
            request.getSession().setAttribute("guestDAO", guestDao);
            checkinReturnModel.setSuccess(true);
            checkinReturnModel.setMessage("Guest successfully checked out");
        }else{
            checkinReturnModel.setSuccess(false);
            checkinReturnModel.setMessage("This guest is not checked in!");
        }
        out.print(mapper.toJson(checkinReturnModel));
    }

}
