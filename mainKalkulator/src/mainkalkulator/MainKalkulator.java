/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainkalkulator;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class MainKalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        Kalkulator K=new Kalkulator();
        System.out.print("Value 1 = ");
        double V1=input.nextInt();
        K.setValue1(V1);
        System.out.print("Value 2 = ");
        double V2 =input.nextInt();
        K.setValue2(V2);
        K.setNameProject();
        K.setNoteProject("This Projet Shown You How to Menage Method in Java");
        System.out.println("Result Add is = "+K.add(V1, V2));
        System.out.println("Result Minus is = "+K.minus(V1, V2));
        System.out.println("Result Multiplication is = "+K.multiplication(V1, V2));
        System.out.println("result Division is = "+K.division(V1, V2));
        
    }
    
}
