
package baithuchanhso3_19521309;

public class SachTrinhTham extends Sach{
    private float Thue;
    
    public SachTrinhTham() {}

    public SachTrinhTham(float Thue) {
        this.Thue = Thue;
    }
    
    public SachTrinhTham(long maSach, double donGia, String tenSach,int soLuong, String nxb, float Thue)
    {
        super(maSach, donGia, tenSach, soLuong, nxb);
        this.Thue = Thue;
    }
    
    
    @Override
    public void inThongTin ()
    {
        super.inThongTin();
        System.out.println("Loai sach: Sach tieu thuyet");
        System.out.println("Tinh trang thue: " + this.Thue);
    }
    
    @Override
    public double thanhTien()
    {
        if (this.Thue != 0)
            return super.getSoLuong() * super.getDonGia();
        else
            return 0;
    }
    
    
}
