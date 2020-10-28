/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package backend;

import java.sql.*;
/**
 *
 * @author Abel Moremi
 */
public class DataConnection {
    
    String connectURL = "jdbc:oracle:thin:@10.0.18.2:1521:orcl";
    String connectName = "mor03625";
    String connectPass = "mor03625";
    
    Statement stmt = null;
    Connection conn = null;
    
    DataConnection(){
        try {
            System.out.println("Using JDBC + Oracle on java");
            Class.forName("oracle.jdbc.OracleDriver").newInstance();
        } 
        catch (Exception E) {
            System.err.println("Unable to load driver.");
            E.printStackTrace();
        }
    }
    
    public ResultSet runStatement(String statement){
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection(
                connectURL,
                connectName, 
                connectPass
            );

            stmt = conn.createStatement();       
            rs = stmt.executeQuery(statement);
            System.out.println("Executed " + statement);
            
            //printResultSet(rs);
            
            // Close connection and statement
            //close(stmt, conn);

        }catch(SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        return rs;
    }
    
    public void printResultSet(ResultSet rs){
        try{
           while(rs.next()){
            System.out.println(
                rs.getString("part_PartNo")+" "+
                rs.getString("part_description")+" "+
                rs.getString("part_cost")+" "+
                rs.getString("part_manufactureDate")     
            );
           } 
        }catch(SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }
    
    public void close(Statement stmt, Connection conn){
        try{
            stmt.close();
            conn.close();
        }catch(SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }

    /*public static void main(String arguments[]){
      DataConnection ma = new DataConnection();
      ResultSet rs = ma.runStatement("SELECT WMC_NAME FROM T_WMC");
      ma.printResultSet(rs);
    }*/
}
