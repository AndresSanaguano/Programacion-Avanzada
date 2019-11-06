/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexion {

    private static final String db = "appmobile?useTimezone=true&serverTimezone=UTC";
    private static final String URL = "jdbc:mysql://localhost:3306/" + db;
    private static final String USERNAME = "root";
    private static final String PASSSWORD = "";

    public  Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSSWORD);
            java.lang.System.out.println("Conexion realizada con exito");
        } catch (Exception e) {
            java.lang.System.out.println("Conexion Fallida");
        }
        return connection;
    }
    
    public static void main(String[] args){
  Conexion c=new Conexion();
  c.getConnection();
    }
}
