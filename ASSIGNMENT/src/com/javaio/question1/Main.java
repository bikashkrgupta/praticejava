package com.javaio.question1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
//import java.util.LinkedList;


public class Main {
	public static void main(String[] args)
	{
		BufferedReader br = null;
		PrintWriter pw = null;
	try {
		br = new BufferedReader(new FileReader(new File("E:\\praticejava\\ASSIGNMENT\\src\\com\\javaio\\question1\\Test_In.txt")));
	    pw = new PrintWriter(new FileWriter(new File("E:\\praticejava\\ASSIGNMENT\\src\\com\\javaio\\question1\\Test_Out.txt")));
	    
	    ArrayList<String> lines = new ArrayList<String>();

        String tmp="";
        while ((tmp = br.readLine()) != null) {
            lines.add(tmp);
        }
        for (int i = lines.size()-5; i < lines.size(); i++) {
            //System.out.println(lines.get(i));
        	 pw.write(lines.get(i)+"\n");
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

