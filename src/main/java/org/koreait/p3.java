package org.koreait;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum;
        int first = a;
        int second = b;

        System.out.print(a + " ");
        System.out.print(b + " ");


        for(int i = 1; i <= 8; i++){

            sum = first + second;
            System.out.print(sum + " ");

            first = second;
            second = sum;

        }
    }
}
