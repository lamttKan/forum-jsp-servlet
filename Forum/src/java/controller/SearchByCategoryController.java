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
import model.Category;
import model.Post;

/**
 *
 * @author ADMIN
 */
public class SearchByCategoryController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        CategoryDBContext categoryDB = new CategoryDBContext();
        ArrayList<Category> categories = categoryDB.getCategories();
        request.setAttribute("categories", categories);
        request.getRequestDispatcher("/view/question/searchByCategory.jsp").forward(request, response);
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
        int cid = Integer.parseInt(request.getParameter("category_id"));
        request.setAttribute("categoryID", cid);
        
        QuestionDBContext qdb = new QuestionDBContext();
        ArrayList<Post> posts = qdb.searchByCategory(cid);
        request.setAttribute("posts", posts);
        
        CategoryDBContext categoryDB = new CategoryDBContext();
        ArrayList<Category> categories = categoryDB.getCategories();
        request.setAttribute("categories", categories);
        
        request.getRequestDispatcher("/view/question/searchByCategory.jsp").forward(request, response);
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
