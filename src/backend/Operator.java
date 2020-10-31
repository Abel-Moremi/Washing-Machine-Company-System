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

    public void addOperator(String MNo, String ENo){
        String addOperatorStmt = "INSERT INTO  T_Operator(operator_machine_MNo,  operator_employee_ENo, operator_NoOfParts)" 
                + "VALUES('"+MNo+"', '"+ENo+"')";
        this.runStatement(addOperatorStmt);
    }

    public void updateOperator(String MNo, String ENo, String newENo){
        String updateOperatorStmt = "UPDATE T_Operator "
                + "SET  operator_employee_ENo='"+newENo+"'"
                + "WHERE operator_machine_MNo='"+MNo+"' AND operator_employee_ENo='"+ENo+"'";
        
        this.runStatement(updateOperatorStmt);
    }

    public void deleteOperator(String MNo, String ENo){
        String deleteOperatorStmt = "DELETE FROM T_Operator"
                + "WHERE operator_machine_MNo='"+MNo+"' AND operator_employee_ENo='"+ENo+"'";
        this.runStatement(deleteOperatorStmt);
    }
    
}
