package backend;

import java.sql.ResultSet;

/**
 *
 * @author Abel Moremi
 */

public class MadeOn extends DataConnection{

    public ResultSet getMadeOns(){
        String stmt = "SELECT * FROM T_MadeOn";
        ResultSet rs = this.runStatement(stmt);
        return rs;
    }

    public ResultSet getMadeOn(String MNo, String PrNo){
        String stmt = "SELECT * FROM  T_MadeOn" 
                +"WHERE madeon_machine_MNo='"+MNo+"' AND madeon_part_PartNo='"+PrNo+"'";
        ResultSet rs = this.runStatement(stmt);
        return rs;
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
        String deleteMadeOnStmt = "DELETE FROM T_Part "
                + "WHERE madeon_machine_MNo='"+MNo+"' AND madeon_part_PartNo='"+PrNo+"'";
        this.runStatement(deleteMadeOnStmt);
    }
}
