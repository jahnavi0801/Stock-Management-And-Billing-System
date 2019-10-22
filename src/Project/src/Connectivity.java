import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

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
}
