package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
	public static boolean insertStudentToDB(Student st) {
		boolean f=false;
		// TODO Auto-generated method stub
		try {
			//jdbc code
		 Connection con=CP.createC();
		 String q="insert into students(sname,sphone,scity) values(?,?,?)";
		 
		 //PreparedStatement
		 PreparedStatement pstmt=con.prepareStatement(q);
		 // set the value of parameter
		 pstmt.setString(1,st.getStudentName());
		 pstmt.setString(2,st.getStudentPhone());
		 pstmt.setString(3,st.getStudentCity());
		 
		 //execute
		 pstmt.executeUpdate();
		 f=true;
		 
	}catch(Exception e) {
		
		e.printStackTrace();
	}
		return f;

}

	public static boolean deleteStudent(int userId) {
		// TODO Auto-generated method stub
		boolean f=false;
		// TODO Auto-generated method stub
		try {
			//jdbc code
		 Connection con=CP.createC();
		 String q="delete from students where sid=?";
		 
		 //PreparedStatement
		 PreparedStatement pstmt=con.prepareStatement(q);
		 // set the value of parameter
		pstmt.setInt(1,userId);
		
		 //execute
		 pstmt.executeUpdate();
		 f=true;
		 // delete student
		
		 
	}catch(Exception e) {
		
		e.printStackTrace();
	}
		return f;
		
	}

	public static void showAllStudents() {
		// TODO Auto-generated method stub
		boolean f=false;
		// TODO Auto-generated method stub
		try {
			//jdbc code
		 Connection con=CP.createC();
		 String q="select * from students";
		 Statement stmt=con.createStatement();
		 ResultSet set=stmt.executeQuery(q);
		 
		 while(set.next()) {
			int id=set.getInt(1); 
		String name	=set.getString(2);
		String	phone=set.getString(3);
		String	city=set.getString("scity");
		
		System.out.println("ID:"+id);
		System.out.println("name:"+name);
		System.out.println("phone:"+phone);
		System.out.println("city:"+city);
		System.out.println("*********************");
		 }}
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		
		
	}}
