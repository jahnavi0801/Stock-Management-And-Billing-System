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
    
    public void Details() {
    	System.out.println("Enter your name :");
    	name = sc.nextLine();
    	System.out.println("Enter your PhoneNumber : ");
    	String phn = sc.nextLine();
    	Pattern p = Pattern.compile("\\d{10}");
    	Matcher m = p.matcher(phn);
    	if(m.matches()) {
    		phno = phn;
    	}
    	else {
    		System.out.println("Please Enter Valid Number");
    	}
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
                              // Food(); 
                               break;

                    case "3" : System.out.println("Welcome to the Crockery section.");
                               //Crockery(); 
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
                               //Dental();
                               break;

                    case "2" : System.out.println("Bathing");
                               Bathing();
                               break;

                    case "3" : System.out.println("Utilities");
                               //Utilities();
                               break;

                    case "4" : System.out.println("Thank you for coming.Visit again .");    
                               System.exit(0);

                    default : System.out.println("The number you entered is incorrect.Please try again.");
                              break; 
                    } 
        }while(!(n.equals("1"))&&!(n.equals("2"))&&!(n.equals("3"))&&!(n.equals("4")));
    }

	static void Bathing() {
		s = "bathing";
		System.out.println("BATHING");
		System.out.println();
		c.Table(s);
		System.out.print("Select ID : ");
		id = sc.nextInt();
		System.out.print("nos : ");
		n = sc.nextInt();
		c.buy(id,n);
		c.cart(name,phno,id,n);
	}  
	
    }    