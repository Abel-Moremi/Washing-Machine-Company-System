package backend;

import java.sql.ResultSet;

/**
 *
 * @author Abel Moremi
 */

public class Customer extends DataConnection{

    public ResultSet getCustomers(){
        String stmt = "SELECT * FROM T_Customer";
        ResultSet rs = this.runStatement(stmt);
        
        
        return rs;
    }

    public ResultSet getCustomer(String CNo){
        String stmt = "SELECT * FROM FROM T_Customer WHERE customer_CNo='"+CNo+"'";
        ResultSet rs = this.runStatement(stmt);
        return rs;
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
