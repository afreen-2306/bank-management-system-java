package banking;
import java.util.*;
public class bank {

	public static void main(String[] args) 
	{
		int pin=2123; //ATM pin
		int op;   //Option
		int eac;  //Enter ATM card
		int ea=5000;//Enter amount
		int ul;//user input
		int ep=0;//Enter pin
		int da=0;//deposit amount
		int i,count=0;
		int np;//new pin
		int rep;
		int OTP=1234;
		int uotp;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.print("ENTER ATM CARD :");
		eac=sc.nextInt();
		if (eac!=0)
		{
			 System.out.println("1.WITHDRAW\t 2.DEPOSIT\n 3.CHANGE PIN\t 4.CHECK BALANCE");
			   System.out.println("ENTER OPTION:");
			   op=sc.nextInt();
			   switch(op)
			   {
			   case 1://withdraw
			   {
				   System.out.println("ENTER AMOUNT:");
				   ul=sc.nextInt();
				   System.out.println("Enter pin:");
				   ep=sc.nextInt();
				   if(ep==pin)
				   {
					   if(ul<=ea)
					   {
						   ea=ea-ul;
						   System.out.println("PLEASE COLLECT YOUR AMOUNT");
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
				   da=sc.nextInt();
				   System.out.println("Enter Pin:");
				   ep=sc.nextInt();
				   if(ep==pin)
				   {
					   ea=ea+da;
					   System.out.println("YOUR AMOUNT IS DEPOSITED: "+ea);
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
				   ep=sc.nextInt();
				   if(ep==pin)
				   {
					   System.out.println("Enter new pin:");
					   np=sc.nextInt();
					   System.out.println("Re-enter new pin:");
					   rep=sc.nextInt();
					   if(np==rep)
					   {
						   System.out.println("Enter OTP:");
						   uotp=sc.nextInt();
						   if(OTP==uotp)
						   {
							   pin=np;
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
				   ep=sc.nextInt();
					   if(ep==pin)
					   {
						   System.out.println("Amount:"+ea);
					   }
					   else
				       {
						   System.out.print("INCORRECT PIN");  					   
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