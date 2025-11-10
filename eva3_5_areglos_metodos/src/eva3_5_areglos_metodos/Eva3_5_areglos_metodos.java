/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_5_areglos_metodos;

/**
 *
 * @author nikol
 */
public class Eva3_5_areglos_metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int []miArreglo;
        miArreglo=crearArreglo(10,100);
        imprimirAreglo(miArreglo);
    }
    //un metodo que cre un areglo y le ponga valores aliatorios 
    public static int [] crearArreglo(int tama, int valorAleatorio){
        int resu[]= new int [tama];
        for( int i=0; i<tama; i++){
            resu[i]=(int)(Math.random()*valorAleatorio);
        }
        return resu;
    }
    //imprimir un areglo
    public static void imprimirAreglo (int []arreglo){//los corchetes dicen el tamaño
        for(int i=0; i<arreglo.length;i++){
            System.out.println("["+arreglo[i]+"]");
        }
        System.out.println("");
    }
    
}
