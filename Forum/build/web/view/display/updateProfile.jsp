<%-- 
    Document   : updateProfile.jsp
    Created on : Nov 7, 2021, 4:51:40 PM
    Author     : ADMIN
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <link href="../css/bootstrap.css" rel="stylesheet" type="text/css">
        <link href="../css/style.css" rel="stylesheet" type="text/css">
        <link href="../css/font-awesome.min.css" rel="stylesheet" type="text/css">
    </head>

    <body>
        <div class="top-menu-bottom932">
            <nav class="navbar navbar-default">
                <div class="container">
                    <!-- Brand and toggle get grouped for better mobile display -->
                    <div class="navbar-header">
                        <h1 style="height: max-content; color: #fd6372; font-family: Brush Script MT;">Pallas Forum</h1>
                    </div>
                    <!-- Collect the nav links, forms, and other content for toggling -->
                    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                        <ul class="nav navbar-nav"> </ul>
                        <ul class="nav navbar-nav navbar-right">
                            <li><a href="../questions/list">Home</a></li>
                            <li><a href="../questions/ask">Ask Question</a></li>
                            <li><a href="../searchByCategory">Search</a></li>
                            <li><a href="profile">Profile</a></li>
                            <li><a href="../logout">Login/Logout</a></li>
                        </ul>
                    </div>
                    <!-- nav bar-collapse -->
                </div>
                <!-- /.container-fluid -->
            </nav>
        </div>


        <section class="header-descriptin329">

            <section class="main-content920">
                <div class="container">
                    <div class="row center">

                        <div class="ask-question-input-part032">


                            <form action="updateProfile" method="POST">
                                <input type="hidden" name="username" value="${requestScope.account.username}">
                                <div class="question-title39">
                                    <span class="form-description432">First name</span>
                                    <input type="text" name="firstname" value="${requestScope.account.firstname}" class="question-ttile32">
                                </div>

                                <div class="question-title39">
                                    <span class="form-description432">Last name</span>
                                    <input type="text" name="lastname" value="${requestScope.account.lastname}" class="question-ttile32" >
                                </div>

                                <div class="question-title39">
                                    <span class="form-description433">Gender</span>
                                    <input type="radio" name="gender" ${(requestScope.account.gender) ? "checked=\"checked\"" : ""}  value="male"> Male
                                    <input type="radio" name="gender" ${(!requestScope.account.gender) ? "checked=\"checked\"" : ""} value="female" > Female
                                </div>

                                <div class="question-title39">
                                    <span class="form-description432">Date of birth </span> 
                                    <input type="date" name="dob" value="${requestScope.account.dob}" class="question-ttile32" > 

                                </div>

                                <div class="question-title39">
                                    <span class="form-description432">Email</span>
                                    <input type="text" name="email" value="${requestScope.account.email}" class="question-ttile32">
                                </div>

                                <input type="submit" class="publis1291" value="Update your profile" />
                            </form>


                        </div>

                    </div>
                </div>
            </section>
            <br />

            <section class="footer-part">
                <div class="container">
                    <div class="row">

                        <div class="col-md-3">
                            <div class="info-part-one320">
                                <h4>Contact :</h4>
                                <p>Author : Thanh Lam Tran</p>
                                <p>Facebook: https://www.facebook.com/lamkan01/ </p>
                                <p>Email: lamtthe150351@fpt.edu.vn</p>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
            <script src="js/jquery-3.1.1.min.js"></script>
            <script src="js/bootstrap.min.js"></script>
            <script src="js/npm.js"></script>
    </body>

</html>
