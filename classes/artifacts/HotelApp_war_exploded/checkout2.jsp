<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 7/15/2019
  Time: 12:13 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

    <link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

    <title>Checkout Form</title>
    <script type="text/javascript"
            src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="resources/js/checkout.js"></script>
</head>
<body>
<%--<div>--%>

<%--    <label for="FirstName">Name</label> <c:out value="${guest.firstName}"  />--%>
<%--    <label for="LastName">Bill</label> <c:out value="${guest.room.rate}"/>--%>
<%--    <label for="GuestId"></label><span id="guest_id"><c:out value="${guest.id}" /></span>--%>
<%--</div>--%>
<%--<div>--%>
<%--    <input id="btn_add" type="submit" value="Submit" />--%>
<%--</div>--%>


<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
<div class="container">
    <h1>Checkout Form</h1>
    <table id="cart" class="table table-hover table-condensed">
        <thead>
        <tr>
            <th style="width:50%">Guest</th>
            <th style="width:10%">Rate</th>
            <th style="width:8%">Day/Night</th>
            <th style="width:22%" class="text-center">Subtotal</th>
            <th style="width:10%"></th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td data-th="Product">
                <div class="row">
                    <div class="col-sm-2 hidden-xs"><img src="resources/images/guest-checkout.png" alt="..." class="img-responsive"/></div>
                    <div class="col-sm-10">
                        <h4 class="nomargin">
                            <c:out value="${guest.firstName}"/> <c:out value="${guest.lastName}"/>
                        </h4>

                    </div>
                </div>
            </td>
            <td data-th="Price">$50.00</td>
            <td data-th="Bed">
                <input type="number" class="form-control text-center" value="1" id="duration">
            </td>
            <td data-th="Subtotal" class="text-center" id="subTotal"><c:out value="${guest.room.rate}"/></td>
            <td class="actions" data-th="">
                <button class="btn btn-info btn-sm" id="refreshTotal"><i class="fa fa-refresh"></i></button>
                <button class="btn btn-danger btn-sm"><i class="fa fa-trash-o"></i></button>
            </td>
        </tr>
        </tbody>
        <tfoot>
        <tr class="visible-xs">
            <td class="text-center"><strong>Total 1.99</strong></td>
        </tr>
        <tr>
            <td></td>
            <td colspan="2" class="hidden-xs"></td>
            <td class="hidden-xs text-center"><strong id="totalPrice">Total <c:out value="${guest.room.rate}"/></strong></td>
            <td><a href="#">
                <input type="hidden" id="guest_id" value="${guest.id}"/>
                <input class="btn btn-success btn-block" id="btn_add" type="submit" value="Checkout" /> </a></td>

        </tr>
        </tfoot>
    </table>
</div>

</body>
</html>


