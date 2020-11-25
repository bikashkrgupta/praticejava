package com.javaio.question2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args)
	{
		BufferedReader br=null;
		 PrintWriter pw=null;
		
	try {
		 br = new BufferedReader(new FileReader(new File("E:\\praticejava\\ASSIGNMENT\\src\\com\\javaio\\question2\\Test_In.txt")));
	     pw = new PrintWriter(new FileWriter(new File("E:\\praticejava\\ASSIGNMENT\\src\\com\\javaio\\question2\\Test_Out.txt")));
	    String line = null;
	    while((line = br.readLine()) != null){
	    	pw.write(line.replaceAll("\\s", ""));
	    }
	}
	catch (Exception e) {
		
		System.out.println("Exception occured while Reading a file:"+e);
	}
	finally
	{
		try
		{
			
			if(br!=null)
				br.close();
		}
		catch(Exception e)
		{
			System.out.println("could not close buffered reader: "+e);
		}
		try
		{
			if(pw!=null)
				pw.close();
		}
		catch(Exception e)
		{
			System.out.println("could not close writer: "+e);
		}
		
	}
		 
	}
	}
