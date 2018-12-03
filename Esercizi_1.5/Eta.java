import java.util.Scanner;

public class Eta
{
	public static void main(String[] args)
	{
		//I declare int variable eta and the Object Scanner
		Scanner tastiera = new Scanner(System.in);
		int eta;
		
		
		//I ask the eta in input and than I print it in the console
		System.out.println("Inserire un eta':");
		eta = tastiera.nextInt();
		System.out.println("L'eta' inserita e' la seguente "+eta);
		
		//I could optimize this code just by calling scanner.nextInt() directly in the console
	}
}