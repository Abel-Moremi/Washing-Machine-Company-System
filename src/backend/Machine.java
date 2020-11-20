package backend;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Abel Moremi
 */

public class Machine extends DataConnection{
    
    Operator operator;
    Supervisor supervisor;
    
    public ResultSet getMachine(){
        String stmt = "SELECT WMC_NAME FROM T_Machine";
        ResultSet rs = this.runStatement(stmt);
        return rs;
    }
    
    public ArrayList<String[]> getAllMachine(String mNo) throws SQLException{
        String stmt = "SELECT T_Machine.machine_MNo,"
                + "T_Machine.machine_name,"
                + "T_Operator.operator_employee_ENo,"
                + "T_Supervisor.supervisor_employee_ENo "
                + "FROM T_Machine "
                + "LEFT JOIN T_Operator ON T_Machine.machine_MNo = T_Operator.operator_machine_MNo "
                + "LEFT JOIN T_Supervisor ON T_Machine.machine_MNo = T_Supervisor.supervisor_machine_MNo "
                + "WHERE part_PartNo='"+mNo+"'";
        
        ResultSet rs = this.runStatement(stmt);
        ArrayList<String[]> partList = new ArrayList<>();
        
        while(rs.next()){
            
            String[] temp = new String[4];
            temp[0] = rs.getString("machine_MNo");
            temp[1] = rs.getString("machine_name");
            temp[2] = rs.getString("operator_employee_ENo");
            temp[3] = rs.getString("supervisor_employee_ENo");
            
            partList.add(temp);
        }
        
        return partList;
    }
    
    public ArrayList<String[]> getAllMachines() throws SQLException{
        String stmt = "SELECT T_Machine.machine_MNo,"
                + "T_Machine.machine_name,"
                + "T_Operator.operator_employee_ENo,"
                + "T_Supervisor.supervisor_employee_ENo "
                + "FROM T_Machine "
                + "LEFT JOIN T_Operator ON T_Machine.machine_MNo = T_Operator.operator_machine_MNo "
                + "LEFT JOIN T_Supervisor ON T_Machine.machine_MNo = T_Supervisor.supervisor_machine_MNo";
        
        ResultSet rs = this.runStatement(stmt);
        ArrayList<String[]> partList = new ArrayList<>();
        
        while(rs.next()){
            
            String[] temp = new String[4];
            temp[0] = rs.getString("machine_MNo");
            temp[1] = rs.getString("machine_name");
            temp[2] = rs.getString("operator_employee_ENo");
            temp[3] = rs.getString("supervisor_employee_ENo");
            
            partList.add(temp);
        }
        
        return partList;
    }
    
    public void addAllMachine(String mNo, String name, String ope, String sup){
        operator = new Operator();
        supervisor = new Supervisor();
        
        this.addMachine(mNo, name);
        operator.addOperator(mNo, ope);
        supervisor.addSupervisor(mNo, sup);
        
    }
    
    public void deleteAllMachine(String mNo) throws SQLException{
        
        operator = new Operator();
        supervisor = new Supervisor();
        
        String oNo = null;
        String sNo = null;
        
        String stmt = "SELECT T_Machine.machine_MNo,"
                + "T_Machine.machine_name,"
                + "T_Operator.operator_employee_ENo,"
                + "T_Supervisor.supervisor_employee_ENo "
                + "FROM T_Machine "
                + "LEFT JOIN T_Operator ON T_Machine.machine_MNo = T_Operator.operator_machine_MNo "
                + "LEFT JOIN T_Supervisor ON T_Machine.machine_MNo = T_Supervisor.supervisor_machine_MNo "
                + "WHERE part_PartNo='"+mNo+"'";
        
        ResultSet rs = this.runStatement(stmt);
        
        while(rs.next()){
        
            oNo = rs.getString("operator_employee_ENo");
            sNo = rs.getString("supervisor_employee_ENo");
           
        }
        
        operator.deleteOperator(mNo, oNo);
        supervisor.deleteSupervisor(mNo, sNo);
    }
    
    public int getlastMNo() throws SQLException{
        int lastDigits = 00;
        String eno = "mc-100";
        String last3Char = "100";
        
        String getMaxMNoStmt = "SELECT machine_MNo "
                + "FROM T_Machine "
                + "WHERE machine_MNo = (SELECT MAX(machine_MNo) FROM T_Machine)";
        
        ResultSet rs = this.runStatement(getMaxMNoStmt);
        
        while(rs.next()){

            eno = rs.getString("part_partno");
        }
       
        last3Char = eno.substring(Math.max(eno.length() - 3, 0));
        
        lastDigits = Integer.parseInt(last3Char) + 1;
        
        return lastDigits;
    }

    public void addMachine(String MNo, String name){
        String addMachineStmt = "INSERT INTO T_Machine (machine_MNo, machine_name)" 
                + "VALUES('"+MNo+"', '"+name+"')";
        this.runStatement(addMachineStmt);
    }

    public void updateMachine(String MNo, String NewName){
        String updateMachineStmt = "UPDATE T_Machine "
                + "SET machine_name = '"+NewName+"'"
                + "WHERE machine_MNo ='"+MNo+"'";
        
        this.runStatement(updateMachineStmt);
    }

    public void deleteMachine(String MNo){
        String deleteMachineStmt = "DELETE FROM T_Machine WHERE machine_MNo ='"+MNo+"'";
        this.runStatement(deleteMachineStmt);
    }
}
