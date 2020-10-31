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

    
}
