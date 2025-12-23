package com.skillnext;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a three digit or more number");
        int n=sc.nextInt();
        int sum=0;
        while(n>0)
        {
            int k=n%10;
            sum=sum*10+k;
            n/=10;
        }
        System.out.println(sum);

    }
}
