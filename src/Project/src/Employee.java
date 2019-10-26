/*import java.util.*;

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
        /*else
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
   
}  */
  /*import java.util.*;

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
        /*else
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
   
}*/
import java.util.*;

public class Employee extends Customer{
    public String name;
    public int id;
    public int f=0;

    public void password(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password : ");
        String p = sc.nextLine();
        if(p.equals("12345678"))
        {
            System.out.println("Entered successfully!!");
            Print();
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
                case "1" : password();
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

    public void Print(){
        String t;
        //String n,n1;
       Scanner sc = new Scanner(System.in);

            do{
                System.out.println("1. view stocks");
                System.out.println("2. alerts");
                System.out.println("3. customer requests");
                System.out.println("4. monthly analysis");
                System.out.println("5. Go back to the main page.");
                System.out.println("6. Exit ");
                t= sc.nextLine();
                switch(t){
                    case "1" :
                        System.out.println("data");
                        break;
                    case "2" :
                        System.out.println("here's what you need to buy");
                        //alert();
                        break;
                    case "3" :
                        System.out.println("viewing requests");
                        break;
                    case "4" :
                        System.out.println("monthly sales");
                        break;
                    case "5" : StockMAnagementAndBilling s = new StockMAnagementAndBilling();
                        s.print();
                        break;

                    case "6" : System.out.println("Thank you for coming.Visit again .");
                        System.exit(0);

                    default : System.out.println("The number you entered is incorrect.Please try again.");
                        break;
                }
                //Display();
            }
            while(!(t.equals("1"))&&!(t.equals("2"))&&!(t.equals("3"))&&!(t.equals("4"))&&!(t.equals("5"))&&!(t.equals("6")));
            System.out.println();
            System.out.println("do you want to continue?");
            String z = sc.nextLine();
            if(z.equals("Y")||z.equals("y"))
            {
                Print();
            }
            else
                System.exit(0);
    }

}
      
  
    
