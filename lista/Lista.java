package lista;
public class Lista<T>{
    //primer elemento de la lista
    private Nodo<T> cabeza;
    //total de elementos
    private int tamanio;
    //constructor
    public Lista(){
        this.cabeza=null;
        this.tamanio=0;

    }
    //devuelve el tamaño de la lista
    public int getTamanio() {
        return tamanio;
    }
    public boolean esVacia(){
        if (cabeza == null);
       return true;
        else
        return false;
        //return (cabeza==null); otra forma de hacerlo
    }
    public void agregar(T valor){
        Nodo<T> nuevo = new Nodo<T>();
        nuevo.setValor(valor);
        if (!esVacia())
        cabeza = nuevo;
        else{
            //agregar al final de la lista
            Nodo<T> aux = cabeza;
            while (aux.getSiguiente()!=null) {
                aux= aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        tamanio++;
        /**
         * insertar un nuevo nodo en la lista
         * @parram valor a agregar
         * @param posicion donde se insertara el nodo
         */
}
        public void insertar(T valor, int pos)throws PosicionIlegalException{
            if(pos>=0 && pos<=tamanio){

            }else {
                throw new PosicionIlegalException();
            }  
}
}