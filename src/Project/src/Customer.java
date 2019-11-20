import java.util.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer extends Product{
	
    static String s ; 
    static int id;
    static int n;
    private static String name;
	private static String phno;
	static int sno = 0;
    static Scanner sc = new Scanner(System.in);
    
    static void Details() {
    	System.out.println("                                           ****Welcome, Happy Shopping!****");
        System.out.println();
    	sno = bn();
    	System.out.print("                                                 Enter your name :");
    	name = sc.nextLine();
    	System.out.print("                                                 Enter Your Phone number : ");
    	String p = sc.nextLine();
    	validate_id(p);
    	
    }
    
    static void validate_id(String s) {
		Pattern p = Pattern.compile("\\d{10}");
    	Matcher m = p.matcher(s);
    	if(m.matches()) {
    		phno = s;
    	}
    	else {
    		System.out.print(                                                 "Please enter valid Phnoenumber : ");
    		phno = sc.nextLine();
    		validate_id(phno);
    	}
	}
    
    static void Display() throws Exception{
    	String n;
        do{
        	System.out.println();
            System.out.println("                                                 Select the item you would like to buy.");
            System.out.println();
            System.out.println("                                                 1. Daily Uses");
            System.out.println("                                                 2. Food");
            System.out.println("                                                 3. Crockery");
            System.out.println("                                                 4. Exit ");
            System.out.println();
            System.out.print("                                                 Choose : ");
            n = sc.nextLine();
            switch(n)
            {
                    case "1" : System.out.println("                                                 Welcome to the Daily uses section.");
                               DailyUses();
                               break;

                    case "2" : System.out.println("                                                 Welcome to the Food section.");
                               Food(); 
                               break;

                    case "3" : System.out.println("                                                 Welcome to the Crockery section.");
                               category("Kitchenware"); 
                               break;

                    case "4" : System.out.println("                                                 Thank you for coming.Visit again .");    
                               System.exit(0);

                    default : System.out.println("                                                 The number you entered is incorrect.Please try again.");
                              break; 
            } 
        }while(!(n.equals("1"))&&!(n.equals("2"))&&!(n.equals("3"))&&!(n.equals("4")));
     }
    
     static void ask() throws Exception {
    	 System.out.println();
     	System.out.println("                                             ****Customer Section****");
     	System.out.println();
     	
    	 String n;
    	 do {
    		 System.out.println("                                                 1. Proceed");
    		 System.out.println("                                                 2. Main page");
    		 System.out.println("                                                 3. Exit");
    		 System.out.println();
             System.out.print("                                                 Choose : ");
             n = sc.nextLine();
    		 switch(n) {
    		 
    		 case "1" : Details();
    			        Display();
    		            break;
    		
    		 case "2" : StockMAnagementAndBilling.print();
    		            break;
    		            
    		 case "3" : System.out.println("                                                 Thank you for coming.Visit again .");    
                        System.exit(0);
             
    		 default : System.out.println("                                    The number you entered is incorrect.Please try again.");
                       break; 
    		 }
    	 }while(!(n.equals("1"))&&!(n.equals("2"))&&!(n.equals("3")));
     }
     
	 static void DailyUses() throws Exception{
        String n;
        do{
        	System.out.println();
            System.out.println("                                                 Select the item you would like to buy.");
            System.out.println();
            System.out.println("                                                 1. Dental");
            System.out.println("                                                 2. Bathing");
            System.out.println("                                                 3. Utilities");
            System.out.println("                                                 4. Menu");
            System.out.println("                                                 5. Exit");
            System.out.println();
            System.out.print("                                                 Choose : ");
            
            n = sc.nextLine();
            switch(n)
            {
                    case "1" : category("   Dental  ");
                               break;

                    case "2" : category("  Bathing  ");
                               break;

                    case "3" : category(" Utilities ");
                               break;

                    case "4" : Display();
                               break;
                               
                    case "5" : System.out.println("                                                 Thank you for visiting");
			                   System.exit(0);
			                   
                    default : System.out.println("                                                 The number you entered is incorrect.Please try again.");
                              break; 
                    } 
        }while(!(n.equals("1"))&&!(n.equals("2"))&&!(n.equals("3"))&&!(n.equals("4"))&& !(n.equals("5")));
    }
	
	static void Food() throws Exception {
    	String n;
        do{
        	System.out.println();
            System.out.println("                                                 Select the item you would like to buy.");
            System.out.println();
            System.out.println("                                                 1. Dairy");
            System.out.println("                                                 2. Fruits");
            System.out.println("                                                 3. Vegetables");
            System.out.println("                                                 4. Menu");
            System.out.println("                                                 5. Exit");
            System.out.println();
            System.out.print("                                                 Choose : ");
            
            n = sc.nextLine();
            switch(n)
            {
                    case "1" : category("   Dairy   ");
                               break;

                    case "2" : category("   Fruits  ");
                               break;

                    case "3" : category(" Vegetables");
                               break;
                    
                    case "4" : Display();
                               break;
                    
                    case "5" : System.out.println("                                                 Thank you for visiting");
	                           System.exit(0);
	                   
                    default : System.out.println("                                                 The number you entered is incorrect. Please try again.");
                              break; 
            }
        }while(!(n.equals("1"))&&!(n.equals("2"))&&!(n.equals("3"))&&!(n.equals("4"))&& !(n.equals("5")));

	}
	
	static void category(String s) throws Exception {
		System.out.println("                                                 ****"+s+"****");
		System.out.println();
		Table(s);
		show(s);
	}
	 
    static void show(String a) throws Exception {
    	System.out.println();
		String f;
		do {
		System.out.print("                                                 Would you like to continue (Y/N) : ");
		f = sc.nextLine();
		if(f.equals("Y")||f.equals("y"))
		{
			System.out.println();
			System.out.print("                                                 Select ID : ");
			id = sc.nextInt();
		    validate_id(a, id);
		    System.out.print("                                                 Enter Quantity in units : ");
		    n = sc.nextInt();
		    validate_n(n);
		    end();
		    show();
		}
		if(f.equals("N")||f.equals("n")){
			show();
		}
		
    }while(!(f.equals("Y"))&& !(f.equals("y"))&&!(f.equals("N"))&&!(f.equals("n")));
   }
    
    static void end() throws Exception {
    	System.out.println();
		String n;
    	cost();
        do {
        	System.out.println();
			System.out.println("                                                 Select:");
    		System.out.println("                                                 1. Add to cart");
			System.out.println("                                                 2. Get Bill");
			System.out.println("                                                 3. Menu");
			System.out.println("                                                 4. Exit");
			String e = sc.nextLine();
			System.out.println();
            System.out.print("                                                 Choose : ");
            
			n = sc.nextLine();
			switch(n) 
			{
			case "1" : {
				        Update();
				        Display();
			           }
			           break;
			         
			case "2" :{ 
				       String cr = request();
				       cart(sno, name, phno, cr);
				       receipt(sno);
				       System.out.println();
				       System.out.println("                                                 Thank you for visiting");
			           System.exit(0);
				      }
			          break;
				    
			case "3" : Display();
			           break;
 			case "4" : System.out.println("                                                 Thank you for visiting");
	                   System.exit(0);
	        
 			default  : System.out.println("                                                 Please enter valid input : ");
			           break;
			}
		}while(!(n.equals("1"))&&!(n.equals("2"))&&!(n.equals("3"))&&!(n.equals("4")));	
    }
			
	static String request() {
		System.out.print("                                                 Do you have any request : ");
		String l = sc.nextLine();
		return l;
	}

	static void show() throws Exception {
    	String n;
		do {
			System.out.println("                                                 Select:");
			System.out.println("                                                 1. Menu");
			System.out.println("                                                 2. Exit");
			System.out.println();
            System.out.print("                                                 Choose : ");
            
			n = sc.nextLine();
			switch(n) 
			{
			case "1" : Display();
			           break;
			case "2" : System.out.println("                                                 Thank you for visiting");
			           System.exit(0);
			default  : System.out.println("                                                 Please enter valid input : ");
			           break;
			}
		}while(!(n.equals("1"))&&!(n.equals("2")));	
    }
}