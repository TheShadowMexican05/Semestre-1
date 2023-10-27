package com.mycompany.p16_u3;
import java.util.Scanner;

public class P16_U3 {

    public static void main(String[] args) {
        Scanner P = new Scanner(System.in);
        int i = 1;

        while(i <= 5){
            System.out.println("Ingresa el pago por hora de los empleado "+i+": ");
            double PH = P.nextDouble();
            System.out.println("Ingresa las horas trabajadas por el empleado "+i+": ");
            double H = P.nextDouble();
            
            if(H <= 40 && H>= 0){
                H = H * PH;
                System.out.println("El pago del empleado "+i+" es: "+H);
            }else if(H > 40){
                H = (H * PH) * 2;
                System.out.println("El pago del empleado "+i+" es: "+H);
            }
            i++;
        }
    }
}
