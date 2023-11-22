using System;

class Program
{
    static void Main()
    {
        Console.Write("¿Cuántos nombres deseas ingresar?: ");
        int CN = int.Parse(Console.ReadLine());

        var N = new string[CN];
        var A = new string[CN];

        for (int i = 0; i < CN; i++)
        {
            Console.Write($"Ingrese el nombre {i + 1}: ");
            N[i] = Console.ReadLine();

            Console.Write($"Ingrese el apellido {i + 1}: ");
            A[i] = Console.ReadLine();
        }
        Console.WriteLine("Nombres completos:");
        for (int i = 0; i < CN; i++)
        {
            Console.WriteLine($"{N[i]} {A[i]}");
        }
    }
}
