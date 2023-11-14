using System;

class Frutas
{
    static void Main()
    {
        Console.Write("Ingrese el total de frutas a: \n");
        int T = int.Parse(Console.ReadLine());
        
        string[] F = new string[T];
        
        for(int i = 0; i < T; i++){
            Console.Write($"Ingresa la fruta #{i + 1}: ");
            F[i] = Console.ReadLine();
        }
        
        Array.Reverse(F);

        Console.WriteLine("\nFrutas al revés:");
        foreach (var f in F)
        {
            Console.WriteLine(f);
        }
    }
}
