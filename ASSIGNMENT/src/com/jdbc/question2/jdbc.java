package com.jdbc.question2;

import java.util.*;
import java.sql.*;

class pojo{
	private String firstName;
	private String lastName;
	private int Serial;
	private String Alias;
	private String Quotes; 
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSerial() {
		return Serial;
	}
	public void setSerial(int serial) {
		Serial = serial;
	}
	public String getAlias() {
		return Alias;
	}
	public void setAlias(String alias) {
		Alias = alias;
	}
	public String getQuotes() {
		return Quotes;
	}
	public void setQuotes(String quotes) {
		Quotes = quotes;
	}

	
		
}
class jdbc{
		public static void main(String args[]) throws Exception {
			//Registering the Driver
			 Class.forName( "com.mysql.cj.jdbc.Driver" );
			// conn = DriverManager.getConnection( 
			    //        "jdbc:mysql://localhost:3306/example_schema?user=root&password=root");
		      //DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		      //Getting the connection
		      String mysqlUrl = "jdbc:mysql://localhost/example_schema";
		      Connection con = DriverManager.getConnection(mysqlUrl, "root", "root");
		      System.out.println("Connection established......");
		      //Creating a Statement object
		      Statement stmt = con.createStatement();
		      //Retrieving the data
		      ResultSet rs = stmt.executeQuery("SELECT * FROM test_table");
		      //Creating an ArrayList object
		    ArrayList<pojo> jd = new ArrayList<>();
		    
	
		    	//
		       // Statement statement = c.createStatement();
		        //String s = "SELECT * FROM customer";

		        //ResultSet rs = stm.executeQuery(s);
		       // int g =0;

		        while (rs.next()) {
		        	pojo jd1 = new pojo();
		            jd1.setFirstName(rs.getString("First_Name"));
		            jd1.setLastName(rs.getString("Last_Name"));
		            jd1.setSerial(rs.getInt("Serial_No"));
		            jd1.setAlias(rs.getString("Alias"));
		            jd1.setQuotes(rs.getString("Quote_stat"));
		           
		            jd.add(jd1);
		        }

		       rs.close();
		
	
		for(pojo jd2 :jd)
		{
			System.out.println(jd2.getFirstName());
			System.out.println(jd2.getLastName());
			System.out.println(jd2.getSerial());
			System.out.println(jd2.getAlias());
			System.out.println(jd2.getQuotes());
			System.out.println("\n");
		}
	}
}
