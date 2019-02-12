import java.util.Scanner;
public class Practice_6
{

	// //Task 1 Write a program with a method called vowelsCt that will ONLY find the vowels and main handles everything else

	// public static int vowelsCt(String word)
	// {
	// 	word = word.toLowerCase();
	// 	String vowels = "aeiou";
	// 	int counter = 0;
	// 	for (int i = 0 ; i < word.length() ; i++) 
	// 	{
	// 		if (vowels.indexOf(word.charAt(i)) != -1) 
	// 		{
	// 			counter++;	
	// 		}
	// 	}
	// 	return counter;
	// }
	// public static void main(String args[])
	// {
	// 	Scanner in = new Scanner(System.in);
	// 	System.out.print("Enter a string: ");
	// 	String s1 = in.next();
	// 	System.out.print("Enter a string: ");
	// 	String s2 = in.next();
	// 	int s1_vow = vowelsCt(s1);
	// 	int s2_vow = vowelsCt(s2);
	// 	System.out.println("Number of vowels in string "+s1+" : "+s1_vow);
	// 	System.out.println("Number of vowels in string "+s2+" : "+s2_vow);
	// }

	// //Task 2 In this program write a method called upDown that takes 3 integers as arguments and returns one of these 3 strings

	// public static String upDown(int a,int b,int c)
	// {
	// 	if (a > b && b > c) 
	// 	{
	// 		return("decreasing");
	// 	}
	// 	else if (a < b && b < c)
	// 	{
	// 		return("increasing");	
	// 	}
	// 	else
	// 	{
	// 		return "none";
	// 	}
	// }
	// public static void main(String args[])
	// {
	// 	Scanner in = new Scanner(System.in);
	// 	System.out.print("Enter three integers separated by spaces: ");
	// 	String ints = in.nextLine();
	// 	int space = ints.indexOf(" ");
	// 	int first = Integer.parseInt(ints.substring(0,space));
	// 	String temp = ints.substring(space+1);
	// 	int space2 = temp.indexOf(" ");
	// 	int second = Integer.parseInt(temp.substring(0,space2));
	// 	System.out.print(second);
	// 	int third = Integer.parseInt(temp.substring(space2+1));
	// 	String result = upDown(first,second,third);
	// 	String result2 = upDown(5,1,9);
	// 	System.out.println("These numbers are in order: "+ result);
	// 	System.out.println("Numbers 5,1,9, are in the order: "+ result2);
	// 	if(result.equals(result2))
	// 	{
	// 		System.out.println("same");
	// 	}
	// 	else
	// 	{
	// 		System.out.println("different");
	// 	}
	// }

	// //TASK 3 Start with an incomplete program intended to take input text from the user and then print that text so that each letter is repeated multiple times.

	// public static void main(String[] args) { //Given main, do not modify in anyway
 //        Scanner in = new Scanner(System.in);
 //        String description = "This program repeatedly reads a word "
 //                + "and a number, N, and repeats every  letter of the word.\n\n";
 //        System.out.printf(description);
 //        System.out.printf("Enter a word, or q to quit: ");
 //        String text = in.nextLine();
 //        while (!text.equals("q")) {
 //            System.out.printf("Enter number of times (must be > 0): ");
 //            int times = in.nextInt();
 //            in.nextLine();  // consume the new line character after the number
 //            // This code does not run now. 
 //            // You must write the repeatLetters methods. 
 //            repeatLetters_1(text, times);
 //            repeatLetters_2(text, times);
 //            repeatLetters_3(text, times);   //uncomment it for the extra work
 //            System.out.printf("\n\nEnter a word, or q to quit: ");
 //            text = in.nextLine();
 //        }
 //    }

