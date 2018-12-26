import javax.swing.JOptionPane;

public class p1_15
{
	public static void main(String[] args)
	{
		String name = JOptionPane.showInputDialog("What is your name?");
		//System.out.println("Hello,");
		//System.out.print(name);			Beginner version
		//System.out.print("!");
		System.out.println("Hello, " + name + "!");
	}
}