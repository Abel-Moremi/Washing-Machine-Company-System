package backend;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Abel Moremi
 */


public class MadeBy extends DataConnection{
    
    public  ArrayList<String[]> getMadeBys() throws SQLException{
        String stmt = "SELECT * FROM T_MadeBy";
        ResultSet rs = this.runStatement(stmt);
        ArrayList<String[]> list = new ArrayList<>();
        
        while(rs.next()){
            
            String[] temp = new String[2];
            temp[0] = rs.getString("madeby_part_PartNo");
            temp[1] = rs.getString("madeby_employee_ENo");
            
            list.add(temp);
        }
        
        return list;
    }

    public ArrayList<String[]> getMadeBy(String PrtNo, String ENo)throws SQLException{
        String stmt = "SELECT * FROM  T_MadeBy" 
                +"WHERE madeby_part_PartNo='"+PrtNo+"' AND  madeby_employee_ENo='"+ENo+"'";
        ResultSet rs = this.runStatement(stmt);
        ArrayList<String[]> list = new ArrayList<>();
        
        while(rs.next()){
            
            String[] temp = new String[2];
            temp[0] = rs.getString("madeby_part_PartNo");
            temp[1] = rs.getString("madeby_employee_ENo");
            
            list.add(temp);
        }
        
        return list;
    }

    public void addMadeBy(String PrtNo, String ENo){
        String addMadeByStmt = "INSERT INTO  T_MadeBy (madeby_part_PartNo, madeby_employee_ENo)" 
                + "VALUES('"+PrtNo+"', '"+ENo+"')";
        this.runStatement(addMadeByStmt);
    }

    public void updateMadeBy(String PrNo, String ENo){
        String updateMadeByStmt = "UPDATE T_MadeBy "
                + "SET  madeby_employee_ENo='"+ENo+"'"
                + "WHERE madeby_part_PartNo='"+PrNo+"' AND madeby_employee_ENo='"+ENo+"'";
        
        this.runStatement(updateMadeByStmt);
    }

    public void deleteMadeBy(String PrNo, String ENo){
        String deleteMadeByStmt = "DELETE FROM T_MadeBy"
                + "WHERE madeby_part_PartNo='"+PrNo+"' AND madeby_employee_ENo='"+ENo+"'";
        this.runStatement(deleteMadeByStmt);
    }
}
