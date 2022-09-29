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
public class KinhDoanh extends KhachHang{

    public KinhDoanh() {
    }

    public KinhDoanh(String maKH, String tenKH, String ngayHD, int soLuongDien, double donGia, double thanhTien) {
        super(maKH, tenKH, ngayHD, soLuongDien, donGia, thanhTien);
    }

    KinhDoanh(String maKH, String tenKH, String ngayHD, double soLuongDien, double donGia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double ThanhTien() {
        if (super.getSoLuongDien()<400) 
        {
            return super.ThanhTien();
	}
	else {
            return super.ThanhTien()*0.05;
	} // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
