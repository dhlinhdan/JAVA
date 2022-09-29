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

public class Pointer {
    private double x;
    private double y;
    
    public Pointer() {}
    
    public Pointer(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    
    public double x(){
        return x;
    }
    
    public double y(){
        return y;
    }
    
    public void getx(double x) {
        this.x = x;
    }
    
    public void gety(double y) {
        this.y = y;
    }
    
    /**
     * Ham in toa do diem
     */
    
    public void nhapToaDo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap hoanh do: ");
        this.x = sc.nextDouble();
        
        System.out.print("\nNhap tung do: ");
        this.y = sc.nextDouble();
    }
    
    /**
     * Ham xuat toa do diem
     */
           
    public void xuatToaDo(){
        System.out.println("Toa do diem la: (" + x 
         + "," + y + ") ");        
    }
    
    /**
     * Ham tinh khoang cach
     * @param a
     */
    
    public void tinhKhoangCach (Pointer a){
        double khoangCach = Math.sqrt(Math.pow((a.x - this.x), 2) + Math.pow((a.y - this.y), 2));
        System.out.println("Khoang cach cua 2 diem la: " + khoangCach);
    }
            
    
}
