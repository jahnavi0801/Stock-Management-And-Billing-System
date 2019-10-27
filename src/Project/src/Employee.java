import java.util.*;

public class Employee{
    public String name;
    public int id;

    public void Print(){
        
        Scanner sc = new Scanner(System.in); 
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
            System.out.println("Press 1 if you want to try again.");
            System.out.println("Press 2 if you want to back to the home page.");
            System.out.println("Press any other key to exit.");
            String ch = sc.nextLine();
            switch(ch)
            {
                    case "1" : Print();
                               break;

                    case "2" : StockMAnagementAndBilling s = new StockMAnagementAndBilling();
                               s.print();
                               break;
                            
                    default : System.out.println("Thanks for coming.Visit again soon");
                              System.exit(0);
                              break;               
            }                                                  
        }
        sc.close();
    }
   
}           
