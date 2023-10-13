//4- Conversor.

using System;

class Grados {
  static void Main() {
      double gf;
		Console.WriteLine("Ingresa los grados celcius a convertir: ");
		double gc = double.Parse(Console.ReadLine());
		gf = (gc * 1.8) + 32;
		Console.WriteLine(gc+"°C son iguales a: "+gf+"°F.");
    }
}
