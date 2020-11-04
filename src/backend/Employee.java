package backend;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Abel Moremi
 */

public class Employee extends DataConnection{

    public ArrayList<String[]> getEmployees() throws SQLException{
        String stmt = "SELECT * FROM T_Employee";
        ResultSet rs = this.runStatement(stmt);
        
        ArrayList<String[]> employeeList = new ArrayList<>();
        
        while(rs.next()){
            
            String[] temp = new String[4];
            temp[0] = rs.getString("employee_ENo");
            temp[1] = rs.getString("employee_Name");
            temp[2] = rs.getString("employee_Designation");
            temp[3] = rs.getString("employee_Salary");
            
            employeeList.add(temp);
        }
        
        return employeeList;
    }

    public  ArrayList<String[]> getEmployee(String ENo) throws SQLException{
        String stmt = "SELECT * FROM T_Employee WHERE employee_ENo='"+ENo+"'";
        ResultSet rs = this.runStatement(stmt);
        
        ArrayList<String[]> employeeList = new ArrayList<>();
        
        while(rs.next()){
            
            String[] temp = new String[4];
            temp[0] = rs.getString("employee_ENo");
            temp[1] = rs.getString("employee_Name");
            temp[2] = rs.getString("employee_Designation");
            temp[3] = rs.getString("employee_Salary");
            
            employeeList.add(temp);
        }
        
        return employeeList;
    }

    public void addEmplyee(String ENo, String name, String designation, int salary){
        String addEmployeeStmt = "INSERT INTO T_Employee (employee_ENo, employee_Name, employee_Designation)" 
                + "VALUES('"+ENo+"', '"+name+"', '"+designation+"', '"+salary+"')";
        this.runStatement(addEmployeeStmt);
    }

    public void deleteEmployee(String ENo){
        String deleteEmployeeStmt = "DELETE FROM T_Employee WHERE employee_ENo='"+ENo+"'";
        this.runStatement(deleteEmployeeStmt);
    }

}
