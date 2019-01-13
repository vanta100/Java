import java.util.Scanner;
public class Practice_5
{
	public static void main(String args[])
	{
		// //TASK 1 Write a program that performs the following operations: +, -, *, /, % (as defined by Java). Your program should first read the first number, 
		// //then the operation, and then the second number. Both numbers are integers. If, for the operation, the user entered one of the symbols shown above, 
		// //your program should perform the corresponding operation and compute the result. After that it should print the operation and the result. 
		// //If the operation is not recognized, the program should display a message about it. You do not need to do any input validation for the integers.

		// Scanner in = new Scanner(System.in);
		// System.out.print("Enter the first number: ");
		// int first = in.nextInt();
		// System.out.print("Enter the operation: ");
		// String op = in.next();
		// System.out.print("Enter the second number: ");
		// int second = in.nextInt();

		// if (op.equals("+")) 
		// {
		// 	System.out.printf("%d + %d = %d",first,second,(first+second));	
		// }
		// else if (op.equals("-")) 
		// {
		// 	System.out.printf("%d - %d = %d",first,second,(first-second));	
		// }
		// else if (op.equals("/")) 
		// {
		// 	System.out.printf("%d / %d = %d",first,second,(first/second));	
		// }
		// else if (op.equals("*")) 
		// {
		// 	System.out.printf("%d * %d = %d",first,second,(first*second));	
		// }
		// else if (op.equals("%")) 
		// {
		// 	System.out.printf("%d %% %d = %d",first,second,(first%second));
		// }
		// else
		// {
		// 	System.out.printf("This operation is not recognized.");
		// }

		// //TASK 2 Write a program that prints the divisors for each number in the range[A,B] (given be the user).

		// Scanner in = new Scanner(System.in);
		// System.out.println("This program will print the divisors of each number in the [A,B].");
		// System.out.print("Enter A: ");
		// int a = in.nextInt();
		// System.out.print("Enter B: ");
		// int b = in.nextInt();
		// System.out.print("Enter length of horizontal line: ");
		// int line = in.nextInt();
		// String dash = "";
		// for(int i = 0 ; i < line ; i++)
		// {
		// 	dash+="-";
		// }
		// System.out.println("\n"+dash);
		// if (a < b) 
		// {
		// 	for(int i = a ; i <= b ; i++)
		// 	{
		// 		String answer = i + " : ";
		// 		for (int j = 2 ; j <= i ; j++) 
		// 		{
		// 			if (i % j == 0) 
		// 			{
		// 				answer += j + ", ";
		// 			}
		// 		}
		// 		System.out.println(answer);
		// 		System.out.println(dash);
		// 	}
		// }
		// System.out.print("Bye");
		
		//TASK 3 Write a program that asks the user for 2 numbers, len and repeat, and prints a pattern of size len X as shown.

		// Scanner in = new Scanner(System.in);
		// System.out.println("This program will print a len X len pattern.");
		// System.out.print("Enter len: ");
		// int len = in.nextInt();
		// System.out.print("Enter repeat: ");
		// int repeat = in.nextInt();
		// for (int i = 0 ; i < len ; i++)//_______________________________________________ 
		// {
		// 	for (int j = 0 ; j < len ; j++) 
		// 	{
		// 		if ((i+j) % repeat == 0) 
		// 		{
		// 			System.out.print("\\");	//BEST METHOD 1 FOR TASK 3
		// 		}
		// 		else
		// 		{
		// 			System.out.print("-");
		// 		}	
		// 	}
		// 	System.out.println("");	
		// }//_____________________________________________________________________________
		//String og = "";//________________________________________________________________
		// for(int i = 0 ; i < len ; i++)
		// {
		// 	if (i % repeat == 0) 
		// 	{
		// 		og+="\\";
		// 	}
		// 	else
		// 	{
		// 		og+="-";
		// 	}
		// }
		// for (int i = 0 ; i < len ; i++) 
		// {
		// 	String output = "";				//METHOD 2 FOR TASK 3 (IT IS GARBAGE METHOD)
		// 	for(int j = 0 ; j < len ; j++)
		// 	{
		// 		if(j+i >= len)
		// 		{
		// 			if ((i+j) % repeat == 0) 
		// 			{
		// 				output+="\\";
		// 			}
		// 			else
		// 			{
		// 				output+="-";
		// 			}
		// 		}
		// 		else
		// 		{
		// 			output += og.charAt(j+i);
		// 		}
		// 	}	
		// 	System.out.println(output);
		// }//_____________________________________________________________________________
		// String pattern = "";//__________________________________________________________
		// for (int i = 0; i < (len*len) ; i++) 
		// {
		// 	if (i % repeat == 0) 
		// 	{
		// 		pattern += "\\";
		// 	}
		// 	else
		// 	{
		// 		pattern += "-";
		// 	}
		// }							//METHOD 3 FOR TASK 3
		// for (int i = 0 ; i < len ; i++)
		// {
		// 	for (int j = 0 ; j < len ; j++)
		// 	{
		// 		System.out.print(pattern.charAt(j+i));
		// 	}
		// 	System.out.println("");	
		// }
		// System.out.print("Bye");//______________________________________________________

		//TASK 4 Write a program that asks the user for a phrase and extracts and prints one per line the words in that phrase
		//At the end it should say how many they were

		Scanner in = new Scanner(System.in);
		System.out.println("This program will extract words in a phrase entered by the user. It uses spaces as separator for words (no puntctuation or anything else).");
		System.out.print("Enter the phrase: ");
		String phrase = in.nextLine();
		int counter = 0;
		int prev_ind = 0;
		System.out.println("Extracted words:");
		for(int i = 0 ; i < phrase.length() ; i++)
		{
			if(phrase.charAt(i) == ' ')
			{
				System.out.println(phrase.substring(prev_ind,i));
				prev_ind = i + 1;
				counter++;
			}
			else if(i == phrase.length()-1)
			{
				System.out.println(phrase.substring(prev_ind));
				counter++;
			}
			// else if(phrase.equals(""))
			// {

			// }
		}
		System.out.printf("There were %d words in your phrase.\nBye",counter);
	}
}