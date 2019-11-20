import java.sql.ResultSet;
import com.mysql.jdbc.Statement;

public class Customer_rq extends Usable implements Connectivity{
	static Customer_rq cr = new Customer_rq();
    static void ask() throws Exception {
    	try {
    		Statement s = (Statement) cr.merge();
    		ResultSet r = s.executeQuery("select Customer_Requests, name, phno, billno from cus_info ");
    		System.out.println("                                                 Following Are The Customer Requests");
    		System.out.println();
            System.out.println("                                       BillNo   CUSTOMER_NAME  PHONE_NUMBER    CUSTOMER_REQUESTS");
    		while(r.next()) {
    			System.out.println("                                       " + r.getInt("billno")+"          "+r.getString("name")+"            "+r.getString("phno")+"       "+r.getString("Customer_Requests"));
    	}
       }catch(Exception e) {
    	   System.out.println(e);
       }
    }
}
