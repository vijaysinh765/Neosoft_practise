package preparestatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatement1 {
public static void main(String[] args) {
	
	//prepared statement CMS compilation-only one time,we can submit through ps object only one sql query, string concatenation not required
	System.out.println("main success");
	try {
		Class.forName("com.mysql.jdbc.Driver");//1
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcresultset","root","root");//2
		String sql="insert into employee values(?,?)";//3
		PreparedStatement ps=con.prepareStatement(sql);//4
		ps.setInt(1, 40);
		ps.setString(2, "vinod");
		ps.execute();//5
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
