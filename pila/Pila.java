package pila;

import javax.xml.validation.Validator;

public class Pila<T> {
    //atributo cabeza que apunta al tope de la pila;
    private Nodo<T> cabeza;
    //atributo almacena el total de elementos de la pila
    private int tamanio;
    //constructor por defecto
    public Pila(){
        cabeza = null;
        tamaño = 0;

    }
    //devuelve el total de elemntos de la pila
    public int getTamanio(){
        return tamanio; 
    }

    //verificar si la pila esta vacia
    public boolean esVacia(){
        return(cabeza == null);
    }

    //apilar elemento Nuevo
    public void apilar(T valor){
        //crear nuevo nodo
        Nodo<T> nuevo = new Nodo<T>();
        //fijar el valor dentro del Nodo
        nuevo.setValor(Valor);
        if(esVacia()){
            //cabeza apunta al nuevo Nodo
            cabeza = nodo;
        }else{
            //se enlaza el campo siguiente de nuevo con la cabeza
            nuevo.setSiguiente(cabeza);
            //la nueva cabeza de la pila pasa a se nuevo
            cabeza = nuevo;
        
        }
    }
           
}