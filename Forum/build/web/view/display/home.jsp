<%-- 
    Document   : home.jsp
    Created on : Oct 25, 2021, 9:53:02 PM
    Author     : ADMIN
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <title>Pallas</title>
        <link href="../css/bootstrap.css" rel="stylesheet" type="text/css">
        <link href="../css/style.css" rel="stylesheet" type="text/css">
        <link href="../css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <script src="js/pagger.js" type="text/javascript"></script>
    </head>

    <body>
        <!--======== Navbar =======-->
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


        <!--======= welcome section on top background=====-->
        <section class="welcome-part-one">
            <div class="container">
                <div class="welcome-demop102 text-center">
                    <h2>Welcome to Pallas forum, Ask good question bring awesome knowledge !!!</h2>
                    
                </div>
            </div>
        </section>


        <!-- ======content section/body=====-->
        <section class="main-content920">
            <div class="container">
                <div class="row">
                    <div class="col-md-9">
                        <div id="main">
                            <input id="tab1" type="radio" name="tabs" checked>
                            <label for="tab1">Recent Question</label>
                            <input id="tab2" type="radio" name="tabs">
                            <label for="tab2">Most Response</label>
                            <input id="tab4" type="radio" name="tabs">
                            <label for="tab4">No Answer</label>
                            <input id="tab5" type="radio" name="tabs">
<!--                            <label for="tab5">Your Post</label>-->



                            <section id="content1">
                                <!--Recent Question Content Section -->
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
                                                        <i class="fa fa-comment" aria-hidden="true">${p.answer}</i>
                                                        <!--                                            <i class="fa fa-user-circle-o" aria-hidden="true"> 70 view</i> -->
                                                    </div>
                                                </div>
                                            </div>

                                        </div>
                                    </div>                   
                                </c:forEach>                    
                                <nav aria-label="Page navigation">
                                    <ul class="pagination">
                                        <li>
                                            <a href="#" aria-label="Previous">
                                                <span aria-hidden="true">&laquo;</span>
                                            </a>
                                        </li>
                                        <li><a href="#">1</a></li>
                                        <li><a href="#">2</a></li>
                                        <li><a href="#">3</a></li>
                                        <li><a href="#">4</a></li>
                                        <li><a href="#">5</a></li>
                                        <li>
                                            <a href="#" aria-label="Next">
                                                <span aria-hidden="true">&raquo;</span>
                                            </a>
                                        </li>
                                    </ul>
                                </nav>
                            </section>
                            <!--  End of content-1------>

                            <section id="content2">
                                <!--Most Response Content Section -->
                                <c:forEach items="${requestScope.mostRespPosts}" var="p">
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
                                                        <i class="fa fa-comment" aria-hidden="true"> ${p.answer}</i>
                                                        <!--                                            <i class="fa fa-user-circle-o" aria-hidden="true"> 70 view</i> -->
                                                    </div>
                                                </div>
                                            </div>

                                        </div>
                                    </div>                   
                                </c:forEach>    

                                <nav aria-label="Page navigation">
                                    <ul class="pagination">
                                        <li>
                                            <a href="#" aria-label="Previous">
                                                <span aria-hidden="true">&laquo;</span>
                                            </a>
                                        </li>
                                        <li><a href="#">1</a></li>
                                        <li><a href="#">2</a></li>
                                        <li><a href="#">3</a></li>
                                        <li><a href="#">4</a></li>
                                        <li><a href="#">5</a></li>
                                        <li>
                                            <a href="#" aria-label="Next">
                                                <span aria-hidden="true">&raquo;</span>
                                            </a>
                                        </li>
                                    </ul>
                                </nav>
                            </section>

                            <!----end of content-2----->

                            <section id="content4">
                                <!--No answered Content Section -->
                                <c:forEach items="${requestScope.noAnsPosts}" var="p">
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
                                                        <i class="fa fa-comment" aria-hidden="true"> ${p.answer}</i>
                                                        <!--                                            <i class="fa fa-user-circle-o" aria-hidden="true"> 70 view</i> -->
                                                    </div>
                                                </div>
                                            </div>

                                        </div>
                                    </div>                   
                                </c:forEach> 

                                <!--End of content-4-->
                                <nav aria-label="Page navigation">
                                    <ul class="pagination">
                                        <li>
                                            <a href="#" aria-label="Previous">
                                                <span aria-hidden="true">&laquo;</span>
                                            </a>
                                        </li>
                                        <li><a href="#">1</a></li>
                                        <li><a href="#">2</a></li>
                                        <li><a href="#">3</a></li>
                                        <li><a href="#">4</a></li>
                                        <li><a href="#">5</a></li>
                                        <li>
                                            <a href="#" aria-label="Next">
                                                <span aria-hidden="true">&raquo;</span>
                                            </a>
                                        </li>
                                    </ul>
                                </nav>
                            </section>


                            <section id="content5">
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
                                                        <i class="fa fa-comment" aria-hidden="true">${p.answer}</i>
                                                        <!--                                            <i class="fa fa-user-circle-o" aria-hidden="true"> 70 view</i> -->
                                                    </div>
                                                </div>
                                            </div>

                                        </div>
                                    </div>                   
                                </c:forEach>  
                                <div id="paggerbot" class="pagger"></div>
                            </section>

                        </div>
                    </div>
                    <!--end of col-md-9 -->
                    <!--strart col-md-3 (side bar)-->
                    <aside class="col-md-3 sidebar97239">

                        <!--          start tags part-->
                        <div class="tags-part2398">
                            <h4>Category</h4>
                            <ul>
                                <c:forEach items="${requestScope.categories}" var="c">
                                    <li><a href="#">${c.title}</a></li>
                                    </c:forEach>
                            </ul>
                        </div>
                        <!--          End tags part-->

                    </aside>
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
        <script>
            renderPagger('paggerbot',${requestScope.pageindex}, ${requestScope.totalpage}, 2);
        </script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="js/jquery-3.1.1.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/npm.js"></script>
    </body>

</html>
