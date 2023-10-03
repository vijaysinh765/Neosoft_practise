package storedprocedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StoredProcedure1 {
public static void main(String[] args) {
	System.out.println("main start");
	try {
		Class.forName("com.mysql.jdbc.Driver");//1
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcresultset","root","root");//2
		CallableStatement cs=con.prepareCall("{call ss(?,?)}");//3
		cs.setInt(1, 18);
		cs.setString(2, "shivaji");
		
//		ResultSet rs=cs.executeQuery();
//		while(rs.next()) {
//			System.out.println(rs.getInt(1));
//			System.out.println(rs.getString(2));
//		}
		
//		cs.setInt(1, 77);
//		cs.setString(2, "gayle");
		
		cs.execute();//4
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
