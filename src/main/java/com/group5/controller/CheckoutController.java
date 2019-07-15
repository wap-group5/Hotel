package com.group5.controller;

import com.google.gson.Gson;
import com.group5.dao.GuestDao;
import com.group5.model.BillingInfo;
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


@WebServlet("/CheckoutController")
public class CheckoutController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private GuestDao guestDao;
    private GuestDao dao;
    Gson mapper = new Gson();

    @Override
    public void init() throws ServletException {
        dao = new GuestDao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        request.setAttribute("products", dao.getAllProducts());
        RequestDispatcher view = request.getRequestDispatcher("login.jsp");
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String jsonSting = request.getParameter("billingInfo");
        BillingInfo billingInfo = mapper.fromJson(request.getParameter("billingInfo"), BillingInfo.class);
        String guestId = billingInfo.getId();
        Guest guest = guestDao.getGuestById(Integer.parseInt(guestId));
        float rate = guest.getRoom().getRate();
         String in= guest.getCheckInTime();

        LocalDate today = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        //convert String to LocalDate
        LocalDate localDate = LocalDate.parse(in, formatter);
//        Period p = Period.between(localDate, today);
        long intervalDays = ChronoUnit.DAYS.between(localDate, today);
float totalBill= rate*intervalDays;
request.getSession().setAttribute("totalBill",totalBill);
        dao.removeGuest(guest);


//        PrintWriter out = response.getWriter();
//
//        out.print(mapper.toJson(product));
        response.sendRedirect("welcome.jsp");
    }

}
