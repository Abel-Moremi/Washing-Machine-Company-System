package backend;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Abel Moremi
 */

public class Assembles extends DataConnection{
    
    public ArrayList<String[]> getAssembles() throws SQLException{
        String stmt = "SELECT * FROM T_Assembles";
        ResultSet rs = this.runStatement(stmt);
        
        ArrayList<String[]> assemblesList = new ArrayList<>();
        
        while(rs.next()){
            
            String[] temp = new String[2];
            temp[0] = rs.getString("assembles_product_PNo");
            temp[1] = rs.getString("assembles_part_PartNo");
            
            assemblesList.add(temp);
        }
        
        return assemblesList;
    }
    
     public ArrayList<String[]> getAssemble(String pNo, String prNo) throws SQLException{
        String stmt = "SELECT * "
                + "FROM T_Assembles "
                + "WHERE assembles_product_PNo ='"+prNo+"' AND assembles_part_PartNo ='"+pNo+"'";
        ResultSet rs = this.runStatement(stmt);
        
        ArrayList<String[]> assemblesList = new ArrayList<>();
        
        while(rs.next()){
            
            String[] temp = new String[2];
            temp[0] = rs.getString("assembles_product_PNo");
            temp[1] = rs.getString("assembles_part_PartNo");
            
            assemblesList.add(temp);
        }
        
        return assemblesList;
    }

    public void addAssemble(String PNo, String PrNo){
        String addAssembleStmt = "INSERT INTO T_Assembles (assembles_product_PNo, assembles_part_PartNo)" 
                + "VALUES('"+PrNo+"', '"+PNo+"')";
        this.runStatement(addAssembleStmt);
    }

    public void updateAsemble(String PNo, String PrNo, String newPrNo){
        String updateAssembleStmt = "UPDATE T_Assembles "
                + "SET assembles_part_PartNo = '"+newPrNo+"'"
                + "WHERE assembles_product_PNo ='"+PNo+"' AND assembles_part_PartNo ='"+PrNo+"'";
        
        this.runStatement(updateAssembleStmt);
    }

    public void deleteAssemble(String PNo, String PrNo){
        String deleteAssembleStmt = "DELETE FROM T_Assembles WHERE assembles_product_PNo ='"+PNo+"' AND assembles_part_PartNo ='"+PrNo+"'";
        this.runStatement(deleteAssembleStmt);
    }
    
}
