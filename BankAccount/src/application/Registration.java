package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Registration {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String holder;
		int number;
		char yesOrNo;
		double initialDeposit = 0;

		System.out.print("Enter account holder: ");
		holder = sc.nextLine();

		System.out.print("Enter account number: ");
		number = sc.nextInt();

		System.out.print("Is there na initial deposit (y/n)? ");
		yesOrNo = sc.next().charAt(0);

		if (yesOrNo == 'y' || yesOrNo == 'Y') {
			System.out.print("Enter initial deposit value: ");
			initialDeposit = sc.nextDouble();
			Account account = new Account(number, holder, initialDeposit);
			System.out.print("\n"+ account.Print());

		} else if (yesOrNo == 'n' || yesOrNo == 'N') {
			Account account = new Account(number, holder);
			System.out.print(account.Print());

		} else {
			System.out.print("Digite apenas os caracteres (y/n)! ");

		}
		Account account = new Account(number, holder, initialDeposit);
		System.out.print("\nEnter a deposit value: ");
		initialDeposit = sc.nextDouble();
		account.setAddBalance(initialDeposit);
		System.out.print("\n"+ account.Print1());

		System.out.print("\nEnter a withdraw value: ");
		initialDeposit = sc.nextDouble();
		account.getRemoveBalance(initialDeposit);
		System.out.print("\n"+ account.Print1());
//		System.out.print("");
		sc.close();
		
	}

}
