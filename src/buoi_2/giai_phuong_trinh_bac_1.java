package buoi_2;

import java.util.Scanner;

public class giai_phuong_trinh_bac_1 {
    public static void main(String[] args) {
            int a, b;
            double x;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào số a: ");
            a = scanner.nextInt();
            System.out.println("Nhập vào số b: ");
            b = scanner.nextInt();
            x = -b/a;
            System.out.print("nghiệm x là: ");
            System.out.println(x);
    }
}
