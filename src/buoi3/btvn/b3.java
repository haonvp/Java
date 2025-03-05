package buoi3.btvn;

import java.util.Scanner;

public class b3 {
    public static int tinhGiaiThua(int n) {
        int giaiThua = 1;
        int i = n;
        while (i !=0) {
            giaiThua = giaiThua * i;
            i--;
        }
        return giaiThua;
    }

    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println(n + "! = " + tinhGiaiThua(n));
    }
}
