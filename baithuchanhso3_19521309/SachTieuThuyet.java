
package baithuchanhso3_19521309;

import baithuchanhso3_19521309.Sach;

public class SachTieuThuyet extends Sach{
    private boolean TinhTrang;
    
    public SachTieuThuyet() {}

    public SachTieuThuyet(boolean TinhTrang) {
        this.TinhTrang = TinhTrang;
    }
    
    public SachTieuThuyet(long maSach, double donGia, String tenSach,int soLuong, String nxb, boolean TinhTrang)
    {
        super(maSach, donGia, tenSach, soLuong, nxb);
        this.TinhTrang = TinhTrang;
    }
    
    public boolean isTinhTrang() {
        return TinhTrang;
    }
    
    public void setTinhTrang (boolean TinhTrang)
    {
        this.TinhTrang = TinhTrang;
    }
    
    @Override
    public void inThongTin ()
    {
        super.inThongTin();
        System.out.println("Loai sach: Sach tieu thuyet");
        System.out.println("Tinh trang: " + this.TinhTrang);
    }
    
    @Override
    public double thanhTien()
    {
        if (this.TinhTrang == true)
            return super.getSoLuong() * super.getDonGia();
        else
            return 0;
    }
    
    
}
