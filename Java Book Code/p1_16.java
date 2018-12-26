import javax.swing.JOptionPane;

public class p1_16
{
	public static void main(String[] args)
	{
		String name = JOptionPane.showInputDialog("What is your name?");
		System.out.println("Hello, " + name + "!");
		JOptionPane.showInputDialog("My name is Hal! What would you like me to do?");
		System.out.print("I'm sorry " + name + ". I'm afraid I can't do that.");


	}
}