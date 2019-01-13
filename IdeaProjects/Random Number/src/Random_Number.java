import java.util.Scanner;
public class Random_Number
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int answer = (int)(Math.random()*100)+1;
        System.out.println("I have randomly chosen a number between 1 and 100.");
        System.out.println("Try and guess it.");
        boolean found = false;
        for (int i = 10; i > 0 ; i--)
        {
            System.out.println("You have "+i+" guesses left.");
            int guess = in.nextInt();
            if (guess < answer)
            {
                System.out.println("The answer is greater then "+ guess);
            }
            else if (guess > answer)
            {
                System.out.println("The answer is less then "+ guess);
            }
            else
            {
                found = true;
                break;
            }
        }
        if (found)
        {
            System.out.println("YOU WON");
        }
        else
        {
            System.out.println("YOU LOST SUCKA");
        }
    }
}
