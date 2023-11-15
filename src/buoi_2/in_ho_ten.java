package buoi_2;

import java.util.Scanner;

public class in_ho_ten {
    public static void main(String[] args) {
        String ho;
        String ten;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời bạn nhập họ: ");
        ho = scanner.nextLine();
        System.out.println("Mời bạn nhập tên: ");
        ten = scanner.nextLine();
        System.out.println("Họ tên của bạn là: " + ho + " " + ten);
    }
}
