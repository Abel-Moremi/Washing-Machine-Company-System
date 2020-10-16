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
    String CompanyName = "SELECT WMC_NAME FROM T_WMC";
    Statement stmt;

    try {
       System.out.println("Using JDBC + Oracle on java");
       Class.forName("oracle.jdbc.OracleDriver").newInstance();
    } 
    catch (Exception E) {
        System.err.println("Unable to load driver.");
        E.printStackTrace();
    }

    try {
        Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@10.0.18.2:1521:orcl",
                    "mor03625", 
                    "mor03625"
        );
   
        stmt = con.createStatement();       
        ResultSet rs = stmt.executeQuery(CompanyName);
        System.out.println("Executed " + CompanyName);
        
        String name = "Nothing yet";
        while(rs.next()) {
            name = rs.getString("WMC_NAME");
            System.out.println(name);
        }
        
        System.out.println(name);
        stmt.close();
        con.close();
        
    }catch(SQLException ex) {
        System.err.println("SQLException: " + ex.getMessage());
    }
 }

 protected void finalize() throws Throwable{
 }

 public static void main(String arguments[]){
    DataConnection ma = new DataConnection();
 } 
}
