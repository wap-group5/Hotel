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
        String rate = 
        Guest guest = guestDao.getGuestById(Integer.parseInt(guestId));
         String in= guest.getCheckInTime();
//         String out=guestid.getCheckOutTime();
//         String [] x=in.split("-");
//         String [] y= out.split("-");
//        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);

        LocalDate today = LocalDate.now();
//        LocalDate birthday = LocalDate.of(y[0], y[1], y[2]);
//        SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy");
//        LocalDate date = formatter.parse(in);
//        System.out.println(date);
//        System.out.println(formatter.format(date));
//        Period p = Period.between(in, out);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");



        //convert String to LocalDate
        LocalDate localDate = LocalDate.parse(in, formatter);

        dao.removeGuest(guest);


//        PrintWriter out = response.getWriter();
//
//        out.print(mapper.toJson(product));
        response.sendRedirect("welcome.jsp");
    }

}
