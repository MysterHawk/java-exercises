import java.util.Scanner;

public class BMICalculator{
	public static void main ( String [] args )
	{
		Scanner keyboard = new Scanner(System.in);
		double m, kg, bmi;
		
		/*
		 * 	Base Exercise
		 * 
		 *	System.out.print( "Your height in m: " );
		 *	m = keyboard.nextDouble();
		 *
		 *	System.out.print( "Your weight in kg: " );
		 *	kg = keyboard.nextDouble();
		 *
		 */
		
		/*	1st Exercise Study drill
		 * 
		 *	System.out.print( "Your height in inches: " );
		 *	// Conversion inches to m
		 * 	m = keyboard.nextDouble() * 0.0254;
		 *
		 *	System.out.print( "Your weight in pounds: " );
		 *	// Conversion pounds to kg
		 *	kg = keyboard.nextDouble() / 2.2046;
		 * 
		 */
		 
		 System.out.print( "Your height (feet only): " );
		 // Conversion feet to m
		 m = keyboard.nextDouble() / 3.2808;
		 System.out.print( "Your height (inches): " );
		 // Addition of total meters with the conversion of inches to m
		 m = m + keyboard.nextDouble() * 0.0254;
	 
		 System.out.print( "Your weight in pounds: " );
		 // Conversion pounds to kg
		 kg = keyboard.nextDouble() / 2.2046;
		 
		 
		
		bmi = kg / (m*m);
		
		System.out.println( "Your BMI is " + bmi );
	}
}
