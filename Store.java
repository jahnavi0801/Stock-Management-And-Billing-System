import java.sql.ResultSet;

import com.mysql.jdbc.Statement;

public class Store implements Connectivity {
	static Product p = new Product();
	
	static void shortage() {
		try {
            System.out.println("Out of Stock");
			Statement s = (Statement) p.Connect();
			ResultSet r = s.executeQuery("select *from items");
			while(r.next()) {
				if(r.getInt("Current_Stock") < r.getInt("Threshold_stock")) {
					System.out.println(r.getInt("sno")+" "+r.getString("category")+" "+r.getString("Product_name")+" "+r.getInt("ID")+" "+r.getInt("Initial_stock")+" "+r.getInt("Current_Stock")+" "+r.getInt("Threshold_stock"));
			}
		}
		}catch(Exception e) {
			System.out.println(e);
		}
   }
}
