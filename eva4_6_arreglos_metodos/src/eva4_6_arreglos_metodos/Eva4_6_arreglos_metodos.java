/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva4_6_arreglos_metodos;

/**
 *
 * @author nikol
 */
public class Eva4_6_arreglos_metodos {
static String[] menu= {"productos, ventas,clientes,salir"};
    static String[] productos= {"tacos","tortas","tamales","hamburgesas"};
    public static void main(String[] args) {
        // TODO code application logic here
          imprimirArreglo(menu);
          imprimirArreglo(productos);
    }
    public static void imprimirArreglo (String []arreglo){//los corchetes dicen el tamaño
        for(int i=0; i<arreglo.length;i++){
            System.out.println((i+1)+"."+arreglo[i]);
        }
        System.out.println("");
    }
    
    
}
