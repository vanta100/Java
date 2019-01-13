import java.util.Scanner;
public class Practice_2
{
	public static void main(String args[])
	{
		// //TASK 1 Write a program that asks the user for their full name given in the format first last

		// Scanner in = new Scanner(System.in);
		// System.out.print("Please enter your first, middle and last name: ");
		// String name = in.nextLine();
		// int space = name.indexOf(" ");
		// String first = name.substring(0,space);
		// String mid_last = name.substring(space+1);
		// int space2 = mid_last.indexOf(" ");
		// String middle = mid_last.substring(0,space2);
		// String last = mid_last.substring(space2+1);
		// first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
		// middle = middle.substring(0,1).toUpperCase() + middle.substring(1).toLowerCase();
		// last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();
		// char first_init = first.charAt(0);
		// char mid_init = middle.charAt(0);
		// char last_init = last.charAt(0);
		// System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		// System.out.printf("|%-15s|%-15s|%-15s|%c.%c.%c.|\n",last,middle,first,first_init,mid_init,last_init);
		// System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		// //TASK 2 Write a program that reads a string from the user. If it is a valid wikipedia webpage, it 
		// //extracts and prints the topic for that page. If it is not a valid address it prints the message Not a valid wikipedia webpage address.

		// Scanner in = new Scanner(System.in);
		// String wiki = "https://en.wikipedia.org/wiki/"; 
		// System.out.println("This program will extract the topic from a valid Wikipedia webpage address.");
		// System.out.print("Enter a web address: ");
		// String input = in.nextLine();
		// int check = input.indexOf("https://en.wikipedia.org/wiki/");
		// String topic = "";
		// if (check != -1) 
		// {
		// 	topic = input.substring(wiki.length());
		// 	System.out.printf("Topic: %s\n",topic);
		// 	System.out.print("Bye");
		// }
		// else
		// {
		// 	System.out.println("Not a valid wikipedia webpage address.");
		// 	System.out.println("Bye");
		// }

		// //TASK 3 The problem gives the pseudocode for swapping two letters in a string given the indexes of those letters.

		// Scanner in = new Scanner(System.in);
		// System.out.print("Enter the string: ");
		// String input = in.next();
		// System.out.print("Enter the first index: ");
		// int index1 = in.nextInt();
		// System.out.print("Enter the second index: ");
		// int index2 = in.nextInt();
		// char ind_1 = input.charAt(index1);
		// char ind_2 = input.charAt(index2);
		// if (index1 <= index2) 
		// {
		// 	input = input.substring(0,index1) + ind_2 + input.substring(index1+1,index2) + ind_1 + input.substring(index2+1);	
		// }
		// else
		// {
		// 	input = input.substring(0,index2) + ind_1 + input.substring(index2+1,index1) + ind_2 + input.substring(index1+1);
		// }
		// System.out.print(input);

		//TASK 4 A program that reads a string and formats it as a phone number. First it should check if the string has 10 symbols.

		Scanner in = new Scanner(System.in);
		System.out.println("This program will format a string as a phone number.");
		System.out.print("Enter the number: ");
		String pho_num = in.next();
		if (pho_num.length() == 10) 
		{
			pho_num = '(' + pho_num.substring(0,3) + ')' + pho_num.substring(3,6) + '-' + pho_num.substring(6);
			System.out.print("Formatted number: " + pho_num + "\n");
		}
		else
		{
			System.out.print("Not a valid number. Please enter another one: ");
			pho_num = in.next();
			if (pho_num.length() == 10) 
			{
				pho_num = '(' + pho_num.substring(0,3) + ')' + pho_num.substring(3,6) + '-' + pho_num.substring(6);
				System.out.print("Formatted number: " + pho_num + "\n");
			}
			else
			{
				System.out.println("You missed your second try! No more chances!");
			}
		}
		System.out.print("Bye.");		
	}
}