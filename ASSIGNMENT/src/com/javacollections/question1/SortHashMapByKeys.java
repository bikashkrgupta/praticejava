package com.javacollections.question1;  
import java.util.HashMap;  
import java.util.TreeMap;  
import java.util.Iterator;  

public class SortHashMapByKeys {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();   
		hm.put(123, "Alvaro");  
		hm.put(125, "Ursula");  
		hm.put(111, "Alba");   
		Iterator <Integer> it = hm.keySet().iterator();         
		System.out.println("Before Sorting");  
		while(it.hasNext())  
		{  
		int key=(int)it.next();  
		System.out.println("Roll no:  "+key+"     name:   "+hm.get(key));  
		}  
		System.out.println("\n");   
		System.out.println("After Sorting");   
		TreeMap<Integer,String> tm=new  TreeMap<Integer,String> (hm);  
		Iterator <Integer> itr=tm.keySet().iterator();               
		while(itr.hasNext())    
		{    
		int key=(int)itr.next();  
		System.out.println("Roll no:  "+key+"     name:   "+hm.get(key));  
		}    
		

	}

}
