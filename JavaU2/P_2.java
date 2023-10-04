package com.mycompany.p_2;
import java.util.Scanner;

public class P_2 {

    public static void main(String[] args) {
        /*int A = 16, B = 18, S = 0;
        S = A + B;
        System.out.println("La suma es: "+S);*/
        Scanner read = new Scanner(System.in);
        int S = 0;
        System.out.println("Ingresa el primer numero: ");
        int A = read.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        int B = read.nextInt();
        S = A + B;
        System.out.println("La suma es: "+S);
    }
}