 //    public static void repeatLetters_1(String text, int n)
 //    {
 //    	for (int i = 0 ; i < text.length() ; i++)
 //    	{
 //    		for (int j = 0 ; j < n ; j++)
 //    		{
 //    			System.out.print(text.charAt(i));	
 //    		}
 //    	}
 //    	System.out.println("");
 //    }
 //    public static void repeatLetters_2(String text, int n)
 //    {
 //    	String vowels = "aeoui";
 //    	String upper_vowels = "AEOUI";
 //    	for (int i = 0 ; i < text.length() ; i++)
 //    	{
 //    		int check1 = vowels.indexOf(text.charAt(i));
 //    		int check2 = upper_vowels.indexOf(text.charAt(i));
 //    		if(check1 == -1 && check2 == -1)
 //    		{
 //    			for (int j = 0 ; j < n ; j++)
 //    			{
 //    				System.out.print(text.charAt(i));	
 //    			}
 //    		}
 //    		else
 //    		{
 //    			for(int j = 0 ; j < 2*n ; j++)
 //    			{
 //    				System.out.print(text.charAt(i));
 //    			}
 //    		}
 //    	}
 //    	System.out.println("");
 //    }
 //    public static void repeatLetters_3(String text, int n)
 //    {
 //    	String vowels = "aeoui";
 //    	String upper_vowels = "AEOUI";
 //    	for (int i = 0 ; i < text.length() ; i++)
 //    	{
 //    		int check1 = vowels.indexOf(text.charAt(i));
 //    		int check2 = upper_vowels.indexOf(text.charAt(i));
 //    		if(check1 == -1 && check2 == -1 && Character.isLetter(text.charAt(i)))
 //    		{
 //    			for (int j = 0 ; j < n ; j++)
 //    			{
 //    				System.out.print(text.charAt(i));	
 //    			}
 //    		}
 //    		else if(!Character.isLetter(text.charAt(i)))
 //    		{
 //    			System.out.print(text.charAt(i));
 //    		}
 //    		else
 //    		{
 //    			for(int j = 0 ; j < 2*n ; j++)
 //    			{
 //    				System.out.print(text.charAt(i));
 //    			}
 //    		}
 //    	}
 //    	System.out.println("");
 //   }

	//TASK 4 This program will generate all the substrings of a givern word, in increasing order of substring length.
	//An incomplete program is given.
	public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.printf("This program will generate all the substrings of a "
                + "given word, in increasing order of substring length.\n");

    System.out.printf("\nPlease enter a word or q to quit: ");
    String userWord = in.nextLine();
    for (; !userWord.equals("q");) {
    	//printSubstrings(userWord);
        printSubstringsExtra2(userWord);
        System.out.printf("\n\nPlease enter a word or q to quit: ");
        userWord = in.nextLine();
    }
    System.out.println("\n\nBye\n");
    }
    public static void printSubstrings(String input)
    {
    	int length = input.length();
    	String formatStr = " %-" + length + "s |";
    	int num_dashes = (length+2)*length+ (length+1);	
    	String dash = "";
    	for(int i = 0 ; i < num_dashes ; i++)
    	{
    		dash += "-";
    	}
    	System.out.print(dash);
    	for(int i = 0 ; i < length ; i++)
    	{
    		System.out.print("\n|");
    		for(int j = 0 ; j < length && (i+j+1) <= length; j++)
    		{
  				String temp = input.substring(j,i+j+1);
    			System.out.printf(formatStr,temp);	
    		}
    		System.out.print("\n"+dash.substring(0+i*(length+3)));
    	}
    }
    public static void printSubstringsExtra2(String input)
    {
    	int length = input.length();
    	int max_dash = 1;
    	String dash = "";
    	int size = length +3;
    	int limit = 0;
    	for(int i = 1 ; i <= length ; i++)
    	{
    		max_dash += input.substring(0,i).length()+3;
    	}
    	for(int i = 0 ; i < max_dash ; i++)
    	{
    		dash += "-";
    	}
    	System.out.print(dash);
    	for(int i = 1 ; i <= length ; i++)
    	{
    		System.out.print("\n|");
    		for(int j = 0 ; j < length && (i+j) <= length; j++)
    		{
  				String temp = input.substring(i-1,i+j);
  				String formatStr = " %-" + temp.length() + "s |";
    			System.out.printf(formatStr,temp);	
    		}
    		System.out.print("\n"+dash.substring(0+limit));
    		limit += size;
    		size--;		
    	}
    }
}
