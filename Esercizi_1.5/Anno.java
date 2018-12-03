import java.util.Scanner;

public class Anno
{
	public static void main(String[] args)
	{
		// I declare the int variable anni, n and the object Scanner tastiera
		Scanner tastiera = new Scanner(System.in);
		int anni, n;

		// I ask in input the year of birth and the years to live
		System.out.println("Inserisci l'anno in cui sei nato");
		anni = tastiera.nextInt();
		System.out.println("Inserisci anni da vivere ");
		n = tastiera.nextInt();

		//than I calculate when I would have n years what year will be
		System.out.println("Avrai "+n+" anni nel "+(anni+n));


	}
}