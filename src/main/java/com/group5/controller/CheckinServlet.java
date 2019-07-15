package com.group5.controller;

import com.group5.dao.GuestDao;
import com.group5.model.Guest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

@WebServlet(name = "CheckinServlet")
public class CheckinServlet extends HttpServlet {
    private GuestDao guestDao;

    @Override
    public void init() throws ServletException {
        guestDao = new GuestDao();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String guestId = request.getParameter("id");
        Guest guest = guestDao.getGuestById(Integer.parseInt(guestId));
        guest.setCheckInTime(LocalDateTime.now().toString());
        response.sendRedirect("welcome.jsp");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
