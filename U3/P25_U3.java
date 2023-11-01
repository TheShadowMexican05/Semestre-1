package com.mycompany.p25_u3;
import java.util.Scanner;

public class P25_U3 {

    public static void main(String[] args) {
        Scanner OP = new Scanner(System.in);
        char E;
        double Op = 0;
        
        do{
            System.out.println("Ingresa un numero: ");
            double N = OP.nextDouble();
            System.out.println("Ingresa la operacion a realizar: \nSuma(+) \nResta(-) \nMultiplicación(*) \nDivisión(/) \nPara salir ingrese 'q'");
            E = OP.next().charAt(0);
            
            switch (E){
                case '+':
                    Op = Op + N;
                    System.out.println(Op);
                    break;
                case '-':
                    Op = Op - N;
                    System.out.println(Op);
                    break;
                case '*':
                    Op = Op * N;
                    System.out.println(Op);
                    break;
                case '/':
                    Op = Op / N;
                    System.out.println(Op);
                    break;
                case 'q':
                    System.out.println(Op);
                    break;
                default:
                    System.out.println("No es valido");
                    break;
            }
        }while (E != 'q');
    }
}