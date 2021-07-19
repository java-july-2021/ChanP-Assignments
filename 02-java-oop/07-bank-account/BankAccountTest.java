public class BankAccountTest {
    public static void main(String[] args) {
		BankAccount BA = new BankAccount();
		BA.depositMoney(150, "checking");
		BA.depositMoney(25.84, "savings");
		BA.displayAccountBalance();
		System.out.println(BankAccount.totalHoldings);
		BA.withdrawMoney(75, "checking");
		BA.withdrawMoney(15, "savings");
		BA.displayAccountBalance();
		System.out.println(BankAccount.totalHoldings);
	}
}