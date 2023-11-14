using System;

class Array Mayor o Menor {
    
  static void Main(){
      int[] N = { 18, 15, 12, 20, 54};
      
      foreach (int n in N){
          Console.WriteLine($"{n} años es {(n >= 18 ? "mayor" : "menor")} de edad");
      }
  }
}
