package com.group5.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginController extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        if(user.equals("admin") && pass.equals("password")) {
            HttpSession session = request.getSession();
            session.setAttribute("username", user);

            //If the user login successful, send to the check in page
            response.sendRedirect("checkin.jsp");

        } else {
            response.sendRedirect("login.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
