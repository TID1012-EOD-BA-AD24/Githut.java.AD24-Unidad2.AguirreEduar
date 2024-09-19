package miPrincipal;
import pila.Pila;


public class Delimitadores{

    public boolean evaluacionDeDelimitadores(String cadena){
        Pila<String> pcaracteres = new Pila<String>();
        int i = 0;
        boolean masElementosPorLeer = true;
        while (i<cadena.length() && masElementosPorLeer)
        {
            char car = cadena.charAt(i);
            String s = charToString(car);
            i++;
            switch (car)
            {
                //En caso de Apilar
                case '(':{
                    pcaracteres.apilar(charToString(')'));
                    break;
                }
                case '[':{
                    pcaracteres.apilar(charToString(']'));
                    break;
                }
                case '{':{
                    pcaracteres.apilar(charToString('}'));
                    break;
                }
                case '/':{
                if (siguienteEsAsterisco(cadena,i)) {
                    pcaracteres.apilar(charToString('/'));
                    i++;
                }
                break;
                }
            }
            
        }
    }

    private static boolean siguienteEsAsterisco(String cadena, int  posicion) {
        char car = cadena.charAt(posicion);
        if (car=='*')
            return true;
        else
            return false;
    }

    
    private static boolean siguienteEsDiagonal(String cadena, int posicion) {
        char car = cadena.charAt(posicion);
        if (car=='/')
            return true;
        else
            return false;
    }

    //convierte un char a un objeto tipo String
    private static String charToString(char ch) {
        return String.valueOf(ch);
    }
      

}
