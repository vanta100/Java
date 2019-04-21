import java.io.File;
import java.util.Scanner;
public class Game {
    int size;
    int chances;
    String guess;
    String answer;
    String wrong_letters;
    Game(File movie_txt) throws Exception
    {
        guess = "";
        wrong_letters = "";
        String[] movies = new String[50];
        Scanner scanner = new Scanner(movie_txt);
        while(scanner.hasNextLine())
        {
            movies[size] = scanner.nextLine();
            size++;
        }
        int random_title = (int)(Math.random()*size);
        this.answer = movies[random_title];
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
    }
    int getChances()
    {
        return chances;
    }

    String user_guess()
    {
        return guess;
    }
    String key()
    {
        return answer;
    }
    String getWrong_letters()
    {
        return wrong_letters;
    }
    void check()
    {
        Scanner in = new Scanner(System.in);
        boolean found = false;
        System.out.println("You are guessing:" + guess);
        System.out.println("You have guessed (" + chances + ") wrong letters: " + wrong_letters);
        System.out.print("Guess a letter: ");
        String input = in.next();
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


}
