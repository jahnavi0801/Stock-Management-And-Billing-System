import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;

import com.mysql.jdbc.Statement;

public class Graph {
	static Scanner scan = new Scanner(System.in);
    private static JDBCCategoryDataset dataset;
	static void ask() throws IOException {
		   String n;
			do {
				System.out.println("Select:");
				System.out.println("1. Bathing");
				System.out.println("2. Dental");
				System.out.println("3. Utilities");
				System.out.println("4. Dairy");
				System.out.println("5. Fruits");
				System.out.println("6. Vegetables");
				System.out.println("7. Kitchenware");
				System.out.println("8. Go back");
				System.out.println("9. Exit");
				n = scan.nextLine();
				switch(n) 
				{
				case "1" : view("dental");
				           break;
				           
				case "2" : view("dental");
				           break;
				
				case "3" : view("utilities");
		                   break;
		                   
				case "4" : view("dairy");
		                   break;
		                   
				case "5" : view("fruits");
		                   break;
		                   
				case "6" : view("vegetables");
		                   break;
		                   
				case "7" : view("kitchenware");
		                   break;
		
				case "8" : ask();
					       break;
		                   
				case "9" : System.out.println("Thank u fr visiting");
		                   System.exit(0);
		                   
				default  : System.out.println("Please enter valid input : ");
				           break;
				}
			}while(!(n.equals("1"))&&!(n.equals("2")) && !(n.equals("3")));	
	   }
	static void view(String a) throws IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
    		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/product?useSSL=false","root","Josaa_16651");
    		dataset = new JDBCCategoryDataset(c);
            dataset.executeQuery("SELECT Product_name,Total_Sales from items WHERE category = '"+a+"'");   
    	}catch(Exception e) {
    		System.out.println(e);
    	}
		JFreeChart barChart = ChartFactory.createBarChart(
                a,
                "product",
                "sales",
                dataset,
                PlotOrientation.VERTICAL,
                false, true, false);

        ChartUtilities.saveChartAsPNG(new File("sales.png"), barChart, 450, 400);
    }
} 



