package BtapLtap_TX1.QuanLyNhanVienSales;

public class NhanVienBanHang extends NhanVien implements KPI, ChuanHoa{
    private int soSanPhamBanDuoc;

    public NhanVienBanHang() {
    }

    public double luong(){
        if (soSanPhamBanDuoc >= CHI_TIEU){
            return luongCung + (soSanPhamBanDuoc * 50000) + THUONG;
        }
        return luongCung + (soSanPhamBanDuoc * 50000);
    }


    @Override
    public String chuanHoaTen() {
        return setTenNV();
    }
}
