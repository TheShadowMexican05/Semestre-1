using System;
using System.Linq;

class Negativos
{
    static void Main()
    {
        Console.Write("Ingrese el total de números a procesar: ");
        int T = int.Parse(Console.ReadLine());
        
        int[] N = new int[T];
        
        for(int i = 0; i < T; i++){
            Console.Write($"\nIngresa un número para la posición #{i + 1}: ");
            N[i] = int.Parse(Console.ReadLine());
        }
        
        int Ng = N.Count(Num => Num < 0);
        Console.WriteLine($"\nEl total de números negativos son: {Ng}");
    }
}
