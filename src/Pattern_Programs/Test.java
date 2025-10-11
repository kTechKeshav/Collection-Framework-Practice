package Pattern_Programs;

import java.util.Scanner;

public class Test {
    public static int n;

    public static void printA(){
        int mid = (n/2)+1;

        for(int i=1; i<=n; i++){
            for(int j=n-i; j>=1; j--){
                System.out.print("   ");
            }

            for(int j=1; j<=i; j++){
                if(j == 1 || i == mid)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }

            for(int j=1; j<i; j++){
                if(j == i-1 || i == mid)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }

    public static void printB(){
        int mid = (n/2)+1;

        for(int i=1; i<=n; i++){

            for(int j=1; j<=mid+1; j++){
                if(j==1)
                    System.out.print(" * ");

                if(i == 1 || i == mid || i == n){
                    if(j<=mid){
                        System.out.print(" * ");
                    }else{
                        System.out.print("   ");
                    }
                }else{
                    if(j == mid+1)
                        System.out.print(" * ");
                    else{
                        System.out.print("   ");
                    }
                }
            }

            System.out.println();
        }
    }

    // Incomplete
    public static void printC(){

    }

    public static void printD(){
        int mid = (n/2)+1;

        for(int i=1; i<=n; i++){

            for(int j=1; j<=mid+1; j++){
                if(j==1)
                    System.out.print(" * ");

                if(i == 1 || i == n){
                    if(j<=mid){
                        System.out.print(" * ");
                    }else{
                        System.out.print("   ");
                    }
                }else{
                    if(j == mid+1)
                        System.out.print(" * ");
                    else{
                        System.out.print("   ");
                    }
                }
            }

            System.out.println();
        }
    }

    public static void printE(){
        int mid = (n/2)+1;

        for(int i=1; i<=n; i++){

            for(int j=1; j<=mid; j++){
                if(j==1)
                    System.out.print(" * ");

                if(i == 1 || i == mid || i == n){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }

            System.out.println();
        }
    }

    public static void printF(){
        int mid = (n/2)+1;

        for(int i=1; i<=n; i++){

            for(int j=1; j<=mid; j++){
                if(j==1)
                    System.out.print(" * ");

                if(i == 1 || i == mid){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }

            System.out.println();
        }
    }

    // Incomplete
    public static void printG(){

    }

    public static void printH(){
        int mid = (n/2)+1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=mid; j++){
                if(j == 1 || j == mid || i == mid)
                    System.out.print(" * ");
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void printI(){
        int mid = (n/2)+1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=mid; j++){
                if(i == 1 || i == n || j == mid/2)
                    System.out.print(" * ");
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    // Incomplete
    private static void printJ() {

    }

    // Incomplete
    private static void printK() {

    }

    private static void printL() {
        int mid = (n/2)+1;

        for(int i=1; i<=n; i++){

            for(int j=1; j<=mid; j++){
                if(j==1)
                    System.out.print(" * ");

                if(i == n){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }

            System.out.println();
        }
    }

    // Incomplete
    private static void printM() {

    }

    private static void printN() {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j==1 || j == n || i == j)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }

    private static void printO() {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if((i==1 && j==1) || (i==1 && j==n) || (i==n && j==1) || (i==n && j==n)){
                    System.out.print("   ");
                }else{
                    if(i==1 || j==1 || j== n || i==n)
                        System.out.print(" * ");
                    else
                        System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void printP(){
        int mid = (n/2)+1;

        for(int i=1; i<=n; i++){

            for(int j=1; j<=mid+1; j++){
                if(j==1)
                    System.out.print(" * ");

                if(i == 1 || i == mid){
                    if(j<=mid){
                        System.out.print(" * ");
                    }else{
                        System.out.print("   ");
                    }
                }else if(i<=mid){
                    if(j == mid+1)
                        System.out.print(" * ");
                    else{
                        System.out.print("   ");
                    }
                }else{
                    System.out.print("   ");
                }
            }

            System.out.println();
        }
    }

    // Incomplete
    public static void printQ(){
        for(int i=1; i<=n+1; i++){
            for(int j=1; j<=n+1; j++){
                if((i==1 && j==1) || (i==1 && j==n) || (i==n && j==1) || (i==n && j==n)){
                    System.out.print("   ");
                }else{
                    if(i==1 || j==1 || j== n || i==n)
                        System.out.print(" * ");
                    else
                        System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    
    public static void printR(){
        int mid = (n/2)+1;

        for(int i=1; i<=n; i++){

            for(int j=1; j<=mid+1; j++){
                if(j==1)
                    System.out.print(" * ");

                if(i == 1 || i == mid){
                    if(j<=mid){
                        System.out.print(" * ");
                    }else{
                        System.out.print("   ");
                    }
                }else{
                    if(i>mid){
                        for(j=1; j<=mid-i; j++){
                            System.out.print("   ");
                        }
                        System.out.print(" * ");
                    }
                }
            }

            System.out.println();
        }
    }

    // Incomplete
    public static void printS(){

    }

    public static void printT(){

    }

    public static void printU(){

    }

    public static void printV(){

    }

    public static void printW(){

    }

    public static void printX(){

    }

    public static void printY(){

    }

    public static void printZ(){

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Test.n = 9;

        System.out.println("Enter your character : ");
        String s = sc.nextLine().toUpperCase();

        char ch  = s.charAt(0);

        switch(ch){
            case 'A'-> printA();
            case 'B' -> printB();
            case 'C' -> printC(); // Incomplete
            case 'D' -> printD();
            case 'E' -> printE();
            case 'F' -> printF();
            case 'G' -> printG(); // Incomplete
            case 'H' -> printH();
            case 'I' -> printI();
            case 'J' -> printJ(); // Incomplete
            case 'K' -> printK(); // Incomplete
            case 'L' -> printL();
            case 'M' -> printM(); // Incomplete
            case 'N' -> printN(); // Incomplete
            case 'O' -> printO(); // Incomplete
            case 'P' -> printP();
            case 'Q' -> printQ(); // Incomplete
            case 'R' -> printR();
            default -> System.out.println("Wrong Character");
        }
    }
}
