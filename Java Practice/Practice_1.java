import java.util.Scanner;

public class Practice_1
{
	public static void main(String args[])
	{
		// //TASK 1 Print a Face

		// System.out.println(" ------- ");
		// System.out.println("/       \\");
		// System.out.println("| o   o |");
		// System.out.println("|   ^   |");
		// System.out.println(" \\  -  /");
		// System.out.println("  ----- ");

		// //TASK 2 The program should ask the user to enter the current year, the year when robots will 
		// //take over the World and their birthday year. Next, the program will compute and print the information.

		// Scanner in = new Scanner(System.in);
		// System.out.print("Enter the current year: ");
		// int curr_year = in.nextInt();
		// System.out.print("Enter the year when robots take over the world: ");
		// int dom_year = in.nextInt();
		// System.out.print("Enter your birthday year: ");
		// int birth_year = in.nextInt();
		// int calc = dom_year - curr_year;
		// int calc2 = curr_year - birth_year;
		// System.out.printf("You have %d years until they take over.\n",calc);
		// System.out.printf("After %d years, you have finally found the best thing in life: Computer Science.",calc2);

		// //TASK 3 The program should ask the user to enter two integers and compute and display the following
		// // operations between the two: multiplication, division, modulo . Your program's output must be the same as mine.

		// Scanner in = new Scanner(System.in);
		// System.out.print("Enter the first number: ");
		// int first = in.nextInt();
		// System.out.print("Enter the second number: ");
		// int second = in.nextInt();

		// int product = first*second;
		// int quotient = first/second;
		// int mod = first%second;
		// int product2 = second*first;
		// int quotient2 = second/first;
		// int mod2 = second%first; 

		// System.out.printf("%4d * %4d = %4d\n",first,second,product);
		// System.out.printf("%4d / %4d = %4d\n",first,second,quotient);
		// System.out.printf("%4d %% %4d = %4d\n\n",first,second,mod);
		// System.out.printf("%4d * %4d = %4d\n",second,first,product2);
		// System.out.printf("%4d / %4d = %4d\n",second,first,quotient2);
		// System.out.printf("%4d %% %4d = %4d\n\n",second,first,mod2);

		//TASK 4 The program should prompt the user to enter an integer n and then computes the square,
		// cube and fourth power and displays them in a nice table as shown below.

		Scanner in = new Scanner(System.in);
		System.out.print("Enter n: ");
		double n = in.nextDouble();
		double n_squared = Math.pow(n,2);
		double n_cubed = Math.pow(n,3);
		double n_4 = Math.pow(n,4);
		System.out.println(n_squared);
		System.out.printf("+----------+-----+\n");
		System.out.printf("|         n|%5.0f|\n",n);
		System.out.printf("+----------+-----+\n");
		System.out.printf("| n squared|%5.0f|\n",n_squared);
		System.out.printf("+----------+-----+\n");
		System.out.printf("|   n cubed|%5.0f|\n",n_cubed);
		System.out.printf("+----------+-----+\n");
		System.out.printf("|       n^4|%5.0f|\n",n_4);
		System.out.printf("+----------+-----+\n");
	}
}