using System;
using System.Linq;

class Program
{
    static void Main()
    {
        Console.Write("Ingrese el número de países: ");
        int N = int.Parse(Console.ReadLine());

        string[] P = new string[N];

        for (int i = 0; i < N; i++)
        {
            Console.Write($"Ingrese el nombre del país #{i + 1}: ");
            P[i] = Console.ReadLine();
        }

        double PR = P.Length > 0 ? P.Average(p => p.Length) : 0;

        Console.WriteLine($"Longitud promedio de las palabras de los países: {PR:F2}");
    }
}
