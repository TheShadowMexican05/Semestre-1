//4- Concersor.

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner G = new Scanner(System.in);
		double gf;
		
		System.out.println("Ingresa los grados celcius a convertir: ");
		double gc = G.nextFloat();
		gf = (gc * 1.8) + 32;
		System.out.println(gc+"°C son iguales a: "+gf+"°F.");
	}
}
