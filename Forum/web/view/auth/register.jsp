<%-- 
    Document   : register.jsp
    Created on : Oct 21, 2021, 5:00:08 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html >
    <head>
        <meta charset="UTF-8">
        <link href="https://fonts.googleapis.com/css?family=Roboto:300,400" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
        <link rel="stylesheet" href="css/loginstyle.css">
        <title>Register</title>

    </head>

    <body>

        <div class="modal-wrap">

            <div class="modal-bodies">
                <div class="modal-body modal-body-step-1 is-showing">
                    <div class="title">Sign Up</div>
                    <div class="description">Hello there, Register Form</div>
                    <form action="register" method="POST">
                        <input type="text" placeholder="Username" name="username"/>
                        <input type="text" placeholder="Display name" name="displayname"/>
                        <input type="password" placeholder="Password" name="password"/>
                        <div class="text-center">
                            <input class="button" type="submit" value="Sign up" />

                        </div>
                    </form>
                </div>


            </div>
        </div>
        <script src='https://code.jquery.com/jquery-2.2.4.min.js'></script>



    </body>
</html>

