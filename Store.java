import java.sql.ResultSet;
import java.sql.*;

//import com.mysql.jdbc.Statement;

public class Store implements Connectivity {
	static Product p = new Product();
	
	static void shortage() {
		try {
            System.out.println("Out of Stock");
			Statement s = (Statement) p.Connect();
			ResultSet r = s.executeQuery("select * from items");
			System.out.println("SrNo.   Category      Product_Name       ID    MRP    Quantity   Initial_Stock   Current_Stock    Threshold_Stock    Total_Sales" );
			while(r.next()) {
				if(r.getInt("Current_Stock") < r.getInt("Threshold_Stock")) {
					System.out.println(r.getInt("SrNo")+" "+r.getString("Category")+" "+r.getString("Product_Name")+" "+r.getInt("ID")+" "+r.getInt("MRP")+" "+r.getInt("Quantity")+" "+r.getInt("Initial_Stock")+" "+r.getInt("Current_Stock")+" "+r.getInt("Threshold_Stock")+" "+r.getInt("Total_Sales"));
			}
		}
		}catch(Exception e) {
			System.out.println(e);
		}
   }
}