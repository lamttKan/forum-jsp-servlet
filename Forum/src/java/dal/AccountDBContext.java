/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;

/**
 *
 * @author ADMIN
 */
public class AccountDBContext extends DBContext {

    public Account getAccount(String username, String password) {
        try {
            String sql = "SELECT [username]\n"
                    + "      ,[password]\n"
                    + "      ,[displayName]\n"
                    + "  FROM [Account]\n"
                    + "  WHERE [username] = ? AND [password] = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                Account account = new Account();
                account.setUsername(username);
                account.setPassword(password);
                account.setDisplayname(rs.getString("displayname"));
                return account;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void registerAccount(String username, String password, String displayname) {

        try {
            //create acc
            String sql = "INSERT INTO [Account]\n"
                    + "           ([username]\n"
                    + "           ,[password]\n"
                    + "           ,[displayname])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            stm.setString(3, displayname);
            stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
