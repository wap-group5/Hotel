package com.group5.controller;


import com.group5.dao.GuestDao;
import com.group5.model.Guest;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;


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
        // personal details



    }

    /**
     * @param request the response
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstName =  request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String emailAddress= request.getParameter("emailAddress");
        String socialSecurity = request.getParameter("socialSecurity");
        String dateOfBirth = request.getParameter("dateOfBirth");
        String phoneNumber= request.getParameter("phoneNumber");
        String addressLineOne = request.getParameter("addressLineOne");
        String addressLineTwo = request.getParameter("addressLineTwo");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String zipCode = request.getParameter("zipCode");
        String country = request.getParameter("country");
        // booking duration
        String checkInTime= request.getParameter("checkInTime");
        String checkOutTime =request.getParameter("checkOutTime");
        String typeOfBedRoom =request.getParameter("typeOfBedRoom");
        String moreInfoTextArea =request.getParameter("moreInfoTextArea");
        // payment Info
        String paymentType=request.getParameter("ok");
        String cardNumber =request.getParameter("cardNumber");
        String expireDate =request.getParameter("expireDate");
        String sCode =request.getParameter("sCode");
        String paymentAgreement=request.getParameter("paymentAgreement");


        // create object
   Guest guest = new Guest( firstName,lastName, emailAddress,
            socialSecurity, dateOfBirth,  phoneNumber,  addressLineOne,
           addressLineTwo,  city, state, zipCode,  country,
            checkInTime,  checkOutTime,  typeOfBedRoom, moreInfoTextArea,
           paymentType,  cardNumber,  expireDate,  sCode,
            paymentAgreement);
   // adding object guest
            dao.addGuest(guest);
//        HttpSession session = request.getSession();
//
//        session.setAttribute("myGuest",dao.getAllGuest());
//
//        HttpSession my = request.getSession();
//        List<Guest> listOfGuests = (List<Guest>)my.getAttribute("myGuest");
//        PrintWriter out = response.getWriter();
//        out.print("<html><head><title>Test</title></head><body>");
//        out.print("<p> guest</p>");
//        listOfGuests.stream().forEach(p->out.println(p.toString()));
//        out.println("["+my.getAttribute("myGuest").toString()+"]");
//        out.print("</body></html>");
////
//             RequestDispatcher rd = request.getRequestDispatcher("servlet2");
////        rd.forward(request,response);













    }

}

