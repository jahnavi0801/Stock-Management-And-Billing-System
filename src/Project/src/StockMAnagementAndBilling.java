import java.util.*;

class StockMAnagementAndBilling {
    
    public static void print(){
        Scanner sc = new Scanner(System.in);
        String n;
        do{
            System.out.println("Login as :");
            System.out.println("1. Customer");
            System.out.println("2. Staff");
            System.out.println("3. Exit");
            n = sc.nextLine();
            switch(n)
            {
                case "1" : Customer c = new Customer();
                		   c.Details();	
                           c.Display();  
                           break;

                case "2" : Employee e = new Employee();
                           e.Print(); 
                           break;

                case "3" : System.out.println("Thank you for coming.Visit again soon.");    
                           System.exit(0);

                default : System.out.println("The number you entered is incorrect.Please try again.");
                          break; 
            } 
        }while(n!="1" && n!="2");
        sc.close();
    }

    public static void main(String[] args) {
        System.out.println("Welcome To  ");
        print();
    }

}