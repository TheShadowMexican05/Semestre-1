//2.Suma x = y+a+3.

using System;

class ecuacion {
  static void Main() {
      float x;
		
		Console.WriteLine("Ingresa el numero 'y': ");
		float y = float.Parse(Console.ReadLine());
		Console.WriteLine("Ingresa el numero 'a': ");
		float a = float.Parse(Console.ReadLine());
		x = y + a + 3;
		Console.WriteLine("La suma de los numeros es: "+x);
    }
}
