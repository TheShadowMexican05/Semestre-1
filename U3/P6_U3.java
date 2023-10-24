package com.mycompany.p6_u3;
import java.util.Scanner;

public class P6_U3 {

    public static void main(String[] args) {
        Scanner P = new Scanner(System.in);
        int r;
        System.out.println("Ingresa un numero: ");
        int num = P.nextInt();
        r = num % 2;
        if (r == 0){
            System.out.println("El numero es par");
        }else {
            System.out.println("El numero es impar");
        }
    }
}