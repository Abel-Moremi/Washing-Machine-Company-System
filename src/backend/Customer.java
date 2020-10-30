package backend;

import java.sql.ResultSet;

/**
 *
 * @author Abel Moremi
 */

public class Customer extends DataConnection{

    public ResultSet getCustomers(){
        String stmt = "SELECT * FROM T_Customer";
        ResultSet rs = this.runStatement(stmt);
        return rs;
    }
}
