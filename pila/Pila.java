package pila;
public class Pila<T> {
//Atributos cabeza, que apunta al tope de la pila
private Nodo<T> cabeza;
//Almacena el total de elementos de la pila
private int tamanio;
//Constructor por defecto
public Pila() {
cabeza = null;
tamanio = 0;
}
public int getTamanio() {
return tamanio;
}
//Verifica si la pila esta vacia
public boolean esVacia() {
return (cabeza == null);
}
//Apila un elemento nuevo
public void apilar(T valor) {
    //Crear un nuevo nodo
    Nodo<T> nuevo = new Nodo<T>();
    //Fijar el valor dentri de nuevo
    nuevo.setValor(valor);
    if (esVacia()) {
    //cabeza apunta al nuevo nodo
    cabeza = nuevo;
    }
    else {
    //se enlaza el campo siguiete de nuevo con la cabeza
    nuevo.setSiguiente(cabeza);
    //la nueva cabeza de la pila pasa a ser nuevo
    cabeza = nuevo;
    }
    //Incrementamos el tamaño de la pila
    tamanio++;
    }
    //Elimina un elemento de la pila
public void retirar() {
    if (!esVacia()) {
    cabeza = cabeza.getSiguiente();
    tamanio--;
    }
    }
    //Devuelve el elemento almacenado en el tope de la pila
    public T cima() {
    if(!esVacia())
    return cabeza.getValor();
    else
    return null;
    }
    }