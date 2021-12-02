package application;

import java.util.Scanner;

import model.entities.Account;
import model.exception.BusinessEception;

public class Program {

public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double whithdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, whithdrawLimit);
		
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		
		try {
			acc.withdraw(sc.nextDouble());
			System.out.printf("New balance: %.2f", acc.getBalance());
		}
		catch(BusinessEception e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}