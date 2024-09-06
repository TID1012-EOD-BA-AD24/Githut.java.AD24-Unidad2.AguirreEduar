package miPrincipal;

public class Nodo<t>{
    //atributo valor de tipo de t que almacena al
    //objeto que se guarda en el nodo
    private t valor;
    //referencia al siguiente nodo enlazado
    Nodo<t> siguiente;
    
    //constructor por defecto
    public Nodo(t valor, Nodo<t> siguiente) {
        this.valor = valor;
        this.siguiente = siguiente;
    }
    


}