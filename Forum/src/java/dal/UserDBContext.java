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
import model.User;

/**
 *
 * @author ADMIN
 */
public class UserDBContext extends DBContext{
    public ArrayList<User> getUsers(){
        ArrayList<User> users = new ArrayList<>();
        try {
            String sql = "SELECT * FROM User";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                User u = new User();
                u.setFirstname(rs.getString("firstname"));
                u.setLastname(rs.getString("lastname"));
                u.setGender(rs.getBoolean("gender"));
                u.setDob(rs.getDate("dob"));
                u.setEmail(rs.getString("email"));
                users.add(u);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return users;
    }
    
    public User getUser(String username){
        try {
            String sql = "SELECT * FROM [User] WHERE username = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, username);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                User u = new User();
                u.setFirstname(rs.getString("firstname"));
                u.setLastname(rs.getString("lastname"));
                u.setGender(rs.getBoolean("gender"));
                u.setDob(rs.getDate("dob"));
                u.setEmail(rs.getString("email"));
                return u;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
