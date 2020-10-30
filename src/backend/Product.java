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
        String stmt = "SELECT * FROM T_Product WHERE product_MNo ='"+prNo+"'";
        ResultSet rs = this.runStatement(stmt);
        return rs;
    }

    public void addProduct(String prNo, String name, String cost){
        String addProductStmt = "INSERT INTO T_Product (product_MNo, product_PrName, product_cost)" 
                + "VALUES('"+prNo+"', '"+name+"', '"+cost+"')";
        this.runStatement(addProductStmt);
    }

    public void updateProduct(String prNo, String newName, String newCost){
        String updateProductStmt = "UPDATE T_Product "
                + "SET product_PrName = '"+newName+"', product_cost = '"+newCost+"'"
                + "WHERE product_MNo ='"+prNo+"'";
        
        this.runStatement(updateProductStmt);
    }
}
