package com.group5.controller;

import com.group5.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/login")
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
                Cookie name = new Cookie("username", userName);
                Cookie rem = new Cookie("remember", remember);
                //Set cookie age for 1 month
                name.setMaxAge(60 * 60 * 24 * 30);
                rem.setMaxAge(60 * 60 * 24 * 30);
                response.addCookie(name);
                response.addCookie(rem);
            } else {
                //Clear cookie
                Cookie name = new Cookie("username", null);
                Cookie rem = new Cookie("remember", null);
                name.setMaxAge(0);
                rem.setMaxAge(0);
                response.addCookie(name);
                response.addCookie(rem);
            }

            //Clear error message if the user success
            String errorMessage = "";
            request.getSession().setAttribute("msg", errorMessage);

            //forward to welcome or checkin page
            request.getRequestDispatcher("/welcome.jsp").forward(request, response);

        } else {
            String errorMessage = "Invalid username or password!";
            request.getSession().setAttribute("msg", errorMessage);
            response.sendRedirect("login");

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");

        dispatcher.forward(request, response);
    }
}
