package backend;

import java.sql.ResultSet;

/**
 *
 * @author Abel Moremi
 */

public class Oders extends DataConnection{

    public ResultSet getOrders(){
        String stmt = "SELECT * FROM T_Orders";
        ResultSet rs = this.runStatement(stmt);
        return rs;
    }

    
}
