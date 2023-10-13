package com.mycompany.p_2_u_3;
import java.util.Scanner;

public class P_2_U_3 {

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
