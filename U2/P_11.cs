//8- Área de hexagono.

using System;

class hexagono {
    static void Main() {
        float A, P;
		
		Console.WriteLine("Ingresa el valor del lado: ");
		float l = float.Parse(Console.ReadLine());
		P = l * 6;
		Console.WriteLine("Ingresa el valor del apotema: ");
		float a = float.Parse(Console.ReadLine());
		A = (P * a) / 2;
		Console.WriteLine("El perimetro es igual a: "+P);
		Console.WriteLine("El valor del área es igual a: "+A);
    }
}
