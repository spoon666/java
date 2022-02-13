package com.company;


import my.demo.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main extends fu{

    public static void main(String[] args) {
	// write your code here
        String str = "aaaa";
        int num = 100;
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
        System.out.println(num);
        System.out.println(str);
        System.out.println("hello world");
        test();
        hello ss = new hello();
        ss.test1();

//        Scanner cin = new Scanner(System.in);
//        System.out.println("请输入一个字符串");
//
//        String str1 = cin.nextLine();
//
//        System.out.println("输出一个字符串");
//        System.out.println(str1);

        System.out.println(lengthOfLastWord("ab "));

        StringBuilder strb = new StringBuilder();


        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        System.out.println(arr);
        System.out.println(arr.get(2));

        interface1 inter = new interimp();
        inter.show();
        interface2 inter2 = new interimp();
        inter2.print();

        interimp.inner test = new interimp().new inner();
        System.out.println(test.num3);

        exception1 exp = new exception1();
        exp.print();


//        Main th = new Main();
//        th.show();



    }

    public static void test() {
        System.out.println("asdjfasdfjdsajf");
    }

    public static int lengthOfLastWord(String s) {
        String str = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                str = s.substring(0, i + 1);
                break;
            }
        }
        if (str.lastIndexOf(" ") != -1) {
            String str2 = str.substring(str.lastIndexOf(" ") + 1);
            return str2.length();
        }

        return str.length();

    }

    public static int searchInsert(int[] nums, int target) {
        int begin = 0;
        int end = nums.length;
        int pos = begin + (end - begin)/2;
        while (begin >= end) {
            if (nums[pos] < target) {
                begin = pos;
                pos = begin + (end - begin)/2;
            } else if (nums[pos] > target) {
                end = pos;
                pos = begin + (end - begin)/2;
            } else {
                return pos;
            }
        }
        if (nums[pos] > target) {
            return pos;
        }
        return pos + 1;
    }

    public void show() {
        System.out.println("main");
    }
}
