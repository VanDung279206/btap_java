package baitap_4;

public class PhuongTien {
    private String tenChuXe;
    private String loaixe;
    private int dungTich;
    private double triGia;

    public PhuongTien() {
    }

    public PhuongTien(String tenChuXe, String loaixe, int dungTich, double triGia) {
        this.tenChuXe = tenChuXe;
        this.loaixe = loaixe;
        this.dungTich = dungTich;
        this.triGia = triGia;
    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public String getLoaixe() {
        return loaixe;
    }

    public void setLoaixe(String loaixe) {
        this.loaixe = loaixe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }

    //tính thuế
    public double tinhThue() {
        if (dungTich < 100) {
            return triGia * 0.01;
        } else if (dungTich <= 200) {
            return triGia * 0.03;
        } else {
            return triGia * 0.005;
        }
    }

    // hiển thị 1 dòng
    public void xuat() {
        System.out.printf("%-20s %-20s %-10d %-15.2f %-15.2f\n", tenChuXe, loaixe, dungTich, triGia, tinhThue());
    }
}
