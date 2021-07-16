/**
 * This is the child class for the Senior and Child Accounts
 * @author Aarya Shah
 * @course ICS4UC
 * @date 2020/10/02
 */
public class SeniorChildAccount extends BankAccount {
	//Attributes
	protected double interestRate = 0.02;

	public SeniorChildAccount(int num, String name, double startMoney) {
		super(num, name, startMoney);
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
	public String Transactions() {
		transactions++;
		return "$" + this.amountSent + "has been sent by" + this.sender + "to" + this.reciever;
	}

}