package JDBCApplication;

import java.util.*;
import java.sql.*;
import java.util.Scanner;

public class lab2 {
	public static void main(String[] args) throws SQLException {
Scanner sc=new Scanner(System.in);
try {
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "1234");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "1234");
		if (connection != null)
			System.out.println("Connection established");
		else
			System.out.println("Something went wrong");
		
		Statement statement = connection.createStatement();

		System.out.println("Choose Operation to perform"+'\n');
		System.out.println("1.Insert"+'\n'+"2.Update"+'\n'+"3.Delete"+'\n'+"5.Display all Record"+'\n'+"5.Exit"+'\n');
		int n=sc.nextInt();
		switch(n)
		{
		//*******PERFORMING INSERT QUERY**************************
		case 1:
		{
			String sql = "INSERT INTO Author(authorId,firstName,middleName,lastName,phoneNo) VALUES (?, ?, ?, ?,?)";
			 
			PreparedStatement statement1 = connection.prepareStatement(sql);
			System.out.println("enter author id  =");
			statement1.setInt(1,sc.nextInt());
			System.out.println("enter firstname");
			statement1.setString(2,sc.next());
			System.out.println("enter middlename");
			statement1.setString(3,sc.next());
			System.out.println("enter middlename");
			statement1.setString(4,sc.next());
			System.out.println("enter phone no");
			statement1.setInt(5,sc.nextInt());
			 
			int rowsInserted= statement1.executeUpdate();
			if (rowsInserted > 0) {
			    System.out.println("A new user was inserted successfully!"+'\n');
			    }
		}
		//********************************************UPDATE OPERATION*********************************************************
		case 2:
		{
			String s = "UPDATE Author SET firstName=?, middleName=? ,lastName=? ,phoneNo=? WHERE authorID=?";
			 
			PreparedStatement statement2 = connection.prepareStatement(s);
			System.out.println("enter firstname");
			statement2.setString(1,sc.next());
			System.out.println("enter middlename");
			statement2.setString(2,sc.next());
			System.out.println("enter middlename");
			statement2.setString(3,sc.next());
			System.out.println("enter phone no");
			statement2.setInt(4,sc.nextInt());
			System.out.println("enter author id  =");
			statement2.setInt(5,sc.nextInt());
			 
			int rowsUpdated = statement2.executeUpdate();
			if (rowsUpdated > 0) {
			    System.out.println("An existing user was updated successfully!");
			}
			else
				System.out.println("failed to update");

break;

		}
		case 3:
		{//**************************************DELETE OPERATION-***********************************
			String s2 = "DELETE FROM Author WHERE authorId=?";
			 
			PreparedStatement statement3 = connection.prepareStatement(s2);
			System.out.println("enter the authorId to delete the record");
			statement3.setInt(1,sc.nextInt());
			 
			int rowsDeleted = statement3.executeUpdate();
			if (rowsDeleted > 0) {
			    System.out.println("A record is deleted successfully!");
			}
			else
				System.out.println("not deleted");
			
	
		}
		
			
		case 4:
		{
			String q="Select * from Author";
        ResultSet rs=statement.executeQuery(q);

			if(rs.next()){ 
				do{
				System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4)+","+rs.getInt(5));
				}while(rs.next());
			}


			connection.close();
			break;
		}
		case 5:
		{
			System.out.println("you are exit");
			System.exit(0);break;
		}
		
		default :
			System.out.println("chosen option is invalid");
			
		}
}
	
catch(Exception e) {

e.printStackTrace();
System.out.println("something error"+e);
}

		}
	}




