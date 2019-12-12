import recursivos.Recursivos;
import lista.*;

public class Main {

    public static void main(String args[]){
        testarListas();
        testarRecursiones();

    }


    public static void testarListas(){

        System.out.println("__________Testes lista Circular Simpte __________ \n");
        ListaCircularSimple listaCircularSimple = new ListaCircularSimple();
        listaCircularSimple.imprimirLista();
        listaCircularSimple.eliminarPrimero();
        listaCircularSimple.insertarFinal(2);
        listaCircularSimple.imprimirLista();
        listaCircularSimple.eliminarPrimero();
        listaCircularSimple.insertarFinal(3);
        listaCircularSimple.insertarFinal(5);
        listaCircularSimple.insertarFinal(6);

        listaCircularSimple.imprimirLista();

        listaCircularSimple.eliminarPrimero();
        listaCircularSimple.imprimirLista();
        listaCircularSimple.eliminarPrimero();
        listaCircularSimple.imprimirLista();
        listaCircularSimple.eliminarPrimero();

        listaCircularSimple.insertarFinal(7);
        listaCircularSimple.insertarFinal(7);
        listaCircularSimple.insertarFinal(8);

        listaCircularSimple.imprimirLista();

        System.out.println("__________ Fin Testes lista Circular Simpte __________ \n");

        System.out.println("_______ Lista doble _________");
        ListaVinculoDoble listaVinculoDoble = new ListaVinculoDoble();
        listaVinculoDoble.eliminarValor(0);
        listaVinculoDoble.imprimirLista();
        listaVinculoDoble.imprimirListaInvertido();

        listaVinculoDoble.insertarFinal(2);
        listaVinculoDoble.insertarFinal(3);
        listaVinculoDoble.insertarFinal(5);
        listaVinculoDoble.insertarFinal(1);
        listaVinculoDoble.insertarFinal(4);
        listaVinculoDoble.insertarFinal(5);
        listaVinculoDoble.imprimirLista();
        listaVinculoDoble.imprimirListaInvertido();

        System.out.println("______Teste remover______");

        listaVinculoDoble.eliminarValor(2);
        listaVinculoDoble.eliminarValor(5);
        listaVinculoDoble.eliminarValor(4);
        listaVinculoDoble.eliminarValor(123);
        listaVinculoDoble.imprimirLista();
        listaVinculoDoble.imprimirListaInvertido();

        System.out.println("__________Testes lista doble __________ \n");
    }

    public static void testarRecursiones(){
        System.out.println("______ Teste de inversion_______");

        int teste[] = {1,2,3,4,5,6,7};
        int fin = teste.length-1;
        System.out.println("original : ");
        for (int i = 0; i < teste.length ; i++) {
            System.out.print(teste[i] + "  ");
        }

        Recursivos.invertir(teste,0,fin);
        System.out.println("\nInvertido : ");
        for (int i = 0; i < teste.length ; i++) {
            System.out.print(teste[i] + "  ");
        }
        System.out.println(" \n____Fin del teste inversion_____"+ "\n");


        System.out.println("_____Teste Cantidad ceros_____");
        int teste2[] = {0,0,1,1,0,0,0,1,0,1,1,1,0,0,0,1};

        for (int i = 0; i < teste2.length ; i++) {
            System.out.print(teste2[i] + "  ");
        }
        int resultado = Recursivos.cantidadCeros(teste2);

        System.out.println("\nCantidad ceros = " + resultado);
        System.out.println("____Fin del teste cantidad ceros_____"+"\n");

        System.out.println("____Teste conversion_____");

        int decimal = 128;
        System.out.println("decimal = " + decimal);
        System.out.println("binario = " +Recursivos.convertirDecimalBinario(decimal));

        System.out.println("____Fin del teste conversion_____");
    }


}
