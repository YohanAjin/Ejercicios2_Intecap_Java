/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diasmesaños;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class DiasMesAños {

    public static void main(String[] args) {
     Scanner sp = new Scanner(System.in);
       System.out.println("Escriba su dia");
       int dia = sp.nextInt();
     Scanner ap = new Scanner(System.in);
       System.out.println("Escriba su mes");
       int mes = ap.nextInt();
     Scanner qp = new Scanner(System.in);
       System.out.println("Escriba su año");
       int año = qp.nextInt();
       
       switch (mes){
           case 1:
               System.out.println("Enero");
       if(dia>0 && dia<=31){
        if (año>0){
          System.out.println("Dia: "+dia+" "+" Mes: "+mes+" "+" Año: "+año);
        }else{
          System.out.println("Año incorrecto");  
        }
        }else{
           System.out.println("Dia incorrecto");
       }
         break;
           case 2:
           System.out.println("Febrero");
        if(dia>0 && dia<=28){
          if (año>0){
          System.out.println("Dia: "+dia+" "+" Mes: "+mes+" "+" Año: "+año);
        }else{
          System.out.println("Año incorrecto");  
        }
        }else{
           System.out.println("Dia incorrecto");
       }   
         break;
           case 3:
           System.out.println("Marzo");
        if(dia>0 && dia<=31){
          if (año>0){
          System.out.println("Dia: "+dia+" "+" Mes: "+mes+" "+" Año: "+año);
        }else{
          System.out.println("Año incorrecto");  
        }
        }else{
           System.out.println("Dia incorrecto");
       }   
         break;
           case 4:
           System.out.println("Abril");
        if(dia>0 && dia<=30){
        if (año>0){
          System.out.println("Dia: "+dia+" "+" Mes: "+mes+" "+" Año: "+año);
        }else{
          System.out.println("Año incorrecto");  
        }
        }else{
           System.out.println("Dia incorrecto");
       }   
         break;
           case 5:
           System.out.println("Mayo");
        if(dia>0 && dia<=31){
        if (año>0){
          System.out.println("Dia: "+dia+" "+" Mes: "+mes+" "+" Año: "+año);
        }else{
          System.out.println("Año incorrecto");  
        }
        }else{
           System.out.println("Dia incorrecto");
       }
         break;   
           case 6:
           System.out.println("Junio");
        if(dia>0 && dia<=30){
        if (año>0){
          System.out.println("Dia: "+dia+" "+" Mes: "+mes+" "+" Año: "+año);
        }else{
          System.out.println("Año incorrecto");  
        }
        }else{
           System.out.println("Dia incorrecto");
       }   
         break;
           case 7:
           System.out.println("Julio");
        if(dia>0 && dia<=31){
          if (año>0){
          System.out.println("Dia: "+dia+" "+" Mes: "+mes+" "+" Año: "+año);
        }else{
          System.out.println("Año incorrecto");  
        }
        }else{
           System.out.println("Dia incorrecto");
       }
        break;
           case 8:
           System.out.println("Agosto");
        if(dia>0 && dia<=31){
        if (año>0){
          System.out.println("Dia: "+dia+" "+" Mes: "+mes+" "+" Año: "+año);
        }else{
          System.out.println("Año incorrecto");  
        }
        }else{
           System.out.println("Dia incorrecto");
       }   
         break;
           case 9:
           System.out.println("Septiembre");
        if(dia>0 && dia<=30){
        if (año>0){
          System.out.println("Dia: "+dia+" "+" Mes: "+mes+" "+" Año: "+año);
        }else{
          System.out.println("Año incorrecto");  
        }
        }else{
           System.out.println("Dia incorrecto");
       }
         break;  
           case 10:
           System.out.println("Octubre");
        if(dia>0 && dia<=31){
        if (año>0){
          System.out.println("Dia: "+dia+" "+" Mes: "+mes+" "+" Año: "+año);
        }else{
          System.out.println("Año incorrecto");  
        }
        }else{
           System.out.println("Dia incorrecto");
       }   
         break;
           case 11:
           System.out.println("Noviembre");
        if(dia>0 && dia<=30){
        if (año>0){
          System.out.println("Dia: "+dia+" "+" Mes: "+mes+" "+" Año: "+año);
        }else{
          System.out.println("Año incorrecto");  
        }
        }else{
           System.out.println("Dia incorrecto");
       }   
        break;
           case 12:
           System.out.println("Diciembre");
           if(dia>0 && dia<=31){
        if (año>0){
          System.out.println("Dia: "+dia+" "+" Mes: "+mes+" "+" Año: "+año);
        }else{
          System.out.println("Año incorrecto");  
        }
        }else{
           System.out.println("Dia incorrecto");
       }
         break;
       }
    }
    
}
