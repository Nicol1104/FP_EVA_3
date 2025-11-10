/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8_paso_referencia;

/**
 *
 * @author nikol
 */
public class Eva3_8_paso_referencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] datos=new int[1];
        datos[0]=5;
        System.out.print(datos);
         System.out.print("original="+ datos[0]);
         incrementar(datos);
           System.out.print("despues de incremetar ="+datos [0]);
    }
    public static void incrementar (int arreglo[]){
          for(int i=0; i<arreglo.length;i++)
           arreglo[i]=arreglo[i]+1;//o tambien asi arreglo [i] ++
       }
    
}
