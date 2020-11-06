/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Abel Moremi
 */
public class Part extends DataConnection{
    
    public ArrayList<String[]> getParts()throws SQLException{
        String stmt = "SELECT * FROM T_PART";
        ResultSet rs = this.runStatement(stmt);
        ArrayList<String[]> partList = new ArrayList<>();
        
        while(rs.next()){
            
            String[] temp = new String[4];
            temp[0] = rs.getString("part_PartNo");
            temp[1] = rs.getString("part_description");
            temp[2] = rs.getString("part_cost");
            temp[3] = rs.getString("part_manufactureDate");
            
            partList.add(temp);
        }
        
        return partList;
    }

    public ArrayList<String[]> getPart(String partNo) throws SQLException{
        String stmt = "SELECT * FROM T_PART WHERE part_PartNo='"+partNo+"'";
        ResultSet rs = this.runStatement(stmt);
        ArrayList<String[]> partList = new ArrayList<>();
        
        while(rs.next()){
            
            String[] temp = new String[4];
            temp[0] = rs.getString("part_PartNo");
            temp[1] = rs.getString("part_description");
            temp[2] = rs.getString("part_cost");
            temp[3] = rs.getString("part_manufactureDate");
            
            partList.add(temp);
        }
        
        return partList;
    }

    public void addPart(String partNo, String description, String cost){
        String addPartStmt = "INSERT INTO T_Part (part_PartNo, part_description, part_cost)" 
                + "VALUES('"+partNo+"', '"+description+"', '"+cost+"')";
        this.runStatement(addPartStmt);
    }

    public void updatePart(String partNo, String newDescription, String newCost){
        String updateNameStmt = "UPDATE T_Part "
                + "SET part_description = '"+newDescription+"', part_cost = '"+newCost+"'"
                + "WHERE part_PartNo='"+partNo+"'";
        
        this.runStatement(updateNameStmt);
    }

    public void deletePart(String partNo){
        String deletePartStmt = "DELETE FROM T_Part WHERE part_PartNo='"+partNo+"'";
        this.runStatement(deletePartStmt);
    }
     
    /*public static void main(String arguments[]){
       Part pt = new Part();
       pt.printResultSet(pt.getParts());
    }*/
    
}
