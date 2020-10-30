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

    public ResultSet getProduct(String prNo){
        String stmt = "SELECT * FROM T_PART WHERE product_MNo ='"+prNo+"'";
        ResultSet rs = this.runStatement(stmt);
        return rs;
    }
}
