package com.chainsys.skillmatrix;

import java.util.Scanner;

public class CommonPrefix {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of strings:");
        int n = scanner.nextInt();
        String[] strings = new String[n];

        System.out.println("Enter a string:");
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.next();
        }

        System.out.println("Longest common prefix: " + longestCommonPrefix(strings));
        scanner.close();
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return findLongestCommonPrefix(strs);
                }
            }
        }

        return prefix;
    }

    public static String findLongestCommonPrefix(String[] strs) {
        String longestPrefix = "";
        for (int i = 0; i < strs.length; i++) {
            for (int j = i + 1; j < strs.length; j++) {
                String prefix = strs[i];
                while (strs[j].indexOf(prefix) != 0) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                    if (prefix.isEmpty()) {
                        break;
                    }
                }
                if (prefix.length() > longestPrefix.length()) {
                    longestPrefix = prefix;
                }
            }
        }
        return longestPrefix;
    }
}