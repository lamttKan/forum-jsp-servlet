<%-- 
    Document   : home.jsp
    Created on : Oct 25, 2021, 9:53:02 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <title>Pallas</title>
    <link href="css/bootstrap.css" rel="stylesheet" type="text/css">
    <link href="css/style.css" rel="stylesheet" type="text/css">
    <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css">
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
                        <li><a href="index.html">Home</a></li>
                        <li><a href="ask_question.html">Ask Question</a></li>
                        <li class="dropdown"> <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                                aria-haspopup="true" aria-expanded="false">Search<span class="caret"></span></a>
                            <ul class="dropdown-menu animated zoomIn">
                                <li><a href="category.html">Category</a></li>
                                <li><a href="category.html">Tag</a></li>
                                <li><a href="category.html">User</a></li>
                                <li><a href="category.html">Advanced Search</a></li>
                            </ul>
                        </li>

                        <li><a href="profile.html">Profile</a></li>
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


    <!--======= welcome section on top background=====-->
    <section class="welcome-part-one">
        <div class="container">
            <div class="welcome-demop102 text-center">
                <h2>Welcome to Pallas forum, Ask good question bring awesome knowledge !!!</h2>
                <div class="form-style8292">
                    <div class="input-group"> <span class="input-group-addon"><i class="fa fa-pencil-square"
                                aria-hidden="true"></i></span>
                        <input type="text" class="form-control form-control8392"
                            placeholder="Ask any question and you be sure find your answer ?"> <span
                            class="input-group-addon"><a href="#">Ask Now</a></span>
                    </div>
                </div>
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
                        <input id="tab3" type="radio" name="tabs">
                        <label for="tab3">Recently Answered</label>
                        <input id="tab4" type="radio" name="tabs">
                        <label for="tab4">No Answer</label>
                        <input id="tab5" type="radio" name="tabs">
                        <label for="tab5">Recent Post</label>



                        <section id="content1">
                            <!--Recent Question Content Section -->
                            <div class="question-type2033">
                                <div class="row">
                                    <div class="col-md-1">
                                        <div class="left-user12923 left-user12923-repeat">
                                            <a href="#"><img src="image/images.png" alt="image"> </a> <a href="#"><i
                                                    class="fa fa-check" aria-hidden="true"></i></a>
                                        </div>
                                    </div>
                                    <div class="col-md-9">
                                        <div class="right-description893">
                                            <div id="que-hedder2983">
                                                <h3><a href="post-deatils.html" target="_blank">How Did You Hear About
                                                        This Position?</a></h3>
                                            </div>
                                            <div class="ques-details10018">
                                                <p>Wouldn’t it be great if you knew exactly what questions a hiring
                                                    manager would be asking you in your next job interview?

                                                    We can’t read minds, unfortunately, but we’ll give you the next best
                                                    thing: a list of more than 40 of the most commonly asked interview
                                                    questions, along with advice for answering them all.

                                                    While we don’t recommend having a canned response for every
                                                    interview question (in fact, please don’t), we do recommend spending
                                                    some time getting comfortable with what you might be asked, what
                                                    hiring managers are really looking for in your responses, and what
                                                    it takes to show that you’re the right person for the job.</p>
                                            </div>
                                            <hr>
                                            <div class="ques-icon-info3293"> <a href="#"><i class="fa fa-star"
                                                        aria-hidden="true"> 5 </i> </a> <a href="#"><i
                                                        class="fa fa-folder" aria-hidden="true"> wordpress</i></a> <a
                                                    href="#"><i class="fa fa-clock-o" aria-hidden="true"> 4 min
                                                        ago</i></a> <a href="#"><i class="fa fa-question-circle-o"
                                                        aria-hidden="true"> Question</i></a> <a href="#"><i
                                                        class="fa fa-bug" aria-hidden="true"> Report</i></a> </div>
                                        </div>
                                    </div>
                                    <div class="col-md-2">
                                        <div class="ques-type302">
                                            <a href="#">
                                                <button type="button" class="q-type238"><i class="fa fa-comment"
                                                        aria-hidden="true"> 333335 answer</i></button>
                                            </a>
                                            <a href="#">
                                                <button type="button" class="q-type23 button-ques2973"> <i
                                                        class="fa fa-user-circle-o" aria-hidden="true"> 70 view</i>
                                                </button>
                                            </a>
                                        </div>
                                    </div>
                                </div>
                            </div>

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
                            <div class="question-type2033">
                                <div class="row">
                                    <div class="col-md-1">
                                        <div class="left-user12923 left-user12923-repeat">
                                            <a href="#"><img src="image/images.png" alt="image"> </a> <a href="#"><i
                                                    class="fa fa-check" aria-hidden="true"></i></a>
                                        </div>
                                    </div>
                                    <div class="col-md-9">
                                        <div class="right-description893">
                                            <div id="que-hedder2983">
                                                <h3><a href="post-deatils.html" target="_blank">Coronavirus disease
                                                        (COVID-19)</a></h3>
                                            </div>
                                            <div class="ques-details10018">
                                                <p>Duis dapibus aliquam mi, eget euismod sem scelerisque ut. Vivamus at
                                                    elit quis urna adipiscing iaculis.Duis dapibus aliquam mi, eget
                                                    euismod sem scelerisque ut. Vivamus at elit quis urna adipiscing
                                                    iaculis.</p>
                                            </div>
                                            <hr>
                                            <div class="ques-icon-info3293"> <a href="#"><i class="fa fa-check"
                                                        aria-hidden="true"> solved</i></a> <a href="#"><i
                                                        class="fa fa-star" aria-hidden="true"> 5</i> </a> <a href="#"><i
                                                        class="fa fa-folder" aria-hidden="true"> wordpress</i></a> <a
                                                    href="#"><i class="fa fa-clock-o" aria-hidden="true"> 4 min
                                                        ago</i></a> <a href="#"><i class="fa fa-comment"
                                                        aria-hidden="true"> 5 answer</i></a> <a href="#"><i
                                                        class="fa fa-user-circle-o" aria-hidden="true"> 70 view</i> </a>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-2">
                                        <div class="ques-type302">
                                            <a href="#">
                                                <button type="button" class="q-type238"><i class="fa fa-comment"
                                                        aria-hidden="true"> 333335 answer</i></button>
                                            </a>
                                            <a href="#">
                                                <button type="button" class="q-type23 button-ques2973"> <i
                                                        class="fa fa-user-circle-o" aria-hidden="true"> 70 view</i>
                                                </button>
                                            </a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            
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

                        <section id="content3">
                            <!--Recently answered Content Section -->
                            <div class="question-type2033">
                                <div class="row">
                                    <div class="col-md-1">
                                        <div class="left-user12923 left-user12923-repeat">
                                            <a href="#"><img src="image/images.png" alt="image"> </a> <a href="#"><i
                                                    class="fa fa-check" aria-hidden="true"></i></a>
                                        </div>
                                    </div>
                                    <div class="col-md-9">
                                        <div class="right-description893">
                                            <div id="que-hedder2983">
                                                <h3><a href="post-deatils.html" target="_blank">This is my first
                                                        Question</a></h3>
                                            </div>
                                            <div class="ques-details10018">
                                                <p>Duis dapibus aliquam mi, eget euismod sem scelerisque ut. Vivamus at
                                                    elit quis urna adipiscing iaculis.Duis dapibus aliquam mi, eget
                                                    euismod sem scelerisque ut. Vivamus at elit quis urna adipiscing
                                                    iaculis.</p>
                                            </div>
                                            <hr>
                                            <div class="ques-icon-info3293"> <a href="#"><i class="fa fa-check"
                                                        aria-hidden="true"> solved</i></a> <a href="#"><i
                                                        class="fa fa-star" aria-hidden="true"> 5</i> </a> <a href="#"><i
                                                        class="fa fa-folder" aria-hidden="true"> wordpress</i></a> <a
                                                    href="#"><i class="fa fa-clock-o" aria-hidden="true"> 4 min
                                                        ago</i></a> <a href="#"><i class="fa fa-comment"
                                                        aria-hidden="true"> 5 answer</i></a> <a href="#"><i
                                                        class="fa fa-user-circle-o" aria-hidden="true"> 70 view</i> </a>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-2">
                                        <div class="ques-type302">
                                            <a href="#">
                                                <button type="button" class="q-type238"><i class="fa fa-comment"
                                                        aria-hidden="true"> 333335 answer</i></button>
                                            </a>
                                            <a href="#">
                                                <button type="button" class="q-type23 button-ques2973"> <i
                                                        class="fa fa-user-circle-o" aria-hidden="true"> 70 view</i>
                                                </button>
                                            </a>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            
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
                        <!--End content-3 -->


                        <section id="content4">
                            <!--No answered Content Section -->
                            <div class="question-type2033">
                                <div class="row">
                                    <div class="col-md-1">
                                        <div class="left-user12923 left-user12923-repeat">
                                            <a href="#"><img src="image/images.png" alt="image"> </a> <a href="#"><i
                                                    class="fa fa-check" aria-hidden="true"></i></a>
                                        </div>
                                    </div>
                                    <div class="col-md-9">
                                        <div class="right-description893">
                                            <div id="que-hedder2983">
                                                <h3><a href="post-deatils.html" target="_blank">This is my first
                                                        Question</a></h3>
                                            </div>
                                            <div class="ques-details10018">
                                                <p>Duis dapibus aliquam mi, eget euismod sem scelerisque ut. Vivamus at
                                                    elit quis urna adipiscing iaculis.Duis dapibus aliquam mi, eget
                                                    euismod sem scelerisque ut. Vivamus at elit quis urna adipiscing
                                                    iaculis.</p>
                                            </div>
                                            <hr>
                                            <div class="ques-icon-info3293"> <a href="#"><i
                                                        class="fa fa-check check-color329" aria-hidden="true">
                                                        solved</i></a> <a href="#"><i class="fa fa-star"
                                                        aria-hidden="true"> 5</i> </a> <a href="#"><i
                                                        class="fa fa-folder" aria-hidden="true"> wordpress</i></a> <a
                                                    href="#"><i class="fa fa-clock-o" aria-hidden="true"> 4 min
                                                        ago</i></a> <a href="#"><i class="fa fa-comment"
                                                        aria-hidden="true"> 5 answer</i></a> <a href="#"><i
                                                        class="fa fa-user-circle-o" aria-hidden="true"> 70 view</i> </a>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-2">
                                        <div class="ques-type302">
                                            <a href="#">
                                                <button type="button" class="q-type238"><i class="fa fa-comment"
                                                        aria-hidden="true"> 333335 answer</i></button>
                                            </a>
                                            <a href="#">
                                                <button type="button" class="q-type23 button-ques2973"> <i
                                                        class="fa fa-user-circle-o" aria-hidden="true"> 70 view</i>
                                                </button>
                                            </a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            
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
                            <!--Recent Question Content Section -->
                            <div class="question-type2033">
                                <div class="row">
                                    <div class="col-md-1">
                                        <div class="left-user12923 left-user12923-repeat">
                                            <a href="#"><img src="image/images.png" alt="image"> </a> <a href="#"><i
                                                    class="fa fa-check" aria-hidden="true"></i></a>
                                        </div>
                                    </div>
                                    <div class="col-md-9">
                                        <div class="right-description893">
                                            <div id="que-hedder2983">
                                                <h3><a href="post-deatils.html" target="_blank">This is my first
                                                        Question</a></h3>
                                            </div>
                                            <div class="ques-details10018">
                                                <p>Duis dapibus aliquam mi, eget euismod sem scelerisque ut. Vivamus at
                                                    elit quis urna adipiscing iaculis.Duis dapibus aliquam mi, eget
                                                    euismod sem scelerisque ut. Vivamus at elit quis urna adipiscing
                                                    iaculis.</p>
                                            </div>
                                            <hr>
                                            <div class="ques-icon-info3293"> <a href="#"><i class="fa fa-star"
                                                        aria-hidden="true"> 5 </i> </a> <a href="#"><i
                                                        class="fa fa-folder" aria-hidden="true"> wordpress</i></a> <a
                                                    href="#"><i class="fa fa-clock-o" aria-hidden="true"> 4 min
                                                        ago</i></a> <a href="#"><i class="fa fa-question-circle-o"
                                                        aria-hidden="true"> Question</i></a> <a href="#"><i
                                                        class="fa fa-bug" aria-hidden="true"> Report</i></a> </div>
                                        </div>
                                    </div>
                                    <div class="col-md-2">
                                        <div class="ques-type302">
                                            <a href="#">
                                                <button type="button" class="q-type238"><i class="fa fa-comment"
                                                        aria-hidden="true"> 333335 answer</i></button>
                                            </a>
                                            <a href="#">
                                                <button type="button" class="q-type23 button-ques2973"> <i
                                                        class="fa fa-user-circle-o" aria-hidden="true"> 70 view</i>
                                                </button>
                                            </a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            
                            <!--End of content-5-->
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

                    </div>
                </div>
                <!--end of col-md-9 -->
                <!--strart col-md-3 (side bar)-->
                <aside class="col-md-3 sidebar97239">
                    
                    <div class="categori-part329">
                        <h4>Category</h4>
                        <ul>
                            <li><a href="#">web developer</a></li>
                            <li><a href="#">Andriod developer</a></li>
                            <li><a href="#">grapics developer</a></li>
                            <li><a href="#">web developer</a></li>
                        </ul>
                    </div>


                    <!--              highest part-->
                    <div class="highest-part302">
                        <h4>Highest Points</h4>
                        <div class="pints-wrapper">
                            <div class="left-user3898">
                                <a href="#"><img src="image/images.png" alt="Image"></a>
                                <div class="imag-overlay39"> <a href="#"><i class="fa fa-plus"
                                            aria-hidden="true"></i></a> </div>
                            </div> <span class="points-details938">
                                <a href="#">
                                    <h5>Ahmed Hasan</h5>
                                </a>
                                <a href="#" class="designetion439">Pundit</a>
                                <p>206 points</p>
                            </span>
                        </div>
                        <hr>
                        <div class="pints-wrapper">
                            <div class="left-user3898">
                                <a href="#"><img src="image/images.png" alt="Image"></a>
                                <div class="imag-overlay39"> <a href="#"><i class="fa fa-plus"
                                            aria-hidden="true"></i></a> </div>
                            </div> <span class="points-details938">
                                <a href="#">
                                    <h5>Ahmed Hasan</h5>
                                </a>
                                <a href="#" class="designetion439">Pundit</a>
                                <p>206 points</p>
                            </span>
                        </div>

                        <hr>
                        <div class="pints-wrapper">
                            <div class="left-user3898">
                                <a href="#"><img src="image/images.png" alt="Image"></a>
                                <div class="imag-overlay39"> <a href="#"><i class="fa fa-plus"
                                            aria-hidden="true"></i></a> </div>
                            </div> <span class="points-details938">
                                <a href="#">
                                    <h5>Ahmed Hasan</h5>
                                </a>
                                <a href="#" class="designetion439">Pundit</a>
                                <p>206 points</p>
                            </span>
                        </div>
                    </div>
                    <!--               end of Highest points -->
                    <!--          start tags part-->
                    <div class="tags-part2398">
                        <h4>Tags</h4>
                        <ul>
                            <li><a href="#">analytics</a></li>
                            <li><a href="#">Computer</a></li>
                            <li><a href="#">Developer</a></li>
                            <li><a href="#">Google</a></li>
                            <li><a href="#">Interview</a></li>
                            <li><a href="#">Programmer</a></li>
                            <li><a href="#">Salary</a></li>
                            <li><a href="#">University</a></li>
                            <li><a href="#">Employee</a></li>
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
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="js/jquery-3.1.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/npm.js"></script>
</body>

</html>