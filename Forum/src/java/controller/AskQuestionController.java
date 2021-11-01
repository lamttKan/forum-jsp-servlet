/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.authentication.BaseRequireAuthenController;
import dal.CategoryDBContext;
import dal.QuestionDBContext;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import static java.lang.System.out;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import model.Account;
import model.Category;
import model.Post;

/**
 *
 * @author ADMIN
 */
@MultipartConfig(maxFileSize = 16177215)
public class AskQuestionController extends BaseRequireAuthenController {

    @Override
    protected void processGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        CategoryDBContext categoryDB = new CategoryDBContext();
        ArrayList<Category> categories = categoryDB.getCategories();
        request.setAttribute("categories", categories);
        request.getRequestDispatcher("/view/question/ask.jsp").forward(request, response);
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
    protected void processPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Account account = (Account) request.getSession().getAttribute("account");
        String username = account.getUsername();
        String title = request.getParameter("title");
        String content = request.getParameter("content");

        String folderName = "assert";
        String uploadPath = request.getServletContext().getRealPath("") + File.separator + folderName;
        File dir = new File(uploadPath);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        String pattern = "dd.MM.yyyy hh.mm.ss.SSS";
        DateFormat df = new SimpleDateFormat(pattern);

        Part filePart = request.getPart("attachment");
        String fileName = filePart.getSubmittedFileName();

        Timestamp added_date = new Timestamp(System.currentTimeMillis());
        String today = df.format(added_date);

        String attachment = folderName + File.separator + today + fileName;
        InputStream is = filePart.getInputStream();
        Files.copy(is, Paths.get(uploadPath + File.separator + today + fileName));

        Post p = new Post();
        p.setTitle(title);
        p.setContent(content);
        p.setUsername(username);
        Category c = new Category();
        c.setId(Integer.parseInt(request.getParameter("category_id")));
        p.setCategory(c);
        p.setAttachment(attachment);

        QuestionDBContext db = new QuestionDBContext();
        db.insert(p);

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
