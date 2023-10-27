package com.mycompany.p9_u3;
import java.util.Scanner;

public class P9_U3 {

    public static void main(String[] args) {
        Scanner P = new Scanner(System.in);
        int H;
        
        System.out.println("Ingresa la hora de entrada en formato 24 hrs");
        int HE = P.nextInt();
        System.out.println("Ingresa la hora de salida en formato 24 hrs");
        int HS = P.nextInt();
        H = HS - HE;
        
        if (H > 0 && H <=2){
            H = H * 5;
            System.out.println("El pago es: "+H);
        }else if(H > 2 && H < 5){
            H = H * 4;
            System.out.println("El pago es: "+H);
        }else if(H > 4 && H < 10){
            H = H * 3;
            System.out.println("El pago es: "+H);
        }else if(H > 9){
            H = H * 2;
            System.out.println("El pago es: "+H);
        }
    }
}
