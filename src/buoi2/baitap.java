package buoi2;

import java.util.Scanner;

public class baitap {
    public static void main(String[] args) {
       baitap bt = new baitap();
       bt.bai1();

        System.out.println("\n=====================================\n");

        System.out.println("Nhập số thứ 1: ");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("Nhập số thứ 2: ");
        double b = new Scanner(System.in).nextDouble();
        bt.bai2(a, b);

        System.out.println("\n=====================================\n");

        System.out.println("Nhap chieu dai: ");
        double d = new Scanner(System.in).nextDouble();
        System.out.println("Nhap chieu rong: ");
        double r = new Scanner(System.in).nextDouble();
        System.out.println("Diện tích hình chữ nhật: " + bt.bai3(d, r));
    }

    public void bai1 () {
        System.out.println("Nhập họ tên: ");
        String hoTen = new Scanner(System.in).nextLine();
        System.out.println("Nhập ngày tháng năm sinh: ");
        String ngaySinh = new Scanner(System.in).nextLine();
        System.out.println("Nhập quê quán: ");
        String queQuan = new Scanner(System.in).nextLine();
        System.out.println("Nhập trường học: ");
        String truongHoc = new Scanner(System.in).nextLine();

        System.out.println("Xin chào " + hoTen +
                " đến từ " + queQuan +
                ", sinh ngày " + ngaySinh +
                ", trường " + truongHoc);
    }

    public void bai2(double a, double b) {
        System.out.println("Tổng: " + (a + b));
        System.out.println("Tích: " + (a * b));
        System.out.println("Thương: " + (a / b));
        System.out.println("Số dư của thương: " + (a % b));
    }

    public double bai3(double a, double b) {
        return a*b;
    }
}
