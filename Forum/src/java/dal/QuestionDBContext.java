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
            String sql = "SELECT p.*, c.title as cname FROM Post P\n"
                    + "INNER JOIN Category c ON p.category_id = c.id \n"
                    + "ORDER BY id DESC";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Post p = new Post();
                p.setId(rs.getInt("id"));
                p.setTitle(rs.getString("title"));
                p.setContent(rs.getString("content"));
                p.setTime_created(rs.getDate("time_created"));
                p.setUsername(rs.getString("username"));
                Category c = new Category();
                c.setId(rs.getInt("category_id"));
                c.setTitle(rs.getString("cname"));
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
            String sql = "SELECT p.*, c.title as cname FROM Post P\n"
                    + "INNER JOIN Category c ON p.category_id = c.id\n"
                    + "WHERE p.username = ?\n"
                    + "ORDER BY id DESC";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, username);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Post p = new Post();
                p.setId(rs.getInt("id"));
                p.setTitle(rs.getString("title"));
                p.setContent(rs.getString("content"));
                p.setTime_created(rs.getDate("time_created"));
                p.setUsername(rs.getString("username"));
                Category c = new Category();
                c.setId(rs.getInt("category_id"));
                c.setTitle(rs.getString("cname"));
                p.setCategory(c);
                p.setAttachment(rs.getString("attachment"));
                posts.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuestionDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return posts;
    }

    public Post getPostsById(int id) {
        try {
            String sql = "SELECT p.*, c.title as cname FROM Post P\n"
                    + "INNER JOIN Category c ON p.category_id = c.id \n"
                    + "WHERE p.id = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Post p = new Post();
                p.setId(rs.getInt("id"));
                p.setTitle(rs.getString("title"));
                p.setContent(rs.getString("content"));
                p.setTime_created(rs.getDate("time_created"));
                p.setUsername(rs.getString("username"));
                Category c = new Category();
                c.setId(rs.getInt("category_id"));
                c.setTitle(rs.getString("cname"));
                p.setCategory(c);
                p.setAttachment(rs.getString("attachment"));
                return p;
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuestionDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    //update DANG BUG
    public void updatePost(Post p) {
        try {
            String sql = "UPDATE [Post]\n"
                    + "   SET [title] = ?\n"
                    + "      ,[content] = ?\n"
                    + "      ,[category_id] = ?\n"
                    + " WHERE id = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, p.getTitle());
            stm.setString(2, p.getContent());
            stm.setInt(3, p.getCategory().getId());
            stm.setInt(4, p.getId());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(QuestionDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //delete DANG BUG
    public void deletePost(int id) {
        try {
            String sql = "DELETE [Post] WHERE id = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(QuestionDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int countAnswer(int id) {
        int answers = 0;
        try {
            String sql = "SELECT COUNT(c.comment_id) as answers, p.id, p.title, p.content ,p.time_created,p.attachment,p.username FROM Post p \n"
                    + "LEFT JOIN Comment c ON p.id = c.post_id\n"
                    + "GROUP BY p.id, p.title, p.content ,p.time_created,p.attachment,p.username\n"
                    + "HAVING p.id = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                answers = rs.getInt("answers");
                return answers;
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuestionDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    //list post no answers
    public ArrayList<Post> getPostsNoAns() {
        ArrayList<Post> posts = new ArrayList<>();
        try {
            String sql = "SELECT a.answers, a.id, a.title, a.content ,a.time_created,a.attachment,a.username, a.category_id as cid  , ca.title as cname  FROM\n"
                    + "(SELECT COUNT(c.comment_id) as answers, p.id, p.title, p.content ,p.time_created,p.attachment,p.username, p.category_id \n"
                    + "FROM Post p \n"
                    + "LEFT JOIN Comment c ON p.id = c.post_id\n"
                    + "GROUP BY p.id, p.title, p.content ,p.time_created,p.attachment,p.username, p.category_id\n"
                    + ") as a\n"
                    + "INNER JOIN Category ca ON a.category_id = ca.id\n"
                    + "WHERE a.answers = 0\n"
                    + "ORDER BY a.id DESC, a.answers DESC";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Post p = new Post();
                p.setId(rs.getInt("id"));
                p.setTitle(rs.getString("title"));
                p.setContent(rs.getString("content"));
                p.setTime_created(rs.getDate("time_created"));
                p.setUsername(rs.getString("username"));
                Category c = new Category();
                c.setId(rs.getInt("cid"));
                c.setTitle(rs.getString("cname"));
                p.setCategory(c);
                p.setAttachment(rs.getString("attachment"));
                posts.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuestionDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return posts;
    }

    //list post no answers
    public ArrayList<Post> getPostsMostResponse() {
        ArrayList<Post> posts = new ArrayList<>();
        try {
            String sql = "SELECT a.answers, a.id, a.title, a.content ,a.time_created,a.attachment,a.username, a.category_id as cid  , ca.title as cname  FROM\n"
                    + "(SELECT COUNT(c.comment_id) as answers, p.id, p.title, p.content ,p.time_created,p.attachment,p.username, p.category_id \n"
                    + "FROM Post p \n"
                    + "LEFT JOIN Comment c ON p.id = c.post_id\n"
                    + "GROUP BY p.id, p.title, p.content ,p.time_created,p.attachment,p.username, p.category_id\n"
                    + ") as a\n"
                    + "INNER JOIN Category ca ON a.category_id = ca.id\n"
                    + "ORDER BY a.answers DESC, a.id DESC";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Post p = new Post();
                p.setId(rs.getInt("id"));
                p.setTitle(rs.getString("title"));
                p.setContent(rs.getString("content"));
                p.setTime_created(rs.getDate("time_created"));
                p.setUsername(rs.getString("username"));
                Category c = new Category();
                c.setId(rs.getInt("cid"));
                c.setTitle(rs.getString("cname"));
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
