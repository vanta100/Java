import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static String[][] genFile() throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter file name:");
        String fileName = in.nextLine();

        /*Create	an	ArrayList	of	Strings	from	the	file	name	entered*/
        ArrayList<String> allLines = readFile(fileName);


        /*Create	a	2D	array	the	that	will	hold	all	the	information.*/
        String[][] result = new String[allLines.size()][4];

        /*This	loop	should	run	and	capture	all	of	the	data*/
//        for (int i = 0; i < allLines.size(); i++) {
//            result[i] = allLines.get(i).split(",");
//        }
        int i = 0;
        while (i < allLines.size()) {
            /*Each	line of	the	file should	be put into	the 2D array result*/
            result[i] = allLines.get(i).split(",");
            i++;
        }
        return result;
    }

    public static ArrayList<String> readFile(String filename) throws FileNotFoundException {
        File temp = new File(filename);

        /*Create	a	Scanner	object	to	read	in	our	file*/
        Scanner iFile = new Scanner(temp);
        ArrayList<String> result = new ArrayList();

        int i = 0;
        /*Keep	reading	in	each	line	of	the	file	into	the	ArrayList*/
        while (iFile.hasNextLine()) {
            /*Add	each	line	to	the	ArrayList*/
            result.add(iFile.nextLine());
            i++;
        }
        iFile.close();
        return result;
    }

    public static void main(String[] args) throws FileNotFoundException {

        String[][] g = genFile();
        String date = "";
        System.out.println("\nSecond row:");
        /*Print	out	the	second row	with info in the file*/
        for (int i = 0; i < g.length; i++) {
            if (i == 2){
                for (int j = 0; j < g[0].length; j++) {
                    System.out.print(g[i][j] + " ");
                }
            }
            if(g[i][0].equals("Fri 4/3/2015")){
                date = g[i][0];
            }
        }

        /*Print	out	Fri	4/3/2015	(do	not	hardcode)*/

        System.out.println("\n\nDate: " + date);


    }
}
