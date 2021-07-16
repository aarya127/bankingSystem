/**
 * This program will track transactions and will act in each scenario
 * @author Aarya Shah
 * @course ICS4UC
 * @date 2020/10/02
 */
public class BankAccount {
	//Attributes
	protected String typeOfAccount = "";
	protected String name = "";
	protected int accountNumber = 0;
	protected double initialBalance;
	protected int transactions = 0;
	protected double currentBalance;
	protected double interestRate;
	protected double interestEarned;
	public double amountSent;
	public String sender = "";
	public String reciever = "";

	// CONSTRUCTOR
	public BankAccount(int num, String name, double startMoney) {
		this.accountNumber = num; 
		this.name = name;
		this.initialBalance = startMoney;
	}

	public BankAccount(String line) {
		// Assume CSV delimited data
		String[] data = line.split(",");

		this.accountNumber = Integer.parseInt(data[0]);
		this.name = data[1];
		this.initialBalance = Double.parseDouble(data[2]);
	}

	/**
	 * Convert to String - CSV delimited format
	 */
	public String toString() {
		String result = this.accountNumber+","+this.name+","+this.initialBalance;
		return result;
	}
	/**
	 * Depositing money into the account
	 * @param depositAmount
	 * @return
	 */
	public double deposit(double depositAmount) {
		this.initialBalance = this.initialBalance + depositAmount;
		return this.initialBalance;
	}
	/**
	 * Depositing money into the account
	 * @param withdrawalAmount
	 * @return
	 */
	public double withdrawal(double withdrawalAmount) {
		this.initialBalance = this.initialBalance - withdrawalAmount;
		return this.initialBalance;
	}
	/**
	 * Calculating the balance including interest
	 */
	public String addingInterest() {
		this.interestEarned = this.initialBalance * this.interestRate;
		this.currentBalance = this.interestEarned + initialBalance;
		return "$" + this.currentBalance + "is your current balance with interest";
	}
	/**
	 * Depositing money into the account
	 * @param withdrawalAmount
	 * @return
	 */
	public String transactions() {
		this.transactions++;
		return "$" + this.amountSent + "has been sent by" + this.sender + "to" + this.reciever;
	}

}