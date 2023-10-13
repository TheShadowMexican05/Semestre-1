//5- Metros a pies.

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner M = new Scanner(System.in);
		double f;
		
		System.out.println("Ingresa los metros a convertir: ");
		double m = M.nextDouble();
		f = m * 3.281;
		System.out.println(m+"m son iguales a: "+f+"ft");
	}
}
