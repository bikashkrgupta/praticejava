package com.javabasics.question2;
import java.util.Scanner;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
class MyBook extends Book{
	void setTitle(String s) {
		title=s;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		MyBook bk=new MyBook();
		bk.setTitle(title);
		System.out.println("The title is: "+bk.getTitle());
      	sc.close();

	}

}

