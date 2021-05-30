package vn.plusplus.javacore.lesson4;

public class ArrayExample {
    public static void main(String[] args) {
       /* int diemBan1 = 8;
        int diemBan2 = 9;*/

        /*int[] diemCuaLop = new int[10];
        diemCuaLop[0] = 10;
        diemCuaLop[1]= 8;*/

        int[] diemCuaLop2 = {8, 9, 7, 8, 10, 8, 7, 7, 8, 10};


        for(int i = 0; i<diemCuaLop2.length; i=i+1){
            System.out.println("Diem cua ban thu " + (i+1) + " la: " + diemCuaLop2[i]);
        }

        int i = 0;
        for(int item : diemCuaLop2){
            System.out.println("Diem cua ban thu " + (i+1) + " la: " + item);
            i++;
        }
    }
}
