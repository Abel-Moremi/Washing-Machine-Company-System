package backend;

import java.sql.ResultSet;

/**
 *
 * @author Abel Moremi
 */


public class MadeBy extends DataConnection{
    
    public ResultSet getMadeBys(){
        String stmt = "SELECT * FROM T_MadeBy";
        ResultSet rs = this.runStatement(stmt);
        return rs;
    }
}
