package buoi3.btvn;

import java.util.Scanner;

public class Bai1 {

    public static void dtb (float cc, float gk, float ck) {
        float tb = (cc + gk + ck) / 3;
        if (tb < 5) {
            System.out.println("Loại D");
        } else if (tb >=5 && tb < 7) {
            System.out.println("Loại C");
        } else if (tb > 7 && tb < 9) {
            System.out.println("Loại B");
        } else {
            System.out.println("Loại A");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập điểm chuyên cần: ");
        float cc = new Scanner(System.in).nextFloat();

        System.out.println("Nhập điểm giữa kỳ: ");
        float gk = new Scanner(System.in).nextFloat();

        System.out.println("Nhập điểm cuối kỳ: ");
        float ck = new Scanner(System.in).nextFloat();


        System.out.println("Xếp loại: ");
        dtb(cc, gk, ck);
    }
}
