using System;

class Program
{
    static void Main()
    {
        Console.Write("Ingresa los elementos del arreglo separados por espacios: ");
        int[] N = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);

        int[] pares = new int[N.Length];
        int[] impares = new int[N.Length];
        int i = 0, j = 0;

        foreach (var n in N)
        {
            if (n % 2 == 0)
            {
                pares[i++] = n;
            }
            else
            {
                impares[j++] = n;
            }
        }

        Array.Resize(ref pares, i);
        Array.Resize(ref impares, j);

        Console.WriteLine($"Elementos pares: {string.Join(", ", pares)}");
        Console.WriteLine($"Elementos impares: {string.Join(", ", impares)}");
    }
}
