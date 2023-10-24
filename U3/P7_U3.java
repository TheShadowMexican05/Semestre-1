package com.mycompany.p7_u3;
import java.util.Scanner;

public class P7_U3 {

    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);
        
        System.out.println("Ingresa la temperatura: ");
        float tem = T.nextFloat();
        
        if(tem > 27){
            System.out.println("Hace calor");
        }else if(tem < 27 && tem > 20){
            System.out.println("Clima agradable");
        }else{
            System.out.println("Clima fresco o frio");
        }
    }
}