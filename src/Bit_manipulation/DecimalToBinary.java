package Bit_manipulation;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Decimal Number : ");
        int n = sc.nextInt();
        StringBuilder ans = new StringBuilder();
        while(n!=1){
            int rem = n%2;
            ans.append(rem);
            n = n>>1;
        }
        ans.append(1);

        System.out.println(ans.reverse().toString());
    }
}
