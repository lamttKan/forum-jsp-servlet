package org.apache.jsp.view.display;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <title>Pallas</title>\n");
      out.write("    <link href=\"../css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link href=\"../css/style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link href=\"../css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <!--======== Navbar =======-->\n");
      out.write("    <div class=\"top-menu-bottom932\">\n");
      out.write("        <nav class=\"navbar navbar-default\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <h1 style=\"height: max-content; color: #fd6372; font-family: Brush Script MT;\">Pallas Forum</h1>\n");
      out.write("                </div>\n");
      out.write("                <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                    <ul class=\"nav navbar-nav\"> </ul>\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li><a href=\"list\">Home</a></li>\n");
      out.write("                        <li><a href=\"ask\">Ask Question</a></li>\n");
      out.write("                        <li class=\"dropdown\"> <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\"\n");
      out.write("                                aria-haspopup=\"true\" aria-expanded=\"false\">Search<span class=\"caret\"></span></a>\n");
      out.write("                            <ul class=\"dropdown-menu animated zoomIn\">\n");
      out.write("                                <li><a href=\"category.html\">Category</a></li>\n");
      out.write("                                <li><a href=\"category.html\">Tag</a></li>\n");
      out.write("                                <li><a href=\"category.html\">User</a></li>\n");
      out.write("                                <li><a href=\"category.html\">Advanced Search</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li><a href=\"../user/profile\">Profile</a></li>\n");
      out.write("                        <li class=\"dropdown\"> <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\"\n");
      out.write("                                aria-haspopup=\"true\" aria-expanded=\"false\">Account <span class=\"caret\"></span></a>\n");
      out.write("                            <ul class=\"dropdown-menu animated zoomIn\">\n");
      out.write("                                <li><a href=\"logIn.html\">Login</a></li>\n");
      out.write("                                <li><a href=\"\"> Change your profile</a></li>\n");
      out.write("                                <li><a href=\"#\">Logout </a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <!-- nav bar-collapse -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.container-fluid -->\n");
      out.write("        </nav>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!--======= welcome section on top background=====-->\n");
      out.write("    <section class=\"welcome-part-one\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"welcome-demop102 text-center\">\n");
      out.write("                <h2>Welcome to Pallas forum, Ask good question bring awesome knowledge !!!</h2>\n");
      out.write("                <div class=\"form-style8292\">\n");
      out.write("                    <div class=\"input-group\"> <span class=\"input-group-addon\"><i class=\"fa fa-pencil-square\"\n");
      out.write("                                aria-hidden=\"true\"></i></span>\n");
      out.write("                        <input type=\"text\" class=\"form-control form-control8392\"\n");
      out.write("                            placeholder=\"Ask any question and you be sure find your answer ?\"> <span\n");
      out.write("                            class=\"input-group-addon\"><a href=\"#\">Ask Now</a></span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- ======content section/body=====-->\n");
      out.write("    <section class=\"main-content920\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-9\">\n");
      out.write("                    <div id=\"main\">\n");
      out.write("                        <input id=\"tab1\" type=\"radio\" name=\"tabs\" checked>\n");
      out.write("                        <label for=\"tab1\">Recent Question</label>\n");
      out.write("                        <input id=\"tab2\" type=\"radio\" name=\"tabs\">\n");
      out.write("                        <label for=\"tab2\">Most Response</label>\n");
      out.write("                        <input id=\"tab3\" type=\"radio\" name=\"tabs\">\n");
      out.write("                        <label for=\"tab3\">Recently Answered</label>\n");
      out.write("                        <input id=\"tab4\" type=\"radio\" name=\"tabs\">\n");
      out.write("                        <label for=\"tab4\">No Answer</label>\n");
      out.write("                        <input id=\"tab5\" type=\"radio\" name=\"tabs\">\n");
      out.write("                        <label for=\"tab5\">Your Post</label>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <section id=\"content1\">\n");
      out.write("                            <!--Recent Question Content Section -->\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("                    \n");
      out.write("                            <nav aria-label=\"Page navigation\">\n");
      out.write("                                <ul class=\"pagination\">\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\" aria-label=\"Previous\">\n");
      out.write("                                            <span aria-hidden=\"true\">&laquo;</span>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li><a href=\"#\">1</a></li>\n");
      out.write("                                    <li><a href=\"#\">2</a></li>\n");
      out.write("                                    <li><a href=\"#\">3</a></li>\n");
      out.write("                                    <li><a href=\"#\">4</a></li>\n");
      out.write("                                    <li><a href=\"#\">5</a></li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\" aria-label=\"Next\">\n");
      out.write("                                            <span aria-hidden=\"true\">&raquo;</span>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </nav>\n");
      out.write("                        </section>\n");
      out.write("                        <!--  End of content-1------>\n");
      out.write("\n");
      out.write("                        <section id=\"content2\">\n");
      out.write("                            <!--Most Response Content Section -->\n");
      out.write("                            <div class=\"question-type2033\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-1\">\n");
      out.write("                                        <div class=\"left-user12923 left-user12923-repeat\">\n");
      out.write("                                            <a href=\"#\"><img src=\"image/images.png\" alt=\"image\"> </a> <a href=\"#\"><i\n");
      out.write("                                                    class=\"fa fa-check\" aria-hidden=\"true\"></i></a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-9\">\n");
      out.write("                                        <div class=\"right-description893\">\n");
      out.write("                                            <div id=\"que-hedder2983\">\n");
      out.write("                                                <h3><a href=\"post-deatils.html\" target=\"_blank\">Coronavirus disease\n");
      out.write("                                                        (COVID-19)</a></h3>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"ques-details10018\">\n");
      out.write("                                                <p>Duis dapibus aliquam mi, eget euismod sem scelerisque ut. Vivamus at\n");
      out.write("                                                    elit quis urna adipiscing iaculis.Duis dapibus aliquam mi, eget\n");
      out.write("                                                    euismod sem scelerisque ut. Vivamus at elit quis urna adipiscing\n");
      out.write("                                                    iaculis.</p>\n");
      out.write("                                            </div>\n");
      out.write("                                            <hr>\n");
      out.write("                                            <div class=\"ques-icon-info3293\"> <a href=\"#\"><i class=\"fa fa-check\"\n");
      out.write("                                                        aria-hidden=\"true\"> solved</i></a> <a href=\"#\"><i\n");
      out.write("                                                        class=\"fa fa-star\" aria-hidden=\"true\"> 5</i> </a> <a href=\"#\"><i\n");
      out.write("                                                        class=\"fa fa-folder\" aria-hidden=\"true\"> wordpress</i></a> <a\n");
      out.write("                                                    href=\"#\"><i class=\"fa fa-clock-o\" aria-hidden=\"true\"> 4 min\n");
      out.write("                                                        ago</i></a> <a href=\"#\"><i class=\"fa fa-comment\"\n");
      out.write("                                                        aria-hidden=\"true\"> 5 answer</i></a> <a href=\"#\"><i\n");
      out.write("                                                        class=\"fa fa-user-circle-o\" aria-hidden=\"true\"> 70 view</i> </a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-2\">\n");
      out.write("                                        <div class=\"ques-type302\">\n");
      out.write("                                            <a href=\"#\">\n");
      out.write("                                                <button type=\"button\" class=\"q-type238\"><i class=\"fa fa-comment\"\n");
      out.write("                                                        aria-hidden=\"true\"> 333335 answer</i></button>\n");
      out.write("                                            </a>\n");
      out.write("                                            <a href=\"#\">\n");
      out.write("                                                <button type=\"button\" class=\"q-type23 button-ques2973\"> <i\n");
      out.write("                                                        class=\"fa fa-user-circle-o\" aria-hidden=\"true\"> 70 view</i>\n");
      out.write("                                                </button>\n");
      out.write("                                            </a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <nav aria-label=\"Page navigation\">\n");
      out.write("                                <ul class=\"pagination\">\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\" aria-label=\"Previous\">\n");
      out.write("                                            <span aria-hidden=\"true\">&laquo;</span>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li><a href=\"#\">1</a></li>\n");
      out.write("                                    <li><a href=\"#\">2</a></li>\n");
      out.write("                                    <li><a href=\"#\">3</a></li>\n");
      out.write("                                    <li><a href=\"#\">4</a></li>\n");
      out.write("                                    <li><a href=\"#\">5</a></li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\" aria-label=\"Next\">\n");
      out.write("                                            <span aria-hidden=\"true\">&raquo;</span>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </nav>\n");
      out.write("                        </section>\n");
      out.write("\n");
      out.write("                        <!----end of content-2----->\n");
      out.write("\n");
      out.write("                        <section id=\"content3\">\n");
      out.write("                            <!--Recently answered Content Section -->\n");
      out.write("                            <div class=\"question-type2033\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-1\">\n");
      out.write("                                        <div class=\"left-user12923 left-user12923-repeat\">\n");
      out.write("                                            <a href=\"#\"><img src=\"image/images.png\" alt=\"image\"> </a> <a href=\"#\"><i\n");
      out.write("                                                    class=\"fa fa-check\" aria-hidden=\"true\"></i></a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-9\">\n");
      out.write("                                        <div class=\"right-description893\">\n");
      out.write("                                            <div id=\"que-hedder2983\">\n");
      out.write("                                                <h3><a href=\"post-deatils.html\" target=\"_blank\">This is my first\n");
      out.write("                                                        Question</a></h3>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"ques-details10018\">\n");
      out.write("                                                <p>Duis dapibus aliquam mi, eget euismod sem scelerisque ut. Vivamus at\n");
      out.write("                                                    elit quis urna adipiscing iaculis.Duis dapibus aliquam mi, eget\n");
      out.write("                                                    euismod sem scelerisque ut. Vivamus at elit quis urna adipiscing\n");
      out.write("                                                    iaculis.</p>\n");
      out.write("                                            </div>\n");
      out.write("                                            <hr>\n");
      out.write("                                            <div class=\"ques-icon-info3293\"> <a href=\"#\"><i class=\"fa fa-check\"\n");
      out.write("                                                        aria-hidden=\"true\"> solved</i></a> <a href=\"#\"><i\n");
      out.write("                                                        class=\"fa fa-star\" aria-hidden=\"true\"> 5</i> </a> <a href=\"#\"><i\n");
      out.write("                                                        class=\"fa fa-folder\" aria-hidden=\"true\"> wordpress</i></a> <a\n");
      out.write("                                                    href=\"#\"><i class=\"fa fa-clock-o\" aria-hidden=\"true\"> 4 min\n");
      out.write("                                                        ago</i></a> <a href=\"#\"><i class=\"fa fa-comment\"\n");
      out.write("                                                        aria-hidden=\"true\"> 5 answer</i></a> <a href=\"#\"><i\n");
      out.write("                                                        class=\"fa fa-user-circle-o\" aria-hidden=\"true\"> 70 view</i> </a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-2\">\n");
      out.write("                                        <div class=\"ques-type302\">\n");
      out.write("                                            <a href=\"#\">\n");
      out.write("                                                <button type=\"button\" class=\"q-type238\"><i class=\"fa fa-comment\"\n");
      out.write("                                                        aria-hidden=\"true\"> 333335 answer</i></button>\n");
      out.write("                                            </a>\n");
      out.write("                                            <a href=\"#\">\n");
      out.write("                                                <button type=\"button\" class=\"q-type23 button-ques2973\"> <i\n");
      out.write("                                                        class=\"fa fa-user-circle-o\" aria-hidden=\"true\"> 70 view</i>\n");
      out.write("                                                </button>\n");
      out.write("                                            </a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            \n");
      out.write("                            <nav aria-label=\"Page navigation\">\n");
      out.write("                                <ul class=\"pagination\">\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\" aria-label=\"Previous\">\n");
      out.write("                                            <span aria-hidden=\"true\">&laquo;</span>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li><a href=\"#\">1</a></li>\n");
      out.write("                                    <li><a href=\"#\">2</a></li>\n");
      out.write("                                    <li><a href=\"#\">3</a></li>\n");
      out.write("                                    <li><a href=\"#\">4</a></li>\n");
      out.write("                                    <li><a href=\"#\">5</a></li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\" aria-label=\"Next\">\n");
      out.write("                                            <span aria-hidden=\"true\">&raquo;</span>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </nav>\n");
      out.write("                        </section>\n");
      out.write("                        <!--End content-3 -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <section id=\"content4\">\n");
      out.write("                            <!--No answered Content Section -->\n");
      out.write("                            <div class=\"question-type2033\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-1\">\n");
      out.write("                                        <div class=\"left-user12923 left-user12923-repeat\">\n");
      out.write("                                            <a href=\"#\"><img src=\"image/images.png\" alt=\"image\"> </a> <a href=\"#\"><i\n");
      out.write("                                                    class=\"fa fa-check\" aria-hidden=\"true\"></i></a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-9\">\n");
      out.write("                                        <div class=\"right-description893\">\n");
      out.write("                                            <div id=\"que-hedder2983\">\n");
      out.write("                                                <h3><a href=\"post-deatils.html\" target=\"_blank\">This is my first\n");
      out.write("                                                        Question</a></h3>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"ques-details10018\">\n");
      out.write("                                                <p>Duis dapibus aliquam mi, eget euismod sem scelerisque ut. Vivamus at\n");
      out.write("                                                    elit quis urna adipiscing iaculis.Duis dapibus aliquam mi, eget\n");
      out.write("                                                    euismod sem scelerisque ut. Vivamus at elit quis urna adipiscing\n");
      out.write("                                                    iaculis.</p>\n");
      out.write("                                            </div>\n");
      out.write("                                            <hr>\n");
      out.write("                                            <div class=\"ques-icon-info3293\"> <a href=\"#\"><i\n");
      out.write("                                                        class=\"fa fa-check check-color329\" aria-hidden=\"true\">\n");
      out.write("                                                        solved</i></a> <a href=\"#\"><i class=\"fa fa-star\"\n");
      out.write("                                                        aria-hidden=\"true\"> 5</i> </a> <a href=\"#\"><i\n");
      out.write("                                                        class=\"fa fa-folder\" aria-hidden=\"true\"> wordpress</i></a> <a\n");
      out.write("                                                    href=\"#\"><i class=\"fa fa-clock-o\" aria-hidden=\"true\"> 4 min\n");
      out.write("                                                        ago</i></a> <a href=\"#\"><i class=\"fa fa-comment\"\n");
      out.write("                                                        aria-hidden=\"true\"> 5 answer</i></a> <a href=\"#\"><i\n");
      out.write("                                                        class=\"fa fa-user-circle-o\" aria-hidden=\"true\"> 70 view</i> </a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-2\">\n");
      out.write("                                        <div class=\"ques-type302\">\n");
      out.write("                                            <a href=\"#\">\n");
      out.write("                                                <button type=\"button\" class=\"q-type238\"><i class=\"fa fa-comment\"\n");
      out.write("                                                        aria-hidden=\"true\"> 333335 answer</i></button>\n");
      out.write("                                            </a>\n");
      out.write("                                            <a href=\"#\">\n");
      out.write("                                                <button type=\"button\" class=\"q-type23 button-ques2973\"> <i\n");
      out.write("                                                        class=\"fa fa-user-circle-o\" aria-hidden=\"true\"> 70 view</i>\n");
      out.write("                                                </button>\n");
      out.write("                                            </a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <!--End of content-4-->\n");
      out.write("                            <nav aria-label=\"Page navigation\">\n");
      out.write("                                <ul class=\"pagination\">\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\" aria-label=\"Previous\">\n");
      out.write("                                            <span aria-hidden=\"true\">&laquo;</span>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li><a href=\"#\">1</a></li>\n");
      out.write("                                    <li><a href=\"#\">2</a></li>\n");
      out.write("                                    <li><a href=\"#\">3</a></li>\n");
      out.write("                                    <li><a href=\"#\">4</a></li>\n");
      out.write("                                    <li><a href=\"#\">5</a></li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\" aria-label=\"Next\">\n");
      out.write("                                            <span aria-hidden=\"true\">&raquo;</span>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </nav>\n");
      out.write("                        </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <section id=\"content5\">\n");
      out.write("                            <!--Recent Question Content Section -->\n");
      out.write("                            <div class=\"question-type2033\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-1\">\n");
      out.write("                                        <div class=\"left-user12923 left-user12923-repeat\">\n");
      out.write("                                            <a href=\"#\"><img src=\"image/images.png\" alt=\"image\"> </a> <a href=\"#\"><i\n");
      out.write("                                                    class=\"fa fa-check\" aria-hidden=\"true\"></i></a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-9\">\n");
      out.write("                                        <div class=\"right-description893\">\n");
      out.write("                                            <div id=\"que-hedder2983\">\n");
      out.write("                                                <h3><a href=\"post-deatils.html\" target=\"_blank\">This is my first\n");
      out.write("                                                        Question</a></h3>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"ques-details10018\">\n");
      out.write("                                                <p>Duis dapibus aliquam mi, eget euismod sem scelerisque ut. Vivamus at\n");
      out.write("                                                    elit quis urna adipiscing iaculis.Duis dapibus aliquam mi, eget\n");
      out.write("                                                    euismod sem scelerisque ut. Vivamus at elit quis urna adipiscing\n");
      out.write("                                                    iaculis.</p>\n");
      out.write("                                            </div>\n");
      out.write("                                            <hr>\n");
      out.write("                                            <div class=\"ques-icon-info3293\"> <a href=\"#\"><i class=\"fa fa-star\"\n");
      out.write("                                                        aria-hidden=\"true\"> 5 </i> </a> <a href=\"#\"><i\n");
      out.write("                                                        class=\"fa fa-folder\" aria-hidden=\"true\"> wordpress</i></a> <a\n");
      out.write("                                                    href=\"#\"><i class=\"fa fa-clock-o\" aria-hidden=\"true\"> 4 min\n");
      out.write("                                                        ago</i></a> <a href=\"#\"><i class=\"fa fa-question-circle-o\"\n");
      out.write("                                                        aria-hidden=\"true\"> Question</i></a> <a href=\"#\"><i\n");
      out.write("                                                        class=\"fa fa-bug\" aria-hidden=\"true\"> Report</i></a> </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-2\">\n");
      out.write("                                        <div class=\"ques-type302\">\n");
      out.write("                                            <a href=\"#\">\n");
      out.write("                                                <button type=\"button\" class=\"q-type238\"><i class=\"fa fa-comment\"\n");
      out.write("                                                        aria-hidden=\"true\"> 333335 answer</i></button>\n");
      out.write("                                            </a>\n");
      out.write("                                            <a href=\"#\">\n");
      out.write("                                                <button type=\"button\" class=\"q-type23 button-ques2973\"> <i\n");
      out.write("                                                        class=\"fa fa-user-circle-o\" aria-hidden=\"true\"> 70 view</i>\n");
      out.write("                                                </button>\n");
      out.write("                                            </a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <!--End of content-5-->\n");
      out.write("                            <nav aria-label=\"Page navigation\">\n");
      out.write("                                <ul class=\"pagination\">\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\" aria-label=\"Previous\">\n");
      out.write("                                            <span aria-hidden=\"true\">&laquo;</span>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li><a href=\"#\">1</a></li>\n");
      out.write("                                    <li><a href=\"#\">2</a></li>\n");
      out.write("                                    <li><a href=\"#\">3</a></li>\n");
      out.write("                                    <li><a href=\"#\">4</a></li>\n");
      out.write("                                    <li><a href=\"#\">5</a></li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\" aria-label=\"Next\">\n");
      out.write("                                            <span aria-hidden=\"true\">&raquo;</span>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </nav>\n");
      out.write("                        </section>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!--end of col-md-9 -->\n");
      out.write("                <!--strart col-md-3 (side bar)-->\n");
      out.write("                <aside class=\"col-md-3 sidebar97239\">\n");
      out.write("                    \n");
      out.write("<!--                    <div class=\"categori-part329\">\n");
      out.write("                        <h4>Category</h4>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">web developer</a></li>\n");
      out.write("                            <li><a href=\"#\">Andriod developer</a></li>\n");
      out.write("                            <li><a href=\"#\">grapics developer</a></li>\n");
      out.write("                            <li><a href=\"#\">web developer</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>-->\n");
      out.write("\n");
      out.write("                    <!--          start tags part-->\n");
      out.write("                    <div class=\"tags-part2398\">\n");
      out.write("                        <h4>Category</h4>\n");
      out.write("                        <ul>\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <!--          End tags part-->\n");
      out.write("\n");
      out.write("                </aside>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <br/>\n");
      out.write("\n");
      out.write("    <section class=\"footer-part\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <div class=\"info-part-one320\">\n");
      out.write("                        <h4>Contact :</h4>\n");
      out.write("                        <p>Author : Thanh Lam Tran</p>\n");
      out.write("                        <p>Facebook: https://www.facebook.com/lamkan01/ </p>\n");
      out.write("                        <p>Email: lamtthe150351@fpt.edu.vn</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery-3.1.1.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/npm.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.posts}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("p");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                 <div class=\"question-type2033\">\n");
          out.write("                                <div class=\"row\">\n");
          out.write("                                    <div class=\"col-md-11\">\n");
          out.write("                                        <div class=\"right-description893\">\n");
          out.write("                                            <div id=\"que-hedder2983\">\n");
          out.write("                                                <h3><a href=\"detail?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" target=\"_blank\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h3>\n");
          out.write("                                            </div>\n");
          out.write("                                            <hr>\n");
          out.write("                                            <div class=\"ques-icon-info3293\"> \n");
          out.write("                                                <a href=\"profile?username=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><i class=\"fa fa-user\" aria-hidden=\"true\"> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</i></a> \n");
          out.write("                                                <a href=\"#\"><i class=\"fa fa-clock-o\" aria-hidden=\"true\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.time_created}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</i></a>\n");
          out.write("                                                <a href=\"#\"><i class=\"fa fa-tag\" aria-hidden=\"true\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.category.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</i></a>\n");
          out.write("                                                <a href=\"#\"><i class=\"fa fa-comment\" aria-hidden=\"true\"> 5 answer</i></a>\n");
          out.write("                                                <a href=\"#\"><i class=\"fa fa-user-circle-o\" aria-hidden=\"true\"> 70 view</i> </a>\n");
          out.write("                                            </div>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                    \n");
          out.write("                                </div>\n");
          out.write("                            </div>                   \n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.categories}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("c");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <li><a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
