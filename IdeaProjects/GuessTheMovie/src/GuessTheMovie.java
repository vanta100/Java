import java.io.File;
import java.util.Scanner;
public class GuessTheMovie {
    public static void main(String [] args) throws Exception
    {

        File file = new File("movies.txt");
        Scanner in = new Scanner(System.in);
        Game game = new Game(file);
        String answer = game.key();
        while(!game.user_guess().equals(answer) && game.getChances() < 10)
        {
            game.check();
        }
        if (game.user_guess().equals(answer))
        {
            System.out.println("You win!");
            System.out.println("You have correctly guessed '"+ game.user_guess()+"'");
        }
        else
        {
            System.out.println("You have guessed (" + game.getChances() + ") wrong letters: " + game.getWrong_letters());
            System.out.println("You lose!");
            System.out.println("The answer is '"+ answer +"'");
        }

    }
}
