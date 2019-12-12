package lista;

public class ListaCircularSimple {
    /**
     * Classe inline para representar un nodo de la lista.
     */
    public class Nodo {
        int dato;
        Nodo next;

        /**
         * Constructor del nodo.
         *
         * @param dato el int que el nodo almacena.
         */
        public Nodo(int dato) {
            this.dato = dato;
            this.next = null;
        }
    }

    public Nodo head;

    /**
     * Constructor de la lista vacia.
     */
    public ListaCircularSimple() {
        this.head = null;
    }


    /**
     * Inserta un intero en el final de la lista.
     *
     * @param dato el intero a ser insertado en la lista.
     */
    public void insertarFinal(int dato) {
        Nodo nodo = new Nodo(dato);

        if (head == null) {
            head = nodo;
            nodo.next = head;
        } else {
            nodo.next = head;
            Nodo temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = nodo;
        }

    }


    /**
     * Elimina el primero nodo de la lista.
     */
    public void eliminarPrimero() {
        Nodo temp = head;
        try {
            //Si el siguiente al head es el head, elimina el head
            if (temp.next == head) {
                head = null;
            }
            else {
                //Busca el ultimo
                do {
                    temp = temp.next;
                } while (temp.next != head);
                //El siguiente al head (que fue eliminado) pasa a ser el head
                temp.next = head.next;
                head = head.next;
            }
        } catch (NullPointerException e) {
            //head.next = null, lista vacia, no hay o que hacer
        }
    }

    /**
     * Imprime la lista.
     */
    public void imprimirLista() {
        Nodo temp = head;
        if (head != null) {
            do {
                System.out.print(temp.dato + " -> ");
                temp = temp.next;
            } while (temp != head);
            System.out.println();
        } else {
            System.out.println("lista vazia");
        }
    }
}
