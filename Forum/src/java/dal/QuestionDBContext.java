/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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

    //get post by post id
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

    //update 
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

    //delete 
    public void deletePost(int id) {
        try {
            connection.setAutoCommit(false);

            //delete comment
            String sql_cmt = "DELETE FROM [Comment] WHERE post_id = ?";
            PreparedStatement stm_cmt = connection.prepareStatement(sql_cmt);
            stm_cmt.setInt(1, id);
            stm_cmt.executeUpdate();

            //delete post
            String sql = "DELETE [Post] WHERE id = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            stm.executeUpdate();

            //commit transaction
            connection.commit();
        } catch (SQLException ex) {
            Logger.getLogger(QuestionDBContext.class.getName()).log(Level.SEVERE, null, ex);
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(QuestionDBContext.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(QuestionDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    //count total answer of a post
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

    //list post most answers
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

    //search by category
    public ArrayList<Post> searchByCategory(int cid) {
        ArrayList<Post> posts = new ArrayList<>();
        try {
            String sql = "SELECT p.* , c.id as cid, c.title as cname FROM Post p\n"
                    + "INNER JOIN Category c ON p.category_id = c.id\n"
                    + "WHERE p.category_id = ?\n"
                    + "ORDER BY p.id DESC";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, cid);
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

    //advanced search
    public ArrayList<Post> searchAdvance(String title, String content, Date from, Date to, int cid, String username) {
        ArrayList<Post> posts = new ArrayList<>();
        try {
            String sql = "SELECT p.* , c.title as cname FROM Post p \n"
                    + "INNER JOIN Category c ON p.category_id = c.id\n"
                    + "WHERE\n"
                    + "(1=1)";

            int paramIndex = 0;
            HashMap<Integer, Object[]> params = new HashMap<>();

            if (title != null && title.length() > 0) {
                sql += " AND p.title like '%' + ? + '%'";
                paramIndex++;
                Object[] param = new Object[2];
                param[0] = String.class.getName();
                param[1] = title;
                params.put(paramIndex, param);
            }
            if (content != null && content.length() > 0) {
                sql += " AND p.content like '%' + ? + '%'";
                paramIndex++;
                Object[] param = new Object[2];
                param[0] = String.class.getName();
                param[1] = content;
                params.put(paramIndex, param);
            }
            if (from != null) {
                sql += " AND p.time_created >= ?";
                paramIndex++;
                Object[] param = new Object[2];
                param[0] = Date.class.getName();
                param[1] = from;
                params.put(paramIndex, param);
            }
            if (to != null) {
                sql += " AND p.time_created <= ?";
                paramIndex++;
                Object[] param = new Object[2];
                param[0] = Date.class.getName();
                param[1] = to;
                params.put(paramIndex, param);
            }
            if (cid != -1) {
                sql += " AND p.category_id = ?";
                paramIndex++;
                Object[] param = new Object[2];
                param[0] = Integer.class.getName();
                param[1] = cid;
                params.put(paramIndex, param);
            }
            if (username != null && username.length() > 0) {
                sql += " AND p.username like '%' + ? + '%'";
                paramIndex++;
                Object[] param = new Object[2];
                param[0] = String.class.getName();
                param[1] = username;
                params.put(paramIndex, param);
            }

            PreparedStatement stm = connection.prepareStatement(sql);

            for (Map.Entry<Integer, Object[]> entry : params.entrySet()) {
                Integer index = entry.getKey();
                Object[] value = entry.getValue();
                String type = value[0].toString();
                if (type.equals(Integer.class.getName())) {
                    stm.setInt(index, (Integer) value[1]);
                } else if (type.equals(String.class.getName())) {
                    stm.setString(index, value[1].toString());
                } else if (type.equals(Date.class.getName())) {
                    stm.setDate(index, (Date) value[1]);
                } else if (type.equals(Boolean.class.getName())) {
                    stm.setBoolean(index, (Boolean) value[1]);
                }
            }

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

    //list with paging
    //list post
    public ArrayList<Post> getPostsWithPaging(int pageindex, int pagesize) {
        ArrayList<Post> posts = new ArrayList<>();
        try {
            String sql = "SELECT * FROM\n"
                    + "(\n"
                    + "SELECT ROW_NUMBER() OVER (ORDER BY p.id asc) as rownum, p.*, c.title as cname\n"
                    + "FROM Post p\n"
                    + "INNER JOIN Category c ON p.category_id = c.id\n"
                    + ") t\n"
                    + "WHERE >= (? - 1)*? + 1 AND rownum <= ? * ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, pageindex);
            stm.setInt(2, pagesize);
            stm.setInt(3, pageindex);
            stm.setInt(4, pagesize);
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

    public int getRowCount() {
        try {
            String sql = "SELECT Count(*) as Total  FROM Post";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                return rs.getInt("Total");
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuestionDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

}
