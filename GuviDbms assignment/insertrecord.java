package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class insertrecord {
	
	public static void main(String args[]) throws SQLException {
		
		Connection con = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "Prakash6@");
			
			PreparedStatement stmt = con.prepareStatement("Insert into emp1 (empcode,empname,empage,esalary)values (?, ?, ?, ?)");
			stmt.setInt(1, 101);
			stmt.setString(2, "jenny");
			stmt.setInt(3, 25);
			stmt.setInt(4, 10000);
			
			stmt.setInt(1, 102);
			stmt.setString(2, "jacky");
			stmt.setInt(3, 30);
			stmt.setInt(4, 20000);
			
			stmt.setInt(1, 103);
			stmt.setString(2, "joe");
			stmt.setInt(3, 20);
			stmt.setInt(4, 40000);
			
			stmt.setInt(1, 104);
			stmt.setString(2, "john");
			stmt.setInt(3, 40);
			stmt.setInt(4, 80000);
			
			stmt.setInt(1, 105);
			stmt.setString(2, "Shameer");
			stmt.setInt(3, 25);
			stmt.setInt(4, 90000);
			
			
			int status = stmt.executeUpdate();
			
			if(status == 1) {
				System.out.println("Record success fully inserted");
			} else {
				System.out.println("Record not inserted");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		
	}

}