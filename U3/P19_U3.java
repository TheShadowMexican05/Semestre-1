package com.mycompany.p19_u3;
import java.util.Scanner;

public class P19_U3 {

    public static void main(String[] args) {
        Scanner C = new Scanner(System.in);
        int Ng = 0, Cr = 0, P = 0, i = 1;
        
        System.out.println("Ingresa el la cantidad de numeros a evaluar: ");
        int N = C.nextInt();
                
        while(i <= N){
            System.out.println("Ingresa un numero: ");
            int Num = C.nextInt();
            
            if(Num > 0){
                P++;
            }else if(Num < 0){
                Ng++;
            }else if(Num == 0){
                Cr++;
            }
            i++;
        }
        System.out.println("La cantidad de numeros positivos es: "+P);
        System.out.println("La cantidad de numeros iguales a 0 es: "+Cr);
        System.out.println("La cantidad de numeros negativos es: "+Ng);
    }
}
