/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh2_19521309;

/**
 *
 * @author ASUS
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.Scanner;

public class KhachHang {
    private String maKH;
    private String tenKH;
    private String ngayHD;
    private int soLuongDien;
    private double donGia;
    private double thanhTien;
    
    public KhachHang(){}

    public KhachHang(String maKH, String tenKH, String ngayHD, int soLuongDien, double donGia,  double thanhTien) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.ngayHD = ngayHD;
        this.soLuongDien = soLuongDien;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
    }

    public String getMaKH() {
        return maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public String getNgayHD() {
        return ngayHD;
    }

    public int getSoLuongDien() {
        return soLuongDien;
    }

    public double getDonGia() {
        return donGia;
    }


    public double getThanhTien() {
        return thanhTien;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public void setNgayHD(String ngayHD) {
        this.ngayHD = ngayHD;
    }

    public void setSoLuongDien(int soLuongDien) {
        this.soLuongDien = soLuongDien;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }


    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }
    
    public void nhapThongTin()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap ma khach hang: ");
        this.maKH = sc.nextLine();
        sc.nextLine();
        System.out.print("Nhap ten khach hang: ");
        this.tenKH = sc.nextLine();
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Nhap ngay hoa don: ");
        this.ngayHD = sc.nextLine();
        
        System.out.print("Nhap so luong dien: ");
        this.soLuongDien = sc.nextInt();
        while (this.donGia <= 0)
        
        System.out.print("Nhap don gia: ");
        this.donGia = sc.nextInt();     
    }
    
    public void inThongTin()
    {
        System.out.println("Ma Khach hang: " + this.maKH);
	System.out.println("Ten Khach hang: " + this.tenKH);
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
	System.out.println("Ngay hoa don: " + simpleDateFormat.format(this.ngayHD));
	System.out.println("So luong dien: " + this.soLuongDien);
	System.out.println("Don gia: " + this.donGia);
        System.out.println("Thanh tien: " + this.thanhTien);
    }
    
    public double ThanhTien()
    {
        return this.soLuongDien* this.donGia;
    }
   
}
