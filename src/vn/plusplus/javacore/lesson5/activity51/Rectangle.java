package vn.plusplus.javacore.lesson5.activity51;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle() {
    }

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int tinhChuVi(){
        int chuVi = (width + height) * 2;
        return chuVi;
    }

    public int tinhDienTich(){
        int dienTich = width * height;
        return dienTich;
    }

    public void inWidthHeight(){
        System.out.println("Chieu dai la: " + height);
        System.out.println("Chieu rong la: " + width);
    }

    public boolean kiemTraHinhVuong(){
        if(width == height){
            System.out.println("Hinh vuong");
            return true;
        } else {
            System.out.println("Hinh chu nhat");
            return false;
        }
    }
}
