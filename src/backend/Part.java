/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.sql.ResultSet;

/**
 *
 * @author Abel Moremi
 */
public class Part extends DataConnection{
    
    public ResultSet getParts(){
        String stmt = "SELECT * FROM T_PART";
        ResultSet rs = this.runStatement(stmt);
        return rs;
    }

    public ResultSet getPart(String partNo){
        String stmt = "SELECT * FROM T_PART WHERE part_PartNo='"+partNo+"'";
        ResultSet rs = this.runStatement(stmt);
        return rs;
    }

    public void addPart(String partNo, String description, String cost){
        String addPartStmt = "INSERT INTO T_Part (part_PartNo, part_description, part_cost)" 
                + "VALUES('"+partNo+"', '"+description+"', '"+cost+"')";
        this.runStatement(addPartStmt);
    }
     
    public static void main(String arguments[]){
       Part pt = new Part();
       pt.printResultSet(pt.getParts());
    }
    
}
