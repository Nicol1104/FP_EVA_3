/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_metodos;

import java.util.Scanner;

/**
 *
 * @author nikol
 */
public class Eva3_3_metodos {

   
    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
        int valor;
        do{
             imprimirMenu();//esto hace que me mueva al codigo donde esta declarado eso .aqui estoy invocando al metodo y hace un salto 
             valor=captu.nextInt();
             //manejo de opciones --> switch
             switch (valor){
                 case 1:
                      System.out.println("Suma de dos numeros ");
                      realizarSuma();
                  break;
                  case 2:
                       System.out.println("Calcular la potencia");
                       realizarPotencia();//esto nos manda a donde se declararon las cosas 
                 break;
                  case 3:
                 break;
                 
             }
             
        }while(valor !=4);
       
    }
    //imprimir un menu
    public static void imprimirMenu(){
        System.out.println("Bienvenido al sistema");
        System.out.println("Elige la opcion que necesitas");
        System.out.println("1.Calcular una suma");
        System.out.println("2.Calcular una potencia");
        System.out.println("3.Calcular un mensaje");
        System.out.println("4.Terminar");
    }
    //
      public static void realizarSuma(){
          Scanner captu = new Scanner (System.in);
          int val1,val2;
            System.out.println("Valor 1");
            val1=captu.nextInt();
              System.out.println("Valor 2");
              val2=captu.nextInt();
              int resu= sumar(val1,val2);
              System.out.println("La suma es "+resu);
       }
      public static int sumar (int num1, int num2){
          return num1 + num2;
      }
      //calcular una potencia 
       public static void realizarPotencia(){
          Scanner captu = new Scanner (System.in);
          int val1,val2;
            System.out.println("Base:");
            val1=captu.nextInt();
              System.out.println("Exponente");
              val2=captu.nextInt();
              int resu= sumar(val1,val2); 
               System.out.println("La potencia es"+resu);
       }
         public static int calcularPotencia( int base, int expo){
             //ciclo -->for
      int pot=1;
      for (int i=1;i<=expo;i++){
          pot=pot+base;
      }
      return pot;
    }
      
}
