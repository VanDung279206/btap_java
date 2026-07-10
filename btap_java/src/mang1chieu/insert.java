package mang1chieu;

import java.util.Random;

public class insert {
    public static void main(String[] args) {

    }

    //hàm tạo mảng
    public static void mang(int[] arr){
        Random rd = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = rd.nextInt(101);
        }
    }

    //hàm chèn

}
