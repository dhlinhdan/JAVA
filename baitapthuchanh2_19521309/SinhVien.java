/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh2_19521309;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class SinhVien {
    private int mssv;
    private String hoTen;
    private float diemLT;
    private float diemTH;
    
    public SinhVien(){}

    public SinhVien(int mssv, String hoTen, float diemLT, float diemTH) {
        this.mssv = mssv;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public int getMssv() {
        return mssv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setMssv(int mssv) {
        this.mssv = mssv;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }
    
    public double TrungBinh()
    {
        return (diemLT + diemTH)/2;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "mssv=" + mssv + ", hoTen=" + hoTen + ", diemLT=" + diemLT + ", diemTH=" + diemTH + ", diem trung binh= " + TrungBinh() + '}';
    }
    
    public void NhapTT() 
    {
	Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("----------------");
	System.out.print("Nhap Ma so sinh vien: ");
	this.mssv = sc.nextInt();
        sc.nextLine();
	System.out.print("Nhap Ho ten sinh vien: ");
	this.hoTen = sc.nextLine();
        System.out.print("Nhap diem ly thuyet: ");
	this.diemLT = sc.nextFloat();
        System.out.print("Nhap diem thuc hanh: ");
	this.diemTH = sc.nextFloat();        
    }
    
    
    
}
