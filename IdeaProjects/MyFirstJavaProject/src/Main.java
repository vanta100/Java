import java.util.Scanner;
public class Main {
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        ContactsManager boss = new ContactsManager();
        for (int i = 0 ; i < 5 ; i++)
        {
            System.out.println("Enter contact name: ");
            String name = in.nextLine();
            System.out.println("Enter contact number: ");
            String num = in.nextLine();
            Contact test = new Contact(name,num);
            boss.addContact(test);
        }
        Contact found = boss.searchContact("Steven Finley");
        System.out.println(found.phone_number);

    }
}
