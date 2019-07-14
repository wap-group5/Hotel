<%--
  Created by IntelliJ IDEA.
  User: james
  Updated: sovicheacheth
  Date: 7/13/19
  Time: 4:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hotel Management System</title>
    <link href="resources/css/styles.css" rel="stylesheet"/>
    <script src="resources/js/scripts.js" type="text/javascript"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <link href="resources/images/favicon.ico" rel="icon" type="image/x-icon"/>
</head>
<body>
<div id="header">
    <div class="navbar">
        <a class="active" href="#">Hotel Management System</a>
        <a href="login.jsp" class="login">Login</a>

    </div>
</div>
<div id="container">
    <div class="column left">
        <img src="resources/images/feature-image-01.png" alt="Hotel Feature Image"/>
    </div>
    <div class="column right">
<%--        <button id="btnBooking" href="guestDetails.jsp" text="Book Now">Book Now</button>--%>
        <a href="guestDetails.jsp" class="guest">Book Now</a>
    </div>
</div>
<div id="roomRate">
    <div class="roomInfo">
        <img src="resources/images/one-bed-room.png" alt="One Bed Room"/>
        <p class="roomFeature">
            <strong>Standard Room, 1 Queen Bed</strong><br/>
            Free Wi-Fi<br/>
            Free Breakfast<br/>
            Free Parking
        </p>
        <p class="roomPrice">
            $110/night
        </p>
    </div>

    <div class="roomInfo">
        <img src="resources/images/two-bed-room.png" alt="Two Bed Room"/>
        <p>
            <strong>Standard Room, 2 Queen Beds</strong><br/>
            Free Wi-Fi<br/>
            Free Breakfast<br/>
            Free Parking
        </p>
        <p class="roomPrice">
            $175/night
        </p>
    </div>
</div>
<div id="footer">
    <p>Copy Right &copy; 2019 Group 5 <br/>Hotel Management System</p>
</div>
</body>
</html>
