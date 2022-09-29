/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh2_19521309;

import java.util.Date;


/**
 *
 * @author ASUS
 */

import java.util.Scanner;
public class SinhHoat extends KhachHang {
    private int dinhMuc;
    
    public SinhHoat() {}

    public SinhHoat(int dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    public SinhHoat(int dinhMuc, String maKH, String tenKH, String ngayHD, int soLuongDien, double donGia, double thanhTien) {
        super(maKH, tenKH, ngayHD, soLuongDien, donGia, thanhTien);
        this.dinhMuc = dinhMuc;
    }

    SinhHoat(double dinhMuc, String maKH, String tenKH, String ngayHD, double soLuongDien, double donGia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setDinhMuc(int dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    public int getDinhMuc() {
        return dinhMuc;
    }

    @Override
    public double ThanhTien() {
        if (super.getSoLuongDien() <= this.dinhMuc)
        {
            return super.ThanhTien();
        }
        else
        {
            return (super.getSoLuongDien() - this.dinhMuc)*2*super.getDonGia() + super.ThanhTien();
        }
    }
    
    
    public void tinhThanhTien()
    {
        if (super.getSoLuongDien() <= getDinhMuc())
        {
            super.setThanhTien(super.getSoLuongDien() * super.getDonGia());
        }
        else 
        {
            super.setThanhTien(getDinhMuc()* super.getDonGia() + (super.getSoLuongDien() - getDinhMuc())*super.getDonGia()*2);
        }
    }

    @Override
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.print("Nhap dinh muc: ");
        this.dinhMuc = sc.nextInt();
    }

    @Override
    public void inThongTin() {
        super.inThongTin(); 
        System.out.println("Dinh muc dien la: " + this.dinhMuc);// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    
     
}
