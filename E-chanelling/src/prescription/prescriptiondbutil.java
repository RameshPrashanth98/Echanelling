package prescription;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class prescriptiondbutil {
	
	private static String url = "jdbc:mysql://localhost:3306/neworder";
	private static String user = "root";
	private static String pass = "Ramesh98";



public static boolean addmedicine(String Uname,String ID,String Address,String Mobile, String Medicine) {
	boolean result = false;
	//Create database connection

		System.out.println(ID);
	

	try {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection connect = DriverManager.getConnection(url,user,pass); 
		Statement stm = connect.createStatement();
		
		
		System.out.println(Uname);
		//add Patients' details to the database
		String sql = "insert into neworder.order values(0,'"+Uname+"', '"+ID+"' , '"+Address+"', '"+Mobile+"' + '"+Medicine+"')";
		int Result = stm.executeUpdate(sql);
		
		if(Result>0){
			System.out.println(result);	
			result = true;
		}else {
			System.out.println("try");
			result = false;
		}
		
	}catch(Exception e) {
		e.getMessage();
	}

	//Return add or not statement
	return result;
}
}
