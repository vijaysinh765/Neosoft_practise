package exceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class CheckedException {
	public static void main(String[] args) {
		SQLExceptionExample();
		IOExceptionExample();
	}
	
	public static void SQLExceptionExample() {
		 String jdbcUrl = "jdbc:mysql://localhost:3306/mydatabase";
	        String username = "username";
	        String password = "password";

	        try {
	            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
	            Statement statement = connection.createStatement();
	            // Attempt to execute a SQL query
	            statement.executeUpdate("INSERT INTO mytable (column1, column2) VALUES ('value1', 'value2')");

	            statement.close();
	            connection.close();
	        } catch (SQLException e) {
	            System.out.println("An SQL Exception occurred:");
	            System.out.println("SQL State: " + e.getSQLState());
	            System.out.println("Error Code: " + e.getErrorCode());
	            System.out.println("Message: " + e.getMessage());
	        }
	}
	
	public static void IOExceptionExample () {
		String fileName = "example.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
