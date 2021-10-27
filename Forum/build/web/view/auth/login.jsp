<%-- 
    Document   : login
    Created on : Sep 29, 2021, 4:45:30 PM
    Author     : Trung
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html >
<head>
  <meta charset="UTF-8">
  <link href="https://fonts.googleapis.com/css?family=Roboto:300,400" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
   <link rel="stylesheet" href="css/loginstyle.css">
   <title>Login</title>
</head>

<body>
  
<div class="modal-wrap">

  <div class="modal-bodies">
    <div class="modal-body modal-body-step-1 is-showing">
      <div class="title">Log In</div>
      <div class="description">Hello there, Log In</div>
      <form action="login" method="POST">
        <input type="text" placeholder="Username" name="user"/>
        <input type="password" placeholder="Password" name="pass"/>
        <div class="text-center">
            <input class="button" type="submit" value="Login" />
            <a href="register"><div class="button">Create an account</div></a>
        </div>
      </form>
    </div>

 
  </div>
</div>
  <script src='https://code.jquery.com/jquery-2.2.4.min.js'></script>

    

</body>
</html>

