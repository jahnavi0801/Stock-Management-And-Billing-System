import java.util.*;

public class Employee extends Customer{
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
            Display();
            /*do{
                System.out.println("Enter your choice : ");
                System.out.println("1. Daily Uses");
                System.out.println("2. Food");
                System.out.println("3. Crockery");
                System.out.println("4. Exit");
                n = sc.nextLine();
                switch(n)
                {
                    case "1" : System.out.println("Welcome to the Daily uses section.");
                               DailyUses();
                               break;

                    case "2" : System.out.println("Welcome to the Food section.");
                               Food(); 
                               break;

                    case "3" : System.out.println("Welcome to the Crockery section.");
                               Crockery(); 
                               break;

                    case "4" : System.out.println("Thank you for coming.Visit again soon.");    
                               System.exit(0);

                    default : System.out.println("The number you entered is incorrect.Please try again.");
                              break; 
                } 
                }while(!(n.equals("1"))&&!(n.equals("2"))&&!(n.equals("3"))&&!(n.equals("4")));
                System.out.println("Do you want ot continue(Y/y for yes) ?");
                n1 = sc.nextLine();
                if(n1.equals("Y")||n1.equals("y"))
                    Display();
                else
                    System.out.println("Thank you visit again.");*/   
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
