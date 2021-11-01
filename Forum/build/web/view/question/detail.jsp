<%-- 
    Document   : detail.jsp
    Created on : Oct 31, 2021, 2:50:07 PM
    Author     : ADMIN
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <link href="../css/bootstrap.css" rel="stylesheet" type="text/css">
        <link href="../css/style.css" rel="stylesheet" type="text/css">
        <!-- <link href="css/animate.css" rel="stylesheet" type="text/css"> -->
        <link href="../css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link href="../css/responsive.css" rel="stylesheet" type="text/css">
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
                            <li><a href="list">Home</a></li>
                            <li><a href="ask">Ask Question</a></li>
                            <li class="dropdown"> <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                                                     aria-haspopup="true" aria-expanded="false">Search<span class="caret"></span></a>
                                <ul class="dropdown-menu animated zoomIn">
                                    <li><a href="category.html">Category</a></li>
                                    <li><a href="category.html">Tag</a></li>
                                    <li><a href="category.html">User</a></li>
                                    <li><a href="category.html">Advanced Search</a></li>
                                </ul>
                            </li>

                            <li><a href="../user/profile">Profile</a></li>
                            <li class="dropdown"> <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                                                     aria-haspopup="true" aria-expanded="false">Account <span class="caret"></span></a>
                                <ul class="dropdown-menu animated zoomIn">
                                    <li><a href="login">Login</a></li>
                                    <li><a href=""> Change your profile</a></li>
                                    <li><a href="#">Logout </a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                    <!-- navbar-collapse -->
                </div>
                <!-- /.container-fluid -->
            </nav>
        </div>

        <section class="main-content920">
            <div class="container">
                <div class="row">
                    <div>
                        <div class="post-details">
                            <div class="details-header923">
                                <div class="row">
                                    <div class="col-md-8">
                                        <div class="post-title-left129">
                                            <h3>${requestScope.post.title}</h3> </div>
                                    </div>
                                    <div class="col-md-4">
                                        <div class="post-que-rep-rihght320"> <a href="#"><i class="fa fa-question-circle" aria-hidden="true"></i> Question</a> <a href="#" class="r-clor10">Report</a> </div>
                                    </div>
                                </div>
                            </div>
                            <div class="post-details-info1982">
                                <p>${requestScope.post.content}</p>
                                <c:set var = "link" value = "${requestScope.post.attachment}"/>

                                <c:choose>
                                    <c:when test = "${fn:endsWith(link, '.jpg')}">
                                        <img width = 800 height="500" src="${pageContext.request.contextPath}/${requestScope.post.attachment}">
                                    </c:when>

                                    <c:when test = "${fn:endsWith(link, '.mp4')}">
                                        <video width="1000" height="500" controls>
                                            <source src="${pageContext.request.contextPath}/${requestScope.post.attachment}" type="video/mp4">
                                        </video>
                                    </c:when>

                                    <c:otherwise>
                                        
                                    </c:otherwise>
                                </c:choose>
                                <hr>
                                <div class="post-footer29032">
                                    <!-- <div class="l-rightside39">
                                        <button type="button" class="tolltip-button thumbs-up2" data-toggle="tooltip" data-placement="bottom" title="Like"><i class="fa fa-thumbs-o-up " aria-hidden="true"></i></button>
                                        <button type="button" class="tolltip-button  thumbs-down2" data-toggle="tooltip" data-placement="bottom" title="Dislike"><i class="fa fa-thumbs-o-down" aria-hidden="true"></i></button> <span class="single-question-vote-result">+22</span> </div>
                                </div> -->
                                    <a href="#"><i class="fa fa-user" aria-hidden="true"> ${requestScope.username}</i></a> 
                                    <a href="#"><i class="fa fa-clock-o" aria-hidden="true">${requestScope.post.time_created}</i></a>
                                    <a href="#"><i class="fa fa-tag" aria-hidden="true">${requestScope.category.title}</i></a>
                                    <a href="#"><i class="fa fa-comment" aria-hidden="true"> 5 answer</i></a>
                                    <a href="#"><i class="fa fa-user-circle-o" aria-hidden="true"> 70 view</i> </a>
                                </div>
                            </div>
                            <br>

                            <div class="comment-list12993">
                                <h3>Comments</h3>
                                <div class="container">
                                    <div class="row">

                                        <div class="comments-container">
                                            <ul id="comments-list" class="comments-list">
                                                <li>
                                                    <div class="comment-main-level">
                                                        <div class="comment-box">
                                                            <div class="comment-head">
                                                                <h6 class="comment-name"><a href="#">Lorena Rojero</a></h6> <span><i class="fa fa-clock-o" aria-hidden="true"> January 15 , 2014 at 10:00 pm</i></span> <i class="fa fa-reply"></i> <i class="fa fa-heart"></i> </div>
                                                            <div class="comment-content"> Lorem ipsum dolor sit amet, consectetur adipisicing elit. Velit omnis animi et iure laudantium vitae, praesentium optio, sapiente distinctio illo? </div>
                                                        </div>
                                                    </div>
                                                </li>
                                            </ul>

                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="comment289-box">
                                <h3>Your Reply</h3>
                                <hr>
                                <div class="row">
                                    <div class="col-md-12">
                                        <div class="post9320-box">
                                            <input type="text" class="comment-input219882" placeholder="Enter Your Post"> </div>
                                        <button type="button" class="pos393-submit">Post Your Answer</button>
                                    </div>

                                </div>
                            </div>
                        </div>
                        <!--                end of col-md-9 -->
                        <!--           strart col-md-3 (side bar)-->

                    </div>
                </div>
        </section>
        <!--    footer -->

        <br/>

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
