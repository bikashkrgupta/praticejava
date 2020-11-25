package com.javabasics.question1;
import java.util.Scanner;
class Arithmetic{
	 public int add(int a, int b){
	        return a+b;
	    }
}
class Adder extends Arithmetic{
	public static void main(String[] args) {
		Adder a = new Adder();
		Scanner sc= new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		System.out.print(a.add(number1,number2));
		sc.close();

	}

}


