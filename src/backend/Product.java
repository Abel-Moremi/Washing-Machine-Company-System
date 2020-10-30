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

    public void addProduct(String prNo, String name, String cost){
        String addProductStmt = "INSERT INTO T_Part (product_MNo, product_PrName, product_cost)" 
                + "VALUES('"+prNo+"', '"+name+"', '"+cost+"')";
        this.runStatement(addProductStmt);
    }
}
