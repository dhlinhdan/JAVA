
package baitapthuchanh2_19521309;

/**
 *
 * @author ASUS
 */

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

public class BaiTapThucHanh2_19521309 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
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
                System.out.println("Bai 1: Ham Tai Khoan");
                HamTaiKhoan();                        
                break;
            }
            case 2:
            {
                System.out.println("Bai 2: Ham Pointer");
                HamPointer();                        
                break;
            }
            case 3:
            {
                System.out.println("Bai 3: Ham Sach");
                Sach();                        
                break;
            }
            case 4:
            {
                System.out.println("Bai 4: Ham Hinh Chu Nhat");
                HamHinhChuNhat();                        
                break;
            }case 5:
            {
                System.out.println("Bai 5: Ham Sinh Vien");
                HamSinhVien();                        
                break;
            }case 6:
            {
                System.out.println("Bai 6: Ham Xe");
                HamXe();                        
                break;
            }
            case 7:
            {
                System.out.println("Bai 7: ");
                HamDien();                        
               break;
            }
            default:
                break;
           
        }
               
        // TODO code application logic here
    }
    
    public static void HamTaiKhoan()
    {
        TaiKhoan tk = new TaiKhoan(1000, "Dinh Hoang Linh Dan", 100000);
        tk.inTaiKhoan();
        tk.napTien(100000);
        tk.inTaiKhoan();
        
        TaiKhoan tk2 = new TaiKhoan(999, "Nguyen Minh Nhat", 200000);
        tk2.inTaiKhoan();
        tk.chuyenKhoan(tk2, 2000);
        tk.inTaiKhoan();
        tk2.inTaiKhoan();
    }
    
    
    
    public static void HamPointer() {
        Pointer n = new Pointer();
        Pointer m = new Pointer();
        
        n.nhapToaDo();
        n.xuatToaDo();
        m.nhapToaDo();
        m.xuatToaDo();
        
        n.tinhKhoangCach(m);
    }
    
    public static void Sach()
    {
        Sach SachTieuThuyet = new SachTieuThuyet(101,50000,"IELTS ACADEMIC 16",  7, "CAMBRIDGE",false);
        SachTieuThuyet.inThongTin();
        System.out.print("Thanh tien: " + SachTieuThuyet.thanhTien());
        System.out.println("-----------");
        
        Sach SachTrinhTham = new SachTrinhTham(102, 60000,"IELTS ACADEMIC 15",  1, "CAMBRIDGE",1);
        SachTrinhTham.inThongTin();
        System.out.print("Thanh tien: " + SachTrinhTham.thanhTien());
    }
    
    public static void HamHinhChuNhat()
    {
        
        HinhChuNhat h1 = new HinhChuNhat();
        h1.NhapTT();
        System.out.println(HinhChuNhat.TieuDe()); 
        System.out.println(h1);
    }
    
    public static void HamSinhVien()
    {
        SinhVien s1 = new SinhVien();
        SinhVien s2 = new SinhVien();
        SinhVien s3 = new SinhVien();
        s1.NhapTT();
        s2.NhapTT();
        s3.NhapTT();
        System.out.println("____________");
        System.out.println();
        System.out.println(s1);
        System.out.println();
        System.out.println(s2);
        System.out.println();
        System.out.println(s3);
        System.out.println("____________");
    }

    public static void HamXe()
    {
        ArrayList<Xe> dsXe = Xe.nhapXe();
        Xe.xuatXe(dsXe);
        Xe.timXe(dsXe);
    }
    
    public static boolean isValidDate(String inDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(inDate.trim());
        } catch (ParseException pe) {
            return false;
        }
        return true;
    }
    
    private static void HamDien()
    {
        int loaiKH;
        String maKH, tenKH, ngayHD;
        double soLuongDien, donGia, dinhMuc;
        int loaiDien;
        KhachHang[][] danhsachKH = new KhachHang[50][3];
        int sinhHoat = 0,kinhDoanh = 0,sanXuat = 0;
        Scanner sc = new Scanner(System.in);

        OUTER:
        do {
            System.out.println("Nhap loai khach hang can nhap: \n1. Sinh Hoat. \n2. Kinh Doanh.\n3. San xuat.");
            loaiKH =  sc.nextInt();
            switch (loaiKH) {
                case 1:
                    System.out.println("Nhap ma khach hang: ");
                    sc.nextLine();
                    maKH = sc.nextLine();
                    if (maKH.isEmpty()) {
                        break OUTER;
                    }
                    System.out.println("Nhap ten khach hang: ");
                    tenKH = sc.nextLine();
                    System.out.println("Nhap ngay hoa don theo dd/MM/yyyy: ");
                    ngayHD = sc.nextLine();
                    System.out.println("Nhap so luong dien: ");
                    soLuongDien = sc.nextDouble();
                    System.out.println("Nhap dpn gia: ");
                    donGia = sc.nextDouble();
                    System.out.println("Nhap dinh muc dien: ");
                    dinhMuc = sc.nextDouble();
                    KhachHang sinhhoat = new SinhHoat(dinhMuc, maKH,tenKH,ngayHD, soLuongDien, donGia);
                    danhsachKH[sinhHoat][0] = sinhhoat;
                    sinhHoat= sinhHoat + 1;
                    break;
                case 2:
                    System.out.println("Nhap ma khach hang: ");
                    sc.nextLine();
                    maKH = sc.nextLine();
                    if (maKH.isEmpty()) {
                        break OUTER;
                    }
                    System.out.println("Nhap ten khach hang: ");
                    tenKH = sc.nextLine();
                    System.out.println("Nhap ngay hoa don theo dd/MM/yyyy: ");
                    ngayHD = sc.nextLine();
                    System.out.println("Nhap so luong dien: ");
                    soLuongDien = sc.nextDouble();
                    System.out.println("Nhap dpn gia: ");
                    donGia = sc.nextDouble();
                    KhachHang kinhdoanh = new KinhDoanh( maKH,tenKH,ngayHD, soLuongDien, donGia);
                    danhsachKH[sinhHoat][0] = kinhdoanh;
                    kinhDoanh= kinhDoanh + 1;
                    break;
                case 3:
                    System.out.println("Nhap ma khach hang: ");
                    sc.nextLine();
                    maKH = sc.nextLine();
                    if (maKH.isEmpty()) {
                        break OUTER;
                    }
                    System.out.println("Nhap ten khach hang: ");
                    tenKH = sc.nextLine();
                    System.out.println("Nhap ngay hoa don theo dd/MM/yyyy: ");
                    ngayHD = sc.nextLine();
                    System.out.println("Nhap so luong dien: ");
                    soLuongDien = sc.nextDouble();
                    System.out.println("Nhap dpn gia: ");
                    donGia = sc.nextDouble();
                    System.out.println("Nhap so pha cua dien: (pha) ");
                    loaiDien = sc.nextInt();
                    KhachHang sanxuat = new SanXuat( loaiDien, maKH,tenKH,ngayHD, soLuongDien, donGia);
                    danhsachKH[sanXuat][0] = sanxuat;
                    sanXuat= sanXuat + 1;
                    break;
                default:
                    break;
            }
        } while (true);
        
        System.out.println("Nhap thang can tim hoa don: ");
        int thangHD = sc.nextInt();
        System.out.println("Nhap nam can tim hoa don: ");
        int namHD = sc.nextInt();
    }
