package listaContactos;

import lista.PosicionIlegalException;

public class ClienteMain {

    public static void main(String[] args) {
        //crear una lista de contactos
        ListaDeContactos ldc = new ListaDeContactos();
        try{
            ldc.agregarContacto("fernando", "castro", "Barrancos", "FernandoCadtro@gmail.com", "6170062262", "66170003065");
            ldc.agregarContacto("maria", "Hernandez", "prados del sol #5402", "FernandoCadtro@gmail.com", "6170062262", "66170003065");

        }catch(PosicionIlegalException e){
            e.printStackTrace();
        }
    }
}