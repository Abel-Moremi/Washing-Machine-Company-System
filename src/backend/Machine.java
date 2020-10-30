package backend;

import java.sql.ResultSet;

/**
 *
 * @author Abel Moremi
 */

public class Machine extends DataConnection{
    public ResultSet getMachine(){
        String stmt = "SELECT WMC_NAME FROM T_Machine";
        ResultSet rs = this.runStatement(stmt);
        return rs;
    }
}
