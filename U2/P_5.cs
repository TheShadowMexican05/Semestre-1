//3- Area y Perimetro de un triangulo.

using System;

class Triangulo {
  static void Main() {
      float A, P;
		
		Console.WriteLine("Ingresa el valor de la altura: ");
		float h = float.Parse(Console.ReadLine());
		Console.WriteLine("Ingresa el valor de la base: ");
		float b = float.Parse(Console.ReadLine());
		Console.WriteLine("Ingresa el valor del lado 1: ");
		float l1 = float.Parse(Console.ReadLine());
		Console.WriteLine("Ingresa el valor del lado 2: ");
		float l2 = float.Parse(Console.ReadLine());
		A = (b * h) / 2;
		P = b + l1 + l2;
		Console.WriteLine("El area es igual a: "+A);
		Console.WriteLine("El perimetro es igual a: "+P);
    }
}
