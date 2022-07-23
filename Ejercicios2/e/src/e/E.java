/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class E {

  
    public static void main(String[] args) {
       Scanner sp = new Scanner(System.in);
       System.out.println("Escriba un numero");
       int n1 = sp.nextInt();
       Scanner ap = new Scanner(System.in);
       System.out.println("Escriba otro numero");
       int n2 = ap.nextInt();
       if (n1==n2){
        System.out.println("Son valores iguales");
       }else{
        System.out.println("Son valores diferentes");
       }
    }
    
}
