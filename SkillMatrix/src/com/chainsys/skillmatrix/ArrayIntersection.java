package com.chainsys.skillmatrix;

import java.util.Scanner;

public class ArrayIntersection {

    public static void main(String[] args) {
        int n, n1, i, j;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in first array:");
        n = scanner.nextInt();
        int[] array1 = new int[n];
        System.out.println("Enter the elements:");
        for (i = 0; i < n; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.println("Enter the number of elements in second array:");
        n1 = scanner.nextInt();
        int[] array2 = new int[n1];
        System.out.println("Enter the elements:");
        for (i = 0; i < n1; i++) {
            array2[i] = scanner.nextInt();
        }

        System.out.println("Intersection of two arrays:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n1; j++) {
                if (array1[i] == array2[j]) {
                    System.out.print(array1[i] + " ");
                    break;
                }
            }
        }
scanner.close();
    }
}
