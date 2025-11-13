/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_areglos_formanerafacil;

/**
 *
 * @author nikol
 */
public class Eva2_14_areglos_forManeraFacil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // variable que nos ayuda a escojer numeros aleatorios es : Math.random();
       //arreglo.length este sirve para ahorrarnos de poner el tamaño en el for 
        int arreglo[] = new int[10];
     
        for(int i=0;i<arreglo.length;i++)
            arreglo[i]= (int)(Math.random()*100);
        
        for(int i =0; i<arreglo.length;i++)
            System.out.println("["+arreglo[i]+"]");
        
    }
    
}
