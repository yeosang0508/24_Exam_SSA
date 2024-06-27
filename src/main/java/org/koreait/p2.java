package org.koreait;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int a = 0;

        for (int i = n; i > 0; i--) {

            for (int k = a; k > 0; k--) {
                System.out.print(" ");
            }

            for (int j = n - a; j >= 1; j--) {
                System.out.print(j + " ");
            }
            a++;


            System.out.println();
        }

    }
}
