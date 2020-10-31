package backend;

import java.sql.ResultSet;

/**
 *
 * @author Abel Moremi
 */

public class MadeOn extends DataConnection{

    public ResultSet getMadeOns(){
        String stmt = "SELECT * FROM T_MadeOn";
        ResultSet rs = this.runStatement(stmt);
        return rs;
    }
}
