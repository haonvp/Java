package buoi3.btvn;

import java.util.Scanner;

public class b5 {
    public static int doiSo(int n) {
        int soNhiPhan = 0;
        int heSo = 1;
        while(n>0) {
            int du = n % 2;
            soNhiPhan += du * heSo;
            heSo = heSo * 10;
            n = n /2;
        }
        return soNhiPhan;
    }

    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("So nhi phan: " + doiSo(n));
    }
}
