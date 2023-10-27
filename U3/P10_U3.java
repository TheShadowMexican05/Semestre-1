package com.mycompany.p10_u3;
import java.util.Scanner;

public class P10_U3 {

    public static void main(String[] args) {
        Scanner P = new Scanner(System.in);
        
        System.out.println("Ingresa el pago por hora de los empleado: ");
        double PH = P.nextDouble();
        System.out.println("Ingresa las horas trabajadas por el empleado: ");
        double H = P.nextDouble();
            
        if(H <= 40 && H>= 0){
            H = H * PH;
            System.out.println("El pago del empleado es: "+H);
        }else if(H > 40){
            H = (H * PH) * 2;
            System.out.println("El pago del empleado es: "+H);
        }
    }
}