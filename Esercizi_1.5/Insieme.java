import java.util.Scanner;

public class Insieme 
{
	public static void main(String[] args)
	{
		// I declare the object Scanner tastiera and the two integer values which I need to print the range of numbers
		// Es Input 3 and 6
		// Output 3 4 5 6 and viceversa

		Scanner tastiera = new Scanner(System.in);
		int a,b;


		//I ask at the user the 2 numbers
		System.out.println("Inserire il primo numero");
		a = tastiera.nextInt();
		System.out.println("Inserire il secondo numero");
		b = tastiera.nextInt();


		//if a>b than increment b and print it until is equal to a, if not viceversa
		if(a>b)
			while(b<=a)
			{
				System.out.print(b+" ");
				b++;
			}
		else
			while(a<=b)
			{
				System.out.print(a+" ");
				a++;
			}
	}
}