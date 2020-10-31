package backend;

import java.sql.ResultSet;

/**
 *
 * @author Abel Moremi
 */

public class Supervisor extends DataConnection{

    public ResultSet getSupervisors(){
        String stmt = "SELECT * FROM T_Supervisor";
        ResultSet rs = this.runStatement(stmt);
        return rs;
    }

    public ResultSet getSupervisor(String MNo, String ENo){
        String stmt = "SELECT * FROM  T_Supervisor" 
                +"WHERE supervisor_machine_MNo='"+MNo+"' AND  supervisor_employee_ENo='"+ENo+"'";
        ResultSet rs = this.runStatement(stmt);
        return rs;
    }

    public void addSupervisor(String MNo, String ENo){
        String addSupervisorStmt = "INSERT INTO  T_Supervisor (supervisor_machine_MNo, supervisor_employee_ENo)" 
                + "VALUES('"+MNo+"', '"+ENo+"')";
        this.runStatement(addSupervisorStmt);
    }

    public void updateSupervisor(String MNo, String ENo){
        String updateSupervisorStmt = "UPDATE T_Supervisor "
                + "SET supervisor_employee_ENo='"+ENo+"'"
                + "WHERE supervisor_machine_MNo='"+MNo+"' AND  supervisor_employee_ENo='"+ENo+"'";
        
        this.runStatement(updateSupervisorStmt);
    }
    
}
