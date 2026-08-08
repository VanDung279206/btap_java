package Collection.QuanLyHinhTron;

public class HinhTron {
    private double banKinh;

    public HinhTron() {
    }

    public HinhTron(double banKinh){
        this.banKinh = banKinh;
    }

    public double tinhDienTich(){
        return Math.PI * Math.pow(banKinh, 2);
    }

    @Override
    public String toString() {
        return "ban kinh: " + banKinh
                + ", dien tich: " + tinhDienTich();
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }
}
