<%-- 
    Document   : searchUser
    Created on : Nov 6, 2021, 6:40:48 PM
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
                    <div class="ask-question-input-part032 row">
                        <h4>Search User</h4>
                        <hr>
                        <form action="searchUser" method="POST">
                            <div class="question-title39">
                                <span class="form-description433">Search name </span><input type="text" name="searchname"
                                     class="question-ttile32" value="${requestScope.searchname}" placeholder="Search by username or full name">
                            </div>
                            <input type="submit" class="publis1291" value="Search">
                        </form>
                                    <hr>
                        <table border="1px solid black" class="col-md-12">
                            <tr>
                                <td>Username</td>
                                <td>Full name</td>
                                <td>Gender</td>
                                <td>Email</td>
                                <td>Action</td>
                            </tr>
                            <c:forEach items="${requestScope.accounts}" var="a">
                                <tr>
                                <td>${a.username}</td>
                                <td>${a.firstname}  ${a.lastname}</td>
                                <td>${a.gender?"Male":"Female"}</td>
                                <td>${a.email}</td>
                                <td><a href="profile?username=${a.username}">View profile</a></td>
                            </tr>
                            </c:forEach>
                        </table>           


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

