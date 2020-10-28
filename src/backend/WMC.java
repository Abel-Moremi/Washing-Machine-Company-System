/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author Abel Moremi
 */
public class WMC extends DataConnection{
    public void getName(){
        String stmt = "SELECT WMC_NAME FROM T_WMC";
        ResultSet rs = this.runStatement(stmt);
        this.printResultSet(rs);
    }
    
    public void addName(String name){
        String addNameStmt = "INSERT INTO T_WMC (wmc_name) VALUES('"+name+"')";
        System.out.println(addNameStmt);
        this.runStatement(addNameStmt);
    }
    
    public static void main(String arguments[]){
        WMC yebo = new WMC();
        yebo.addName("Clap your hands up");
        //yebo.getName();
    }
}
