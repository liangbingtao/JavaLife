package com.neo.study;


import java.util.Scanner;
import java.util.Stack;

/**
 * @Author : neo
 * @Date 2021/5/6 16:38
 * @Description : TODO
 */
public class meituan {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // int i = scanner.nextInt();
  /*      Solution solution = new Solution();
        solution.push(1);
        solution.push(2);
        solution.push(3);
        solution.push(4);

        System.out.println(solution.pop());
        System.out.println(solution.pop());
        System.out.println(solution.pop());
        System.out.println(solution.pop());*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入字符串：");
        String str = scanner.nextLine();
        int r = Palindrome(str);
        if (r == str.length() / 2) {
            System.out.println('"' + str + '"' + "是回文");
        } else {
            System.out.println('"' + str + '"' + "不是回文");
        }

    }


    public static int Palindrome(String str) {
        int k = 0; //标记对称轴下标
        int n = str.length() - 1;
        for (int i = 0; i <= n / 2; i++) {
            if (str.charAt(i) == str.charAt(n - i)) {
                k++;
            } else {
                break;
            }
        }
        return k;
    }
}

class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (!stack1.isEmpty() && stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}


//7 -5 4 6 2 5 8 -4 -8 4 10 -1 3 3 -5 10 7 0 -5 -4 -9 3 8 0 8 -3
//nygfh
//lixawy