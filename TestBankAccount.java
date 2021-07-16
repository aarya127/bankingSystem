/**
 * This is the test program for our OOP Bank Account
 * @author Aarya Shah
 * @course ICS4UC
 * @date 2020/10/02
 */
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestBankAccount {

	public static void main(String[] args) throws Exception {
		// Create array to hold accounts
		BankAccount[] accounts = new BankAccount[100];
		int numAccounts = 0;

		// Read Account from file
		Scanner sc = new Scanner(new FileReader("accountInfo.txt"));
		while (sc.hasNext()) {
			// CSV delimited data
			String line = sc.nextLine();
			String data[] = line.split(",");

			// Create Accounts and objects with this data
			accounts[numAccounts] = new SavingsAccount(Integer.parseInt(data[0]), data[1], Double.parseDouble(data[2]));	
			numAccounts++;
			accounts[numAccounts] = new ChequingAccount(Integer.parseInt(data[0]), data[1], Double.parseDouble(data[2]));	
			numAccounts++;
			accounts[numAccounts] = new SeniorChildAccount(Integer.parseInt(data[0]), data[1], Double.parseDouble(data[2]));	
			numAccounts++;
			
		}
		sc.close();
		System.out.println("Read "+numAccounts+" accounts");
		System.out.println(numAccounts);

		// Write it back out to file
		for (int i=0; i<numAccounts; i++) {
			System.out.println(accounts[i]);
		}

	}

}