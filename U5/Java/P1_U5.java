package com.mycompany.p1_u5;

public class P1_U5 {

  public static void main (String[]args)
  {
    System.out.println ("Suma = " + S (77, 43));
    System.out.println ("Resta = " + R (52, 22));
    System.out.println ("Multiplicacion = " + M (45, 3));
    System.out.println ("Division = " + D (24, 8));
  }
  public static int S (int a, int b)
  {
    int S = a + b;
    return S;
  }
  public static int R (int a, int b)
  {
    int R = a - b;
    return R;
  }
  public static int M (int a, int b)
  {
    int M = a * b;
    return M;
  }
  public static int D (int a, int b)
  {
    int D = a / b;
    return D;
  }
}