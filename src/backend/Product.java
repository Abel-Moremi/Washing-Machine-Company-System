package backend;

import java.sql.ResultSet;

/**
 *
 * @author Abel Moremi
 */

public class Product extends DataConnection{

    public ResultSet getProducts(){
        String stmt = "SELECT * T_Product";
        ResultSet rs = this.runStatement(stmt);
        return rs;
    }
}
