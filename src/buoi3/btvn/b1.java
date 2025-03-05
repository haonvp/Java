package buoi3.btvn;

import java.util.Scanner;

public class b1 {

    public static int totalNumber (int n) {
        int sum = 0;
        for(int i=1; i<=n; i++) {
            sum += i*i*i;
        }
        return sum;
    }

    public static void main (String [] args) {
        int n;
        do {
            System.out.println("Nhap so nguyen duong: ");
            n = new Scanner(System.in).nextInt();
            if(n < 0){
                System.out.println("Nhap so duong");
            }
        } while (n < 0);
            int rs = totalNumber(n);
            System.out.println("Tong: " + rs);
    }
}
