package jdbcdemo;

import java.sql.*;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//1. Get a connection to a database
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","root","adhyarujinal2000");
			
			//2. Create a statement
			Statement myStmt = myConn.createStatement();
			
			//3. Execute SQL query
			ResultSet myRs = myStmt.executeQuery("SELECT sno,name,phno,totalcost,billno,     GROUP_CONCAT(items) FROM cus_info GROUP BY billno;");
			
			//4. Process the result set
			while(myRs.next()) {
				System.out.println(myRs.getInt("sno") + " ," + myRs.getString("name") + " , " + myRs.getInt("phno") + " ," + myRs.getString("GROUP_CONCAT(items)") + " , " + myRs.getInt("totalcost") + " ," + myRs.getInt("billno") );
			}
			
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}
		
	}

}
