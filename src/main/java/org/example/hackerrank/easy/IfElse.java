package org.example.hackerrank.easy;

import java.util.Scanner;

public class IfElse {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        if ( n%2 == 1 )
            System.out.println("Weird");
        else if ( n>2 && n<5 ){
            System.out.println("Not weird");
        }
        else if (n>6 && n<20){
            System.out.println("Weird");
        }
        else if ( n > 20){
            System.out.println("Not weird");
        }
        else {
            System.out.println("Weird");
        }
    }
}
