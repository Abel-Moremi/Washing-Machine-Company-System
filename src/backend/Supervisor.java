package backend;

import java.sql.ResultSet;

/**
 *
 * @author Abel Moremi
 */

public class Supervisor extends DataConnection{

    public ResultSet getSupervisors(){
        String stmt = "SELECT * FROM T_Supervisor";
        ResultSet rs = this.runStatement(stmt);
        return rs;
    }
    
}
