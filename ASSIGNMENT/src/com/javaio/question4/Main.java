package com.javaio.question4;

import java.io.*;
public class Main
{
	/*public static int no_columns_fun(String str)
	{
		String rows[]=str.split(",");
		int n=rows.length;
		return n;
	}
	public static String[] Csv_row(String str)
	{
		String rows[]=str.split(",");  
		return rows;  
	}  */
	public static void main(String[] args) throws IOException,FileNotFoundException
	{
		//Reader rdr1 = null,rdr2=null;
		//BufferedReader bfrdr1 = null, bfrdr2=null;
		//Writer wtr = null;
		//BufferedWriter bfwtr = null;
		//int no_rows=0,no_columns=0;
		//String[][] csv= null;
		String splitBy=",";
		String line;
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\KIIT\\Downloads\\DataUploading1 .csv"));
		FileWriter fw=new FileWriter("C:\\Users\\KIIT\\Downloads\\DataUploading1 .txt");
		
		while((line=br.readLine())!=null) {
			String [] arr=line.split(splitBy);
			for (int i = 0; i < arr.length; i++) {
				fw.write(arr[i]+ " ");
				fw.flush();
			}
			fw.write("\n");
			fw.flush();
			System.out.println();
		}
	}
}
			
			
		
