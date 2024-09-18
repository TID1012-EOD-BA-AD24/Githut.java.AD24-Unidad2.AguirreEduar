
package miPrincipal;
import java.util.EmptyStackException;
import java.util.Stack;

import pila.Pila;
public class Principal {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
       // System.out.println(new Principal().getGreeting());
       //crear una nueva pila de enteros
       Pila<Integer> pila1 = new Pila<Integer>();
       //apilar datos Enteros
       pila1.apilar(2);
       pila1.apilar(5);
       pila1.apilar(7);
    System.out.println("El tope de la pila es " + pila1.cima());
        //se desapila
        pila1.retirar();//retira el 7
        System.out.println("El tope de la pila es " + pila1.cima());
        //se desapila
        pila1.retirar();//retira el 5
        System.out.println("El tope de la pila es " + pila1.cima());
        //se desapila
        pila1.retirar();//retira el 2
        System.out.println("El tope de la pila es " + pila1.cima());
        System.out.println("¿pila vacia?"+ pila1.esVacia());

    pila1.apilar(8);
    pila1.apilar(10);
    pila1.apilar(20);

    if(pila1.buscar(8)!= -1)
        System.out.println("el elemento buscado esta en la posicion "+pila1.buscar(8));
    else
        System.out.println("elemento no encontrado");
    
    //USO DE LA CLASE STACK
    //Crear a una pila de enteros
    Stack<Integer> pila = new Stack<Integer>();
    //apilar elementos
    pila.push(2);
    pila.push(5);
    pila.push(7);
    System.out.println("El tope  de la pila;"+pila.peek());
    //desapilamos elementos
    
    try{ //usamos try catch para la excepcion 
    pila.pop();
    System.out.println("El tope  de la pila;"+pila.peek());
    pila.pop();
    System.out.println("El tope  de la pila;"+pila.peek());
    pila.pop();
    System.out.println("El tope  de la pila;"+pila.peek());

    } catch (EmptyStackException e) {
        System.out.println("Error: La pila está vacía.");
    }
    //cuando desapila de una pila vacia
    try {
    pila.pop(); // Esto lanzará una excepción
    } catch (EmptyStackException e) {
        System.out.println("Error: No se puede desapilar, la pila está vacía.");
    }

    //Apilar mas Elementos
    pila.push(10);
    pila.push(8);
    pila.push(20);
    System.out.println("El elemento 8 se encuentra en la posicion:"+pila.search(8));
    System.out.println("El elemento 10 se encuentra en la posicion:"+pila.search(10));
    System.out.println("El elemento 20 se encuentra en la posicion:"+pila.search(20));


    }
}