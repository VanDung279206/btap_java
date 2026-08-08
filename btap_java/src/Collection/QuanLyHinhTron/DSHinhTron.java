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
}
