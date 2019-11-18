import java.sql.ResultSet;
import java.util.*;

//import com.mysql.jdbc.PreparedStatement;
//import com.mysql.jdbc.Statement;

/*import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;*/

//import com.mysql.jdbc.PreparedStatement;
//import com.mysql.jdbc.Statement;

import java.sql.*;

public class Product implements Connectivity {
	static Product p = new Product();
	static Customer cus = new Customer();
	static Scanner scan = new Scanner(System.in);
	static int i;
	static void Table(String x)
	{
		try {
			Statement s = (Statement) p.Connect();
			ResultSet r = s.executeQuery("select * from items WHERE Category = '"+x+"'");
			System.out.println("SRNO.  CATEGORY     PRODUCT NAME     ID        MRP       QUANTITY        DOM         DOE     " );
		    while(r.next()) {
		    	if(r.getInt("Current_Stock") > r.getInt("Threshold_Stock")) {
		    		System.out.println(""+r.getInt("SrNo")+"    "+r.getString("Category")+" "+r.getString("Product_Name")+"   "+r.getInt("ID")+"      "+r.getString("MRP")+"     "+r.getString("Quantity")+"     "+r.getString("DOM")+"     "+r.getString("DOE"));
			    } 
		    }
	    }catch(Exception e) {
	    	System.out.println(e);
	     }
	}
	static void Table() {
		try {
			Statement s = (Statement) p.Connect();
			ResultSet r = s.executeQuery("select *from items");
			System.out.println("SRNO.  CATEGORY     PRODUCT NAME   ID        MRP       QUANTITY        DOM         DOE     INITIAL STOCK   CURRENT STOCK    THRESHOLD STOCK    TOTAL SALES" );
		    while(r.next()) {
		    		System.out.println(""+r.getInt("SrNo")+"    "+r.getString("Category")+" "+r.getString("Product_Name")+"   "+r.getInt("ID")+"      "+r.getString("MRP")+"     "+r.getString("Quantity")+"     "+r.getString("DOM")+"     "+r.getString("DOE")+"        "  +r.getInt("Initial_Stock")+"            "+ r.getInt("Current_Stock")+"               "+r.getInt("Threshold_Stock")+ "                "+r.getInt("Total_Sales"));
		    } 
	    }catch(Exception e) {
	    	System.out.println(e);
	    }
	}
    static void validate_id(String a) {
    	try {
    		Statement s = (Statement) p.Connect();
			ResultSet r = s.executeQuery("select * from items WHERE Category = '"+a+"'");
			System.out.println("SRNO.  CATEGORY     PRODUCT NAME   ID        MRP       QUANTITY        DOM         DOE     INITIAL STOCK   CURRENT STOCK    THRESHOLD STOCK    TOTAL SALES" );
		    while(r.next()) {
		    		System.out.println(""+r.getInt("SrNo")+"    "+r.getString("Category")+" "+r.getString("Product_Name")+"   "+r.getInt("ID")+"      "+r.getString("MRP")+"     "+r.getString("Quantity")+"     "+r.getString("DOM")+"     "+r.getString("DOE")+"        "  +r.getInt("Initial_Stock")+"            "+ r.getInt("Current_Stock")+"               "+r.getInt("Threshold_Stock")+ "                "+r.getInt("Total_Sales"));
		    }
	    }catch(Exception e) {
	    	System.out.println(e);
	     }
	}
	static void validate_id(String a, int id) {
		try {
			Statement s = (Statement) p.Connect();
			ResultSet r = s.executeQuery("select * from items where ID = '"+id+"'and Category = '"+a+"' and Current_Stock>Threshold_Stock");
			if(!r.next()) {
				System.out.println("Enter valid ID : ");
				i = scan.nextInt();
				validate_id(a,i);
			}
			else {
				i = id;
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	static void validate_n(int n) {
		try {
			Statement s = (Statement) p.Connect();
			ResultSet r = s.executeQuery("select * from items where ID = '"+i+"'");
				while(r.next()) {
					if(n>r.getInt("Current_Stock"))
					{
			    		System.out.println("Avaliable Stock is only : "+ r.getInt("Current_Stock"));
			    		System.out.print("Please enter Quantity : ");
			    		int nos = scan.nextInt();
			    		validate_n(nos);
				    }		
				    else if(n <= r.getInt("Current_Stock")) {
				    	Statement s1 = (Statement) p.Connect();
						s1.executeUpdate("Update items set Current_Stock = Current_Stock - '"+n+"' WHERE ID = '"+i+"'");					    
				    }
		          }
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	static void cart(String name,String phno, int id, int n) {
		int sno = 1, cost = 0;
		try {
			Statement s = (Statement) p.Connect();
			ResultSet r = s.executeQuery("select Product_name from items WHERE ID = '"+id+"'");
		    PreparedStatement pt = p.person();
		    pt.setInt(1, sno);
		    pt.setString(2, name);
			pt.setString(3, phno);
			pt.setInt(6, sno);
			sno++;
			while(r.next())
		    {
		    	String pn = r.getString("Product_Name");
		    	String list = pn +" - "+n;
		    	pt.setString(4, list);
		    }
			ResultSet r1 = s.executeQuery("select MRP from items where ID = 11"); 
			while(r1.next()) {
				String t = r1.getString("MRP");
				int mrp = Integer.parseInt(t.substring(4));
				cost = cost + n*mrp;
			}
			pt.setInt(5, cost);
	        pt.executeUpdate();
		}catch(Exception e) {
	    	System.out.println(e);
	    }
	}
    
}