package pila;

public class Nodo<T>{
    //Atributo valor de tipo T, Almacena la referencia al
    //objeto que se guarda el nodo
    private T valor;
    //Referencia al siguiente nodo anclado
    Nodo<T>siguiente;
    //constructor por defecto
    public Nodo (T valor, Nodo<T> siguiente) {
        this.valor = valor;
        this.siguiente = siguiente;
    }
    public Nodo(){
        valor = null;
        siguiente= null;
    }
    //devuelve el valor
    public T getValor() {
        return valor;
        
    }
    //modificar el valor 
    public void setValor(T valor) {
        this.valor = valor;
    }
    //devolver el atributo siguiente
    public Nodo<T> getSiguiente() {
        return siguiente;
    }
    //modificar el atributo siguiente
    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
    
}
