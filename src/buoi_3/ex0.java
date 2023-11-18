package buoi_3;

public class ex0 {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 8, 6};
        int k = 0;
        int j = 0;
        //Cach 1
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
    }

        //Cach 2
        while (k < numbers.length){
            System.out.println(numbers[k]);
            k++;
        }

        //Cach 3
        do {
            System.out.println(numbers[j]);
            j++;
        } while (j < numbers.length);
}
}
