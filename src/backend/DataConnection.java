/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package backend;

import java.sql.*;
import java.lang.*;

/**
 *
 * @author 201503625
 */
public class DataConnection {
   DataConnection(){
    String listBooks = "SELECT * FROM T_Book";
    Statement stmt;

    try {
       System.out.println("Example 1");
       System.out.println("Using JDBC + Oracle on java");
       Class.forName("oracle.jdbc.OracleDriver").newInstance();
    } 
    catch (Exception E) {
        System.err.println("Unable to load driver.");
        E.printStackTrace();
    }

    try {
        Connection con = DriverManager.getConnection(
                    "",
                    "", 
                    ""
        );
   
        stmt = con.createStatement();       
        ResultSet rs =   stmt.executeQuery(listBooks);
        System.out.println("Executed " + listBooks);
        while( rs.next()) {
            String Author = rs.getString("Author");
            String Title = rs.getString("Title");
            System.out.println(Author + "  " + Title);
        }
  
        stmt.close();
        con.close();
        
    }catch(SQLException ex) {
        System.err.println("SQLException: " + ex.getMessage());
    }
 }

 protected void finalize() throws Throwable{
 }

 public static void main(String arguments[]){//TODO::Add entry code
    DataConnection ma = new DataConnection();
 } 
}
