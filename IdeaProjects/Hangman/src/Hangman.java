import java.util.Scanner;
import java.io.File;
public class Hangman
{
    public static void main(String [] args) throws Exception
    {
        File file = new File("movies.txt");
        Scanner in = new Scanner(System.in);
        Scanner scanner = new Scanner(file);
        int chances = 0;
        int size = 0;
        String[] movies = new String[50];
        while(scanner.hasNextLine())
        {
            movies[size] = scanner.nextLine();
            size++;
        }
        int random_title = (int)(Math.random()*size);
        String answer = movies[random_title];
        String guess = "";
        String wrong_letters = "";
        for (int i = 0; i < answer.length(); i++)
        {
            if (answer.charAt(i) == ' ')
            {
                guess+=" ";
            }
            else
            {
                guess += "_";
            }
        }
        while(!guess.equals(answer) && chances < 10)
        {
            boolean found = false;
            System.out.println("You are guessing:" + guess);
            System.out.println("You have guessed (" + chances + ") wrong letters: " + wrong_letters);
            System.out.print("Guess a letter: ");
            String input = in.nextLine();
            for (int i = 0; i < answer.length(); i++)
            {
                if(answer.charAt(i) == input.charAt(0))
                {
                    guess = guess.substring(0,i) + answer.charAt(i) + guess.substring(i+1);
                    found = true;
                }
            }
            if(!found)
            {
                wrong_letters+= input + " ";
                chances++;
            }

        }
        if (guess.equals(answer))
        {
            System.out.println("You win!");
            System.out.println("You have correctly guessed '"+ guess+"'");
        }
        else
        {
            System.out.println("You have guessed (" + chances + ") wrong letters: " + wrong_letters);
            System.out.println("You lose!");
            System.out.println("The answer is '"+ answer +"'");
        }
    }
}
