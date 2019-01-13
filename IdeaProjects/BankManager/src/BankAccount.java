public class BankAccount {
    String acc_num;
    int balance;
    public static void main(String [] args)
    {
        CheckingAccount vans = new CheckingAccount();
        SavingsAccount Vans = new SavingsAccount();
        CertificateOfDeposit VANS = new CertificateOfDeposit();
        vans.acc_num = "100-1000-10000";
        vans.balance = 1000;
        vans.limit = 10000;
        Vans.acc_num = "100-1000-10000";
        Vans.balance = 1000;
        Vans.limit = 10000;
        VANS.acc_num = "100-1000-10000";
        VANS.balance = 1000;
        VANS.limit = 10000;

        System.out.println(vans.acc_num + " " + Vans.balance + " " + VANS.limit);

    }
}
