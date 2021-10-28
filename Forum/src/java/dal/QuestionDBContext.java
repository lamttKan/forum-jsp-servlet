/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Category;
import model.Post;

/**
 *
 * @author ADMIN
 */
public class QuestionDBContext extends DBContext {

    //ask question
    public void insert(Post p) {
        try {
            String sql = "INSERT INTO [Post]\n"
                    + "           ([title]\n"
                    + "           ,[content]\n"
                    + "           ,[time_created]\n"
                    + "           ,[username]\n"
                    + "           ,[category_id]\n"
                    + "           ,[attachment])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,GETDATE()\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, p.getTitle());
            stm.setString(2, p.getContent());
            stm.setString(3, p.getUsername());
            stm.setInt(4, p.getCategory().getId());
            stm.setString(5, p.getAttachment());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(QuestionDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //list post
    public ArrayList<Post> getPosts() {
        ArrayList<Post> posts = new ArrayList<>();
        try {
            String sql = "SELECT [id]\n"
                    + "      ,[title]\n"
                    + "      ,[content]\n"
                    + "      ,[time_created]\n"
                    + "      ,[username]\n"
                    + "      ,[category_id]\n"
                    + "      ,[attachment]\n"
                    + "  FROM [Post]";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Post p = new Post();
                p.setTitle(rs.getString("title"));
                p.setContent(rs.getString("content"));
                p.setTime_created(rs.getDate("time_created"));
                p.setUsername(rs.getString("username"));
                Category c = new Category();
                c.setId(rs.getInt("category_id"));
                p.setCategory(c);
                p.setAttachment(rs.getString("attachment"));
                posts.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuestionDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return posts;
    }

    //get post by username
    public ArrayList<Post> getPostByUser(String username) {
        ArrayList<Post> posts = new ArrayList<>();
        try {
            String sql = "SELECT [id]\n"
                    + "      ,[title]\n"
                    + "      ,[content]\n"
                    + "      ,[time_created]\n"
                    + "      ,[username]\n"
                    + "      ,[category_id]\n"
                    + "      ,[attachment]\n"
                    + "  FROM [Post] WHERE [username] = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, username);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Post p = new Post();
                p.setTitle(rs.getString("title"));
                p.setContent(rs.getString("content"));
                p.setTime_created(rs.getDate("time_created"));
                p.setUsername(rs.getString("username"));
                Category c = new Category();
                c.setId(rs.getInt("category_id"));
                p.setCategory(c);
                p.setAttachment(rs.getString("attachment"));
                posts.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuestionDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return posts;
    }

}
