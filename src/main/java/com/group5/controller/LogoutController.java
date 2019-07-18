package com.group5.controller;

import com.google.gson.Gson;
import com.group5.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/logout")
public class LogoutController extends HttpServlet {

    Gson mapper = new Gson();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        User user = mapper.fromJson(req.getParameter("username"), User.class);
        PrintWriter out = resp.getWriter();

        if(session != null) {
            session.invalidate();
        }

//        session.invalidate();
        req.getSession().setAttribute("msg", "You have been logged out successfully!");
        RequestDispatcher dispatcher = req.getRequestDispatcher("login");
        dispatcher.forward(req, resp);

        out.print(mapper.toJson(user));


    }
}
