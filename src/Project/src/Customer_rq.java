import java.sql.ResultSet;
import com.mysql.jdbc.Statement;

public class Customer_rq implements Connectivity{
	static Customer_rq cr = new Customer_rq();
    static void ask() throws Exception {
    	try {
    		Statement s = (Statement) cr.merge();
    		ResultSet r = s.executeQuery("select Customer_Requests, name, phno, billno from cus_info ");
    		while(r.next()) {
    			System.out.println(r.getInt("billno")+" "+r.getString("name")+" "+r.getString("phno")+" "+r.getString("Customer_Requests"));
    	}
       }catch(Exception e) {
    	   System.out.println(e);
       }
    }
}
