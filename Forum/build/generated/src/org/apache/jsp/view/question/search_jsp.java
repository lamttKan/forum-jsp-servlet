package org.apache.jsp.view.question;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <link href=\"../css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"../css/style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"../css/editor.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"../css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <link href=\"css/responsive.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
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
      out.write("                        <li><a href=\"index.html\">Home</a></li>\n");
      out.write("                        <li><a href=\"ask_question.html\">Ask Question</a></li>\n");
      out.write("                        <li class=\"dropdown\"> <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\"\n");
      out.write("                                                 aria-haspopup=\"true\" aria-expanded=\"false\">Search<span class=\"caret\"></span></a>\n");
      out.write("                            <ul class=\"dropdown-menu animated zoomIn\">\n");
      out.write("                                <li><a href=\"category.html\">Category</a></li>\n");
      out.write("                                <li><a href=\"category.html\">Tag</a></li>\n");
      out.write("                                <li><a href=\"category.html\">User</a></li>\n");
      out.write("                                <li><a href=\"category.html\">Advanced Search</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\"\n");
      out.write("                               data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                Dropdown\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                                <a href=\"category.html\">Category</a>\n");
      out.write("                                <a href=\"category.html\">Tag</a>\n");
      out.write("                                <a href=\"category.html\">User</a>\n");
      out.write("                                <a href=\"category.html\">Advanced Search</a>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"profile.html\">Profile</a></li>\n");
      out.write("                        <li class=\"dropdown\"> <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\"\n");
      out.write("                                                 aria-haspopup=\"true\" aria-expanded=\"false\">Account <span class=\"caret\"></span></a>\n");
      out.write("                            <ul class=\"dropdown-menu animated zoomIn\">\n");
      out.write("                                <li><a href=\"logIn.html\">Login</a></li>\n");
      out.write("                                <li><a href=\"\"> Change your profile</a></li>\n");
      out.write("                                <li><a href=\"#\">Logout </a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.navbar-collapse -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.container-fluid -->\n");
      out.write("        </nav>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <section class=\"header-descriptin329\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h3>Search</h3>\n");
      out.write("            <ol class=\"breadcrumb breadcrumb839\">\n");
      out.write("                <li><a href=\"ask_question.html\">Search By Category</a></li>\n");
      out.write("                <li><a href=\"#\">Search User</a></li>\n");
      out.write("                <li><a href=\"index.html\">Advanced Search</a></li>\n");
      out.write("            </ol>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <section class=\"main-content920 \">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <div class=\"ask-question-input-part032\">\n");
      out.write("                        <h4>Advanced Search</h4>\n");
      out.write("                        <hr>\n");
      out.write("                        <form action=\"ask\" method=\"POST\">\n");
      out.write("\n");
      out.write("                            <div class=\"question-title39\">\n");
      out.write("                                <span class=\"form-description432\">Question-Title </span>\n");
      out.write("                                <input type=\"text\" name=\"title\" class=\"question-ttile32\" placeholder=\"Write Your Question Title\">\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"question-title39\">\n");
      out.write("                                <span class=\"form-description432\">Body Question</span><input type=\"text\" name=\"content\"\n");
      out.write("                                    class=\"question-ttile32\" placeholder=\"What's on your mind?\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"question-title39\">\n");
      out.write("                                <span class=\"form-description432\">Post Newer than </span><input type=\"date\" name=\"content\"\n");
      out.write("                                    class=\"question-ttile32\" >\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"question-title39\">\n");
      out.write("                                <span class=\"form-description432\">Post Older than </span> <input type=\"date\" name=\"content\" class=\"question-ttile32\" > \n");
      out.write("                                    \n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"categori49\">\n");
      out.write("                                <span class=\"form-description432\">Category </span>\n");
      out.write("                                <select name=\"category_id\" class=\"question-ttile32\">\n");
      out.write("                                    <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.categories}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"c\">\n");
      out.write("                                        <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("                                    </c:forEach>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"question-title39\">\n");
      out.write("                                <span class=\"form-description432\">Username</span><input type=\"text\" name=\"content\"\n");
      out.write("                                    class=\"question-ttile32\" placeholder=\"What's on your mind?\">\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"publish-button2389\">\n");
      out.write("                                <input type=\"submit\" class=\"publis1291\" value=\"Search\" />\n");
      out.write("                            </div>\n");
      out.write("                        </form>         \n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <br />\n");
      out.write("\n");
      out.write("    <section class=\"footer-part\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <div class=\"info-part-one320\">\n");
      out.write("                        <h4>Support :</h4>\n");
      out.write("                        <p>Support Telephone No : (+2)01111011110</p>\n");
      out.write("                        <p>Support Email Account : </p>\n");
      out.write("                        <p>info@example.com</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery-3.1.1.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/editor.js\"></script>\n");
      out.write("    <script>\n");
      out.write("        $(document).ready(function () {\n");
      out.write("            $(\"#txtEditor\").Editor();\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
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
}
