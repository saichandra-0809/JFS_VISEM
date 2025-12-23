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
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                count++;
        }
        if(count<=2)
        {
            System.out.print("PrimeNumber");
        }
        else{
            System.out.print("Not PrimeNumber");
        }
    }
}
