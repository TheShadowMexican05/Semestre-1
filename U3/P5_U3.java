package com.mycompany.p5_u3;
import java.util.Scanner;

public class P5_U3 {

    public static void main(String[] args) {
        Scanner P = new Scanner(System.in);
        double S, T;
        
        System.out.println("Ingresa el valor de el primer producto: ");
        double P1 = P.nextDouble();
        System.out.println("Ingresa el valor de el segundo producto: ");
        double P2 = P.nextDouble();
        System.out.println("Ingresa el valor de el tercer producto: ");
        double P3 = P.nextDouble();
        S = P1 + P2 + P3;
        
        if (S >= 1500){
            T = S - (S * 0.3);
            System.out.println("El total a pagar es: "+T);
        }else if(S <= 1499 && S >= 1000){
            T = S - (S * 0.2);
            System.out.println("El total a pagar es: "+T);
        }else if(S <= 999 && S >= 700){
            T = S - (S * 0.1);
            System.out.println("El total a pagar es: "+T);
        }else {
            System.out.println("El total a pagar es: "+S);
        }
    }
}
