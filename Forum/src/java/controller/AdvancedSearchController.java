/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.CategoryDBContext;
import dal.QuestionDBContext;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Category;
import model.Post;

/**
 *
 * @author ADMIN
 */
public class AdvancedSearchController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        CategoryDBContext categoryDB = new CategoryDBContext();
        ArrayList<Category> categories = categoryDB.getCategories();
        request.setAttribute("categories", categories);
        
        request.getRequestDispatcher("../view/question/search.jsp").forward(request, response);
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
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        String raw_from = (request.getParameter("from"));
        String raw_to = (request.getParameter("to"));
        String raw_cid = (request.getParameter("category_id"));
        String username = request.getParameter("username");
        
        
        Date from = (raw_from !=null && raw_from.length()>0)?Date.valueOf(raw_from):null;
        Date to = (raw_to !=null && raw_to.length()>0)?Date.valueOf(raw_to):null;
        if(raw_cid == null || raw_cid.length() ==0)
            raw_cid = "-1";
        int cid = Integer.parseInt(raw_cid);
        QuestionDBContext db = new QuestionDBContext();
        
        ArrayList<Post> posts = db.searchAdvance(title, content, from, to, cid, username);
        request.setAttribute("searchPosts", posts);
        
        
        CategoryDBContext categoryDB = new CategoryDBContext();
        ArrayList<Category> categories = categoryDB.getCategories();
        request.setAttribute("categories", categories);
        request.getRequestDispatcher("../view/question/search.jsp").forward(request, response);
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
