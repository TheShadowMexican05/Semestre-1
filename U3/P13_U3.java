package com.mycompany.p13_u3;
import java.util.Scanner;

public class P13_U3 {

    public static void main(String[] args) {
        Scanner Nm = new Scanner(System.in);
        int Ng = 0, P = 0;
        
        for(int i = 1; i <= 5; i++){
            System.out.println("Ingresa un numero");
            int N = Nm.nextInt();
            
            if(N > 0){
                P++;
            }else{
                Ng++;
            }
        }
        System.out.println("Los negativos son "+Ng);
        System.out.println("Los positivos son "+P);
    }
}
