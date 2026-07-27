package baitap_5;

import java.util.Scanner;

public class Ngay {
    private int ngay;
    private int thang;
    private int nam;

    Scanner sc = new Scanner(System.in);

    public Ngay() {
    }

    public Ngay(int ngay, int thang, int nam, Scanner sc) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
        this.sc = sc;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    // kiểm tra năm nhuận
    public boolean namNhuan() {
        return (nam % 400 == 0) || (nam % 4 == 0 && nam % 100 != 0);
    }

    //kiểm tra ngày hợp lệ
    public boolean hopLe() {
        if (thang < 1 || thang > 12) {
            return false;
        }

        int soNgay;

        switch (thang) {
            case 4:
            case 6:
            case 9:
            case 11:
                soNgay = 30;
                break;
            case 2:
                soNgay = namNhuan() ? 29 : 28;
                break;
            default:
                soNgay = 31;
        }
        return ngay >= 1 && ngay <= soNgay;
    }

    //nhập
    public void nhap() {
        do {
            System.out.print("ngày: ");
            ngay = sc.nextInt();

            System.out.print("tháng: ");
            thang = sc.nextInt();

            System.out.print("năm: ");
            nam = sc.nextInt();

            if (!hopLe()) {
                System.out.println("ngày không hợp lệ");
            }
        } while (!hopLe());
    }

    //xuất
    public void xuat() {
        System.out.print(ngay + "/" + thang + "/" + nam);
    }
}
