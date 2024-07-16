package com.chainsys.problem3;

import java.util.Scanner;

public class CheckBalance {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BankA bankA=new BankA();
		BankB bankB=new BankB();
		BankC bankC=new BankC();
		System.out.println("Enter an to check balance(a, b & c):");
		char option=scanner.next().charAt(0);

		switch(option) {
		case 'a':
			System.out.println("In BankA your balance is: " + bankA.getBalance());
			break;
		case 'b':
			System.out.println("In BankB your balance is: " + bankB.getBalance());
			break;
		case 'c':
			System.out.println("In BankC your balance is: " + bankC.getBalance());
			break;
		default:
			System.out.println("Invalid Option!");
		}

	}

}
