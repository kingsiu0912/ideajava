package com.company;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: A001
 * Date: 2017-12-27
 * Time: 22:14
 */
public class 圆 extends Shape {
    private double zhijing;

    public double getZhijing() {
        return zhijing;
    }

    public void setZhijing(double zhijing) {
        this.zhijing = zhijing;
    }

    @Override
    public double mianji() {
        return Math.PI*Math.pow(getZhijing()/2,2);
    }

    @Override
    public double zhouchang() {
        return Math.PI*getZhijing() ;
    }
}
