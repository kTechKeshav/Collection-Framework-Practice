package Bit_manipulation;

import java.util.Scanner;

public class CheckIthSetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Binary Number : ");
        int binNo = sc.nextInt();

        System.out.println("Enter ith Number : ");
        int i = sc.nextInt();

        System.out.println(((binNo & (1 << i)) != 0 )?1:0);
    }
}
