7- Calculadora.

using System;

class Calculadora {
    static void Main() {
      float S, R, M, D;
		
		Console.WriteLine("Ingresa el primer numero: ");
		float N1 = float.Parse(Console.ReadLine());
		Console.WriteLine("Ingresa el segundo numero: ");
		float N2 = float.Parse(Console.ReadLine());
		S = N1 + N2;
		R = N1 - N2;
		M = N1 * N2;
		D = N1 / N2;
		Console.WriteLine("La suma de los numeros es: "+S);
		Console.WriteLine("La resta de los numeros es: "+R);
		Console.WriteLine("La multiplicación de los numeros es: "+M);
		Console.WriteLine("La divición de los numeros es: "+D);
    }
}
