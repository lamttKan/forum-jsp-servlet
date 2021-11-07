<%-- 
    Document   : update.jsp
    Created on : Nov 5, 2021, 10:05:29 PM
    Author     : ADMIN
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <link href="../css/bootstrap.css" rel="stylesheet" type="text/css">
        <link href="../css/style.css" rel="stylesheet" type="text/css">
        <link href="../css/editor.css" rel="stylesheet" type="text/css">
        <link href="../css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link href="../css/responsive.css" rel="stylesheet" type="text/css">
    </head>

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
                            <li><a href="../searchByCategory">Search</a></li>
                            <li><a href="../user/profile">Profile</a></li>
                            <li><a href="../logout">Login/Logout</a></li>
                        </ul>
                    </div>
                    <!-- nav bar-collapse -->
                </div>
                <!-- /.container-fluid -->
            </nav>
        </div>

    <section class="main-content920 ">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="ask-question-input-part032">
                        <h4>Question</h4>
                        <hr>

                        <form action="update" method="POST" >
                            <input type="hidden" name="id" value="${requestScope.post.id}" /> <br/>
                            <div class="question-title39">
                                <span class="form-description433">Question-Title</span>
                                <input type="text" name="title" value="${requestScope.post.title}"
                                       class="question-ttile32" placeholder="Write Your Question Title">
                            </div>

                            <div class="question-title39">
                                <span class="form-description433">Body Question</span><input type="text" name="content"
                                                                                             value="${requestScope.post.content}" class="question-ttile32" placeholder="What's on your mind?">
                            </div>

                            <div class="categori49">
                                <span class="form-description43305">Category </span>
                                <select name="category_id" class="question-ttile32">
                                    <c:forEach items="${requestScope.categories}" var="c">
                                        <option 
                                            <c:if test="${c.id eq requestScope.post.category.id}">
                                                selected="selected"
                                            </c:if>
                                            value="${c.id}">${c.title}</option>
                                    </c:forEach>
                                </select>
                            </div>

                            <div class="publish-button2389">
                                <input type="submit" class="publis1291" value="Update your Question" />
                            </div>
                        </form>


                    </div>
                </div>
            </div>
        </div>
    </section>
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
    <script src="js/editor.js"></script>
    <script>
        $(document).ready(function () {
            $("#txtEditor").Editor();
        });
    </script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>

</body>

</html>
