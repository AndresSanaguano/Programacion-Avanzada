/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author SonyVaio
 */

public class product {
   private int  id;
    private String name;
    private String description;
    private int stock;
    private int price;
public product(){
    
}
  public static void main(String[] args){
  Conexion c=new Conexion();
  c.getConnection();
    }
    private Conexion conexion = new Conexion();

    public product(int id, String name, String description, int stock, int price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.stock = stock;
        this.price = price;
    }
    
  public void RegisterProducto( int id,String name,String description, int stock, int price){
       Connection con = conexion.getConnection();
        Statement st;
        //Creamos las sentenia sql
        String sql = "INSERT INTO product(id,name,description,stock,price) "
                + "VALUES ('" + id+ "','" +name+ "','" + description+ "','"+ stock+ "','" + price + "')";
        //Ejecutamos la sentencia SQL
        try {
            st = con.createStatement();
            st.executeUpdate(sql);
            //Cerramos las conexiones 
            st.close();
            con.close();
        }    catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error no se puse registrar la provincia");
        }
  }
  
  public String  ListproductData(){
   Connection con = conexion.getConnection();
        Statement st;
        ResultSet rs;
          ArrayList l=new ArrayList();
        String sql = "SELECT * FROM product";
        String list="";
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {//id,name,description,stock,price
               list=list+("id:" + rs.getInt(1) + " name_p:" + rs.getString(2) + "description:" + rs.getString(3) + " stock:" + rs.getInt(4) + "price:" + rs.getInt(5)+"\n");
               l.add(list);
            }
            rs.close();
            st.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a los datos de Alumnos");
        }
        return list;
}

  
   public ArrayList  ListProviderData(){
   Connection con = conexion.getConnection();
        Statement st;
        ArrayList l=new ArrayList();
        ResultSet rs;
        String sql = "SELECT * FROM provider";
        String list="";
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {//id,name,description,stock,price
               list=("id:" + rs.getInt(1) + " name:" + rs.getString(2) + " address:" + rs.getString(3) + " telephone:" + rs.getString(4) +"\n");
               l.add(list);
            }
            rs.close();
            st.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a los datos de Alumnos");
        }
        return l;
}
   
  public report SearchProduct(String nameproduct,String nameprovide) {
        Conexion con = new Conexion();
        Statement st;
        report report = null;
        String msj = "no";
        //Creamos las sentenia sql
        String sql = "SELECT *FROM product WHERE name_pro LIKE '" + name + "%'";
        try {
            st = con.getConnection().createStatement();
            ResultSet respuesta = st.executeQuery(sql);
            while (respuesta.next()) {
                String name = respuesta.getString(2);
                System.out.println("" + name);
                if (name.equals(nameproduct)) {
                    System.out.println("" + nameproduct);
                    report = new report();
                    report.setId(respuesta.getInt(1));
                    report.setName(respuesta.getString(2));
                    report.setStock(respuesta.getInt(3));
                    report.setPrice(respuesta.getInt(4));
                    report.setDescription(respuesta.getString(5));
                    msj = "exito";
                    return report;
                }
                respuesta.close();
                st.close();
            }
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a los datos de Alumnos");
        }
         return report;
  }

    public report SearchProduct(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
    /**
     * @return the id
     */


    /**
     * @return the instrictor
     */
    

}
