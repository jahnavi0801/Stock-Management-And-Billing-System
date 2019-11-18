import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Stock {
	static Scanner scan = new Scanner(System.in);
	static Product p = new Product();
	static String s;
	
static void view() throws Exception{
	p.Table();
	search();
}

static void search() throws Exception{
	System.out.println("Would you like to search(Y/N)");
	s = scan.nextLine();
	if(s.equals("Y") || s.equals("y")) {
		System.out.println("Enter category : ");
		String a = scan.nextLine();
		p.validate_id(a);
		ask();
	}
	else if (s.equals("N") || s.equals("n")) {
		ask();
	}	
}
static void ask() throws Exception{
	String n;
	do {
		System.out.println("Select:");
		System.out.println("1. Menu");
		System.out.println("2. Exit");
		n = scan.nextLine();
		switch(n) 
		{
		case "1" : Employee e = new Employee();
		           e.options();
		           break;
		case "2" : System.out.println("Thank u fr visiting");
		           System.exit(0);
		default  : System.out.println("Please enter valid input : ");
		           break;
		}
	}while(!(n.equals("1"))&&!(n.equals("2")));	
}
}

