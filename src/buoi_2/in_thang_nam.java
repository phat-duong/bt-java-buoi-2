package buoi_2;

import java.util.Scanner;

public class in_thang_nam {
    public static void main(String[] args) {
        int thang;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời bạn nhập tháng: ");
        thang = scanner.nextInt();

        System.out.print("Tháng bạn nhập là: ");
        System.out.println(thang);
    }
}
