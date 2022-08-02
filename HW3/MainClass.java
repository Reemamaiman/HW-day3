package HW3;

import java.util.Scanner;

public class MainClass {

    public static void primeNumber(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime)
            System.out.println("Prime number");
        else
            System.out.println("Not prime number");
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter A Number Please : ");
        n = scanner.nextInt();

        primeNumber(n);

    }

}
