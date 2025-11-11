/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_11_capturar_clientes;

import java.util.Scanner;

/**
 *
 * @author nikol
 */
public class Eva3_11_capturar_clientes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String[ ] clientes= new String[5];
      double[ ] credito= new double[5];
      capturaraClientes(clientes,credito);
      System.out.println("clientes ");
      imprimir(clientes);
      System.out.println("credito");
      imprimir(credito);
      System.out.println("todo");
      imprimir(credito,clientes );
      
  // imprimirArreglo(arreglo);
    }
     public static void capturaraClientes(String[] clientes,double credito []) {
         Scanner captu = new Scanner( System.in);
         for(int i=0; i<clientes.length;i++){
             System.out.println("Nombre del cliente:");
             clientes[i]=captu.nextLine();
              System.out.println("credito");
               credito[i]=captu.nextDouble();
                  captu.nextLine();
         } 
     }
     public static void imprimir(String[] arreglo) {
          for(int i=0; i<arreglo.length; i++){
                 System.out.println("["+arreglo[i]+"]");
             }
              //System.out.println("");
     }
      public static void imprimir(double[] credito) {
            for(int i=0; i<credito.length; i++){
                 System.out.println("["+credito[i]+"]");
             }
              //System.out.println("");
      }
       public static void imprimir(String[] arreglo,double credito[]){
              for(int i=0; i<credito.length; i++){
                  System.out.println("["+arreglo[i]+"]");
             System.out.println("["+credito[i]+"]");
             
       }
              System.out.println("");
       }
}
