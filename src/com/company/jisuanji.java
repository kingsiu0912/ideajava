package com.company;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: A001
 * Date: 2017-12-27
 * Time: 22:40
 */
public class jisuanji {
    public static void main(String[] args) {
        //计算机

        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入第一个数");
            double i = scanner.nextDouble();

        System.out.println("选择运算符:");
        String s=scanner.next();
        System.out.println("输入第二个数：");
        double b = scanner.nextDouble();
        switch (s){
            case "/" :
                double chu=i/b;
                System.out.println("等于："+chu);
                break;
            case "*":
                double sheng=i*b;
                System.out.println("等于："+sheng);
                break;
            case "-":

                double jian=i-b;
                System.out.println("等于："+jian);
                break;
            case "+":
                double jia=i+b;
                System.out.println("等于："+jia);
                break;
            }

        }
}
