package com.neo.dataStructure;

/**
 * @Description Author neo
 * Date 2021/3/14 15:46
 */
public class Fibonacci {
    public static int fib(int n){
        if (n==0){
            return 0;
        }else if (n==1||n==2){
            return 1;
        }else{
            return ((fib(n-1)+fib(n-2))%(1000000007));
        }
    }

    public static void main(String[] args) {
        System.out.println(fib(10));
    }
}
