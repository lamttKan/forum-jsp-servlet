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
import model.Account;
import model.Comment;
import model.Post;

/**
 *
 * @author ADMIN
 */
public class CommentDBContext extends DBContext {

    public void insertComment(Comment c) {
        try {
            String sql = "INSERT INTO [Comment]\n"
                    + "           ([comment_id]\n"
                    + "           ,[time_created]\n"
                    + "           ,[content]\n"
                    + "           ,[username]\n"
                    + "           ,[post_id])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,GETDATE()\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, c.getId());
            stm.setString(2, c.getContent());
            stm.setString(3, c.getAccount().getUsername());
            stm.setInt(4, c.getPost().getId());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CommentDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateComment(Comment c) {
        try {
            String sql = "UPDATE [Comment]\n"
                    + "   SET [content] = ?\n"
                    + "      \n"
                    + " WHERE comment_id = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, c.getContent());
            stm.setInt(2, c.getId());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CommentDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteComment(Comment c){
        try {
            String sql = "DELETE FROM [Comment] WHERE comment_id = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, c.getId());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CommentDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Comment> getCommentsByPostId(int postId){
        ArrayList<Comment> comments = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Comment WHERE post_id = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, postId);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                Comment c = new Comment();
                c.setId(rs.getInt("comment_id"));
                c.setTime_created(rs.getDate("time_created"));
                c.setContent(rs.getString("content"));
                Account a = new Account();
                a.setUsername(rs.getString("username"));
                c.setAccount(a);
                Post p = new Post();
                p.setId(postId);
                c.setPost(p);
                comments.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CommentDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return comments;
    }

}
