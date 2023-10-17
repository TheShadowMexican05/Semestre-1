package com.mycompany.p4_u3;
import java.util.Scanner;

public class P4_U3 {

    public static void main(String[] args) {
        Scanner AMLP = new Scanner(System.in);
        
        System.out.println("Ingresa un numero de mes: ");
        int M = AMLP.nextInt();
        
        switch (M){
            case 1:
                System.out.println("Es Enero");
                break;
            case 2:
                System.out.println("Es Febrero");
                break; 
            case 3:
                System.out.println("Es Marzo");
                break;
            case 4:
                System.out.println("Es Abril");
                break;
            case 5:
                System.out.println("Es Mayo");
                break;
            case 6:
                System.out.println("Es Junio");
                break;
            case 7:
                System.out.println("Es  Julio");
                break;
            case 8:
                System.out.println("Es Agosto");
                break;
            case 9:
                System.out.println("Es Septiembre");
                break;
            case 10:
                System.out.println("Es Octubre");
                break;
            case 11:
                System.out.println("Es Noviembre");
                break;
            case 12:
                System.out.println("Es Diciembre");
            default:
                System.out.println("Numero no valido");
        }
    }
}
