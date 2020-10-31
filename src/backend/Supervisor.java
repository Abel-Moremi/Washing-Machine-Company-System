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
        String stmt = "SELECT * FROM  T_MadeOn" 
                +"WHERE supervisor_machine_MNo='"+MNo+"' AND  supervisor_employee_ENo='"+ENo+"'";
        ResultSet rs = this.runStatement(stmt);
        return rs;
    }
    
}
