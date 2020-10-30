package backend;

import java.sql.ResultSet;

/**
 *
 * @author Abel Moremi
 */

public class Employee extends DataConnection{

    public ResultSet getEmployees(){
        String stmt = "SELECT * FROM T_Employee";
        ResultSet rs = this.runStatement(stmt);
        return rs;
    }

    public ResultSet getEmployee(String ENo){
        String stmt = "SELECT * FROM T_Employee WHERE employee_ENo='"+ENo+"'";
        ResultSet rs = this.runStatement(stmt);
        return rs;
    }

}
