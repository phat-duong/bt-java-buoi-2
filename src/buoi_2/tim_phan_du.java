package buoi_2;

import java.util.Scanner;

public class tim_phan_du {
    public static void main(String[] args) {
        int phan_du;
        int so_bi_chia;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời bạn nhập số nguyên: ");
        so_bi_chia = scanner.nextInt();
        phan_du = so_bi_chia % 2;
        System.out.print("Phần dư là: ");
        System.out.println(phan_du);
    }
}
