package jdbcconnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcconnection {
	public static void main(String[] args) {	
		try {
			Class.forName("com.mysql.jdbc.Driver");    // register driver class
	// create connection	
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/database7pm",
		"root","password");		
	//create statement
			Statement st =con.createStatement();	
	//execute query		
	ResultSet  rs=st.executeQuery("select * from employee");	
		while(rs.next()){
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}	
	//close connection	
		con.close();	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
