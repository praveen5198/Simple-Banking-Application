package bankapplication;

import java.util.Scanner;

public class bankingApplication {

	public static void main(String[] args) {
		BankAccount obj = new BankAccount("PRAVEEN","BANK0013");
		obj.showMenu();

	}

}
class BankAccount{
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
//	Account details
	
	public BankAccount(String cname,String cid)
	{
		customerName = cname;
		customerId = cid;
		
		
	}
	
//	Deposit
	
	void deposit(int amount) 
	{
		if(amount!=0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	
//	withdraw
	
	void withDraw (int amount)
	{
		if(amount!=0)
		{
			balance = balance - amount;
			previousTransaction = - amount;
	}
	}
	
//	Previous Transaction
	
	void getPreviousTransaction () 
	{
		if(previousTransaction > 0)
		{
			System.out.println("Deposited  " + previousTransaction);
		}
		else if(previousTransaction < 0)
		{
			System.out.println("Withdraw   " + Math.abs(previousTransaction));
		}
		
		else
		{
			System.out.println("No transaction Occured");
		}
	}
	
	void showMenu () 
	{
		char option = '\0';
		Scanner s = new Scanner (System.in);
		
		System.out.println("Welcome " + customerName);
		System.out.println("Your ID " + customerId);
		System.out.println("\n");
		
		System.out.println("A : Check Your Balance");
		System.out.println("B : Deposit");
		System.out.println("C : Withdraw");
		System.out.println("D : Previous Transaction");
		System.out.println("E : Your Details");
		System.out.println("F : Exit Option");
		
		do 
		{
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Enter Your Option");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			option = s.next().charAt(0);
			System.out.println("\n");
			
			
			switch (option) {
			case 'A':
				System.out.println("---------------------------------------------------");
			    System.out.println("Balance  = " +balance);
			    System.out.println("---------------------------------------------------");
			    System.out.println("\n");
				break;
				
				
			case 'B':
			System.out.println("---------------------------------------------------");
		    System.out.println("Enter an amount to deposit ");
		    System.out.println("---------------------------------------------------");
		    int amount = s.nextInt();
		    deposit(amount);
		    System.out.println("Your Amount Successfully Deposited");
		    System.out.println("\n");
			break;
			
			
			case 'C':
				System.out.println("---------------------------------------------------");
				System.out.println("Enter an amount to withdraw");
				System.out.println("---------------------------------------------------");
				int amount2  = s.nextInt();
				withDraw(amount2);
				System.out.println("\n");
				break;
				
			case 'D':
				System.out.println("---------------------------------------------------");
				getPreviousTransaction();
				System.out.println("---------------------------------------------------");
				System.out.println("\n");
				break;
				
			case 'E':
				System.out.println("---------------------------------------------------");
				System.out.println("Your Details");
				System.out.println("Name = "+customerName);
				System.out.println("Your ID = "+ customerId);
				System.out.println("---------------------------------------------------");
				System.out.println("\n");
				break;
				
				
			case 'F':
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				break;
				
			default:
				System.out.println(" Invalid Option!! Please Enter Correct Option..........");
				break;
			}
		}
		
		while(option != 'F');
		{
			System.out.println("Thank You....!");
		}
		
	}
	
	
}