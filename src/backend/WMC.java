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
public class WMC extends DataConnection{
    public ResultSet getName(){
        String stmt = "SELECT WMC_NAME FROM T_WMC";
        ResultSet rs = this.runStatement(stmt);
        return rs;
    }
    
    public void addName(String name){
        String addNameStmt = "INSERT INTO T_WMC (wmc_name) VALUES('"+name+"')";
        this.runStatement(addNameStmt);
    }
    
    public void deleteName(String name){
        String deleteNameStmt = "DELETE FROM T_WMC WHERE wmc_name='"+name+"'";
        this.runStatement(deleteNameStmt);
    }
    
    public void updateName(String oldName, String newName){
        String updateNameStmt = "UPDATE T_WMC "
                + "SET wmc_name = '"+newName+"'"
                + "WHERE wmc_name='"+oldName+"'";
        
        this.runStatement(updateNameStmt);
    }
    
    /*public static void main(String arguments[]){
        WMC yebo = new WMC();
        yebo.updateName("VIBES", "Just Vibing");
        //yebo.getName();
    }*/
}
