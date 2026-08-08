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
}
