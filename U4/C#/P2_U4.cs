using System;
using System.Linq;

class Promedio {
    
  static void Main(){
      Console.WriteLine("Ingresa la cantidad de calificaciones a evaluar: ");
      int T = int.Parse(Console.ReadLine());
      
      double[] C = new double[T];
      
      for (int i = 0; i < T; i++){
          Console.Write($"Ingrese la calificación #{i + 1}: ");
          C[i] = double.Parse(Console.ReadLine());
      }
      
      double P = C.Average();
      
      Console.WriteLine($"El promedio del alumno es: {P}");
  }
}
