import java.util.*;

public class Employee extends Usable{
    static Scanner sc = new Scanner(System.in);  
    static String p = "12345678";
    
    static void Print() throws Exception{
    	System.out.print("                                                 Please Enter Password : ");
        String p1 = sc.nextLine();
        if(p1.equals(p)) {
        	System.out.println();
        	System.out.println("                                          ****Welcome To The Staff Section****");
            System.out.println();
            options();
        }
        else {
        	String n;
            do {
            	System.out.println();
            	System.out.println("                                                 1. Re-enter Password");
            	System.out.println("                                                 2. Main Page");
            	System.out.println("                                                 3. Exit");
            	System.out.println();
                System.out.print("                                                 Choose : ");
                n = sc.nextLine();
            	switch(n) {
            	
            	case "1" : Print();
            	           break;
            	           
            	case "2" : StockMAnagementAndBilling.print();
            	           break;
            	           
            	case "3" : System.out.println("                                                 Thank you for coming.Visit again soon.");    
                           System.exit(0);
                 
            	default : System.out.println("                                            The number you entered is incorrect. Please try again.");
                          break;
            	}
            }while(n!="1" && n!="2" && n!="3");       		
        }
}
    static void options() throws Exception{
    	String n;
    	do {
            System.out.println();
    		System.out.println("                                                 1. Stock Information");
    		System.out.println("                                                 2. Sales Analysis (Graphs)");
    		System.out.println("                                                 3. Updation Of Stock");
    		System.out.println("                                                 4. Customer Review");
    		System.out.println("                                                 5. Home Page");
    		System.out.println("                                                 6. Exit");
    		System.out.println();
            System.out.print("                                                 Choose : ");
            n = sc.nextLine();
    		switch(n) {
    		
    		case "1" : Stock.view();
    		           break;
    		
    		case "2" : Graph.ask();
        	           break;
	
    		case "3" : Store.ask();
	                   break;
	                   
    		case "4" :{ 
    			       Customer_rq.ask();
    		           System.out.println();
    		           break;
    		          }
    			      
    		case "5" : StockMAnagementAndBilling.print();
	                   break;
	           			
    		case "6" : System.out.println("                                                 Thank you for coming.Visit again soon.");    
                       System.exit(0);
                       
    		 default : System.out.println("                                                 Please enter valid input  ");
                       break;         
    		}
    	}while(n!="1" && n!="3" && n!="4" && n!="5" && n!="6");
    }
    static void ask() throws Exception{
    	System.out.println();
    	System.out.println("                                             ****Staff Section****");
    	System.out.println();
    	
   	 String n;
   	 do {
   		 System.out.println();
		 System.out.println("                                                 1. Proceed");
   		 System.out.println("                                                 2. Main page");
   		 System.out.println("                                                 3. Exit");
   		 System.out.println();
         System.out.print("                                                 Choose : ");
         n = sc.nextLine();
   		 switch(n) {
   		 case "1" : Print();
   		            break;
   		
   		 case "2" : StockMAnagementAndBilling.print();
   		            break;
   		            
   		 case "3" : System.out.println("                                           Thank you for coming.Visit again .");    
                    System.exit(0);
            
   		 default : System.out.println("                                     The number you entered is incorrect.Please try again.");
                   break; 
   		 }
   	 }while(!(n.equals("1"))&&!(n.equals("2"))&&!(n.equals("3")));
   	 String e = sc.nextLine();
    }
	
}           