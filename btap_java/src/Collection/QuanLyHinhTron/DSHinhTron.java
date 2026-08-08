package Collection.QuanLyHinhTron;

import java.util.ArrayList;

public class DSHinhTron {
    private ArrayList<HinhTron> ds = new ArrayList<>();

    public DSHinhTron() {
    }

    //them hinh tron
    public void themHinhTron(HinhTron x){
        ds.add(x);
    }

    //lay so luong hinh tron
    public int layKichThuoc(){
        return ds.size();
    }

    // lay hinh tron tai vi tri index
    public HinhTron layHinhTron(int index){
        return ds.get(index);
    }

    //gan hinh tron tai vi tri index
    public void ganHinhTron(int index, HinhTron x){
        ds.set(index, x);
    }

    //tinh tong dien tich
    public double tinhTongDT(){
        double tong = 0;

        for (HinhTron x : ds){
            tong += x.tinhDienTich();
        }
        return tong;
    }

    //tim dien tich lon nhat
    public double timMaxDT(){
        if (ds.isEmpty())
            return 0;
        double max = ds.get(0).tinhDienTich();

        for (HinhTron x : ds){
            if (x.tinhDienTich() > max){
                max = x.tinhDienTich();
            }
        }
        return max;
    }

    // tim hinh tron co dien tich no nhat
    public HinhTron timMinHT(){
        if (ds.isEmpty())
            return null;

        HinhTron min = ds.get(0);
        for (HinhTron x : ds){
            if (x.tinhDienTich() < min.tinhDienTich()){
                min = x;
            }
        }
        return min;
    }
}
