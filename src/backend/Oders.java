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

    public ResultSet getOrder(String PNo, String CNo){
        String stmt = "SELECT * FROM  T_Orders" 
                +"WHERE orders_product_PNo='"+PNo+"' AND orders_customer_CNo='"+CNo+"'";
        ResultSet rs = this.runStatement(stmt);
        return rs;
    }

    public void addOrder(String PNo, String CNo){
        String addOrderStmt = "INSERT INTO  T_Orders (orders_product_PNo, orders_customer_CNo)" 
                + "VALUES('"+PNo+"', '"+CNo+"')";
        this.runStatement(addOrderStmt);
    }

    public void updateOder(String PNo, String CNo, String newPNo){
        String updateOderStmt = "UPDATE T_Orders "
                + "SET orders_product_PNo='"+newPNo+"'"
                + "WHERE orders_product_PNo='"+PNo+"' AND orders_customer_CNo='"+CNo+"'";
        
        this.runStatement(updateOderStmt);
    }
}
