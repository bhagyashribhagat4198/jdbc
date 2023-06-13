package jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementExample {

	public static void main(String[] args) {	
		try {
			Class.forName("com.mysql.jdbc.Driver");    

			Connection con =DriverManager.getConnection
					("jdbc:mysql://localhost:3306/database7pm",
							"root","password");			
	PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?)");		
	ps.setInt(1, 105);	
	ps.setString(2, "nayan");
	ps.setInt(3, 32);
	int i =ps.executeUpdate();
		System.out.println(i+ "  record inserted into table successfully");	
			
			con.close();	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}