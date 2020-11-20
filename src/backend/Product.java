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
     
     public int getlastPNo() throws SQLException{
        int lastDigits = 00;
        String eno = "pd-100";
        String last3Char = "100";
        
        String getMaxPNoStmt = "SELECT product_MNo "
                + "FROM T_Product "
                + "WHERE product_MNo = (SELECT MAX(product_MNo) FROM T_Product)";
        
        ResultSet rs = this.runStatement(getMaxPNoStmt);
        
        while(rs.next()){

            eno = rs.getString("product_MNo");
        }
       
        last3Char = eno.substring(Math.max(eno.length() - 3, 0));
        
        lastDigits = Integer.parseInt(last3Char) + 1;
        
        return lastDigits;
    }

    public void addProduct(String prNo, String name, String cost){
        String addProductStmt = "INSERT INTO T_Product (product_MNo, product_PrName, product_cost)" 
                + "VALUES('"+prNo+"', '"+name+"', '"+cost+"')";
        this.runStatement(addProductStmt);
    }

    public void updateProduct(String prNo, String newName, String newCost){
        String updateProductStmt = "UPDATE T_Product "
                + "SET product_PrName = '"+newName+"', product_cost = '"+newCost+"' "
                + "WHERE product_MNo ='"+prNo+"'";
        
        this.runStatement(updateProductStmt);
    }

    public void deleteProduct(String prNo){
        String deleteProductStmt = "DELETE FROM T_Product WHERE product_MNo='"+prNo+"'";
        this.runStatement(deleteProductStmt);
    }
}
