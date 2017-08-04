package keyChainStore;

import java.util.Scanner;

public class ExecutionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int runTime = 0;
		int count;
		KeyChainMain obj = new KeyChainMain();
		System.out.println("Welcome to Hitesh's Key Chain Store..!!");
		while (i == 0) {
			System.out.println("1.Add Keychain to Order");
			System.out.println("2.Remove Keychain from Order");
			System.out.println("3.View current Order");
			System.out.println("4.Checkout");
			Scanner scan = new Scanner(System.in);
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				count = obj.addKeychain(runTime);
				runTime = count;
				break;

			case 2:
				count = obj.removeKeychain(runTime);
				runTime = count;
			default:
				System.out.println("Enter Valid choice number !");
			}
		}
	}

}
