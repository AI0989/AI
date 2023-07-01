package demo.demo_browser;

import java.util.Scanner;

public class Ai 
{
	public static void main(String[] args) {
		int Miles_Covered;
		double Gallon_of_Fuel;
		double Miles_per_Gallon;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Please enter the distance covered (Miles):");
		Miles_Covered = scan.nextInt();
		System.out.print("Please enter the fuel used (Gallon):");
		Gallon_of_Fuel = scan.nextDouble();
		Miles_per_Gallon = Miles_Covered/Gallon_of_Fuel;
		System.out.println("Miles_per_gallon (MPG):"+ Miles_per_Gallon);
	}

}
