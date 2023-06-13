package jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class ResultSetMetadataExample {

	public static void main(String[] args) {	
		try {
			Class.forName("com.mysql.jdbc.Driver");    
			Connection con =DriverManager.getConnection
					("jdbc:mysql://localhost:3306/database7pm",
							"root","password");					
		PreparedStatement ps=con.prepareStatement("select * from employee");
		ResultSet rs=ps.executeQuery();
		
		ResultSetMetaData rsmd=rs.getMetaData();
		
		System.out.println("Total Columns = "+rsmd.getColumnCount());
		System.out.println("1st Column name = "+rsmd.getColumnName(1));	
		System.out.println("1st cloumn type  = "+rsmd.getColumnTypeName(1));
			con.close();	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
