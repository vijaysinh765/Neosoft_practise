package resultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSet1 {
public static void main(String[] args) {
	System.out.println("main start");
	
	try {
		Class.forName("com.mysql.jdbc.Driver"); //1
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcresultset","root","root");//2
		//--------------BasicCRUD Sql queries-------------
		//String sql= "create table employee(eid int(30),ename varchar(100)) ";//3
		//String sql="insert into employee values(33,'suraj')";
		//String sql="update employee set eid=20 where ename='ankit'";
		//String sql= "delete from employee where eid=20";
		String sql= "select * from employee";
		
		Statement smt=con.createStatement(); //4
//	    smt.execute(sql);//5
		
		//---------RESULTSET to get data from data base and print on console-use select * from tablename; query from database
		ResultSet rs=smt.executeQuery(sql);  //
		while(rs.next()){
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
		}
		
		smt.close(); //6
		con.close();//7
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
