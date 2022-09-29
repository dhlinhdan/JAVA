/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitapthuchanh1_19521309_;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class BaiTapThucHanh1_19521309_ {

    public static void Bai1()
    {
        double r;
        System.out.println("Nhap ban kinh cua hinh tron: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextDouble();
        while (r<0)
        {
            System.out.println("Ban kinh am khong hop le, vui long nhap lai!");
            System.out.println("Nhap ban kinh cua hinh tron: ");
            r = sc.nextDouble();
        }
        double ChuVi = r*2*3.13;
        double DienTich = r*r*3.14;
        System.out.println("Chu vi hinh tron la: "+ChuVi);
        System.out.println("Dien tich hinh tron la: "+DienTich);        
    }
    
    public static void Bai2()
    {
       String x,y;
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Nhap chuoi x: ");
       x = sc.nextLine();
       System.out.println("Nhap chuoi y: ");
       y = sc.nextLine();
       
       System.out.println("x= "+ x +"\ny=" + y);
       System.out.println("Chieu dai cua chuoi x la: " + x.length());
       System.out.println("Chieu dai cua chuoi y la: " + y.length());
       
       if (x.length() >=3)
       {
           System.out.println(x.substring(0,3));
       }
       else
       {
           System.out.println("x khong co du 3 ki tu.");
       }
    }
    
    public static void Bai3()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so dien: ");
        double soDien = sc.nextDouble();
        double soTien;
        if (soDien<0)
        {
            System.out.println("So dien am khong hop le, vui long nhap lai!");               
        }
        else if (soDien <= 50)
        {
            soTien = soDien*2000;
            System.out.print("Tien dien la: ");
            System.out.printf("%.0f", soTien);
            System.out.print(" vnd\n\n");
        }
        else if (soDien > 50 && soDien <= 100)
        {
            soTien = (soDien-50)*2500 + 50*2000;
            System.out.print("Tien dien la: ");
            System.out.printf("%.0f", soTien);
            System.out.print(" vnd\n\n");
        }
        else 
        {
            soTien = (soDien-50)*3500 + 50*2000;
            System.out.print("Tien dien la: ");
            System.out.printf("%.0f", soTien);
            System.out.print(" vnd\n\n");
        }
    }
    
    public static void Bai4()
    {
        for (int i=0; i<= 20;i++)
        {
            if (i==0)
            {
                System.out.printf("%-2s%-3s", "X","|");             
            }
            else 
            {
                System.out.printf("%-5d", i);
            }
        }
        System.out.println();
        System.out.printf("----------------------------------");
        System.out.println();
        
        for (int i=1;i<=20;i++)
        {
            System.out.printf("%-2d%-3s", i,"|");
            for (int j=1;i<=20;j++)
            {
                System.out.printf("%-5d", i*j);
            }
            System.out.println();
        }
    }
    
    public static void Bai5()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen thu nhat: ");
        double a = sc.nextDouble();
        while (Math.ceil(a) != Math.floor(a))
        {
            System.out.print("Khong phai so nguyen, vui long nhap lai!");
            a = sc.nextDouble();
        }
        System.out.print("Nhap so nguyen thu hai: ");
        double b = sc.nextDouble();
        while (Math.ceil(b) != Math.floor(b))
        {
            System.out.print("Khong phai so nguyen, vui long nhap lai!");
            b = sc.nextDouble();
        }
        
        System.out.println();
        System.out.println("Hai so nguyen vua duoc nhap la:");
        System.out.printf("So thu ntat: \n",a);
        System.out.printf("So thu hai: \n",b);
        
        if (a==0 && b ==0)
        {
            System.out.println("--> Khong co UCLN!");         
        }
        else
        {
            if (a==0 && b !=0)
            {
                System.out.printf("--> UCLN la %.0f \n: ",b);                
            }
            else 
            {
                if (a!=0 && b ==0)
                {
                    System.out.printf("--> UCLN la %.0f \n: ",a);
                }
            }
        }
        double m = Math.min(a, b);
        if (m<0)
        {
            m*=-1;            
        }
        float UCLN = 1;
        for (int i = 1;i<=m;i++)
        {
            if (a%i ==0&& b%i ==0)
            {
                UCLN = i;
            }
        }
        System.out.printf("--> UCLN = ", UCLN);
    }
    
    public static void Bai6()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen can tim uoc: ");
        double a = sc.nextDouble();
        while (Math.ceil(a) != Math.floor(a))
        {
            System.out.print("Khong phai so nguyen, vui long nhap lai!");
            a = sc.nextDouble();
        }
        
        System.out.printf("\nCac uoc cua ",a);
        System.out.printf("-------------------");
        System.out.println();
        for (int i=1;i<=a;i++)
        {
            if (a%i ==0)
            {
                System.out.print(i+"\t");
            }
        }
    }
    
    public static boolean isPrimeNumber(int n)        
    {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void Bai7()
    {
        int dong, cot;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so dong cua mang hai chieu: ");
        dong = sc.nextInt();
        System.out.println("Nhap vao so cot cua mang hai chieu: ");
        cot = sc.nextInt();
        
        int[][] A = new int[dong][cot];
        
        for (int i = 0; i < dong; i++) 
        {
            for (int j = 0; j < cot; j++) 
            {
                System.out.print("Nhap phan tu o vi tri [" + i + ", " + j + "]: ");
            A[i][j] = sc.nextInt();
        }
        }
        int max = A[0][0];
        int dongMax = 0, cotMax =0;
         
        for (int i = 0; i < dong; i++) 
        {
            for (int j = 0; j < cot; j++) 
            {
                if (max < A[i][j]) 
                {
                    max = A[i][j];
                    dongMax = i;
                    cotMax = j;
                }
            }
        }
         
        System.out.println("Phan tu lon nhat trong ma tran la A[ = " +dongMax);
        System.out.print(","+cotMax);
        System.out.print("]: "+max);
        
        int[][] B = new int[dong][cot];
        
        for (int i = 0; i < dong; i++) 
        {
            for (int j = 0; j < cot; j++) 
            {
                if (true == isPrimeNumber(A[i][j])) 
                {
                    B[i][j] = A[i][j];
                }
                else 
                {
                    B[i][j] =0;
                }
            }
        }
        
        System.out.println("Mang cac so nguyen to cua ma tran la: ");
        for (int i = 0; i < dong; i++) 
        {
            for (int j = 0; j < cot; j++) 
            {
                System.out.print(B[i][j] + "\t");
            }
        // sau khi viết xong 1 dòng thi xuống hàng
            System.out.println("\n");   
        }
        
        for(int k = 0; k<dong ; k++)
        {
            for(int i = 0; i<cot-1 ; i++)
            {
                for(int j = cot-1; j>i ; j--)
                {
                    if(A[j][k]<A[j-1][k])
                    {
                        int temp = A[j][k];
                        A[j][k] = A[j-1][k];
                        A[j-1][k] = temp;
                    }
                }
            }
        }
        System.out.println("Ma tran duoc sap xep theo cot la: ");
        for (int i = 0; i < dong; i++) 
        {
            for (int j = 0; j < cot; j++) 
            {
                System.out.print(A[i][j] + "\t");
            }
        // sau khi viết xong 1 dòng thi xuống hàng
            System.out.println("\n");   
        }
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        System.out.println("#######################");
        System.out.println("1.Bai 1");
        System.out.println("2.Bai 2");
        System.out.println("3.Bai 3");
        System.out.println("4.Bai 4");
        System.out.println("5.Bai 5");
        System.out.println("6.Bai 6");
        System.out.println("7.Bai 7");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch(n)
        {
            case 1:
            {
                System.out.println("Bai 1: ");
                Bai1();                        
                break;
            }
            case 2:
            {
                System.out.println("Bai 2: ");
                Bai2();                        
                break;
            }
            case 3:
            {
                System.out.println("Bai 3: ");
                Bai3();                        
                break;
            }
            case 4:
            {
                System.out.println("Bai 4: ");
                Bai4();                        
                break;
            }case 5:
            {
                System.out.println("Bai 5: ");
                Bai5();                        
                break;
            }case 6:
            {
                System.out.println("Bai 6: ");
                Bai6();                        
                break;
            }case 7:
            {
                System.out.println("Bai 7: ");
                Bai7();                        
                break;
            }
            default:
                break;
           
        }
        
    }
    
}
