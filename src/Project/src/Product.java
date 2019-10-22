import java.sql.ResultSet;

import com.mysql.jdbc.Statement;

public class Product implements Connectivity {
	static String sql;
	static Product p = new Product();
	static void Table(String x)
	{
		try {
			Statement s = (Statement) p.Connect();
			ResultSet r = s.executeQuery("select *from items WHERE category = '"+x+"'");
		    while(r.next()) {
		    	if(r.getInt("Current_Stock") > r.getInt("Threshold_stock")) {
		    		System.out.println(r.getInt("sno")+" "+r.getString("category")+" "+r.getString("Product_name")+" "+r.getInt("ID")+" "+r.getString("MRP")+" "+r.getString("Quantity")+" "+r.getString("DOM")+" "+r.getString("DOE")+" ");
		    	}
		    }
	    }catch(Exception e) {
	    	System.out.println(e);
	     }
	}
	static void buy(int id, int n)
	{
		Product p = new Product();
		try {
			Statement s = (Statement) p.Connect();
			sql = "SELECT *FROM items WHERE ID = '"+id+"'";
		    ResultSet r = s.executeQuery(sql);
		    if(r.next()) {
		    	if(n <= r.getInt("Current_Stock")) {
		    		sql = "Update items set Current_Stock = Current_Stock - '"+n+"' WHERE ID = '"+id+"'";
		    	    s.executeUpdate(sql);
		    	}
		    	else {
		    		System.out.println("Avaliable Stock is :"+ r.getInt("Current_Stock"));
		    	}
		    }
		    else {
		    	System.out.println("Enter valid ID");
		    }
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
