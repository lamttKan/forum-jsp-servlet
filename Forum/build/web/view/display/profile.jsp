<%-- 
    Document   : profile
    Created on : Oct 28, 2021, 3:15:23 PM
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
                            <li class="dropdown"> <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                                                     aria-haspopup="true" aria-expanded="false">Search<span class="caret"></span></a>
                                <ul class="dropdown-menu animated zoomIn">
                                    <li><a href="category.html">Category</a></li>
                                    <li><a href="category.html">Tag</a></li>
                                    <li><a href="category.html">User</a></li>
                                    <li><a href="category.html">Advanced Search</a></li>
                                </ul>
                            </li>

                            <li><a href="profile">Profile</a></li>
                            <li class="dropdown"> <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                                                     aria-haspopup="true" aria-expanded="false">Account <span class="caret"></span></a>
                                <ul class="dropdown-menu animated zoomIn">
                                    <li><a href="logIn.html">Login</a></li>
                                    <li><a href=""> Change your profile</a></li>
                                    <li><a href="#">Logout </a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                    <!-- /.navbar-collapse -->
                </div>
                <!-- /.container-fluid -->
            </nav>
        </div>


        <section class="header-descriptin329">

            <section class="main-content920">
                <div class="container">
                    <div class="row">
                        <div class="col-md-4">
                            <div class="ask-question-input-part032">
                                <h4>Profile</h4>
                                <hr>
                                <div class="username-part940">
                                    <span class="form-description43">Full name: ${requestScope.user.firstname}  ${requestScope.user.lastname}</span>
                                </div> <br>
                                <div class="username-part940">
                                    <span class="form-description43">Gender: ${requestScope.user.gender?"Male":"Female"}</span>
                                </div> <br>
                                <div class="username-part940">
                                    <span class="form-description43">Date of birth: ${requestScope.user.dob}</span>
                                </div> <br>
                                <div class="username-part940">
                                    <span class="form-description43">Email: ${requestScope.user.email}</span>
                                </div> <br>
                                <br>
                            </div>


                        </div>
                        <!--                end of col-md-9 -->
                        </aside>
                        <div class="col-md-8">
                            <div class="ask-question-input-part032">
                                <h4>Posts</h4>
                                <hr>
                                <c:forEach items="${requestScope.posts}" var="p">
                                    <div class="question-type2033">
                                        <div class="row">
                                            <div class="col-md-11">
                                                <div class="right-description893">
                                                    <div id="que-hedder2983">
                                                        <h3><a href="" target="_blank">${p.title}</a></h3>
                                                    </div>
                                                    <hr>
                                                    <div class="ques-icon-info3293"> 
                                                        <a href="#"><i class="fa fa-user" aria-hidden="true"> ${p.username}</i></a> 
                                                        <a href="#"><i class="fa fa-clock-o" aria-hidden="true">${p.time_created}</i></a>
                                                        <a href="#"><i class="fa fa-comment" aria-hidden="true"> 5 answer</i></a>
                                                        <a href="#"><i class="fa fa-user-circle-o" aria-hidden="true"> 70 view</i> </a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>                   
                                </c:forEach> 
                            </div>


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
