package keyChainStore;

import java.util.Scanner;

public class KeyChainMain {

	public int addKeychain(int x) {
		int keyChainNum = x;
		System.out.println("You have " + x + " keychains. How Many to Add ?");
		Scanner scan = new Scanner(System.in);
		int temp = scan.nextInt();
		keyChainNum = keyChainNum + temp;
		System.out.println("You now have " + keyChainNum + " keychains.");
		return keyChainNum;
	}

	public int removeKeychain(int y) {
		int keyChainNum = y;
		System.out.println("You have " + y + " keychains. How Many to Remove ?");
		Scanner scan = new Scanner(System.in);
		int temp = scan.nextInt();
		keyChainNum = keyChainNum - temp;
		System.out.println("You now have " + keyChainNum + " keychains.");
		return keyChainNum;
	}

}
