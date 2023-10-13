//5- Metros a pies.

using System;

class Metros {
  static void Main() {
      double f;
		
		Console.WriteLine("Ingresa los metros a convertir: ");
		double m = double.Parse(Console.ReadLine());
		f = m * 3.281;
		Console.WriteLine(m+"m son iguales a: "+f+"ft");
    }
}
