/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package invertir_una_matriz;

/**
 *
 * @author juand
 */
public class Invertir_una_Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {                                      
        
        int temporal, fila_in, columna_in, tamaño_m, b, cont_r;

        tamaño_m = 7;
        b = 0; //para rellenar la matriz
        cont_r = 0; //contador de veces que se intercambia un valor en la matriz
        fila_in = tamaño_m - 1; //contador inverso para intercambiar valores en las filas
        columna_in = tamaño_m - 1; //contador inverso para intercambiar valores en las columnas

        int Matriz[][] = new int[tamaño_m][tamaño_m];

        System.out.print("Matriz ingresada \n");
        
        //esta parte solo es para rellenar la matriz
        
        for (int columna = 0; columna < tamaño_m; columna++) {
            for (int fila = 0; fila < tamaño_m; fila++) {
                b += 1;
                Matriz[columna][fila] = b;
                System.out.print("[" + Matriz[columna][fila] + "]" + " ");
            }
            System.out.print("\n");
        }

        System.out.print("Matriz en orden inverso \n");
        
        //esta es la de intercambio de valores en la matriz

        for (int columna = 0; columna < tamaño_m; columna++) {
            for (int fila = 0; fila < tamaño_m; fila++) {
                if ((tamaño_m % 2) == 0) {  //este if es para aplicar la formula dependiendo si el tamaño de la matriz es par o impar
                    if (cont_r <= ((tamaño_m / 2) * tamaño_m)) {    //con este if aplicamos el resultado de la formula para saber hasta cuando se va a repetir tomando en cuenta la variable cont_r
                        temporal = Matriz[columna][fila];                       //aqui guardamos el valor de la celda en una variable temporal
                        Matriz[columna][fila] = Matriz[columna_in][fila_in];    //aqui igualamos la celda a su inversa  
                        Matriz[columna_in][fila_in] = temporal;                 //igualamos la inversa al valor que guardamos en la variable temporal
                        cont_r += 1;                                            //le restamos 1 a la variable cont_r     
                        if (tamaño_m == 2 && cont_r == 2) {         //este if es para solucionar un error de la formula cuando el tamaño es de 2 (2x2)
                            cont_r += 1;
                        }
                    }
                } else {
                    if (cont_r <= ((tamaño_m / 2) * tamaño_m) + (tamaño_m / 2)) { //en este if se hace lo mismo pero la formula cambia para numeros impares.
                        temporal = Matriz[columna][fila];
                        Matriz[columna][fila] = Matriz[columna_in][fila_in];
                        Matriz[columna_in][fila_in] = temporal;
                        cont_r += 1;
                    }
                }
                fila_in = fila_in - 1; //le restamos 1 al contador inverso para que avance a la celda que sigue en el orden
            }
            columna_in = columna_in - 1;      //le restamos 1 al contador inverso de las columnas para que avance a la siguiente columna
            fila_in = tamaño_m - 1;   //volvemos a igualar el contador de la fila para que 
        }

        //este for es para imprimir el vector despues de que se le hayan hecho los cambios
        
        for (int c = 0; c < tamaño_m; c++) {
            for (int f = 0; f < tamaño_m; f++) {
                System.out.print("[" + Matriz[c][f] + "]" + " ");
            }
            System.out.print("\n");
        }  
    }
    
}
