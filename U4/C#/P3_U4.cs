using System;

class Program
{
    static void Main()
    {
        Console.Write("Ingrese el total de temperaturas a procesar: ");
        int TT = int.Parse(Console.ReadLine());

        double[] TC = new double[TT];

        for (int i = 0; i < TT; i++)
        {
            Console.Write($"Ingrese la temperatura en °C {i + 1}: ");
            TC[i] = double.Parse(Console.ReadLine());
        }

        Console.WriteLine("\nResultados:");

        for (int i = 0; i < TT; i++)
        {
            PrintConversion(i + 1, TC[i], c => c * 9 / 5 + 32, c => c + 273.15);
        }
    }

    static void PrintConversion(int i, double t, Func<double, double> f, Func<double, double> k)
    {
        Console.WriteLine($"Temperatura {i}:\n°C: {t}\n°F: {f(t)}\n°K: {k(t)}\n");
    }
}
