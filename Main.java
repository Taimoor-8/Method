package com.company;

import java.util.Scanner;

public class Main {

    static int table(int n){
        for(int i=1; i<=10; i++){
            System.out.format("%d X %d = %d\n",n, i , i*n);
        }
        return n;
    }
    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your value");
        int a= sc.nextInt();
        table(a);
    }
}
