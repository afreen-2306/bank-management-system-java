package banking;
import java.util.*;
public class ATM 
{
	static int balance = 50000;
	static int pin=1234;
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
				balance -= amount;
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
	static void deposit(Scanner sc) 
	{
		System.out.println("Enter amount to deposit: ");
		int amount = sc.nextInt();
		System.out.println("Enter PIN: ");
		int enteredPin = sc.nextInt();
		if(enteredPin == pin)
		{
			balance +=amount;
			System.out.println("Amount depoisted successfully.");
		}
		else
		{
			System.out.println("Incorrect PIN.");
		}
	}
	static void changePin(Scanner sc) 
	{
		System.out.println("Enter  OLD PIN: ");
		int enteredPin = sc.nextInt();
		if(enteredPin == pin)
		{
			System.out.println("Enter NEW PIN: ");
			int newPin = sc.nextInt();
			pin=newPin;
			System.out.println("PIN changed successfully.");
		}
		else
		{
			System.out.println("Incorrect PIN.");
		}
	}
	static void checkBalance(Scanner sc)
	{
		System.out.println("Enter PIN: ");
		int enteredPin = sc.nextInt();
		if(enteredPin == pin)
		{
			System.out.println("Balance is: "+balance);
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
