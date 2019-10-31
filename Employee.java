import java.util.*;

public class Employee{
    static Scanner sc = new Scanner(System.in); 
    static Store s = new Store();
    static Stock a = new Stock();
    static String p = "12345678";
    
    public static void Print(){
    	System.out.println("****Welcome****");
        System.out.println();
        System.out.println("Please Enter Password : ");
        String p1 = sc.nextLine();
        if(p1.equals(p)) {
        	System.out.println("Welcome to the store");
        	options();
        }
        else {
        	String n;
            do {
            	System.out.println("1. To re-enter");
            	System.out.println("2. Main Page");
            	System.out.println("3. Exit");
            	n = sc.nextLine();
            	switch(n) {
            	
            	case "1" : Print();
            	           break;
            	           
            	case "2" : StockMAnagementAndBilling sb = new StockMAnagementAndBilling();
            	           sb.print();
            	           break;
            	           
            	case "3" : System.out.println("Thank you for coming.Visit again soon.");    
                           System.exit(0);
                 
            	default : System.out.println("The number you entered is incorrect.Please try again.");
                          break;
            	}
            }while(n!="1" && n!="2" && n!="3");       		
        }
}
    static void options() {
    	String n;
    	do {
    		System.out.println("1. Stock");
    		System.out.println("2. Graph");
    		System.out.println("3. Out Of Stock");
    		System.out.println("4. Customer Requests");
    		n = sc.nextLine();
    		switch(n) {
    		
    		case "1" : a.view();
    		           break;
    		
    		case "2" : System.out.println("Thank you for coming.Visit again soon.");    
                       System.exit(0);
                       
    		 default : System.out.println("Thanks for coming.Visit again soon");
                       System.exit(0);
                       break;         
    		}
    	}while(n!="1" && n!="2");
    }
    static void call() {
   	 String n;
   	 do {
   		 System.out.println("1. Countiue");
   		 System.out.println("2. Main page");
   		 System.out.println("3. Exit");
   		 n = sc.nextLine();
   		 switch(n) {
   		 case "1" : Print();
   		            break;
   		
   		 case "2" : StockMAnagementAndBilling sb = new StockMAnagementAndBilling();
   		            sb.print();
   		            break;
   		            
   		 case "3" : System.out.println("Thank you for coming.Visit again .");    
                    System.exit(0);
            
   		 default : System.out.println("The number you entered is incorrect.Please try again.");
                   break; 
   		 }
   	 }while(!(n.equals("1"))&&!(n.equals("2"))&&!(n.equals("3")));
   	 String e = sc.nextLine();
    }
	
}           