/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numsmayoramenor2;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class NumsMayorAMenor2 {
    
    public static void main(String[] args) {
    Scanner sp = new Scanner(System.in);
       System.out.println("Escriba un numero");
       int n1 = sp.nextInt();
       Scanner ap = new Scanner(System.in);
       System.out.println("Escriba otro numero");
       int n2 = ap.nextInt();
       Scanner qp = new Scanner(System.in);
       System.out.println("Escriba otro numero");
       int n3 = qp.nextInt();
    if (n1>n2&&n1>n3&&n2>n3){
        System.out.println("El orden es: "+n1+" "+n2+" "+n3);
    }else if (n2>n1&&n2>n3&&n1>n3){
        System.out.println("El orden es: "+n2+" "+n1+" "+n3);
      }else if (n3>n1&&n3>n2&&n2>n1){
        System.out.println("El orden es: "+n3+" "+n2+" "+n1);    
    }
    }
    
}
