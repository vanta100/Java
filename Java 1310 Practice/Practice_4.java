import java.util.Scanner;
public class Practice_4
{
	public static void main(String args[])
	{
		// //TASK 1 This program asks the user for 2 integers A and B and computes: 9 + (x+3)/2 for all x between A and B INCLUSIVE (includes A and B)

		// Scanner in = new Scanner(System.in);
		// System.out.println("This program will print the values of the function:\n 	9 + (x+3)/2 for A <= x <= B");
		// System.out.print("Enter value for A: ");
		// double a = in.nextDouble();
		// System.out.print("Enter value for B: ");
		// double b = in.nextDouble();
		// if (a <= b) {
		// 	double range = b - a;
		// 	for(double x = a ; x <= (a+range) ; x++)
		// 	{
		// 		double result = 9 + (x+3)/2;
		// 		System.out.printf("9 + (%.0f+3)/2 = %.2f\n",x,result);

		// 	}
		// }
		// System.out.print("Bye.");

		// //TASK 2 This program will take a user inputted string and print it in reverse.

		// Scanner in = new Scanner(System.in);
		// System.out.println("This program will create a string with letters in reversed order.");
		// System.out.print("Enter a string: ");
		// String input = in.nextLine();
		// String reverse = "";
		// for (int i = input.length() - 1 ; 0 <= i ; i-- ) 
		// {
		// 	reverse += input.charAt(i);
		// }
		// System.out.print("The reversed string is: " + reverse + "\nBye");

		// //TASK 3 Write a program that reads 3 integers: start, end and step. It should print all the numbers starting with start and up to end in steps of step.

		// Scanner in = new Scanner(System.in);
		// System.out.println("This program will be counting by a certain step.\nEnter what you want the start, end and step values to be.");
		// System.out.print("Start is: ");
		// int start = in.nextInt();
		// System.out.print("End is: ");
		// int end = in.nextInt();
		// System.out.print("Step is: ");
		// int step = in.nextInt();
		// System.out.print("The sequence is: ");
		// for (int i = start ; i <= end ; i+=step) 
		// {
		// 	System.out.printf("%d ",i);
		// }
		// System.out.print("\nBye");

		// //TASK 4 The program should read 3 integers: start, end and step. After that, it should let the user enter the numbers (by hitting ENTER after each one)
		// //and it will verify if they are correct.

		// Scanner in = new Scanner(System.in);
		// System.out.println("This program will be counting by a certain step.\nEnter what you want the start, end and step values to be.");
		// System.out.print("Start is: ");
		// int start = in.nextInt();
		// System.out.print("End is: ");
		// int end = in.nextInt();
		// System.out.print("Step is: ");
		// int step = in.nextInt();
		// System.out.printf("Enter the numbers (starting with %d): ",start);
		// for (int i = start ; i <= end ; i+=step) 
		// {
		// 	System.out.print("Enter your answer: ");
		// 	int input = in.nextInt();
		// 	if (input == i) 
		// 	{
		// 		System.out.println("Correct");
		// 	}
		// 	else
		// 	{
		// 		System.out.printf("Wrong. The correct answer was: %d\n",i);
		// 	}
		// }
		// System.out.print("Bye");

		//TASK 5 Write a program that reads an integer and displays, using asterisks, a filled and hollow square, placed next to each other.
		//if user enters a number smaller than 2 and program does not work it is ok.

		// Scanner in = new Scanner(System.in);
		// System.out.println("This program will display a full and an empty square given the side length.");
		// System.out.print("Enter the side length: ");
		// int length = in.nextInt();
		// String solid = "";//__________________________________________________________________________________________
		// String hollow = "";
		// for (int i = 0 ; i < length ; i++)
		// {
		// 	solid+="*";
		// 	if (i > 0 && i < (length - 1)) 
		// 	{
		// 		hollow+=" ";	
		// 	}
		// 	else
		// 	{
		// 		hollow+="*";
		// 	}
		// }
												//METHOD 1 FOR TASK 5
		// for (int i = 0; i < length ; i++) 
		// {
		// 	if (i > 0 && i < (length - 1)) 
		// 	{
		// 		System.out.println(solid + " " + hollow);		
		// 	}
		// 	else
		// 	{
		// 		System.out.println(solid + " " + solid);	
		// 	}
		// }//___________________________________________________________________________________________________________

		// for (int i = 0 ; i < length ; i++)//__________________________________________________________________________ 
		// {
		// 	for (int j = 0 ; j < length ; j++ ) 
		// 	{
		// 		System.out.print("*");		
		// 	}
		// 	System.out.print(" ");
		// 	for (int k = 0 ; k < length ; k++)								//METHOD 2 FOR TASK 5
		// 	{		
		// 		if (k > 0 && k < (length-1) && i > 0 && i < (length-1)) 
		// 		{
		// 			System.out.print(" ");	
		// 		}
		// 		else
		// 		{
		// 			System.out.print("*");
		// 		}
		// 	}
		// 	System.out.println("");	
		// }//___________________________________________________________________________________________________________

		// for (int i = 0 ; i < length ; i++)//_____________________________________________________________________________
		// {
		// 	String solid = "";
		// 	String hollow = "";
		// 	for (int j = 0 ; j < length ; j++ ) 
		// 	{
		// 		solid+="*";
		// 		if (j > 0 && j < (length - 1)) 
		// 		{
		// 			hollow+=" ";	
		// 		}
		// 		else
		// 		{
		// 			hollow+="*";
		// 		}	
		// 	}													//METHOD 3 FOR TASK 5
		// 	if(i > 0 && i < (length-1))
		// 	{
		// 		System.out.println(solid+" "+hollow);
		// 	}
		// 	else
		// 	{
		// 		System.out.println(solid+" "+solid);
		// 	}
		// }//______________________________________________________________________________________________________________
		// System.out.print("Bye");

		// //TASK 6 Write a program that asks the user for a phrase and encodes it. In order to encode it, replace each letter with the corresponding one in the encoding string.

		// Scanner in = new Scanner(System.in);
		// String reg = "abcdefghijklmnopqrstuvwxyz";
		// String encrypt = "qwertyuioplkjhgfdsazxcvbnm";
		// System.out.println("Enter a phrase and I will encode it: ");
		// String input = in.nextLine();
		// String encoded = "";
		// for (int i = 0; i < input.length() ; i++) 
		// {
		// 	boolean check = false;
		// 	char letter = input.charAt(i);
		// 	if (Character.isUpperCase(letter)) 
		// 	{
		// 		letter = Character.toLowerCase(letter);
		// 		check = true;
		// 	}
		// 	int index = reg.indexOf(letter);
		// 	if (index == -1) 
		// 	{
		// 		encoded+=letter;	
		// 	}
		// 	else if (check) 
		// 	{
		// 		encoded+=Character.toUpperCase(encrypt.charAt(index));
		// 	}
		// 	else
		// 	{
		// 		encoded+=encrypt.charAt(index);
		// 	}
		// }
		// System.out.print("The encoded phrase is: \n" + encoded + "\nBye");

		//TASK 7 This program will read user inputted string and count the vowels and siplay the number of vowels and distinct vowels.

		Scanner in = new Scanner(System.in);
		String vowels = "ioueay";
		System.out.println("Enter a phrase. I will count the vowels");
		String input = in.nextLine();
		int counter = 0;
		int dis_counter = 0;
		String distinct = "";
		for (int i = 0 ; i < input.length() ; i++)
		{
			char letter = input.charAt(i);
			if (vowels.indexOf(Character.toLowerCase(letter)) != -1) 
			{
				counter++;
			}
			if (vowels.indexOf(Character.toLowerCase(letter)) != -1 && distinct.indexOf(Character.toLowerCase(letter)) == -1) 
			{
				dis_counter++;
				distinct+=Character.toLowerCase(letter);
			}	
		}
		System.out.printf("There are %d distinct vowels in \"%s\".\n",dis_counter,input);
		System.out.printf("There are %d total vowels in \"%s\".",counter,input);
	}
}