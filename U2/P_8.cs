//6- Iva 

using System;

class IVA {
  static void Main() {
      double T = 0, ST = 0;
	  const double IVA = 0.16;
		
	  Console.WriteLine("Ingresa el valor del primer producto: ");
	  double P1 = double.Parse(Console.ReadLine());
	  Console.WriteLine("Ingresa el valor del segundo producto: ");
	  double P2 = double.Parse(Console.ReadLine());
	  Console.WriteLine("Ingresa el valor del tercer producto: ");
	  double P3 = double.Parse(Console.ReadLine());
	  T = P1 + P2 + P3;
	  ST = T - (T * IVA);
	  Console.WriteLine("El precio total es: "+T);
	  Console.WriteLine("El subtotal es: "+ST);
    }
}
