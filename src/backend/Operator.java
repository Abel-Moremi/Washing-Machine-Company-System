package backend;

import java.sql.ResultSet;

/**
 *
 * @author Abel Moremi
 */

public class Operator extends DataConnection{

    public ResultSet getOperators(){
        String stmt = "SELECT * FROM T_Operator";
        ResultSet rs = this.runStatement(stmt);
        return rs;
    }

    public ResultSet getOperator(String MNo, String ENo){
        String stmt = "SELECT * FROM  T_Operator" 
                +"WHERE operator_machine_MNo='"+MNo+"' AND operator_employee_ENo='"+ENo+"'";
        ResultSet rs = this.runStatement(stmt);
        return rs;
    }
    
}
