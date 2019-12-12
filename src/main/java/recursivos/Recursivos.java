package recursivos;

import java.util.Arrays;

public class Recursivos {

    public static int cantidadCeros = 0;
    public static int binarioFinal = 0;



    /**
     * Inverte un arreglo de interos.
     * @param a el arreglo a ser invertido.
     * @param inicio el inicio del arreglo (primera vez = 0).
     * @param fin el final del arreglo (primera vez = a.length-1).
     */
    public static void invertir(int[] a, int inicio, int fin){
        //Si el indice del inicio es menor que el fin, cambia los valores, si no (<=) no cambia
        if(inicio<fin){
            int aux = a[fin];
            a[fin] = a[inicio];
            a[inicio] = aux;
            //Despues de invertir, llama de nuevo con los indices seguintes
            invertir(a, inicio+1, fin-1);
        }
    }

    /**
     * Conta la cantidad de Ceros de un arreglo usando dividir y conquistar
     * @param a el arreglo que desea saber la cantidad de ceros.
     * @return la cantidad de ceros.
     */
    public static int cantidadCeros(int[] a){

        //Caso base, arreglo solo un número
        if(a.length==1){
            if(a[0]==0){
                //Uso la variable global (static) para guardar el valor cambiado en cada ejecucion.
                cantidadCeros++;
            }
        }
        else{
            //Divide los arrays en la mitad
            int[] left = Arrays.copyOfRange(a, 0, a.length/2);
            int[] rigth = Arrays.copyOfRange(a, a.length/2, a.length);
            // Y llama la funcion de nuevo con cada mitad
            cantidadCeros(left);
            cantidadCeros(rigth);

        }

        return cantidadCeros;
    }

    /**
     * Convierte un decimal en binario usando recursion
     * @param decimal
     * @return
     */
    public static int convertirDecimalBinario(int decimal){
        //Caso base, decimal 0 = binario 0
        if (decimal == 0){
            return 0;
        }
        //Podria ser : return a%2 + 10 * binario(a/2);
        //Pero guardo en una variable static para observar los valores en cada llamada
        int proximo = decimal/2;
        binarioFinal = decimal % 2 + 10 * convertirDecimalBinario(proximo);
        return binarioFinal;

    }
}
