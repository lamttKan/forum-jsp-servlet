 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.user;

import controller.authentication.BaseRequireAuthenController;
import dal.QuestionDBContext;
import dal.UserDBContext;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;
import model.Post;

/**
 *
 * @author ADMIN
 */
public class ProfileController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Account account = (Account) request.getSession().getAttribute("account");
        String my_username = account.getUsername();
        String username = request.getParameter("username");
        int flag = 0;
        if(username == null || username.trim().length() ==0){
            username = my_username;
            flag++;
        }
        UserDBContext Userdb = new UserDBContext();
        Account user = Userdb.getUser(username);
        request.setAttribute("user", user);
                
        QuestionDBContext db = new QuestionDBContext();
        ArrayList<Post> posts = db.getPostByUser(username);
        for (Post post : posts) {
            post.setAnswer(db.countAnswer(post.getId()));
        }
        request.setAttribute("posts", posts);
        request.setAttribute("username", username);
        if(flag == 0){
            request.getRequestDispatcher("../view/display/profile2.jsp").forward(request, response);
        }else{
            request.getRequestDispatcher("../view/display/profile.jsp").forward(request, response);
        }
                
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
