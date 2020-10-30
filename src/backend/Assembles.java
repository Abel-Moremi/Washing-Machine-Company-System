package backend;

import java.sql.ResultSet;

/**
 *
 * @author Abel Moremi
 */

public class Assembles extends DataConnection{

    public ResultSet getAssembles(){
        String stmt = "SELECT * FROM T_Assembles";
        ResultSet rs = this.runStatement(stmt);
        return rs;
    }

    public ResultSet getAssemble(String PNo){
        String stmt = "SELECT * FROM T_Assembles WHERE assembles_product_PNo ='"+PNo+"'";
        ResultSet rs = this.runStatement(stmt);
        return rs;
    }

    public void addAssemble(String PNo, String PrNo){
        String addAssembleStmt = "INSERT INTO T_Assembles (assembles_product_PNo, assembles_part_PartNo)" 
                + "VALUES('"+PNo+"', '"+PrNo+"')";
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
