package banking;
import java.util.*;
public class bank {

	public static void main(String[] args) 
	{
		int pin=2123; //ATM pin
		int option; 
		int eac;  //Enter ATM card
		int balance=5000;//Enter amount
		int amount;//user input
		int PIN=0;//Enter pin
		int depositamount=0;
		int i,count=0;
		int newPIN;//new pin
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
			 System.out.println("1.WITHDRAW\t 2.DEPOSIT\n 3.CHANGE PIN\t 4.CHECK BALANCE");
			   System.out.println("ENTER OPTION:");
			   option=sc.nextInt();
			   switch(option)
			   {
			   case 1://withdraw
			   {
				   System.out.println("ENTER AMOUNT:");
				   amount=sc.nextInt();
				   System.out.println("Enter pin:");
				   PIN=sc.nextInt();
				   if(PIN==pin)
				   {
					   if(amount<=balance)
					   {
						   balance=balance-amount;
						   System.out.println("PLEASE COLLECT YOUR AMOUNT"+amount);
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
				   PIN=sc.nextInt();
				   if(PIN==pin)
				   {
					   balance=balance+amount;
					   System.out.println("YOUR AMOUNT IS DEPOSITED: "+balance);
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
				   PIN=sc.nextInt();
				   if(PIN==pin)
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
							   pin=newPIN;
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
				   PIN=sc.nextInt();
					   if(PIN==pin)
					   {
						   System.out.println("Amount:"+balance);
					   }
					   else
				       {
						   System.out.println("INCORRECT PIN");  					   
				       }
			   }				  				
			   break;
			  default:
			   {
				   System.out.println("INVALID OPTION");
			   }
		   }
	    }
		}
	}
}
