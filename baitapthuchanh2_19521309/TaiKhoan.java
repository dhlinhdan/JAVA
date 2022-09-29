package baitapthuchanh2_19521309;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class TaiKhoan {
    //so tai khoan
    private long soTK;
    
    //
    private String tenTK;
    
    private double soTien;
    
    /**
     * constructor macdinh
     */
    
    public TaiKhoan() {}
    
    /**
     * constructor co tham so
     * 
     * @param soTK
     * @param tenTK
     * @param soTien 
     */
    
    public TaiKhoan(long soTK, String tenTK, double soTien)
    {
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.soTien = soTien;             
    }
    
    public long soTK() {
        return soTK;
    }
    public String tenTK() {
        return tenTK;
    }
    public double soTien() {
        return soTien;
    }
    
    public void setsoTK(long soTK) {
        this.soTK = soTK;
    }
    public void settenTK(String tenTK) {
        this.tenTK = tenTK;
    }
    public void setsoTien(double soTien) {
        this.soTien = soTien;
    }
    
    public long getsoTK() {
        return soTK;
    }
    public String gettenTK() {
        return tenTK;
    }
    public double getsoTien() {
        return soTien;
    }
    
    /**
     * Ham in tai khoan
     */
    
    public void inTaiKhoan()
    {
        System.out.println("So tai khoan: "+ this.soTK
        +"\nTen tai khoan" + this.tenTK
        +"\nSo tien: " + this.soTien
        + "\n---------------------");
    }
    
    /**
     * ham nap tien
     * 
     * @param soTien
     * 
     * @return
     */
    
    public boolean napTien(double soTien) {
        if (soTien > 0)
        {
            this.soTien = this.soTien + soTien;
            return true;
        }
        return false;
    }
    
    /**
     * @param a la tai khoan nguoi can chuyen
     * @param soTien
     * @return
     */
    
    public boolean chuyenKhoan(TaiKhoan a, double soTien) {
        if (soTien>this.soTien) return false;
        if (a.soTK == this.soTK){
            return false;
        }
        if (soTien<=0){
            return false;
        }
        a.soTien = a.soTien + soTien;
        this.soTien = this.soTien - soTien;
        return true;
    }
    
    }

