package javaAssessment;

public class BankAccount {
	
	public String accountNumber;
	public String accountholdername;
	private double balance;
	
		
	public BankAccount(String accountNumber,String accountholdername,double balance)
	{
		this.accountNumber = accountNumber;
		this.accountholdername = accountholdername;
		this.balance= balance;
				
	}
	
	public void deposit(double amount)
	{
		balance = balance+amount;
		System.out.println(amount+ "deposite."+ "New Balance:"+ balance);
	}
	
	public void withdraw(double amount)
	{
		if (balance>=amount)
		{
			balance=balance-amount;
			System.out.println(amount+"withdrawn. New Balance:" + balance);
			
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
	
	public double getBalance()
	{
		return balance;
	}
	public String getaccountholdername()
	{
		return accountholdername;
	}
	public String getaccountnumber()
	{
		return accountNumber;
	}
	
		
	}


