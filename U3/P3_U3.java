package com.mycompany.p3_u3;
import java.util.Scanner;

public class P3_U3 {

    public static void main(String[] args) {
        Scanner AMLP = new Scanner(System.in);
        
        System.out.println("Ingresa un numero de un dia: ");
        int dia = AMLP.nextInt();
        
        switch (dia){
            case 1:
                System.out.println("Es Lunes");
                break;
            case 2:
                System.out.println("Es Martes");
                break;
            case 3:
                System.out.println("Es Miercoles");
                break;
            case 4:
                System.out.println("Es Jueves");
                break;
            case 5:
                System.out.println("Es Viernes");
                break;
            case 6:
                System.out.println("Es Sabado");
                break;
            case 7:
                System.out.println("Es Domingo");
                break;
            default:
                System.out.println("Numero no valido");
        }
    }
}
