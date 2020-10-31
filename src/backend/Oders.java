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
        String stmt = "SELECT * FROM T_PART" 
                +"WHERE orders_product_PNo='"+PNo+"' AND orders_customer_CNo='"+CNo+"'";
        ResultSet rs = this.runStatement(stmt);
        return rs;
    }
}
