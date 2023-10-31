package com.mycompany.p17_uu3;
import java.util.Scanner;

public class P17_uU3 {

    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        char Op;
        
        do{
            System.out.println("Bienvenido a una sola ejecuciòn");
            System.out.println("Escribe n para salir"); 
            Op = A.next().charAt(0);
        }while(Op != 'n');
    }
}
