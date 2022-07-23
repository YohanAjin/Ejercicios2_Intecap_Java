/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package númeroposyneg;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class NúmeroPosYNeg {

    public static void main(String[] args) {
 Scanner sp = new Scanner(System.in);
       System.out.println("Escriba un numero");
    int n1 = sp.nextInt();
   if (n1>0){
       System.out.println("Es positivo");
   }else{
       System.out.println("Es negativo");
   }
    }
    
}
