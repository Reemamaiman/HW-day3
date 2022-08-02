package HW3;

import java.util.Scanner;

public class Hw2 {

    public static float calculateTax(int price) {
        if (price < 100 || price > 500) {
            System.exit(0);
        }

        return price *15/100;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int price;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter The Price Please : ");
        price = scanner.nextInt();

        System.out.println(calculateTax(price));

    }

}
