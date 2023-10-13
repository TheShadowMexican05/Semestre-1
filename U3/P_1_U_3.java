package com.mycompany.p_1_u_3;
import java.util.Scanner;

public class P_1_U_3 {

    public static void main(String[] args) {
        Scanner CF = new Scanner(System.in);
        int i = 1;
        float S = 0, P;
               
        while (i <= 6){
            System.out.println("Ingresa la calificaciòn "+i+": ");
            float c = CF.nextFloat();
            S = S + c;
            i++;
        }
        P = S / 6;
        if ( P > 70){
            System.out.println("El alumno esta aprobado");
        }else {
            System.out.println("El alumno esta reprobado");
        }
    }
}
