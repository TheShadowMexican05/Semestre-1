using System;

class Promedio {
  static void Main() {
      float S = 0, P;
      int i = 1;
      
      while (i <= 6){
          Console.WriteLine("Ingresa la primera calificación "+i+" : ");
		  float C = float.Parse(Console.ReadLine());
		  S = S + C;
		  i++;
		}
	   P = S / 6;
	   Console.WriteLine("El promedio del alumno es: "+P);
    }
}
