<%--
  Created by IntelliJ IDEA.
  User: james
  Date: 7/13/19
  Time: 6:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <link href="https://fonts.googleapis.com/css?family=Poppins" rel="stylesheet" />
  <link href="resources/css/checkin.css" rel="stylesheet" />
  <link href="resources/css/modal.css" rel="stylesheet">
  <script src="resources/js/modal.js"></script>
</head>
<body>
<div class="s01">
  <form>
    <fieldset>
      <legend>Checkin Guest</legend>
    </fieldset>
    <div class="inner-form">
      <div class="input-field first-wrap">
        <input id="firstName" type="text" placeholder="First Name" />
      </div>
      <div class="input-field second-wrap">
        <input id="lastName" type="text" placeholder="Last Name" />
      </div>
      <div class="input-field third-wrap">
        <button  id="search" class="btn-search" type="button">Search</button>
      </div>
    </div>
  </form>
</div>
<!-- The Modal -->
<div id="myModal" class="modal">

  <!-- Modal content -->
  <div class="modal-content">
    <div class="modal-header">
      <span class="close">&times;</span>
      <h2>Checkin Guest</h2>
    </div>
    <div class="modal-body">
      <p>Guest: John Doe</p>
      <p>Single Room</p>
      <form>
       Select Room :
        <select>
          <option>Room 11</option>
          <option>Room 12</option>
          <option>Room 110</option>
          <option>Room 122</option>
          <option>Room 200</option>
        </select>
        <br>
<%--        <input type="submit" value="Assign Room">--%>
      </form>
    </div>
    <div class="modal-footer">
<%--      <h3></h3>--%>
      <button  id="assign" type="button">Assign Room</button>
    </div>
  </div>

</div>
</body>
</html>

