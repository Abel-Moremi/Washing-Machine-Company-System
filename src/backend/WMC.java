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
        String stmt = "INSERT INTO T_WMC (wmc_Name)\n" +
                      "VALUES ("+name+");";
        ResultSet rs = this.runStatement(stmt);
        this.printResultSet(rs);
    }
    
    public static void main(String args){
        WMC yebo = new WMC();
        yebo.getName();
    }
}
