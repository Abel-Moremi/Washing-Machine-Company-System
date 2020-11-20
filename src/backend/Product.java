package backend;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Abel Moremi
 */

public class Product extends DataConnection{
    
    public ArrayList<String[]> getProducts() throws SQLException{
        String stmt = "SELECT * FROM T_Product";
        ResultSet rs = this.runStatement(stmt);
        
        ArrayList<String[]> productList = new ArrayList<>();
        
        while(rs.next()){
            
            String[] temp = new String[3];
            temp[0] = rs.getString("product_MNo");
            temp[1] = rs.getString("product_PrName");
            temp[2] = rs.getString("product_cost");
            
            productList.add(temp);
        }
        
        return productList;
    }
    
     public ArrayList<String[]> getProduct(String prNo) throws SQLException{
        String stmt = "SELECT * FROM T_Product WHERE product_MNo ='"+prNo+"'";
        ResultSet rs = this.runStatement(stmt);
        
        ArrayList<String[]> productList = new ArrayList<>();
        
        while(rs.next()){
            
            String[] temp = new String[3];
            temp[0] = rs.getString("product_MNo");
            temp[1] = rs.getString("product_PrName");
            temp[2] = rs.getString("product_cost");
            
            productList.add(temp);
        }
        
        return productList;
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

    public void deleteProduct(String prNo){
        String deleteProductStmt = "DELETE FROM T_Part WHERE part_PartNo='"+prNo+"'";
        this.runStatement(deleteProductStmt);
    }
}
