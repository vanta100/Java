import java.util.Scanner;
public class Practice_3
{
	public static void main(String args[])
	{
		// //TASK 1 Write a program that takes two real numbers a and b. Your program will need to compute |a-b| (in this order). You cant use the Math.abs function.

		// Scanner in = new Scanner(System.in);
		// System.out.print("Enter a: ");
		// double a = in.nextDouble();
		// System.out.print("Enter b: ");
		// double b = in.nextDouble();
		// if (a > b) 
		// {
		// 	double res = a - b;
		// 	System.out.printf("%.2f-%.2f = %.2f",a,b,res);
		// }
		// else if (b > a)
		// {
		// 	double res = (a - b)*-1;
		// 	System.out.printf("%.2f-%.2f = %.2f",b,a,res);
		// }

		// //TASK 2 Write a program that reads the month and the day from the user and prints whether or not someone born on that date is under the Aries astro sign.
		// //Anyone born between and including March 21 and April 19 is Aries.

		// Scanner in = new Scanner(System.in);
		// System.out.print("Enter the month: ");
		// String month = in.next();
		// System.out.print("Enter the day: ");
		// int day = in.nextInt();
		// if ((month.equals("March") || month.equals("Mar")  || month.equals("3")  || month.equals("03")) && day >= 21 && day <= 31) 
		// {
		// 	System.out.print("Aries.");
		// }
		// else if((month.equals("April") || month.equals("Apr")  || month.equals("4")  || month.equals("04")) && day <= 19 && day > 0)
		// {
		// 	System.out.print("Aries.");
		// }
		// else
		// {
		// 	System.out.print("Not Aries.");
		// }

		// //TASK 3 Write a program that continually prints a face till the user chooses to stop.

		// Scanner in = new Scanner(System.in);
		// String input = "yes";
		// while(input.equals("yes") || input.equals("YES") || input.equals("Yes"))
		// {
		// 	System.out.print("Do you want me to a draw face (yes/no)? ");
		// 	input = in.next();

		// 	if(input.equals("yes") || input.equals("YES") || input.equals("Yes"))
		// 	{
		// 		System.out.print("Did you have a good or bad day (1 for good/0 for bad)? ");
		// 		int choice = in.nextInt();
		// 		if(choice == 1)
		// 		{
		// 			System.out.println(" ------- ");
		// 			System.out.println("/       \\");
		// 			System.out.println("| o   o |");
		// 			System.out.println("|   ^   |");
		// 			System.out.println("| \\---/ |");
		// 			System.out.println(" \\-----/");
		// 		}
		// 		else
		// 		{
		// 			System.out.println(" ------- ");
		// 			System.out.println("/       \\");
		// 			System.out.println("| o   o |");
		// 			System.out.println("|   ^   |");
		// 			System.out.println("| /---\\ |");
		// 			System.out.println(" \\-----/");
		// 		}
		// 	}
		// }

		//TASK 4 Write a program that simulates back transactions for an account, when the program starts, the user is prompted to enter the amount of money in their account.
		//Next the user is repeatedly prompted for transactions. Entering positive numbers = add money , negative = subtract and 0 means no more and loop stops.

		Scanner in = new Scanner(System.in);
		System.out.println("This program simulates transactions in a bank account.");
		System.out.print("Enter your current balance (money in your account): ");
		double balance = in.nextDouble();
		double original = balance;
		double transaction = 1.0;
		while(transaction != 0)
		{
			double temp = balance;
			System.out.print("Enter transaction: ");
			transaction = in.nextDouble();
			balance += transaction;
			if(transaction != 0)
			{
				System.out.println("| Og Balance|Transaction|    Balance|");
				System.out.printf("|%11.2f|%11.2f|%11.2f|\n",temp,transaction,balance);
			}
		}
		if (original > balance) 
		{
			System.out.print("You lost money.\nBye");	
		}
		else
		{
			System.out.print("You made money or have the same as when you started.\nBye");
		}
	}
}