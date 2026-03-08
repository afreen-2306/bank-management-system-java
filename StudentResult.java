package banking;
import java.util.*;
public class StudentResult 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Student Name: ");
		String name = sc.nextLine();
		System.out.println("Enter Roll Number: ");
		int rollNo = sc.nextInt();
		int m1;
		do{
			System.out.println("Enter marks for Subject 1: ");
			m1=sc.nextInt();
		}while (m1 <0 || m1 >100);
		int m2;
		do{
			System.out.println("Enter marks for Subject 2: ");
			m2=sc.nextInt();
		}while(m2 <0 || m2>100);
		int m3;
		do{
			System.out.println("Enter marks for Sybject 3: ");
			m3=sc.nextInt();
		}while (m3 <0 || m3 >100);
		int total = calculateTotal(m1, m2, m3);
		double average = calculateAverage(total);
		String grade= calculateGrade(average);
		String result = calculateResult(grade);
		System.out.println("\n===== STUDENT RESULT =====");
		System.out.println("\n--- Student Result---");
		System.out.println("Name : "+name);
		System.out.println("Roll NO: "+rollNo);
		System.out.println("Total Marks: "+total);
		System.out.println("Average: "+average);
		System.out.println("Grade: "+grade);
		System.out.println("Result: "+result);
		System.out.println("==============================");
	}
		static int calculateTotal(int m1, int m2, int m3)
		{
			return m1+m2+m3;
		}
		static double calculateAverage(int total)
		{
			return total/3.0;
		}
		static String calculateGrade(double average)
		{
			if(average >=75)
				return "A";
			else if(average >=60)
				return "B";
			else if(average >=40)
				return "C";
			else 
				return "F";
		}
		static String calculateResult(String grade)
		{
			if(grade.equals("F"))
				return "Fail";
			else
				return "Pass";
		}
}