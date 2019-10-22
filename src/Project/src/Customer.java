import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class Customer{
	
	private String name;
	private String phn;
    static Scanner sc = new Scanner(System.in);
    
    public void Details() {
    	System.out.println("Enter your name :");
    	name = sc.nextLine();
    	do {
    		System.out.println("Enter your phone number : ");
    		phn = sc.nextLine();
    		if(phn.length() != 10 )
    			System.out.println("Please enter a valid phone number.");
    	}while(phn.length()!=10);
    }
    
    public void Display(){
        String n,n1;
        do{
            System.out.println("Select the item which you would like to buy.");
            System.out.println("1. Daily Uses");
            System.out.println("2. Food");
            System.out.println("3. Crockery");
            System.out.println("4. Go back to the main page.");
            System.out.println("5. Exit ");
            n = sc.nextLine();
            switch(n)
            {
                    case "1" : System.out.println("Welcome to the Daily uses section.");
                               DailyUses();
                               break;

                    case "2" : System.out.println("Welcome to the Food section.");
                               Food(); 
                               break;

                    case "3" : System.out.println("Welcome to the Crockery section.");
                               Crockery(); 
                               break;

                    case "4" : StockMAnagementAndBilling s = new StockMAnagementAndBilling();
                               s.print();
                               break;

                    case "5" : System.out.println("Thank you for coming.Visit again .");    
                               System.exit(0);

                    default : System.out.println("The number you entered is incorrect.Please try again.");
                              break; 
            } 
        }while(!(n.equals("1"))&&!(n.equals("2"))&&!(n.equals("3"))&&!(n.equals("4"))&&!(n.equals("5")));
        System.out.print(sc.nextLine());
        System.out.println("Do you want ot continue(Y/N) ?");
        n1 = sc.nextLine();
        if(n1.equals("Y")||n1.equals("y"))
            Display();
        else
            System.out.println("Thank you for coming.Visit again .");
            System.exit(0);    
    }
    
    public void DailyUses(){
        String n;
        do{
            System.out.println("Select the item which you would like to buy.");
            System.out.println("1. Dental");
            System.out.println("2. Bathing");
            System.out.println("3. Utilities");
            System.out.println("4. Exit");
            n = sc.nextLine();
            switch(n)
            {
                    case "1" : System.out.println("Dental");
                               Dental();
                               break;

                    case "2" : System.out.println("Bathing");
                               Bathing();
                               break;

                    case "3" : System.out.println("Utilities");
                               Utilities();
                               break;

                    case "4" : System.out.println("Thank you for coming.Visit again .");    
                               System.exit(0);

                    default : System.out.println("The number you entered is incorrect.Please try again.");
                              break; 
                    } 
        }while(!(n.equals("1"))&&!(n.equals("2"))&&!(n.equals("3"))&&!(n.equals("4")));
    }    

    static void Utilities() {
    	try {
			System.out.println("Hey there !!!");
		    Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/daily_uses","root","Josaa_16651");
			Statement s = c.createStatement();
			ResultSet r1 = s.executeQuery("select *from utilities"); 
			System.out.println();
			System.out.println("UTILITIES");
			System.out.println();
			System.out.println("Sr.no  " +  "Product Name       " + "MRP    " + "Quantity");
			while(r1.next()) {
				if(r1.getInt("currentstock") > r1.getInt("thresholdstock"))
				  System.out.println(r1.getInt("sno")+"   "+r1.getString("produtctname")+"   "+r1.getInt("ID")+"   "+r1.getString("MRP")+"   "+r1.getString("quantity")+" ");
			  }
			 System.out.println();
			 System.out.println("Select ID of ur choice n :");
			 int id = sc.nextInt();
			 Statement st = c.createStatement();
			 String sql = "SELECT *FROM utilities WHERE ID = '" + id + "'";
			 ResultSet x = st.executeQuery(sql);
			 if(x.next())
			 {
				 System.out.println("nos : ");
				 int nos = sc.nextInt();
				 if(nos <= x.getInt("currentstock")) {
				 String sql1 = "Update utilities set currentstock = currentstock - '"+ nos+ "' WHERE ID = '" + id + "'";
				 st.executeUpdate(sql1);
				 }
				 else
				 {
					 System.out.println("U can take "+ x.getInt("currentstock"));
				 }
		     }
			 else
			 {
				 System.out.println("Say BOO... !!!");
			 }
		}catch (Exception e)
		{
			System.out.println(e);
		}
	
	}

	static void Dental() {
    	try {
			System.out.println("Hey there !!!");
		    Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/daily_uses","root","Josaa_16651");
			Statement s = c.createStatement();
			ResultSet r1 = s.executeQuery("select *from dental"); 
			System.out.println();
			System.out.println("DENTAL");
			System.out.println();
			System.out.println("Sr.no  " +  "Product Name       " + "MRP    " + "Quantity");
			while(r1.next()) {
				if(r1.getInt("currentstock") > r1.getInt("thresholdstock"))
				  System.out.println(r1.getInt("sno")+"   "+r1.getString("produtctname")+"   "+r1.getInt("ID")+"   "+r1.getString("MRP")+"   "+r1.getString("quantity")+"  ");
			  }
			 System.out.println();
			 System.out.println("Select ID of ur choice n :");
			 int id = sc.nextInt();
			 Statement st = c.createStatement();
			 String sql = "SELECT *FROM dental WHERE ID = '" + id + "'";
			 ResultSet x = st.executeQuery(sql);
			 if(x.next())
			 {
				 System.out.println("nos : ");
				 int nos = sc.nextInt();
				 if(nos <= x.getInt("currentstock")) {
				 String sql1 = "Update dental set currentstock = currentstock - '"+ nos+ "' WHERE ID = '" + id + "'";
				 st.executeUpdate(sql1);
				 }
				 else
				 {
					 System.out.println("U can take "+ x.getInt("currentstock"));
				 }
		     }
			 else
			 {
				 System.out.println("Say BOO... !!!");
 			 }
		}catch (Exception e)
		{
			System.out.println(e);
		}
	}
	static void Bathing() {
		try {
			System.out.println("Hey there !!!");
		    Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/daily_uses","root","Josaa_16651");
			Statement s = c.createStatement();
			ResultSet r1 = s.executeQuery("select *from bathing"); 
			System.out.println();
			System.out.println("BATHING");
			System.out.println();
			System.out.println("Sr.no  " +  "Product Name       " + "MRP    " + "Quantity");
			while(r1.next()) {
				if(r1.getInt("currentstock") > r1.getInt("thresholdstock"))
				  System.out.println(r1.getInt("sno")+"   "+r1.getString("produtctname")+"   "+r1.getInt("ID")+"   "+r1.getString("MRP")+"   "+r1.getString("quantity")+" ");
			  }
			 System.out.println("Select ID of ur choice n :");
			 int id = sc.nextInt();
			 Statement st = c.createStatement();
			 String sql = "SELECT *FROM bathing WHERE ID = '" + id + "'";
			 ResultSet x = st.executeQuery(sql);
			 if(x.next())
			 {
				 System.out.println("nos : ");
				 int nos = sc.nextInt();
				 if(nos <= x.getInt("currentstock")) {
				 String sql1 = "Update bathing set currentstock = currentstock - '"+ nos+ "' WHERE ID = '" + id + "'";
				 st.executeUpdate(sql1);
				 }
				 else
				 {
					 System.out.println("U can take "+ x.getInt("currentstock"));
				 }
		     }
			 else
			 {
				 System.out.println("Say BOO... !!!");
			 }
		}catch (Exception e)
		{
			System.out.println(e);
		}
	}

	public void Food(){
        String n;
        do{
            System.out.println("Select the item which you would like to buy.");
            System.out.println("1. Fruits");
            System.out.println("2. Vegetables");
            System.out.println("3. Dairy Products");
            System.out.println("4. Exit");
            n = sc.nextLine();
            switch(n)
            {
                    case "1" : System.out.println("Fruits");
                               Fruits();
                               break;

                    case "2" : System.out.println("Vegetables");
                               Vegetables();
                               break;

                    case "3" : System.out.println("Dairy Products");
                               Dairy();
                               break;

                    case "4" : System.out.println("Thank you for coming.Visit again .");    
                               System.exit(0);

                    default : System.out.println("The number you entered is incorrect.Please try again.");
                              break; 
            } 
        }while(!(n.equals("1"))&&!(n.equals("2"))&&!(n.equals("3"))&&!(n.equals("4")));
    }

	static void Vegetables() {
		try {
	    	 Class.forName("com.mysql.jdbc.Driver");
			 Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/food","root","Josaa_16651");
			 Statement s = c.createStatement();
			 ResultSet r1 = s.executeQuery("select *from vegetables");
			 System.out.println();
			 System.out.println("VEGETABLES");
			 System.out.println();
			 System.out.println("Sr.no  " +  "Product Name       " + "MRP    " + "Quantity");
				while(r1.next()) {
					if(r1.getInt("currentstock") > r1.getInt("thershold"))
					  System.out.println(r1.getInt("sno")+"   "+r1.getString("productname")+"   "+r1.getString("MRP")+"   "+r1.getString("quantity")+" ");
				  }
				 System.out.println();
				 System.out.println("Select s.no of ur choice n :");
				 int sno = sc.nextInt();
				 Statement st = c.createStatement();
				 String sql = "SELECT *FROM vegetables WHERE sno = '" + sno + "'";
				 ResultSet x = st.executeQuery(sql);
				 if(x.next())
				 {
					 System.out.println("nos : ");
					 int nos = sc.nextInt();
					 if(nos <= x.getInt("currentstock")) {
					 String sql1 = "Update vegetables set currentstock = currentstock - '"+ nos+ "' WHERE sno = '" + sno + "'";
					 st.executeUpdate(sql1);
					 }
					 else
					 {
						 System.out.println("U can take "+ x.getInt("currentstock"));
					 }
			     }
				 else
				 {
					 System.out.println("Boo");
				 }
	     }catch(Exception e)
	     {
	    	 System.out.println(e);
	     }
	 }

	static void Dairy() {
		 try {
	    	 Class.forName("com.mysql.jdbc.Driver");
			 Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/food","root","Josaa_16651");
			 Statement s = c.createStatement();
			 ResultSet r1 = s.executeQuery("select *from dairy");
			 System.out.println();
			 System.out.println("DAIRY");
			 System.out.println();
			 System.out.println("Sr.no  " +  "Product Name       " + "MRP    " + "Quantity");
				while(r1.next()) {
					if(r1.getInt("currentstock") > r1.getInt("thershold"))
					  System.out.println(r1.getInt("sno")+"     "+r1.getString("productname")+"     "+r1.getInt("ID")+"     "+r1.getString("MRP")+"   "+r1.getString("quantity")+" ");
				  }
				 System.out.println();
				 System.out.println("Select ID of ur choice n :");
				 int id = sc.nextInt();
				 Statement st = c.createStatement();
				 String sql = "SELECT *FROM dairy WHERE ID = '" + id + "'";
				 ResultSet x = st.executeQuery(sql);
				 if(x.next())
				 {
					 System.out.println("nos : ");
					 int nos = sc.nextInt();
					 if(nos <= x.getInt("currentstock")) {
					 String sql1 = "Update dairy set currentstock = currentstock - '"+ nos+ "' WHERE ID = '" + id + "'";
					 st.executeUpdate(sql1);
					 }
					 else
					 {
						 System.out.println("U can take "+ x.getInt("currentstock"));
					 }
			     }
				 else
				 {
					 System.out.println("invalid");
				 }
	     }catch(Exception e)
	     {
	    	 System.out.println(e);
	     }
	}

    static void Fruits() {
    	try {
       	 Class.forName("com.mysql.jdbc.Driver");
   		 Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/food","root","Josaa_16651");
   		 Statement s = c.createStatement();
   		 Statement s1 = c.createStatement();
   		 ResultSet r1 = s.executeQuery("select *from fruits");
   		 System.out.println();
   		 System.out.println("Fruits");
   		 System.out.println();
   			System.out.println("Sr.no  " +  "Product Name       " + "MRP    " + "Quantity");
   			while(r1.next()) {
   				if(r1.getInt("currentstock") > r1.getInt("thershold"))
   				  System.out.println(r1.getInt("sno")+"      "+r1.getString("productname")+"          "+r1.getString("MRP")+"        "+r1.getString("quantity")+"    ");
   			  }
   			 System.out.println();
   			 System.out.println("Select s.no of ur choice n :");
   			 int sno = sc.nextInt();
   			 Statement st = c.createStatement();
   			 String sql = "SELECT *FROM fruits WHERE sno = '" + sno + "'";
   			 ResultSet x = st.executeQuery(sql);
   			 if(x.next())
   			 {
   				 System.out.println("nos : ");
   				 int nos = sc.nextInt();
   				 if(nos <= x.getInt("currentstock")) {
   				 String sql1 = "Update fruits set currentstock = currentstock - '"+ nos+ "' WHERE sno = '" + sno + "'";
   				 st.executeUpdate(sql1);
   				 }
   				 else
   				 {
   					 System.out.println("U can take "+ x.getInt("currentstock"));
   				 }
   		     }
   			 else
   			 {
   				 System.out.println("invalid");
   			 }
        }catch(Exception e)
        {
       	 System.out.println(e);
        }
    }


	public void Crockery(){
            System.out.println("Select the item which you would like to buy.");
    		try {
   	    	 Class.forName("com.mysql.jdbc.Driver");
   			 Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/crockery","root","Josaa_16651");
   			 Statement s = c.createStatement();
   			 ResultSet r1 = s.executeQuery("select *from kitchenware");
   			 System.out.println();
   			 System.out.println("KITCHENWARE");
   			 System.out.println();
   			System.out.println("Sr.no  " +  "Product Name       " + "MRP    " + "Quantity");
   				while(r1.next()) {
   					if(r1.getInt("currentstock") > r1.getInt("threshold"))
   					  System.out.println(r1.getInt("sno")+"     "+r1.getString("productname")+"     "+r1.getInt("ID")+"     "+r1.getString("MRP")+"     "+r1.getString("quantity")+" ");
   				  }
   				 System.out.println();
   				 System.out.println("Select ID of ur choice n :");
   				 int id = sc.nextInt();
   				 Statement st = c.createStatement();
   				 String sql = "SELECT *FROM kitchenware WHERE ID = '" + id + "'";
   				 ResultSet x = st.executeQuery(sql);
   				 if(x.next())
   				 {
   					 System.out.println("nos : ");
   					 int nos = sc.nextInt();
   					 if(nos <= x.getInt("currentstock")) {
   					 String sql1 = "Update kitchenware set currentstock = currentstock - '"+ nos+ "' WHERE ID = '" + id + "'";
   					 st.executeUpdate(sql1);
   					 }
   					 else
   					 {
   						 System.out.println("U can take "+ x.getInt("currentstock"));
   					 }
   			     }
   				 else
   				 {
   					 System.out.println("invalid");
   				 }
   	     }catch(Exception e)
   	     {
   	    	 System.out.println(e);
   	     }
   	}
    }    