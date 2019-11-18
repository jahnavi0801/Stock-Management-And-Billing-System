import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Statement;

public class Store implements Connectivity {
	static Product p = new Product();
	static Stock a = new Stock();
	static Scanner scan = new Scanner(System.in);
	static int i;

	   static void ask() throws IOException{
		   String n;
			do {
				System.out.println("Select:");
				System.out.println("1. Update");
				System.out.println("2. to view out of stock");
				System.out.println("3. Menu");
				System.out.println("4. Exit");
				n = scan.nextLine();
				switch(n) 
				{
				case "1" : call();
				           break;
				           
				case "2" : find();
				           break;
				           
				case "3" : Employee e = new Employee();
		                   e.options();
		                   break;
				case "4" : System.out.println("Thank u fr visiting");
		                   System.exit(0);
		                   
				default  : System.out.println("Please enter valid input : ");
				           break;
				}
			}while(!(n.equals("1"))&&!(n.equals("2")) && !(n.equals("3")));	
	   }

	   static void call() throws IOException{
		       p.Table();
			   System.out.print("Select ID : ");
			   int id = scan.nextInt();
			   System.out.println("Enter Current_Stock : ");
			   int cs = scan.nextInt();
			   System.out.println("Enter Threshold_stock : ");
			   int ts = scan.nextInt();
			   update(id,cs,ts);
			   System.out.println("****Misson Done****");
			   String e = scan.nextLine();
			   ask();
	       }
		  
	   static void update(int id, int a, int b) {
		   try {
			   Statement s = (Statement) p.Connect();
			   ResultSet r = s.executeQuery("select *from items where ID = '"+id+"'");
			   if(!r.next()) {
				   System.out.println("Enter valid ID : ");
				   id = scan.nextInt();
				   System.out.println("Enter Current_Stock : ");
				   int cs = scan.nextInt();
				   System.out.println("Enter Threshold_stock : ");
				   int ts = scan.nextInt();
				   update(id, a ,b);
			   }
			   else {
				   Statement s1 = (Statement) p.Connect();
					s1.executeUpdate("Update items set Current_Stock = Current_Stock + '"+a+"', Threshold_stock = Threshold_stock + '"+b+"' WHERE ID = '"+id+"'");
			   }
		   }catch(Exception e) {
			   System.out.println(e);
		   }
	   }

	   static void find() throws IOException{
		   shortage();
		   System.out.println("Would u like to update (y/n)");
		   String s = scan.nextLine();
		   if(s.equals("Y")|| s.equals("y")) {
			   System.out.print("Select ID : ");
			   int id = scan.nextInt();
			   validate(id);
			   System.out.println("Enter Current_Stock : ");
			   int cs = scan.nextInt();
			   System.out.println("Enter Threshold_stock : ");
			   int ts = scan.nextInt();
			   update(cs,ts);
			   System.out.println("****Misson Done****");
			   String e = scan.nextLine();
			   ask();
		   }
		   else if(s.equals("N")||s.equals("n")){
			   a.ask();
		   }
	   }

	   static void shortage() {
			try {
	            System.out.println("Out of Stock");
				Statement s = (Statement) p.Connect();
				ResultSet r = s.executeQuery("select *from items where Current_Stock<Threshold_stock");
				while(r.next()) {
					//if(r.getInt("Current_Stock") < r.getInt("Threshold_stock")) {
						System.out.println(r.getInt("sno")+" "+r.getString("category")+" "+r.getString("Product_name")+" "+r.getInt("ID")+" "+r.getInt("Initial_stock")+" "+r.getInt("Current_Stock")+" "+r.getInt("Threshold_stock"));
				//}
			    }
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	   
	   static void validate(int id) {
		   try {
				Statement s = (Statement) p.Connect();
				ResultSet r = s.executeQuery("select *from items where ID = '"+id+"'and Current_Stock<Threshold_stock");
				if(!r.next()) {
					System.out.println("Enter valid ID : ");
					i = scan.nextInt();
					validate(i);
				}
				else {
					i = id;
				}
			}catch(Exception e) {
				System.out.println(e);
			}
	   }
	   
   static void update(int a, int b) {
	   try {
		   Statement s = (Statement) p.Connect();
		   ResultSet r = s.executeQuery("select *from items where ID = '"+i+"'");
		   s.executeUpdate("Update items set Current_Stock = Current_Stock + '"+a+"', Threshold_stock = Threshold_stock + '"+b+"' WHERE ID = '"+i+"'");
	   }catch(Exception e) {
		   System.out.println(e);
	   }
   }
}
   


