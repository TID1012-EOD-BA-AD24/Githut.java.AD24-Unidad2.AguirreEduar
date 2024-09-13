package miPrincipal;
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
    }

}