/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh2_19521309;

/**
 *
 * @author ASUS
 */

import java.util.Scanner;

public class HinhChuNhat {
    private double dai;
    private double rong;

    public HinhChuNhat()
    {
        super();
    }
    public HinhChuNhat(double dai, double rong) {
        super();
        this.dai = dai;
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public double getRong() {
        return rong;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }
    
    public double dai()
    {
        return dai;
    }
    
    public double rong()
    {
        return rong;
    }
    
    public double dienTich()
    {
        return (dai*rong);
    }
    
    public double chuVi()
    {
        return (dai+rong)*2;
    }
    
    public void NhapTT() 
    {
	Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("----------------");
	System.out.print("Nhap chieu dai hinh chu nhat: ");
	this.dai = sc.nextDouble();
	System.out.print("Nhap chieu rong hinh chu nhat: ");
	this.rong = sc.nextDouble();
    }

    @Override
    public String toString() 
    {
	return String.format("%5.2f %5.2f %5.2f %5.2f", dai,rong,chuVi(),dienTich());
    }
    
    public static String TieuDe() 
    {
	return String.format("%5s %5s %5s %5s", "Dai","Rong","Chu Vi","Dien Tich");
    }
}
