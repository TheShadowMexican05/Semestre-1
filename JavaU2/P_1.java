/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p_1;
import java.util.Scanner;

/**
 *
 * @author LaboratorioLTI2
 */
public class P_1 {

    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nom = scanner.nextLine();
        System.out.println("Hola "+nom);
        System.out.println("Ingresa tu edad: ");
        int ed = scanner.nextInt();
        System.out.println("Tu edad es: "+ed+" años");
    }
}
