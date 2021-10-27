package org.apache.jsp.view.question;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ask_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <link href=\"../css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"../css/style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"../css/editor.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"../css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"../css/responsive.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <script>\n");
      out.write("            function readURL(input) {\n");
      out.write("        if (input.files && input.files[0]) {\n");
      out.write("            var reader = new FileReader();\n");
      out.write("\n");
      out.write("            reader.onload = function (e) {\n");
      out.write("                $('#blah')\n");
      out.write("                    .attr('src', e.target.result)\n");
      out.write("                    .width(150)\n");
      out.write("                    .height(200);\n");
      out.write("            };\n");
      out.write("\n");
      out.write("            reader.readAsDataURL(input.files[0]);\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
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
      out.write("                        <li><a href=\"ask\">Ask Question</a></li>\n");
      out.write("                        <li class=\"dropdown\"> <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\"\n");
      out.write("                                                 aria-haspopup=\"true\" aria-expanded=\"false\">Search<span class=\"caret\"></span></a>\n");
      out.write("                            <ul class=\"dropdown-menu animated zoomIn\">\n");
      out.write("                                <li><a href=\"category.html\">Category</a></li>\n");
      out.write("                                <li><a href=\"category.html\">Tag</a></li>\n");
      out.write("                                <li><a href=\"category.html\">User</a></li>\n");
      out.write("                                <li><a href=\"category.html\">Advanced Search</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li><a href=\"profile.html\">Profile</a></li>\n");
      out.write("                        <li class=\"dropdown\"> <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\"\n");
      out.write("                                                 aria-haspopup=\"true\" aria-expanded=\"false\">Account <span class=\"caret\"></span></a>\n");
      out.write("                            <ul class=\"dropdown-menu animated zoomIn\">\n");
      out.write("                                <li><a href=\"login\">Login</a></li>\n");
      out.write("                                <li><a href=\"\"> Change your profile</a></li>\n");
      out.write("                                <li><a href=\"#\">Logout </a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <!-- navbar-collapse -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.container-fluid -->\n");
      out.write("        </nav>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <section class=\"main-content920 \">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <div class=\"ask-question-input-part032\">\n");
      out.write("                        <h4>Question</h4>\n");
      out.write("                        <hr>\n");
      out.write("                        \n");
      out.write("                        <form action=\"ask\" method=\"POST\" enctype='multipart/form-data'>\n");
      out.write("\n");
      out.write("                            <div class=\"question-title39\">\n");
      out.write("                                <span class=\"form-description433\">Question-Title </span>\n");
      out.write("                                <input type=\"text\" name=\"title\"\n");
      out.write("                                       class=\"question-ttile32\" placeholder=\"Write Your Question Title\">\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"question-title39\">\n");
      out.write("                                <span class=\"form-description433\">Body Question</span><input type=\"text\" name=\"content\"\n");
      out.write("                                    class=\"question-ttile32\" placeholder=\"What's on your mind?\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"categori49\">\n");
      out.write("                                <span class=\"form-description43305\">Category </span>\n");
      out.write("                                <select name=\"category_id\" class=\"question-ttile32\">\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"button-group-addfile3239\">\n");
      out.write("                                <span class=\"form-description23993\">Attachment</span><input type=\"file\" name=\"attachment\"\n");
      out.write("                                                                                            class=\"question-ttile3226\"\n");
      out.write("                                                                                            onchange=\"readURL(this);\">\n");
      out.write("                                <img id=\"blah\" src=\"#\" alt=\"\" />\n");
      out.write("                                <video id=\"blah\" src=\"#\" alt=\"\" ></video>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"publish-button2389\">\n");
      out.write("                                <input type=\"submit\" class=\"publis1291\" value=\"Publish your Question\" />\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
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
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js\"></script>\n");
      out.write("\n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.categories}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("c");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                    ");
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
}
