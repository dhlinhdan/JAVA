/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baithuchanhso3_19521309;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class BaiThucHanhSo3_19521309 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("#######################");
        System.out.println("1.Bai 1: Quan ly Sach.");
        System.out.println("2.Bai 2: Tinh trung binh cua mang.");
        System.out.println("3.Bai 3: Nhap xuat mang.");
        System.out.println("4.Bai 4: Xuat Mang.");
        System.out.println("5.Bai 5: Bo bai 52 la, chia bai cho 4 nguoi.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch(n)
        {
            case 1:
            {
                System.out.println("Bai 1: ");
                Sach_Bai1();                        
                break;
            }
            case 2:
            {
                System.out.println("Bai 2: ");
                Generic_Bai2();                        
                break;
            }
            case 3:
            {
                System.out.println("Bai 3: ");
                Exception_Bai3();                        
                break;
            }
            case 4:
            {
                System.out.println("Bai 4: ");
                xuatMang_bai4();                        
                break;
            }case 5:
            {
                System.out.println("Bai 5: ");
                DeckofCards_bai5();                        
                break;
            }
            default:
                break;
           
        }
    }
        
    }
    
    //Sach
    public static void NhapSach(ArrayList sach){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Nhap so luong sach muon nhap: ");
        int soLuong = sc.nextInt();
        
        for (int i = 0; i < soLuong; i++)
        {
            System.out.println("Chon loai sach muon nhap: \n    1. Sach Tieu Thuyet. \n    2. Sach Trinh Tham.");
            int loaiSach = sc.nextInt();
            
            while (loaiSach<1&&loaiSach>2)
            {
                System.out.println("Chon lai loai sach muon nhap: \n    1. Sach Tieu Thuyet. \n    2. Sach Trinh Tham.");
                loaiSach = sc.nextInt();
            }
            
            if (loaiSach == 1)
            {
                Sach sachtieuthuyet = new SachTieuThuyet();
                sachtieuthuyet.nhapThongTin();
                sach.add(sachtieuthuyet);   
            }
            
            else 
            {
                Sach sachtrinhtham = new SachTrinhTham();
                sachtrinhtham.nhapThongTin();
                sach.add(sachtrinhtham);  
            }
        }
    }
    
    public static void Sach_Bai1()
    {
        ArrayList<Sach> listSach = new ArrayList();
        NhapSach(listSach);
        
        double tongTienTieuThuyet =0, tongTienTrinhTham = 0;
                
        for (int i = 0; i < listSach.size(); i++) 
        {
            if (SachTieuThuyet.class == listSach.get(i).getClass()) 
            {
                tongTienTieuThuyet += listSach.get(i).getSoLuong() * 
                    listSach.get(i).getDonGia();
            } 
            else
            {
                tongTienTrinhTham += listSach.get(i).getSoLuong() * 
                    listSach.get(i).getDonGia();
            }
        }
        
        System.out.println("===========");
        System.out.println("Tong tien sach Tieu Thuyet la: " + tongTienTieuThuyet);
        System.out.println("Tong tien sach Trinh Tham la: " + tongTienTrinhTham);
        System.out.println("===========");

        double maxGia = listSach.get(0).getDonGia();
        int indexMaxGia = 0;

        for (int i = 1; i < listSach.size(); i++) 
        {
            if (listSach.get(i).getDonGia() > maxGia) 
            {
                maxGia = listSach.get(i).getDonGia();
                indexMaxGia = i;
            }
        }
        System.out.println("Quyen sach co gia thanh cao nhat la: ");
        listSach.get(indexMaxGia).inThongTin();
    }
    
    //Generic - trung binh
    
    public static double getAverage(List<? extends Number> numList)
    {
        double total = 0.0;
        for (Number num : numList)
            total+= num.doubleValue();
        return total/numList.size();        
    }
    
    public static void Generic_Bai2()
    {
        System.out.println("===========");

        List<Integer> integerList = new ArrayList<Integer>();
        
        integerList.add(3);
        integerList.add(5);
        integerList.add(100);
        integerList.add(452);
        System.out.println("Trung binh cong cua cac so (3,5,100,452) la: "+getAverage(integerList));
        
        List<Double> doubleList = new ArrayList<Double>();
        
        doubleList.add(3.5);
        doubleList.add(7.2);
        doubleList.add(1.6);
        doubleList.add(5.4);
        System.out.println("Trung binh cong cua cac so (3.5,7.2,1.6,5.4) la: "+getAverage(doubleList));
        
    }
    
    //Viết Exception cho trường hợp sử mảng số nguyên 5 phần tử. 
    public static void Exception_Bai3()
    {
        Scanner sc = new Scanner(System.in);
        
        int[] Integer = new int[5];
        int number;
        int i = 0;
        
        try {
            while(true)
            {
                System.out.println("Nhap so nguyen: ");
                number = sc.nextInt();
                Integer[i] = number;
                i++;
            }  
        } catch(ArrayIndexOutOfBoundsException aie)
        {
            System.out.println("Ban da nhap qua so luong phan tu!!!");
        }
        catch (Exception e)
        {
            System.out.println("Vui long nhap so nguyen!!!");
        }
        
        System.out.println("Mang vua nhap la: ");
        for (int j = 0; i< Integer.length; j++)
        {
            System.out.println(Integer[j]);
        }
    }
    
    //Hàm xuất mảng sử dụng Generic
    
    public static <T> void xuatMang(T[] arr)
    {
        for ( int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
    
    public static void xuatMang_bai4()
    {
        Integer[] arrInt = {1,2,3,4};
        String[] arrStr = {"Ä", "B", "C"};
        Double[] arrDouble = {2.3,4.5,6.7,7.8,8.9};
        xuatMang(arrInt);
        xuatMang(arrStr);
        xuatMang(arrDouble);
    }
            
    // Viết hàm mô tả bài và sử dụng hàm shuffle() để chia bài 4 nhóm (Viết Class riêng)     
   
    public static void DeckofCards_bai5()
    {
        Scanner scan = new Scanner(System.in);
        Card C;
        Deck deck = new Deck();
        
        System.out.println("Bo bai 52 la: ");
        System.out.println(deck.toString());
        
        deck.shuffle();

        System.out.println("===========");
        
        System.out.println("==Nguoi thu nhat==");
        for(int i=0; i<13; i++)
        {
            C = deck.drawRandomCard();
            System.out.println(C.toString());
        }
        
        System.out.println("==Nguoi thu hai==");
        for(int i=0; i<13; i++)
        {
            C = deck.drawRandomCard();
            System.out.println(C.toString());
        }
        System.out.println("==Nguoi thu ba==");
        for(int i=0; i<13; i++)
        {
            C = deck.drawRandomCard();
            System.out.println(C.toString());
        }
        
        System.out.println("==Nguoi thu tu==");
        for(int i=0; i<13; i++)
        {
            C = deck.drawRandomCard();
            System.out.println(C.toString());
        }        
        System.out.println(deck.toString());

    }       

    
}
