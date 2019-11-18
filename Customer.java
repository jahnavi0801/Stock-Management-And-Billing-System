import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer{
	
	    static String s ; 
	    static int id;
	    static int n;
	    static Product c = new Product();
		private static String name;
		private static String phno;
	    static Scanner sc = new Scanner(System.in);
	    
	    public static void Details() {
	    	System.out.println("Enter your name :");
	    	name = sc.nextLine();
	    	System.out.println("Enter Your Phone Number : ");
	    	input();
	    }
	    static void input() {
			String a = sc.nextLine();
			set(a);
		}
	    
	    static void set(String s) {
	    	Pattern p = Pattern.compile("\\d{10}");
	    	Matcher m = p.matcher(s);
	    	if(m.matches())
	    		s = phno;
	    	else {
	            System.out.println("Please enter valid Phone Number : ");
	    		input();    		
	    	}
	    }
	    
	    static void Display() throws IOException, SQLException{
	        String n,n1;
	        do{
	            System.out.println("Select the item you would like to buy.");
	            System.out.println("1. Daily Uses");
	            System.out.println("2. Food");
	            System.out.println("3. Crockery");
	            System.out.println("4. Go back to the main page.");
	            System.out.println("5. Exit ");
	            n = sc.nextLine();
	            switch(n)
	            {
	                    case "1" : System.out.println("Welcome to the Daily Uses Section.");
	                               DailyUses();
	                               break;

	                    case "2" : System.out.println("Welcome to the Food Section.");
	                               Food(); 
	                               break;

	                    case "3" : System.out.println("Welcome to the Crockery Section.");
	                               Crockery(); 
	                               break;

	                    case "4" : StockManagement s = new StockManagement();
	                               s.print();
	                               break;

	                    case "5" : System.out.println("Thank you for coming.Visit again soon.");    
	                               System.exit(0);

	                    default : System.out.println("The number you entered is incorrect.Please try again.");
	                              break; 
	            } 
	        }while(!(n.equals("1"))&&!(n.equals("2"))&&!(n.equals("3"))&&!(n.equals("4"))&&!(n.equals("5")));
	        /*System.out.print(sc.nextLine());
	        System.out.println("Do you want ot continue(Y/N) ?");
	        n1 = sc.nextLine();
	        if(n1.equals("Y")||n1.equals("y"))
	            Display();
	        else
	            System.out.println("Thank you for coming.Visit again .");
	            System.exit(0);*/
	    }
	     static void ask() throws IOException, SQLException {
	    	 String n;
	    	 do {
	    		 System.out.println("1. Continue");
	    		 System.out.println("2. Main page");
	    		 System.out.println("3. Exit");
	    		 n = sc.nextLine();
	    		 switch(n) {
	    		 
	    		 case "1" : Details();
	    			        Display();
	    		            break;
	    		
	    		 case "2" : StockManagement sb = new StockManagement();
	    		            sb.print();
	    		            break;
	    		            
	    		 case "3" : System.out.println("Thank you for coming.Visit again soon.");    
	                        System.exit(0);
	             
	    		 default : System.out.println("The number you entered is incorrect.Please try again.");
	                       break; 
	    		 }
	    	 }while(!(n.equals("1"))&&!(n.equals("2"))&&!(n.equals("3")));
	     }
		 static void DailyUses() throws IOException, SQLException{
	        String n;
	        do{
	            System.out.println("Select the item you would like to buy.");
	            System.out.println("1. Dental");
	            System.out.println("2. Bathing");
	            System.out.println("3. Utilities");
	            System.out.println("4. Menu");
	            System.out.println("5. Exit");
	            n = sc.nextLine();
	            switch(n)
	            {
	                    case "1" : Dental();
	                               break;

	                    case "2" : Bathing();
	                               break;

	                    case "3" : Utilities();
	                               break;

	                    case "4" : Display();
	                               break;
	                               
	                    case "5" : System.out.println("Thank you for coming.Visit again soon.");
				                   System.exit(0);
				                   
	                    default : System.out.println("The number you entered is incorrect.Please try again.");
	                              break; 
	                    } 
	        }while(!(n.equals("1"))&&!(n.equals("2"))&&!(n.equals("3"))&&!(n.equals("4")));
	    }
		
		static void Food() throws IOException, SQLException {
	    	String n;
	        do{
	            System.out.println("Select the item which you would like to buy.");
	            System.out.println("1. Dairy");
	            System.out.println("2. Fruits");
	            System.out.println("3. Vegetables");
	            System.out.println("4. Menu");
	            System.out.println("5. Exit");
	            n = sc.nextLine();
	            switch(n)
	            {
	                    case "1" : Dairy();
	                               break;

	                    case "2" : Fruits();
	                               break;

	                    case "3" : Vegetables();
	                               break;
	                    
	                    case "4" : Display();
	                               break;
	                    
	                    case "5" : System.out.println("Thank you for coming.Visit again soon.");
		                            System.exit(0);
		                   
	                    default : System.out.println("The number you entered is incorrect.Please try again.");
	                              break; 
	            }
	        }while(!(n.equals("1"))&&!(n.equals("2"))&&!(n.equals("3"))&&!(n.equals("4")));

		}
		static void Dental() throws IOException, SQLException {
			s = "   Dental  ";
			System.out.println("****DENTAL****");
			System.out.println();
			c.Table(s);
			show(s);
		}
		static void Bathing() throws IOException, SQLException {
			s = "  Bathing  ";
			System.out.println("****BATHING****");
			System.out.println();
			c.Table(s);
			show(s);
		}
		static void Utilities() throws IOException, SQLException {
			s = " Utilities ";
			System.out.println("****UTILITIES****");
			System.out.println();
			c.Table(s);
			show(s);
		}
		static void Dairy() throws IOException, SQLException {
			s = "   Dairy   ";
			System.out.println("****DAIRY****");
			System.out.println();
			c.Table(s);
			show(s);
		}	
		static void Fruits() throws IOException, SQLException {
			s = "   Fruits  ";
			System.out.println("Choose from our fruits");
			System.out.println("****FRUITS****");
			
			System.out.println();
			c.Table(s);
			show(s);
		}
		static void Vegetables() throws IOException, SQLException {
			System.out.println();
			s = " Vegetables";
			System.out.println("Choose from our vegetables");
			System.out.println("****VEGETABLES****");
			System.out.println();
			c.Table(s);
			show(s);
		}
	    static void Crockery() throws IOException, SQLException {
	    	System.out.println();
			System.out.println("Choose from our Kitchenware");
			s = "Kitchenware";
			System.out.println("****KITCHENWARE****");
			System.out.println();
			c.Table(s);
			show(s);
		}
	    static void stocks(int i) {
	    	n = sc.nextInt();
	    	c.validate_n(n);
	    }
	    static void show(String a) throws IOException, SQLException {
			String f;
			do {
			System.out.print("Would you like to continue (Y/N) : ?");
			f = sc.nextLine();
			if(f.equals("Y")||f.equals("y"))
			{
				System.out.println("Select ID : ");
			    id = sc.nextInt();
			    c.validate_id(a, id);
			    System.out.println("Quantity");
			    n = sc.nextInt();
			    c.validate_n(n);
			    String e = sc.nextLine();
			    show();
			}
			if(f.equals("N")||f.equals("n")){
				String n;
				do {
					System.out.println("Select:");
					System.out.println("1. Menu");
					System.out.println("2. Exit");
					n = sc.nextLine();
					switch(n) 
					{
					case "1" : Display();
					           break;
					case "2" : System.out.println("Thank you for coming.Visit again soon.");
					           System.exit(0);
					default  : System.out.println("Please enter a valid input : ");
					           break;
					}
				}while(!(n.equals("1"))&&!(n.equals("2")));
			}
			
	    }while(!(f.equals("Y"))&& !(f.equals("y"))&&!(f.equals("N"))&&!(f.equals("n")));
	    }
	    
	    static void show() throws IOException, SQLException {
	    	String n;
			do {
				System.out.println("Select:");
				System.out.println("1. Menu");
				System.out.println("2. Exit");
				n = sc.nextLine();
				switch(n) 
				{
				case "1" : Display();
				           break;
				case "2" : System.out.println("Thank you for coming.Visit again soon.");
				           System.exit(0);
				default  : System.out.println("Please enter a valid input : ");
				           break;
				}
			}while(!(n.equals("1"))&&!(n.equals("2")));	
	    }
	}