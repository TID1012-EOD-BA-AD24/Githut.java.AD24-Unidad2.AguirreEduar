package delimitadores;

import miPrincipal.Delimitadores;

public class AppDelimitadores{
    public static void main(String[] args) {
        String expresion = "While (m<(n[8]+0)){"+
                            "   int p=7;"+
                            "   /*comentarios*/"+
                            "}";
        Delimitadores objDel = new Delimitadores();
        if (objDel.evaluacionDelimitadores(expresion))
        System.out.println("Expresion Correcta");
        else 
        System.out.println("Expresion Incorrecta");

        expresion = "While (m<(n[8)+0)){"+
                            "   int p=7;"+
                            "   /*comentarios*/"+
                            "}";
        if (objDel.evaluacionDelimitadores(expresion))
        System.out.println("Expresion Correcta");
        else 
        System.out.println("Expresion Incorrecta"); 

        expresion = " (A+B)";
        if (objDel.evaluacionDelimitadores(expresion))
        System.out.println("Expresion Correcta");
        else 
        System.out.println("Expresion Incorrecta"); 

        expresion = " A+B)";
        if (objDel.evaluacionDelimitadores(expresion))
        System.out.println("Expresion Correcta");
        else 
        System.out.println("Expresion Incorrecta"); 
}
}

