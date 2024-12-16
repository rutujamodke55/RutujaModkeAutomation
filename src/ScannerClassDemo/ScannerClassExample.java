package ScannerClassDemo;

import java.io.InputStream;
import java.util.Scanner;

public class ScannerClassExample {

    public static void addition(int a, int b){
        System.out.println("sum of the total number" +(a+b));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       // addition(25,35);
        System.out.println("Enter the first number");
        int no1 = sc.nextInt();
        System.out.println("Enter the second number");
        int no2 = sc.nextInt();
        addition(no1,no2);
    }

    }

