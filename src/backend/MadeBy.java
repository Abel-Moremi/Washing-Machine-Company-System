package backend;

import java.sql.ResultSet;

/**
 *
 * @author Abel Moremi
 */


public class MadeBy extends DataConnection{
    
    public ResultSet getMadeBys(){
        String stmt = "SELECT * FROM T_MadeBy";
        ResultSet rs = this.runStatement(stmt);
        return rs;
    }

    public ResultSet getMadeBy(String PrtNo, String ENo){
        String stmt = "SELECT * FROM  T_Supervisor" 
                +"WHERE  madeby_part_PartNo='"+PrtNo+"' AND  madeby_employee_ENo='"+ENo+"'";
        ResultSet rs = this.runStatement(stmt);
        return rs;
    }
}
