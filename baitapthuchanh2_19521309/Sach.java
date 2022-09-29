/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh2_19521309;

/**
 * lop sach
 * @author ASUS
 */

import java.util.Scanner;
public class Sach {
    //Ma sach
    private long maSach;
    //gia Sach
    private double donGia;
    //ten Sach
    private String tenSach;
    //so luong Sach
    private int soLuong;
    //nha xuat ban sac
    private String nxb;
    
    
    public Sach() {}
    
    public Sach(long maSach, double donGia, String tenSach, int soLuong, String nxb)
    {
        this.maSach = maSach;
        this.donGia = donGia;
        this.tenSach = tenSach;
        this.soLuong = soLuong;
        this.nxb = nxb;
    }
    
    public long getMaSach() {
        return maSach;
    }

    public double getDonGia() {
        return donGia;
    }

    public String getTenSach() {
        return tenSach;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public String getNxb() {
        return nxb;
    }

    public void setMaSach(long maSach) {
        this.maSach = maSach;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }
    
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap ma sach: ");
        this.maSach = sc.nextLong();
        sc.nextLine();
        System.out.print("Nhap ten sach: ");
        this.tenSach = sc.nextLine();
        System.out.print("Nhap don gia: ");
        this.donGia = sc.nextDouble();
        while (this.donGia <= 0)
        {
            System.out.print("Nhap lai don gia: ");
            this.donGia = sc.nextDouble();
        }
        System.out.print("Nhap so luong: ");
        this.soLuong = sc.nextInt();
        while (this.soLuong <= 0)
        {
            System.out.print("Nhap lai so luong: ");
            this.soLuong = sc.nextInt();
        }
        System.out.print("Nhap nha xuat ban: ");
        this.nxb = sc.nextLine();
        sc.nextLine();
    }
        
        /**
         * in thong tin
         */
        
    public void inThongTin()
        {
            System.out.println("Ma sach: " + this.maSach);
            System.out.println("Ten sach: " + this.tenSach) ;
            System.out.println("Don gia: " + this.donGia);
            System.out.println("So luong: " + this.soLuong);
            System.out.println("Nha xuat ban: " + this.nxb);
        }
    
    public double thanhTien(){
        return 0;      
    
    }
    
    
    
    
    
    
}
