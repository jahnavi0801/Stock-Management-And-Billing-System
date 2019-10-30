import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public interface Connectivity {
    default Statement Connect() throws Exception{
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
    		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","Josaa_16651");
    	    Statement s = c.createStatement();
    		return s;
    	}catch(Exception e) {
    		throw e;
    	}
    }
    default PreparedStatement person() throws Exception{
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
    		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","root","Josaa_16651");
    		String sql = "insert into cus_info(sno, name, phno, items, totalcost, billno) values(?, ?, ?, ?, ?, ?)";
    		PreparedStatement ps = (PreparedStatement) c.prepareStatement(sql);
    		return ps;
    	}catch(Exception e) {
    		throw e;
    	}
    }
}
