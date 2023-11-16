using System;
using System.Linq;

class Media
{
    static void Main()
    {
        Console.Write("Ingresa la cantidad de números a analizar: ");
        double[] N = new double[int.Parse(Console.ReadLine())];

        for (int i = 0; i < N.Length; i++)
        {
            Console.Write($"Ingresa el número {i + 1}: ");
            N[i] = int.Parse(Console.ReadLine());
        }

        double M = N.Average(), Md = (N[(N.Length - 1) / 2] + N[N.Length / 2]) / 2.0;
        Console.WriteLine($"Media: {M}\nMediana: {Md}");
    }
}
