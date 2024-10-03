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
        if (cabeza == null)
        return true;
        else
        return false;
        //return (cabeza==null); otra forma de hacerlo
    }
    public void agregar(T valor){
        Nodo<T> nuevo = new Nodo<T>();
        
    }
}