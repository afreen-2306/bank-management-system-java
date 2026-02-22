age banking;
import java.util.*;
public class bank 
{
	public static void main(String[] args) 
	{
		int storedPin=2123;
		int eac;  //Enter ATM card
		int balance=5000;
		int amount;
		int enteredPin=0;
		int depositamount=0;
		int i,count=0;
		int newPIN;
		int re_enternewPIN;
		int OTP=1234;
		int userOTP;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.print("ENTER ATM CARD :");
		eac=sc.nextInt();
		if (eac!=0)
		{
			 System.out.println("1.WITHDRAW\t 2.DEPOSIT\n 3.CHANGE PIN\t 4.CHECK BALANCE \n 5.EXIT");
			   System.out.println("ENTER OPTION:");
			   int option=sc.nextInt();
			   switch(option)
			   {
			   case 1://withdraw
			   {
				   System.out.println("ENTER AMOUNT:");
				   amount=sc.nextInt();
				   System.out.println("Enter pin:");
				   enteredPin=sc.nextInt();
				   if(enteredPin==storedPin)
				   {
					   if(amount<=balance)
					   {
						   balance=balance-amount;
						   System.out.println("Please collect your amount "+amount);
					   }
					   else
					   {
						   System.out.println("NOT SUFFICIENT BALANCE");
					   } 
				   }
				   else
				   {
					   System.out.println("INCORRECT PIN");
				   }
			   }
			   break;
			   case 2://deposit
			   {
				   System.out.println("Enter Amount:");
				   amount=sc.nextInt();
				   System.out.println("Enter Pin:");
				   enteredPin=sc.nextInt();
				   if(enteredPin==storedPin)
				   {
					   balance=balance+amount;
					   System.out.println("Your amount is deposited: "+balance);
					   break;
				   }
				   else
				   {
							   System.out.println("INCORRECT PIN");
				   }
				}
			  break;
			 case 3://change pin
			   {
				   System.out.println("Enter the old pin:");
				   enteredPin=sc.nextInt();
				   if(enteredPin==storedPin)
				   {
					   System.out.println("Enter new pin:");
					   newPIN=sc.nextInt();
					   System.out.println("Re-enter new pin:");
					   re_enternewPIN=sc.nextInt();
					   if(newPIN==re_enternewPIN)
					   {
						   System.out.println("Enter OTP:");
						   userOTP=sc.nextInt();
						   if(OTP==userOTP)
						   {
							   storedPin=newPIN;
							   System.out.println("Successfully pin is changed");
						   }
						   else
						   {
							   System.out.println("security errors");
						   }
					   }
					   else
					   {
						   System.out.println("INCORRECT PIN");
					   }
				   }
				   else
				   {
					   System.out.println("INVALID PIN ");
				   }
			    }
			   break;
			   case 4://check balance
			   {
				   System.out.println("ENTER THE PIN:");
				   enteredPin=sc.nextInt();
					   if(enteredPin==storedPin)
					   {
						   System.out.println("Amount:"+balance);
					   }
					   else
				       {
						   System.out.println("INCORRECT PIN");  					   
				       }
			   }				  				
			   break;
			   case 5:
			   {
				   System.out.println("Thank you for using the ATM");
				   System.exit(0);
			   }
			  default:
			   {
				   System.out.println("INVALID OPTION");
			   }
		   }
	    }
		}
	}
}



