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
    
}
