/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.CategoryDBContext;
import dal.QuestionDBContext;
import java.io.IOException;
import static java.lang.System.out;
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
public class UpdateController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        
        QuestionDBContext db = new QuestionDBContext();
        Post p = db.getPostsById(id);
        request.setAttribute("post", p);
        
        CategoryDBContext categoryDB = new CategoryDBContext();
        ArrayList<Category> categories = categoryDB.getCategories();
        request.setAttribute("categories", categories);
        
        request.getRequestDispatcher("../view/question/update.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Account account = (Account) request.getSession().getAttribute("account");
        String username = account.getUsername();
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        Post p = new Post();
        p.setTitle(title);
        p.setContent(content);
        p.setUsername(username);
        Category c = new Category();
        c.setId(Integer.parseInt(request.getParameter("category_id")));
        p.setCategory(c);
        String id = request.getParameter("id");
        QuestionDBContext db = new QuestionDBContext();
        db.updatePost(p);
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
