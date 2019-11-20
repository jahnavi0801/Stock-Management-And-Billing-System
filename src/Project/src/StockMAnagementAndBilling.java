import java.util.*;

class StockMAnagementAndBilling {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception 
    {
    	System.out.println("                                        ****************************************   ");
        System.out.println("                                        * Welcome To \"The Departmental Store.\" *  ");
        System.out.println("                                        ****************************************    ");
        System.out.println();
        print();
    }
    public static void print() throws Exception{
    	String n;
        do{
            System.out.println("                                                 Login as :");
            System.out.println();
            System.out.println("                                                 1. Customer");
            System.out.println("                                                 2. Staff");
            System.out.println("                                                 3. Exit");
            System.out.println();
            System.out.print("                                                 Choose : ");
            n = sc.nextLine();
            switch(n)
            {
                case "1" : Customer.ask();
                		   break;

                case "2" : Employee.ask();
                           break;

                case "3" : System.out.println("                                           Thank you for coming.Visit again soon.");    
                           System.exit(0);

                default : System.out.println("                                                 Please try again  ");
                          break; 
            } 
        }while(n!="1" && n!="2" && n!="3");
    }

}