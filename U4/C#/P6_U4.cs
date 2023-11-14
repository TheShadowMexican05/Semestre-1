using System;

class Numeros {
    static void Main() {
        Console.Write("Ingresa la cantidad de números a ordenar: ");
        int[] N = new int[int.Parse(Console.ReadLine())];

        for (int i = 0; i < N.Length; i++) {
            Console.Write($"Ingresa el número {i + 1}: ");
            N[i] = int.Parse(Console.ReadLine());
        }

        Array.Sort(N);
        Console.WriteLine("Números ordenados:");
        Console.WriteLine(string.Join(" ", N));
    }
}
