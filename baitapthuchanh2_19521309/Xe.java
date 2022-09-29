/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh2_19521309;

/**
 *
 * @author ASUS
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class Xe {
    private String tenChuXe;
    private String loaiXe;
    private int triGiaXe;
    private int dungTichXylanh;

    public Xe() {}

    public Xe(String tenChuXe, String loaiXe, int triGiaXe, int dungTichXylanh) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.triGiaXe = triGiaXe;
        this.dungTichXylanh = dungTichXylanh;
    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public int getTriGiaXe() {
        return triGiaXe;
    }

    public int getDungTichXylanh() {
        return dungTichXylanh;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public void setTriGiaXe(int triGiaXe) {
        this.triGiaXe = triGiaXe;
    }

    public void setDungTichXylanh(int dungTichXylanh) {
        this.dungTichXylanh = dungTichXylanh;
    }
    
    public double getTienThue()
    {
        if(dungTichXylanh < 100)
        {
            return triGiaXe*0.01;
        }
        else if(dungTichXylanh >= 100 && dungTichXylanh <= 175)
        {
            return triGiaXe*0.03;
        }
        
        return triGiaXe*0.05;
    }

    @Override
    public String toString() {
        return String.format("%-15s|%-15s|%-15d|%-15d|%-15.2f", tenChuXe, loaiXe, triGiaXe, dungTichXylanh, getTienThue());
    }
    
    public static ArrayList<Xe> nhapXe()
    {
        int triGiaXe;
        int dungTichXylanh;
        String tenChuXe;
        Scanner sc = new Scanner(System.in);
        ArrayList<Xe> dsXe = new ArrayList<Xe>();
        boolean isExit = false;
        while(!isExit)
        {
            System.out.println("Nhap xe: ");
            System.out.print("Nhap ten chu xe: ");
            tenChuXe = sc.nextLine();
            
            
            if(tenChuXe == null || tenChuXe.isEmpty())
            {
                sc.nextLine();
                break;
            }

            System.out.print("Loai xe: ");
            String loaiXe = sc.nextLine();
            
            do
            {
                System.out.print("Tri gia xe: ");
                triGiaXe = sc.nextInt();
                sc.nextLine();
            }while(triGiaXe<=0);
            
            do
            {
                System.out.print("Dung tich xy lanh: ");
                dungTichXylanh = sc.nextInt();
                sc.nextLine();
            }while(dungTichXylanh<=0);
            
            
            Xe xe = new Xe(tenChuXe, loaiXe, triGiaXe, dungTichXylanh);
            dsXe.add(xe);
        }
        
        return dsXe;
    }
    
    public static void timXe(ArrayList<Xe> dsXe)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin tim kiem: ");
        System.out.print("Ten chu xe: ");
        String tenChuXe = sc.nextLine();

        System.out.print("Loai xe: ");
        String loaiXe = sc.nextLine();

        for(Xe xe: dsXe)
        {
            if(xe.getTenChuXe().equals(tenChuXe) && xe.getLoaiXe().equals(loaiXe))
            {
                System.out.print("Tien thue: "+ xe.getTienThue());
                return;
            }
        }
        
        System.out.println("Khong tim thay xe");
    }
    
    public static void xuatXe(ArrayList<Xe> dsXe)
    {
        System.out.println(String.format("%-15s|%-15s|%-15s|%-15s|%-15s",
                "Ten chu xe", "Loai xe", "Tri gia xe", "DT Xylanh", "Tien thue"));
        for (Xe xe : dsXe) {
            System.out.println(xe.toString());
        }
    }
    
}
