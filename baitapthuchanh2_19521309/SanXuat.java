/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh2_19521309;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */



public class SanXuat extends KhachHang{
    private int loaiDien;

    public SanXuat(int loaiDien) {
        this.loaiDien = loaiDien;
    }

    public SanXuat(int loaiDien, String maKH, String tenKH, String ngayHD, int soLuongDien, double donGia, double thanhTien) {
        super(maKH, tenKH, ngayHD, soLuongDien, donGia, thanhTien);
        this.loaiDien = loaiDien;
    }

    SanXuat(int loaiDien, String maKH, String tenKH, String ngayHD, double soLuongDien, double donGia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getLoaiDien() {
        return loaiDien;
    }

    public void setLoaiDien(int loaiDien) {
        this.loaiDien = loaiDien;
    }
     
    
    @Override
    public double ThanhTien()
    {
        if (getLoaiDien() == 2)
        {
            if (super.getSoLuongDien() <= 200)
            {
                return super.getSoLuongDien() * super.getDonGia();
            }
            else 
            {
                return super.getSoLuongDien() * super.getDonGia() * 0.98;
            }
        }
        else 
        {
            if (super.getSoLuongDien() <= 150)
            {
                return super.getSoLuongDien() * super.getDonGia();
            }
            else 
            {
                return super.getSoLuongDien() * super.getDonGia() * 0.97;
            }
        }
  
    }
    
    @Override
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.print("Nhap loai dien (Nhap 2 neu la dien 2 pha, nhap 3 neu la dien 3 pha: )");
        this.loaiDien = sc.nextInt();
    }

    @Override
    public void inThongTin() {
        super.inThongTin(); 
        System.out.println("Loai dien duoc dung la: " + this.loaiDien + "pha.");// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
