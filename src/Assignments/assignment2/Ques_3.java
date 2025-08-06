package Assignments.assignment2;

import java.util.Scanner;

public class Ques_3 {
    private static boolean check(String s1, String s2){
        if(s1.length()!=s2.length())
            return false;

        int n = s1.length();
        for(int i=0; i<n; i++){
            if(s1.charAt(i)!=s2.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First String : ");
        String s1 = sc.nextLine();

        System.out.println("Enter your Second String : ");
        String s2 = sc.nextLine();

        if(check(s1, s2)){
            System.out.println("Yes Equal");
        }else{
            System.out.println("Not Equal");
        }
    }
}
