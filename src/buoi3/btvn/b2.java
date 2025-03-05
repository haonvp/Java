package buoi3.btvn;

import java.util.Scanner;

public class b2 {

    public static int daoNguoc(int n) {
        int soDaoNguoc = 0;
        while(n!=0) {
            int so = n % 10;
            soDaoNguoc = soDaoNguoc * 10 + so;
            n = n / 10;
        }

        return soDaoNguoc;
    }

    public static void main (String[] args) {
        System.out.println("Nhap day so: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Dao nguoc: " + daoNguoc(n));
    }
}
