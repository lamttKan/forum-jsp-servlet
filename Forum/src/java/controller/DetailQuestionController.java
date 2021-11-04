/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.CommentDBContext;
import dal.QuestionDBContext;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;
import model.Comment;
import model.Post;

/**
 *
 * @author ADMIN
 */
public class DetailQuestionController extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        QuestionDBContext qdb = new QuestionDBContext();
        Post p = qdb.getPostsById(id);
        request.setAttribute("post", p);
        
        CommentDBContext cdb = new CommentDBContext();
        ArrayList<Comment> comments = cdb.getCommentsByPostId(id);
        request.setAttribute("comments", comments);
        request.getRequestDispatcher("../view/question/detail.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String content = (request.getParameter("cmt_content"));
        Account account = (Account) request.getSession().getAttribute("account");
        String username = account.getUsername();
        int postid = Integer.parseInt(request.getParameter("postid"));
        
        CommentDBContext db = new CommentDBContext();
        db.insertComment(content, username, postid);
        response.sendRedirect("detail?" + postid);
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
