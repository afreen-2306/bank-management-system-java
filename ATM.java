package banking;
import java.util.*;
public class ATM 
{
	static int balance = 50000; //stores current account balance
	static int pin=1234;
	
	//Method to withdraw money from the account
	static void withdraw(Scanner sc) 
	{
		System.out.println("Enter amount: ");
		int amount = sc.nextInt();
		System.out.println("Enter PIN: ");
		int enteredPin = sc.nextInt();
		if(enteredPin == pin)
		{
			if(amount <= balance)
			{
				balance -= amount; // Deduct amount from balance
				System.out.println("Please collect your cash: "+ amount);
			}
			else
			{
				System.out.println("Insufficient balance.");
			}
		}
		else
		{
			System.out.println("Incorrect PIN.");
		}
	}
	// Method to deposit money into the account
	static void deposit(Scanner sc) 
	{
		System.out.println("Enter amount to deposit: ");
		int amount = sc.nextInt();
		System.out.println("Enter PIN: ");
		int enteredPin = sc.nextInt();
		if(enteredPin == pin)
		{
			balance +=amount; // add amount to balance
			System.out.println("Amount depoisted successfully.");
		}
		else
		{
			System.out.println("Incorrect PIN.");
		}
	}
	// Method to Change pin in account
	static void changePin(Scanner sc) 
	{
		System.out.println("Enter  OLD PIN: ");
		int enteredPin = sc.nextInt();
		if(enteredPin == pin)
		{
			System.out.println("Enter NEW PIN: ");
			int newPin = sc.nextInt();
			pin=newPin; // changing OLD PIN into NEW PIN 
			System.out.println("PIN changed successfully.");
		}
		else
		{
			System.out.println("Incorrect PIN.");
		}
	}
	// Method to Check Balance in account
	static void checkBalance(Scanner sc)
	{
		System.out.println("Enter PIN: ");
		int enteredPin = sc.nextInt();
		if(enteredPin == pin)
		{
			System.out.println("Balance is: "+balance); // showing the balance in the account
		}
		else
		{
			System.out.println("Incorrect PIN.");
		}
	}
	public static void main (String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("\n--- ATM MENU---");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Check Balance");
			System.out.println("4. Change PIN");
			System.out.println("5. Exit");
			System.out.println("Choose option: ");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				withdraw(sc);
				break;
			case 2:
				deposit(sc);
				break;
			case 3:
				checkBalance(sc);
				break;
			case 4:
				changePin(sc);
				break;
			case 5:
				System.out.println("Thank you for using ATM.");
				return;
			default:
				System.out.println("Invalid option.");
			}

		}
	}
}
