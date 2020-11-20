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
    
    MadeBy madeByData;
    MadeOn madeOnData;
    
    public ArrayList<String[]> getParts() throws SQLException{
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
    
    public ArrayList<String[]> getAllParts() throws SQLException{
        String stmt = "SELECT T_Part.part_partno,"
                + "T_Part.part_description,"
                + "T_Part.part_cost,"
                + "T_MadeOn.madeon_machine_MNo,"
                + "T_MadeBy.madeby_employee_ENo,"
                + "T_Part.part_manufactureDate "
                + "FROM T_PART "
                + "LEFT JOIN T_MadeOn ON T_part.part_partno = T_MadeOn.madeon_part_PartNo "
                + "LEFT JOIN T_MadeBy ON T_part.part_partno = T_MadeBy.madeby_part_PartNo";
        
        ResultSet rs = this.runStatement(stmt);
        ArrayList<String[]> partList = new ArrayList<>();
        
        while(rs.next()){
            
            String[] temp = new String[6];
            temp[0] = rs.getString("part_PartNo");
            temp[1] = rs.getString("part_description");
            temp[2] = rs.getString("part_cost");
            temp[3] = rs.getString("madeon_machine_MNo");
            temp[4] = rs.getString("madeby_employee_ENo");
            temp[5] = rs.getString("part_manufactureDate");
            
            partList.add(temp);
        }
        
        return partList;
    }
    
     public ArrayList<String[]> getAllPart(String partNo) throws SQLException{
        String stmt = "SELECT T_Part.part_partno,"
                + "T_Part.part_description,"
                + "T_Part.part_cost,"
                + "T_MadeOn.madeon_machine_MNo,"
                + "T_MadeBy.madeby_employee_ENo,"
                + "T_Part.part_manufactureDate "
                + "FROM T_PART "
                + "LEFT JOIN T_MadeOn ON T_part.part_partno = T_MadeOn.madeon_part_PartNo "
                + "LEFT JOIN T_MadeBy ON T_part.part_partno = T_MadeBy.madeby_part_PartNo "
                + "WHERE part_PartNo='"+partNo+"'";
        
        ResultSet rs = this.runStatement(stmt);
        ArrayList<String[]> partList = new ArrayList<>();
        
        while(rs.next()){
            
            String[] temp = new String[6];
            temp[0] = rs.getString("part_PartNo");
            temp[1] = rs.getString("part_description");
            temp[2] = rs.getString("part_cost");
            temp[3] = rs.getString("madeon_machine_MNo");
            temp[4] = rs.getString("madeby_employee_ENo");
            temp[5] = rs.getString("part_manufactureDate");
            
            partList.add(temp);
        }
        
        return partList;
    }
     
     public void addAllPart(String partNo, String description, String cost,String mno, String eno){
        madeOnData = new MadeOn();
        madeByData = new MadeBy();
        
        this.addPart(partNo, description, cost);
        madeOnData.addMadeOn(mno, partNo);
        madeByData.addMadeBy(partNo, eno);
        
    }
     
    public void deleteAllPart(String partNo) throws SQLException{
        madeOnData = new MadeOn();
        madeByData = new MadeBy();
        
        String mNo = null;
        String eno = null;
        String stmt = "SELECT T_Part.part_partno,"
               + "T_Part.part_description,"
               + "T_Part.part_cost,"
               + "T_MadeOn.madeon_machine_MNo,"
               + "T_MadeBy.madeby_employee_ENo,"
               + "T_Part.part_manufactureDate "
               + "FROM T_PART "
               + "LEFT JOIN T_MadeOn ON T_part.part_partno = T_MadeOn.madeon_part_PartNo "
               + "LEFT JOIN T_MadeBy ON T_part.part_partno = T_MadeBy.madeby_part_PartNo "
               + "WHERE part_PartNo='"+partNo+"'";
        ResultSet rs = this.runStatement(stmt);
        
        while(rs.next()){
           
            mNo = rs.getString("madeon_machine_MNo");
            eno = rs.getString("madeby_employee_ENo");
        
        }
        
        madeOnData.deleteMadeOn(mNo,partNo);
        madeByData.deleteMadeBy(partNo, eno);
        this.deletePart(partNo);
        
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
    
    public int getlastPNo() throws SQLException{
        int lastDigits = 00;
        String eno = "FK-1000";
        String last4Char = "1000";
        
        String getMaxPNoStmt = "SELECT part_PartNo "
                + "FROM T_PART "
                + "WHERE part_PartNo = (SELECT MAX(part_PartNo) FROM T_PART)";
        
        ResultSet rs = this.runStatement(getMaxPNoStmt);
        
        while(rs.next()){

            eno = rs.getString("part_partno");
        }
       
        last4Char = eno.substring(Math.max(eno.length() - 4, 0));
        
        lastDigits = Integer.parseInt(last4Char) + 1;
        
        return lastDigits;
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
