package com.group5.controller;

import com.group5.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

public class LoginController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        String remember = request.getParameter("remember");

        if ("admin".equals(userName) && "password".equals(password)) {
            User user = new User(userName, password);
            HttpSession session = request.getSession();
            session.setAttribute("username", userName);
            if (remember != null) {
                Cookie cookie = new Cookie("username", userName);
                cookie.setMaxAge(60 * 60 * 24 * 30);
                response.addCookie(cookie);
            } else {
                Cookie cookie = new Cookie("username", null);
                cookie.setMaxAge(0);
                response.addCookie(cookie);
            }
            request.getRequestDispatcher("/welcome.jsp").forward(request, response);
            return;
        } else {
            String errorMessage = "Invalid username or password! Please try again";
            request.getSession().setAttribute("msg", errorMessage);
            response.sendRedirect("login");

            return;
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");

        dispatcher.forward(request, response);
    }
}
