package com.mycompany.p3_u5;
import java.util.Scanner;
public class P3_U5 {
    public static void main(String[]args){
        Scanner O = new Scanner(System.in);
        
        System.out.print("Ingresa un valor para x: ");
        double x = O.nextDouble();
        System.out.print("Ingresa un valor para y: ");
        double y = O.nextDouble();
        
        System.out.println("El resultado para la primer operación es: "+O1(x, y));
        System.out.print("El resultado para la segunda operación es: "+O2(x, y));
    }
    public static double O1(double x, double y){
        double R; 
        R = Math.pow(x, 2) + (2*Math.pow(y, 4));
        return R;
    }
    public static double O2(double x, double y){
        double R; 
        R = Math.sqrt(Math.pow(x, 4) + 5 * y);
        return R;
    }
}
