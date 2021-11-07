/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.CategoryDBContext;
import dal.QuestionDBContext;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;
import model.Category;
import model.Post;

/**
 *
 * @author ADMIN
 */
public class ListQuestionController extends HttpServlet {

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
        QuestionDBContext db = new QuestionDBContext();
        ArrayList<Post> posts = db.getPosts();
        for (Post post : posts) {
            post.setAnswer(db.countAnswer(post.getId()));
        }
        request.setAttribute("posts", posts);
        
        
        ArrayList<Post> mostRespPosts = db.getPostsMostResponse();
        for (Post post : mostRespPosts) {
            post.setAnswer(db.countAnswer(post.getId()));
        }
        request.setAttribute("mostRespPosts", mostRespPosts);
        
        ArrayList<Post> noAnsPosts = db.getPostsNoAns();
        for (Post post : noAnsPosts) {
            post.setAnswer(db.countAnswer(post.getId()));
        }
        request.setAttribute("noAnsPosts", noAnsPosts);
        
        CategoryDBContext categoryDB = new CategoryDBContext();
        ArrayList<Category> categories =  categoryDB.getCategories();
        request.setAttribute("categories", categories);
        
        
        int pagesize = 5;
        String page = request.getParameter("page");
        if(page ==null || page.trim().length() ==0)
            page = "1";
        int pageindex = Integer.parseInt(page);
        int totalrecords = db.getRowCount();
        int totalpage = (totalrecords % pagesize ==0)?totalrecords / pagesize: 
                (totalrecords / pagesize) + 1;
        ArrayList<Post> postsList = db.getPostsWithPaging(pageindex, pagesize);
        for (Post post : postsList) {
            post.setAnswer(db.countAnswer(post.getId()));
        }
        request.setAttribute("postsList", postsList);
        
        
        request.setAttribute("totalpage", totalpage);
        request.setAttribute("pageindex", pageindex);
        
//        Account account = (Account) request.getSession().getAttribute("account");
//        String username = account.getUsername();
//        ArrayList<Post> myposts = db.getPostByUser(username);
//        request.setAttribute("myposts", myposts);
        
        request.getRequestDispatcher("../view/display/home.jsp").forward(request, response);
        
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
