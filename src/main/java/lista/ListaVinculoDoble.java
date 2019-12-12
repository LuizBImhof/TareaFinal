package lista;

public class ListaVinculoDoble {
    /**
     * Classe inline para representar un nodo de la lista
     */
    public class Nodo{
        Nodo prev;
        Nodo next;
        int dato;

        /**
         * Constructor del nodo
         * @param dato el int que el nodo almacena
         */
        public Nodo(int dato) {
            this.dato = dato;
            prev = null;
            next = null;
        }
    }

    public Nodo head;
    public Nodo tail;

    /**
     * Constructor de la lista vacia
     */
    public ListaVinculoDoble() {
        head = null;
        tail = null;
    }

    /**
     * Inserta un intero en el final de la lista.
     * @param dato el intero a ingresar en la lista.
     */
    public void insertarFinal (int dato){
        Nodo nodo = new Nodo(dato);
        if(existeNumero(dato)){
            // No permitir numeros repetidos, no adiciona
        }else {
            //Si no hay head, la lista está vacia
            if (head == null) {
                head = nodo;
                tail = nodo;
                head.prev = null;
            }
            //Ya hay elementos en la lista
            else {
                tail.next = nodo;
                nodo.prev = tail;
                tail = nodo;
            }
            tail.next = null;
        }
    }

    /**
     * Busca un nodo con el intero ingresado y o elimina si existe en la lista.
     * @param dato el intero a ser removido de la lista.
     * @return true si eliminó, false si no eliminó.
     */
    public boolean eliminarValor(int dato){
        //Busca el nodo con el intero
        Nodo delete = getNodo(dato);
        if(delete != null){
            //Si el nodo es el head, el siguiente pasa a ser el head,  y el anterior debe ser null
            if(delete == head){
                head = delete.next;
                head.prev = null;
            }
            //Si el nodo es el tail, el anterior pasa a ser el tail, y el seguiente debe ser null
            else if(delete == tail){
                tail = delete.prev;
                tail.next = null;
            }
            //Si el nodo no es head ni tail, el siguiente del anterior pasa a ser el siguiente del nodo eliminado
            // y el anterior del siguiente pasa a ser el anterior del nodo eliminado
            else{
                delete.prev.next = delete.next;
                delete.next.prev = delete.prev;
            }
        }
        return false;
    }

    /**
     * Busca el nodo con el intero ingresado.
     * @param dato el intero a ser buscado.
     * @return el nodo con el intero dato.
     */
    public Nodo getNodo(int dato){
        Nodo temp = head;
        if(head == null){
            return null;
        }
        while (temp != null){
            if(temp.dato == dato){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    /**
     * Busca si el intero del parametro existe en la lista.
     * @param dato el intero a ser buscado.
     * @return true si existe, false si no existe en la lista.
     */
    public boolean existeNumero(int dato){
        Nodo temp = head;
        if(head == null){
            return false;
        }
        while (temp != null){
            if(temp.dato == dato){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    /**
     * Imprime la lista partindo del head, utilizando el next nodo
     */
    public void imprimirLista(){
        Nodo temp = head;
        if(head == null){
            System.out.println("Lista vacia");
            return;
        }
        while (temp != null){
            if(temp == tail){
                System.out.println(temp.dato);
            }
            else {
                System.out.print(temp.dato + "->");
            }
            temp = temp.next;
        }

    }

    /**
     * Imprime la lista partindo del tail, utilizando el previous nodo
     */
    public void imprimirListaInvertido(){
        Nodo temp = tail;
        if(head == null){
            System.out.println("Lista vacia");
            return;
        }
        while (temp != null){
            if(temp == head){
                System.out.println(temp.dato);
            }
            else {
                System.out.print(temp.dato + "->");
            }
            temp = temp.prev;
        }
    }


}
