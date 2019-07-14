package com.group5.controller;


import com.group5.dao.GuestDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GuestController extends HttpServlet {
    //    we have a static constant here
    private static final long serialVersionUID = 1L;
    // this is the declaring the productDao type dao
    private GuestDao dao;
    // I don't know about this
//    Gson mapper = new Gson();
    //initialize are the first method to be called durting the first
//    request came to berowseer ]    we are instanciate the ProductDAO object;
    @Override
    public void init() throws ServletException {
        dao = new GuestDao();
    }
// the service method doGet will accept the HttpServletRequest and HttpServlet Response
    /**
     * @param request  the request from the client
     * @param response the response send to back to client
     * @throws ServletException
     * @throws IOException
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {



    }

    /**
     * @param request the response
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = (String)request.getAttribute("firstName");
        PrintWriter out = response.getWriter();
        out.println("welcome"+name);


    }
}

