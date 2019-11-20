import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.jdbc.JDBCCategoryDataset;

import com.mysql.jdbc.Statement;

import javax.swing.*;


public class Graph extends Usable implements Connectivity{
	static Scanner scan = new Scanner(System.in);
    private static JDBCCategoryDataset dataset;
    static Graph gp = new Graph();
	static void ask() throws IOException {
		   String n;
			do {
				System.out.println();
				System.out.println("                                                 Select:");
				System.out.println("                                                 1. Bathing");
				System.out.println("                                                 2. Dental");
				System.out.println("                                                 3. Utilities");
				System.out.println("                                                 4. Dairy");
				System.out.println("                                                 5. Fruits");
				System.out.println("                                                 6. Vegetables");
				System.out.println("                                                 7. Kitchenware");
				System.out.println("                                                 8. Go back");
				System.out.println("                                                 9. Exit");
				System.out.println();
	            System.out.print("                                                 Choose : ");
	            
				n = scan.nextLine();
				switch(n) 
				{
				case "1" : view("  Bathing  ");
				           break;
				           
				case "2" : view("   Dental  ");
				           break;
				
				case "3" : view(" Utilities ");
		                   break;
		                   
				case "4" : view("   Dairy   ");
		                   break;
		                   
				case "5" : view("   Fruits  ");
		                   break;
		                   
				case "6" : view(" Vegetables");
		                   break;
		                   
				case "7" : view("Kitchenware");
		                   break;
		
				case "8" : ask();
					       break;
		                   
				case "9" : System.out.println("                                                 Thank you for visiting");
		                   System.exit(0);
		                   
				default  : System.out.print("                                                 Please enter valid input : ");
				           break;
				}
			}while(!(n.equals("1"))&&!(n.equals("2")) && !(n.equals("3")) && !(n.equals("4")) && !(n.equals("5")) && !(n.equals("6")) && !(n.equals("7"))&& !(n.equals("8"))&& !(n.equals("9")));
    }
	static void view(String a) throws IOException {
		analysis(a);
		System.out.println();
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

        ChartUtilities.saveChartAsPNG(new File("sales.png"), barChart, 700, 700);
        JFrame jf = new JFrame();
        ImageIcon i = new ImageIcon("C:\\Workspace\\Project\\sales.png");
        JLabel label = new JLabel(i);
        jf.add(label);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);
    }
    
	static void analysis(String a) {
		try {
			Statement s = (Statement) gp.Connect();
			ResultSet r = s.executeQuery("select Product_Name ,Total_Sales from items WHERE Category = '"+a+"'");
			System.out.println("                                                 ****Analysis Of Sales****");
			System.out.println();
			System.out.println("                                                 Product Name     :  Total Sales");
			while(r.next()) {
				System.out.println("                                                 "+r.getString("Product_Name")+ " :   "+r.getInt("Total_Sales"));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println();
		System.out.print("                                                 Please Check The Graph Plotted Below");
	}
}




