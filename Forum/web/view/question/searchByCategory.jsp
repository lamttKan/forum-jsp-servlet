<%-- 
    Document   : searchByCategory
    Created on : Nov 6, 2021, 5:52:07 PM
    Author     : ADMIN
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css">
        <link href="css/style.css" rel="stylesheet" type="text/css">
        <link href="css/editor.css" rel="stylesheet" type="text/css">
        <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css">
    </head>
    <link href="css/responsive.css" rel="stylesheet" type="text/css">
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
                            <li><a href="questions/list">Home</a></li>
                            <li><a href="questions/ask">Ask Question</a></li>
                            <li><a href="searchByCategory">Search</a></li>
                            <li><a href="user/profile">Profile</a></li>
                            <li><a href="logout">Login/Logout</a></li>
                        </ul>
                    </div>
                    <!-- nav bar-collapse -->
                </div>
                <!-- /.container-fluid -->
            </nav>
        </div>

    <section class="header-descriptin329">
        <div class="container">
            <h3>Search</h3>
            <ol class="breadcrumb breadcrumb839">
                <li><a href="searchByCategory">Search By Category</a></li>
                <li><a href="searchUser">Search User</a></li>
                <li><a href="questions/search">Advanced Search</a></li>
            </ol>

        </div>
    </section>

    <section class="main-content920 ">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="ask-question-input-part032">
                        <h4>Search By Category</h4>
                        <hr>
                        <form action="searchByCategory" method="POST">
                            <div class="categori49">
                                <span class="form-description43305">Category </span>
                                <select name="category_id" class="question-ttile32">
                                    <c:forEach items="${requestScope.categories}" var="c">
                                        <option 
                                            <c:if test="${c.id eq requestScope.categoryID}">
                                                selected="selected"
                                            </c:if>
                                            value="${c.id}">${c.title}</option>
                                    </c:forEach>
                                </select>
                            </div>
                            <input type="submit" class="publis1291" value="Search">
                        </form>
                                    <hr>
                        <c:forEach items="${requestScope.posts}" var="p">
                            <div class="question-type2033">
                                <div class="row">
                                    <div class="col-md-11">
                                        <div class="right-description893">
                                            <div id="que-hedder2983">
                                                <h3><a href="detail?id=${p.id}" target="_blank">${p.title}</a></h3>
                                            </div>
                                            <hr>
                                            <div class="ques-icon-info3293"> 
                                                <a href="../user/profile?username=${p.username}"><i class="fa fa-user" aria-hidden="true"> ${p.username}</i></a> 
                                                <i class="fa fa-clock-o" aria-hidden="true">${p.time_created}</i>
                                                <i class="fa fa-tag" aria-hidden="true">${p.category.title}</i>
                                                <i class="fa fa-comment" aria-hidden="true"> 5 answer</i>
                                                <!--                                            <i class="fa fa-user-circle-o" aria-hidden="true"> 70 view</i> -->
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
                        <h4>Support :</h4>
                        <p>Support Telephone No : (+2)01111011110</p>
                        <p>Support Email Account : </p>
                        <p>info@example.com</p>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="js/jquery-3.1.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/editor.js"></script>
    <script>
        $(document).ready(function () {
            $("#txtEditor").Editor();
        });
    </script>

</body>

</html>
