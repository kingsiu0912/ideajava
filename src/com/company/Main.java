package com.company;



import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //计算圆的相关信息

        圆 yuan=new 圆();

        System.out.println("请输入圆的直径");
        yuan.setZhijing( scanner.nextDouble());
      double m_y=  yuan.mianji();
        double z_y= yuan.zhouchang();
        System.out.println("圆的面积是"+m_y+"圆的周长是"+z_y);


        //计算三角形的相关信息

        三角形 s=new 三角形();
        System.out.println("请输入第一条边长：");
        s.setA(scanner.nextDouble());
        System.out.println("请输入第二天边长");
        s.setB(scanner.nextDouble());
        System.out.println("请输入第三条边长");
        s.setC(scanner.nextDouble());
        double m_s=s.mianji();
        double z_s=s.zhouchang();
        System.out.println("三角形的面积："+m_s+"三角形的周长："+z_s);


        //计算巨型的相关的信息
        矩形 j=new 矩形();
        System.out.println("请输入长：");
        j.setChang(scanner.nextDouble());
        System.out.println("请输入宽：");
        j.setKuan(scanner.nextDouble());
        System.out.println("矩形的面积为："+j.mianji()+"矩形的周长为："+j.zhouchang());

        //计算机实现




    }
}
