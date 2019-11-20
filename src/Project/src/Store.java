import java.sql.ResultSet;
import java.util.Scanner;

import com.mysql.jdbc.Statement;

public class Store extends Usable implements Connectivity {
	static Product p = new Product();
	static Stock a = new Stock();
	static Scanner scan = new Scanner(System.in);
	static int i;

	   static void ask() throws Exception{
		   
		   String n;
			do {
				System.out.println();
				System.out.println();
	            System.out.println("                                                 Select:");
				System.out.println("                                                 1. Update the Current Stock");
				System.out.println("                                                 2. Out of stock");
				System.out.println("                                                 3. Menu");
				System.out.println("                                                 4. Exit");
				System.out.println();
	            System.out.print("                                                 Choose : ");
	            
				n = scan.nextLine();
				switch(n) 
				{
				case "1" : call();
				           break;
				           
				case "2" : find();
				           break;
				           
				case "3" : Employee.options();
		                   break;
				case "4" : System.out.println("                                           Thank you for visiting");
		                   System.exit(0);
		                   
		                   
				default  : System.out.println();
					       System.out.print("                                                 Please enter valid input  ");
				           break;
				}
			}while(!(n.equals("1"))&&!(n.equals("2")) && !(n.equals("3")));	
	   }

	   static void call() throws Exception{
		       Product.Table();
		       System.out.println();
	           System.out.print("                                                 Select ID : ");
			   int id = scan.nextInt();
			   System.out.print("                                                 Enter Current_Stock : ");
			   int cs = scan.nextInt();
			   System.out.print("                                                 Enter Threshold_stock : ");
			   int ts = scan.nextInt();
			   update(id,cs,ts);
			   System.out.println();
	           System.out.println("                                         Product Stock Details have been successfully updated.");
			   String e = scan.nextLine();
			   ask();
	       }
		  
	   static void update(int id, int a, int b) {
		   try {
			   Statement s = (Statement) p.Connect();
			   ResultSet r = s.executeQuery("select *from items where ID = '"+id+"'");
			   if(!r.next()) {
				   System.out.println();
		           System.out.print("                                                 Enter valid ID : ");
				   id = scan.nextInt();
				   System.out.print("                                                 Enter Current_Stock : ");
				   int cs = scan.nextInt();
				   System.out.print("                                                 Enter Threshold_stock : ");
				   int ts = scan.nextInt();
				   update(id, cs , ts);
			   }
			   else {
				   Statement s1 = (Statement) p.Connect();
				   s1.executeUpdate("Update items set Current_Stock = Current_Stock + '"+a+"', Threshold_Stock = Threshold_Stock + '"+b+"' WHERE ID = '"+id+"'");
			   }
		   }catch(Exception e) {
			   System.out.println(e);
		   }
	   }

	   static void find() throws Exception{
		   String s;
		   shortage();
		   do {
			   System.out.println();
	           System.out.print("                                                 Would you like to update (y/n)");
		       s = scan.nextLine();
		       if(s.equals("Y")|| s.equals("y")) {
			   System.out.print("                                                 Select ID : ");
			   int id = scan.nextInt();
			   validate(id);
			   System.out.print("                                                 Enter Current_Stock : ");
			   int cs = scan.nextInt();
			   System.out.print("                                                 Enter Threshold_stock : ");
			   int ts = scan.nextInt();
			   update(cs,ts);
			   System.out.println("");
			   String e = scan.nextLine();
			   ask();
		   }
		   else if(s.equals("N")||s.equals("n")){
			   Stock.ask();
		   }
		   else 
			   System.out.print("                                                 Enter valid input.");
		   }while((!s.equals("Y")) || (!s.equals("y")) || (!s.equals("N")) || (!s.equals("n")));
	   }

	   static void shortage() {
		   int cnt = 0;
			try {   
	            Statement s = (Statement) p.Connect();
				ResultSet r1 = s.executeQuery("select *from items where Current_Stock<Threshold_Stock");
				while(r1.next()) {
					cnt++;
				}	
				if(cnt == 0)
					System.out.println("                                                 No Product is out of stock.");	
				else {
					ResultSet r = s.executeQuery("select *from items where Current_Stock<Threshold_Stock");
					  System.out.println("                                                       ****The following need to be ordered.****");
					  System.out.println();
				System.out.println("SR NO.   CATEGORY  PRODUCT NAME    PRODUCT ID     INITIAL STOCK    CURRENT STOCK   THRESHOLD STOCK");
				while(r.next()) {
						System.out.println(r.getInt("SrNo")+"     "+r.getString("Category")+"  "+r.getString("Product_Name")+"    "+r.getInt("ID")+"               "+r.getInt("Initial_Stock")+"              "+r.getInt("Current_Stock")+"             "+r.getInt("Threshold_Stock"));
				}
			 }
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	   
	   static void validate(int id) {
		   try {
			   Statement s = (Statement) p.Connect();
				ResultSet r = s.executeQuery("select *from items where ID = '"+id+"'and Current_Stock<Threshold_Stock");
				if(!r.next()) {
					System.out.print("                                                 Enter valid ID : ");
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
		   s.executeUpdate("Update items set Current_Stock = Current_Stock + '"+a+"', Threshold_Stock = Threshold_Stock + '"+b+"' WHERE ID = '"+i+"'");
	   }catch(Exception e) {
		   System.out.println(e);
	   }
   }
}
   


