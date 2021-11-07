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

/**
 *
 * @author ADMIN
 */
public class UserDBContext extends DBContext {

    //get user
    public ArrayList<Account> getUsers() {
        ArrayList<Account> users = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Account";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Account u = new Account();
                u.setFirstname(rs.getString("firstname"));
                u.setLastname(rs.getString("lastname"));
                u.setGender(rs.getBoolean("gender"));
                u.setDob(rs.getDate("dob"));
                u.setEmail(rs.getString("email"));
                u.setUsername(rs.getString("username"));
                users.add(u);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return users;
    }

    //get user by username
    public Account getUser(String username) {
        try {
            String sql = "SELECT * FROM [Account] WHERE username = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, username);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Account u = new Account();
                u.setFirstname(rs.getString("firstname"));
                u.setLastname(rs.getString("lastname"));
                u.setGender(rs.getBoolean("gender"));
                u.setDob(rs.getDate("dob"));
                u.setEmail(rs.getString("email"));
                u.setUsername(rs.getString("username"));
                return u;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    //update profile 
    public void updateProfile(Account a) {
        try {
            String sql = "UPDATE [Account]\n"
                    + "   SET \n"
                    + "      [firstname] = ?\n"
                    + "      ,[lastname] = ?\n"
                    + "      ,[gender] = ?\n"
                    + "      ,[dob] = ?\n"
                    + "      ,[email] = ?\n"
                    + " WHERE username = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, a.getFirstname());
            stm.setString(2, a.getLastname());
            stm.setBoolean(3, a.getGender());
            stm.setDate(4, a.getDob());
            stm.setString(5, a.getEmail());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //search user
    public ArrayList<Account> searchUser(String search) {
        ArrayList<Account> users = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Account WHERE username \n"
                    + "LIKE ? \n"
                    + "OR firstname LIKE ? \n"
                    + "OR lastname LIKE ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            String searchname = "%" + search + "%";
            stm.setString(1, searchname);
            stm.setString(2, searchname);
            stm.setString(3, searchname);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Account u = new Account();
                u.setFirstname(rs.getString("firstname"));
                u.setLastname(rs.getString("lastname"));
                u.setGender(rs.getBoolean("gender"));
                u.setDob(rs.getDate("dob"));
                u.setEmail(rs.getString("email"));
                u.setUsername(rs.getString("username"));
                users.add(u);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return users;
    }

}
