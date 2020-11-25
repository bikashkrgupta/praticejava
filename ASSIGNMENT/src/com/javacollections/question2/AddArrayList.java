package com.javacollections.question2;
import java.util.*; 
public class AddArrayList {
	 public static void main(String[] args) 
	    { 
	        List<String> list = new ArrayList<String>(5); 
	        list.add("welcome"); 
	        list.add(""); 
	        list.add("highradius");
	        list.add("phase2"); 
	  
	    
	        list.add(1, "to"); 
	  
	
	        for (String str : list) { 
	            System.out.print(str + " "); 
	        } 
	    } 
}
