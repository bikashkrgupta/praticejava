package com.javaio.question3;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;



public class Main {
	public static void main(String[] args){	 
		FileReader fr=null;
		BufferedReader br=null;
		 FileWriter fw=null;
		try {
	fr = new FileReader("E:\\praticejava\\ASSIGNMENT\\src\\com\\javaio\\question3\\Test_In.txt"); 
    br = new BufferedReader(fr); 
    fw = new FileWriter("E:\\praticejava\\ASSIGNMENT\\src\\com\\javaio\\question3\\Test_Out.txt"); 
    String line;
    String upper_case_line = "";
    while((line = br.readLine()) != null)
    { 
    	Scanner lineScan = new Scanner(line);
    	while(lineScan.hasNext())
    	{
            String word = lineScan.next(); 
            upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
    	}
    	fw.write(upper_case_line);
    	lineScan.close();
    } 
    
  
		}
		catch (Exception e) {
			
			System.out.println("Exception occured while Reading file:"+e);
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
				if(fw!=null)
					fw.close();
			}
			catch(Exception e)
			{
				System.out.println("could not close buffered reader: "+e);
			}
			try
			{
				if(fr!=null)
					fr.close();
			}
			catch(Exception e)
			{
				System.out.println("Could not close reader: "+e);
			}
		}
}
}

	
			


