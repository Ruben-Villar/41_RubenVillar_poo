/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_as;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ING RUBER VILLAR PDA
 */
public class Conexion {
    
   Connection con;

    public Conexion() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/general?characterEncoding=UTF-8", "root", "");

        } catch (Exception e) {
            System.out.println("Error conexion " + e);
        }
    }
    
    public Connection getConnection(){
        return con;
    }
}
