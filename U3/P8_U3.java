package com.mycompany.p8_u3;
import java.util.Scanner;

public class P8_U3 {

    public static void main(String[] args) {
        Scanner N = new Scanner(System.in);
        
        System.out.println("Ingresa un numero: ");
        float N1 = N.nextInt();
        System.out.println("Ingresa otro numero: ");
        float N2 = N.nextInt();
        
        if (N1 > N2){
            System.out.println("El numero 1 es mayor");
        }else {
            System.out.println("El numero 2 es mayor");
        }
    }
}
