package Bit_manipulation;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your First number : ");
        int n = sc.nextInt();

        System.out.println("Enter your Second number : ");
        int m = sc.nextInt();

        System.out.println("Before Swap :");
        System.out.println("n = "+n);
        System.out.println("m = "+m);

        n = n^m;
        m = n^m;
        n = n^m;

        System.out.println("After Swap :");
        System.out.println("n = "+n);
        System.out.println("m = "+m);
    }
}
