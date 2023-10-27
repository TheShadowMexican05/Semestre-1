package com.mycompany.p12_u3;
import java.util.Scanner;

public class P12_U3 {

    public static void main(String[] args) {
        Scanner P = new Scanner(System.in);
        int r;
        
        for(int i = 1; i <= 5; i++){
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
}
