/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConexionDB {
      Connection cn;
    
   public ConexionDB(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        cn = DriverManager.getConnection("jdbc:mysql://localhost:33060/banco_db", "root", "oscar");
    } catch (Exception e)  {
            System.out.println("Error:"+ e);
    }
  }    
   public Connection getConnection(){
       return cn;
   }
}

