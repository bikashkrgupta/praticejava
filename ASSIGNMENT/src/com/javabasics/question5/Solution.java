package com.javabasics.question5;

import java.util.*;

class Solution{
    public static void main(String []argh){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
        
            int count = 0;
            int constant = 0;
            int sum = 0;
            
            while(count < n){
                if(count == 0){
                    constant = 1;
                    sum = a + (constant*b) + sum;
                    }else{
                    constant = constant * 2;
                    sum = (constant * b) + sum;
                }
                System.out.print (sum + " ");
                count += 1;
            }
        System.out.println();
        }
        sc.close();
    }
}
