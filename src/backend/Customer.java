package backend;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Abel Moremi
 */

public class Customer extends DataConnection{

    public ArrayList<String[]> getCustomers() throws SQLException{
        String stmt = "SELECT * FROM T_Customer";
        ResultSet rs = this.runStatement(stmt);
        
        ArrayList<String[]> customerList = new ArrayList<>();
        
        while(rs.next()){
            
            String[] temp = new String[3];
            temp[0] = rs.getString("customer_CNo");
            temp[1] = rs.getString("customer_Name");
            temp[2] = rs.getString("customer_surname");
            
            customerList.add(temp);
        }
        
        return customerList;
    }

    public ArrayList<String[]> getCustomer(String CNo) throws SQLException{
        String stmt = "SELECT * FROM T_Customer WHERE customer_CNo='"+CNo+"'";
        ResultSet rs = this.runStatement(stmt);
        
        ArrayList<String[]> customerList = new ArrayList<>();
        
        while(rs.next()){
            
            String[] temp = new String[3];
            temp[0] = rs.getString("customer_CNo");
            temp[1] = rs.getString("customer_Name");
            temp[2] = rs.getString("customer_surname");
            
            customerList.add(temp);
        }
        
        return customerList;
    }
    
     public int getlastCno() throws SQLException{
        int lastDigits = 00;
        String eno = "cus100";
        String last3Char = "100";
        
        String getMaxCnoStmt = "SELECT customer_CNo "
                + "FROM T_Customer "
                + "WHERE customer_CNo = (SELECT MAX(customer_CNo) FROM T_Customer)";
        
        ResultSet rs = this.runStatement(getMaxCnoStmt);
        
        while(rs.next()){

            eno = rs.getString("customer_CNo");
        }
       
        last3Char = eno.substring(Math.max(eno.length() - 3, 0));
        
        lastDigits = Integer.parseInt(last3Char) + 1;
        
        return lastDigits;
    }

    public void addCustomer(String CNo, String name, String surname){
        String addCustomerStmt = "INSERT INTO T_Customer (customer_CNo, customer_Name, customer_surname)" 
                + "VALUES('"+CNo+"', '"+name+"', '"+surname+"')";
        this.runStatement(addCustomerStmt);
    }

    public void updateCustomer(String CNo, String newName, String newSurname){
        String updateCustomerStmt = "UPDATE T_Customer "
                + "SET customer_Name = '"+newName+"', customer_surname = '"+newSurname+"'"
                + "WHERE customer_CNo='"+CNo+"'";
        
        this.runStatement(updateCustomerStmt);
    }

    public void deleteCustomer(String CNo){
        String deleteCustomerStmt = "DELETE FROM T_Customer WHERE customer_CNo='"+CNo+"'";
        this.runStatement(deleteCustomerStmt);
    }
}
