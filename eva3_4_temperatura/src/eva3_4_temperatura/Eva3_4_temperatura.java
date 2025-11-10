/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_temperatura;

import java.util.Scanner;

/**
 *
 * @author nikol
 */
public class Eva3_4_temperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
       
    }
     public static void menu(){
           System.out.println("Bienvenido");
           System.out.println("Elige los grados que quieres convertir");
           System.out.println("1.Fahrenheit");
           System.out.println("2.Kelvin");
           System.out.println("3.Celcius");
           System.out.println("4.Termino");
           
      }
     public static double convertirfarCelcius(double far){
          Scanner captu = new Scanner (System.in);
          double fahr,resu;
         System.out.println("Grados fahrenheit");
        fahr=captu.nextDouble();
        resu=convertirfarCelcius(fahr);
        System.out.println(fahr+"fahrenheit="+resu+"c");
          resu=(far-32)/1.8;
         return resu;
     }
      public static double convertirkelcel(double kel){
          Scanner captu = new Scanner (System.in);
          double kel,resu;
           System.out.println("Grados Kelvin ");
        kel=captu.nextDouble();
        resu=convertirkelcel(kel);
        System.out.println(kel+"Kelvin="+resu+"c");
         resu=(kel+273.15);
         return resu;
      }
      public static double convertircelkel(double cel){
            Scanner captu = new Scanner (System.in);
            double cel,resu;
           System.out.println("Grados Celcius  ");
        cel=captu.nextDouble();
        resu=convertircelkel(cel);
        System.out.println(cel+"Celcius="+resu+"k");
          resu=(cel-273.15);
         return resu;
      }
}
