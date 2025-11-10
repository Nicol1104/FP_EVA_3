/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_paso_parametros;

/**
 *
 * @author nikol
 */
public class Eva3_7_paso_parametros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     int  num=5;
     System.out.print("original"+num);
    incremetar(num);//se manda una copia del valor almancenado  en num
      System.out.print("Despues de incremetar ="+num);
    }
    //incremetar un num entero 
       public static void incremetar (int valor){
           valor=valor+1;
       }
}
