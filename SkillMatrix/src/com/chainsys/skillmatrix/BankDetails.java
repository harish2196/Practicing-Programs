package com.chainsys.skillmatrix;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankDetails {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        String accountNumber;
        String branchName = "Kotak Mahindra Bank";
        String IFSC;
        float balance = 10000;
        float withdrawAmount = 0, depositAmount = 0;
        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<String> accnoList = new ArrayList<>();
        ArrayList<String> ifscList = new ArrayList<>();

        System.out.println("Enter a name:");
        name = sc.nextLine();
        String nameRegex = "^[a-zA-Z]{1,50}$";

        while (!name.matches(nameRegex)) {
            System.out.println("Please Re-enter your name");
            name = sc.nextLine();
        }
        nameList.add(name);

        System.out.println("Enter an accno:");
        accountNumber = sc.next();
        String numberRegex = "^[1-9]\\d{11}$";

        while (!accountNumber.matches(numberRegex)) {
            System.out.println("Please Re-enter your accno");
            accountNumber = sc.next();
        }
        accnoList.add(accountNumber);

        System.out.println("Enter an IFSC:");
        IFSC = sc.next();
        String ifscRegex = "^[A-Z]{4}0[0-9]{6}$";

        while (!IFSC.matches(ifscRegex)) {
            System.out.println("Please Re-enter your IFSC code:");
            IFSC = sc.next();
        }
        ifscList.add(IFSC);

        // Check user 
        System.out.println("Enter a name:");
        while (true) {
            name = sc.next();
            if (!name.matches(nameRegex)) {
                System.out.println("Invalid format. Please Re-enter your name.");
                continue;
            }
            if (!nameList.contains(name)) {
                System.out.println("Invalid User");
            } else {
                System.out.println("Success");
                break;
            }
        }

        System.out.println("Enter an accno:");
        while (true) {
            accountNumber = sc.next();
            if (!accountNumber.matches(numberRegex)) {
                System.out.println("Invalid format. Please Re-enter your accno.");
                continue;
            }
            if (!accnoList.contains(accountNumber)) {
                System.out.println("Invalid User. Please Re-enter your accno.");
            } else {
                System.out.println("Success");
                break;
            }
        }

        System.out.println("Enter an IFSC:");
        while (true) {
            IFSC = sc.next();
            if (!IFSC.matches(ifscRegex)) {
                System.out.println("Invalid format. Please Re-enter your IFSC:");
                continue;
            }
            if (!ifscList.contains(IFSC)) {
                System.out.println("Invalid User. Please Re-enter your IFSC:");
            } else {
                System.out.println("Success");
                break;
            }
        }

        System.out.println("Enter an option W or D:");
        char option = sc.next().toLowerCase().charAt(0);

        switch (option) {
            case 'w':
                System.out.println("Enter an amount to withdraw:");
                try {
                    withdrawAmount = sc.nextFloat();
                    if (withdrawAmount < 0) {
                        System.out.println("Amount cannot be negative.");
                    } else if (withdrawAmount > balance) {
                        System.out.println("Insufficient funds!");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("After withdrawal: " + balance);
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid numeric value.");
                    sc.next(); 
                }
                break;

            case 'd':
                System.out.println("Enter an amount to deposit:");
                try {
                    depositAmount = sc.nextFloat();
                    if (depositAmount < 0) {
                        System.out.println("Amount cannot be negative.");
                    } else {
                        balance += depositAmount;
                        System.out.println("After deposit: " + balance);
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid numeric value.");
                    sc.next(); 
                }
                break;

            default:
                System.out.println("Invalid option. Please choose 'w' for withdrawal or 'd' for deposit.");
                break;
        }

        sc.close();
    }
}
