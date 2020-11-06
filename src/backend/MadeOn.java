package backend;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Abel Moremi
 */

public class MadeOn extends DataConnection{

    public ArrayList<String[]> getMadeOns() throws SQLException{
        String stmt = "SELECT * FROM T_MadeOn";
        ResultSet rs = this.runStatement(stmt);
        ArrayList<String[]> list = new ArrayList<>();
        
        while(rs.next()){
            
            String[] temp = new String[2];
            temp[0] = rs.getString("madeon_machine_MNo");
            temp[1] = rs.getString("madeon_part_PartNo");
            
            list.add(temp);
        }
        
        return list;
    }

    public ArrayList<String[]> getMadeOn(String MNo, String PrNo) throws SQLException{
        String stmt = "SELECT * FROM  T_MadeOn" 
                +"WHERE madeon_machine_MNo='"+MNo+"' AND madeon_part_PartNo='"+PrNo+"'";
        ResultSet rs = this.runStatement(stmt);
         ArrayList<String[]> list = new ArrayList<>();
        
        while(rs.next()){
            
            String[] temp = new String[2];
            temp[0] = rs.getString("madeon_machine_MNo");
            temp[1] = rs.getString("madeon_part_PartNo");
            
            list.add(temp);
        }
        
        return list;
    }

    public void addMadeOn(String MNo, String PrNo){
        String addMadeOnStmt = "INSERT INTO  T_MadeOn (madeon_machine_MNo, madeon_part_PartNo)" 
                + "VALUES('"+MNo+"', '"+PrNo+"')";
        this.runStatement(addMadeOnStmt);
    }

    public void updateMadeOn(String MNo, String PrNo){
        String updateMadeOnStmt = "UPDATE T_MadeOn "
                + "SET madeon_part_PartNo='"+PrNo+"'"
                + "WHERE madeon_machine_MNo='"+MNo+"' AND madeon_part_PartNo='"+PrNo+"'";
        
        this.runStatement(updateMadeOnStmt);
    }

    public void deleteMadeOn(String MNo, String PrNo){
        String deleteMadeOnStmt = "DELETE FROM T_MadeOn"
                + "WHERE madeon_machine_MNo='"+MNo+"' AND madeon_part_PartNo='"+PrNo+"'";
        this.runStatement(deleteMadeOnStmt);
    }
}
