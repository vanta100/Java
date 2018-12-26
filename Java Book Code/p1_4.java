public class p1_4
{
	public static void main(String[] args)
	{
		int init_balance = 1000;
		double first_year = init_balance*1.05;
		double second_year = first_year*1.05;
		double third_year = second_year*1.05;
		System.out.println(first_year);
		System.out.println(second_year);
		System.out.println(third_year);	
	}
}