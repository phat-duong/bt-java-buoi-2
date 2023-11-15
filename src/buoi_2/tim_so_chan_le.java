package buoi_2;

import java.util.Scanner;

public class tim_so_chan_le {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời bạn nhập số: ");
        n = scanner.nextInt();
        if(n%2==0)
        {
            System.out.println("Đây là số chẵn!");
        }
        else
        {
            System.out.println("Đây là số lẻ!");
        }
    }
}
