package jdbcconnection;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class DatabaseMetaDataExample {

	public static void main(String[] args) {	
		try {
			Class.forName("com.mysql.jdbc.Driver");    
			Connection con =DriverManager.getConnection
					("jdbc:mysql://localhost:3306/database7pm",
							"root","password");	
			DatabaseMetaData db =con.getMetaData();
			System.out.println("Driver Name = "+db.getDriverName());
			System.out.println("Driver Version = "+db.getDriverVersion());
			System.out.println("User Name= "+db.getUserName());
			System.out.println("Database Product Name = "+db.getDatabaseProductName());
			System.out.println("Database Product version = "+db.getDatabaseProductVersion());
			
			con.close();	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
