package com.jdbc.question1;


import java.sql.*;
//import com.mysql.jdbc.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;

public class Main{

    public static void main(String [] args) throws Exception {
    	Connection conn=null;
    	Statement st=null;
    	ResultSet rs=null;
    	
    	//String url="jdbc:mysql://127.0.0.0:3306/example_schema";
    //	String user="root";
    	//String password="root";
    	try {
        Class.forName( "com.mysql.cj.jdbc.Driver" ); // do this in init
    	
         conn = DriverManager.getConnection( 
            "jdbc:mysql://localhost:3306/example_schema?user=root&password=root");
         //conn = DriverManager.getConnection(url,user,password);
         
         st = conn.createStatement();
         
         rs = st.executeQuery( "select * from test_table where Serial_No=111" );
         while(rs.next())
     	{
     		String firstName = rs.getString(1);
    		String lastName = rs.getString(2);
    		int Serial = rs.getInt(3);
    		String Alias = rs.getString(4);
    		String Quotes = rs.getString(5);
    		System.out.println("First Name:"+firstName+",Last Name:"+lastName+",Serial:"+Serial +",Alias:"+Alias+",Quote:"+Quotes);
     	}
        
    	}

        
        catch(Exception e){ System.out.println(e);}  
    	finally {
    		rs.close();
    		st.close();
    		try{
    	           if(conn!= null)
    	             conn.close();
    		}
    		catch(SQLException ex){
    	           System.out.println(ex.getMessage());}
       }
    	}
}
