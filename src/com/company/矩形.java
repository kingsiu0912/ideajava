package com.company;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: A001
 * Date: 2017-12-27
 * Time: 22:04
 */
public class 矩形 extends Shape {
    //定义长宽
    private double chang;
    private double kuan;

    public double getChang() {
        return chang;
    }

    public void setChang(double chang) {
        this.chang = chang;
    }

    public double getKuan() {
        return kuan;
    }

    public void setKuan(double kuan) {
        this.kuan = kuan;
    }

    @Override
    public double mianji() {

        return getChang()*getKuan();
    }

    @Override
    public double zhouchang() {
        return 2*getChang()+getKuan();
    }
}
