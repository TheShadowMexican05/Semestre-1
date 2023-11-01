package com.mycompany.p18_u3;

public class P18_U3 {

    public static void main(String[] args) {
        double S = 1500, SA, ST = 0;
        int i = 1;
        
        while(i <= 6){
            S = S + (S * 0.1);
            SA = S * 12;
            System.out.println("El salario de el mes del año "+i+" es: "+S);
            ST = ST + SA;
            System.out.println("El salaria acabo de un año es: "+SA);
            i++;
        }
        System.out.println("El salario acabo de 6 años es: "+ST);
    }
}
