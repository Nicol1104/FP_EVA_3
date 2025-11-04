/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_metodos;

/**
 *
 * @author nikol
 */
public class Eva3_1_metodos {
    //
    public static void main(String[] args) { 
        //invocarlo el metodo=es usarlo
        //llamada a procedimiento o a funcion
        //1. si queremos recuperar el valor
        //1.guardar el valor
        int resu=calcualarCuadrado(4);
        System.out.println("el cuadrado de 4 es"+resu);
        //2.usra el valor guardado
         System.out.println("el cuadrado de 4 es"+calcualarCuadrado(4));
         //3.no me importa el resultado
         calcualarCuadrado(4);
    }
    //modificadores
    //modificador de acceso:public,private,protected,default
    //static-->se necesita para usar nuestros metodos en el main 
    //public static
                   //variable de retorno (tipo de dato) =es cuando me regresan un valor 
                      // nombre del metodo (usar vervo)//las clese siempre comienzan en mayusculas y los metodos no es como identificar
                                        //lista de parametros
                                         //cero o n cantidad
    public static int calcualarCuadrado(int num){ //en cabezado (geader)
        //{} -->implementacion del metodo( cuerpo del metodo)
        int cuadrado=num*num;
        return cuadrado;//regresamos el resultado
        //ya no se puede poner codigo aqui por que ya habias acabado el codigo con el return
        //System,out.println();//error no se puede poner codigo 
    } 
}
