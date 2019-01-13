import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

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
