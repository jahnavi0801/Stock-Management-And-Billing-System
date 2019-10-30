import java.util.*;

public class Employee{
    public String name;
    public int id;
    static Scanner sc = new Scanner(System.in); 
    
    public void Print(){
        
        String n,n1;
        System.out.println("Enter the password : ");
        String p = sc.nextLine();
        if(p.equals("12345678"))
        {
            System.out.println("Entered successfully!!");
            
        }
        else
        {
            System.out.println("The password is incorrect.");
            System.out.println("1. if you want to try again.");
            System.out.println("2. if you want to back to the home page.");
            System.out.println("3. Exit");
            String ch = sc.nextLine();
            switch(ch)
            {
                    case "1" : Print();
                               break;

                    case "2" : StockMAnagementAndBilling s = new StockMAnagementAndBilling();
                               s.print();
                               break;
                            
                    case "3" : System.out.println("Thank you for coming.Visit again soon.");    
                               System.exit(0);
                               
                    default : System.out.println("Thanks for coming.Visit again soon");
                              System.exit(0);
                              break;               
            }                                                  
        }
        sc.close();
    }
   
}           