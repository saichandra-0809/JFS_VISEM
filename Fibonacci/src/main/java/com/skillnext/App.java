package com.skillnext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int fib1=0;
        int fib2=1;
        System.out.print(fib1);
        System.out.print(fib2);
        int i=0;
        int n=5;
        while(i<n)
        {
            int fib3=fib1+fib2;
            fib1=fib2;
            fib2=fib3;
            i++;
            System.out.print(fib3);
        }
    }
}
