package backend;

import java.sql.ResultSet;

/**
 *
 * @author Abel Moremi
 */

public class Machine extends DataConnection{
    public ResultSet getMachine(){
        String stmt = "SELECT WMC_NAME FROM T_Machine";
        ResultSet rs = this.runStatement(stmt);
        return rs;
    }

    public void addMachine(String MNo, String name){
        String addMachineStmt = "INSERT INTO T_Machine (machine_MNo, machine_name)" 
                + "VALUES('"+MNo+"', '"+name+"')";
        this.runStatement(addMachineStmt);
    }

    public void updateMachine(String MNo, String NewName){
        String updateMachineStmt = "UPDATE T_Part "
                + "SET machine_name = '"+NewName+"'"
                + "WHERE machine_MNo ='"+MNo+"'";
        
        this.runStatement(updateMachineStmt);
    }
}
