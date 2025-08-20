package Bit_manipulation;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Binary Number : ");
        String num = sc.nextLine();

        int ans = 0;
        int i = num.length();

        for(char ch : num.toCharArray()){
            ans += Integer.parseInt(ch+"")*(int)Math.pow(2, --i);
        }

        System.out.println(ans);
    }
}
