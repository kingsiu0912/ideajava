package com.company;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: A001
 * Date: 2017-12-27
 * Time: 22:07
 */
public class 三角形 extends Shape {

    private double a,b,c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double mianji() {
        double p=(getA()+getB()+getC())/2;
        return Math.sqrt(p * (p - getA()) * (p - getB()) * (p - getC()));
    }

    @Override
    public double zhouchang() {
        return getC()+getB()+getA();
    }
}
