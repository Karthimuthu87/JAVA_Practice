package javaAssessment;

public class Accountexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount account = new BankAccount("123456", "Karthi", 1000);
		System.out.println("Account Holdername :"+ account.getaccountholdername());
		System.out.println("Account Number  :"+ account.getaccountnumber());
		System.out.println("Balance :"+ account.getBalance());
		
		
		
		account.deposit(500.0);
		account.withdraw(200.0);
		account.withdraw(2000.0);
		
	}

}
