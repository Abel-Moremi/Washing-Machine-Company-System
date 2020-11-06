package backend;

import java.sql.ResultSet;
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
        String stmt = "SELECT * FROM FROM T_Customer WHERE customer_CNo='"+CNo+"'";
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
