package listaContactos;

import lista.PosicionIlegalException;
import lista.Lista;

public class ClienteMain {
    public static void main(String[] args) {
        //crear una lista de contactos
        ListaDeContactos ldc = new ListaDeContactos();
        try{
            //agregarmos algunos contactos
            ldc.agregarContacto("Fernado", "Castro", 
                "Laguna de camamo 150 Ote. Las Quintas. Culiacan, Sinaloa", "FernandoC@gmail.com", 
                "6677511616","6677500500");
            ldc.agregarContacto("Maria","Vargas","Isla del Socorro 1085, col.las Vegas, Culiacan, Sinaloa",
                "mariav@gmail.com","667160732","6672514532" );
            ldc.agregarContacto("Carolina", "Sanchez", "Colon 170 Pte.Culiacan Sinala",
                "carolinas@gmail.com" , "6671151611", "6671800800");
            ldc.agregarContacto("Federica", "Cardemas", "Laguna de Catemaco 1723.col Rosales, Culiacan Sinala", 
                "federicac@hotmail.com","6677160732","6671141236");
            //Lista los contactos
            System.out.println("LISTADO DE CONTACTOS ANTES DE LAS ACTUALIZACIONES");
            for(int i=0; i<ldc.mostrarTodosLosContactos().getTamanio();i++) 
            {
                System.out.println(i+"-"+ldc.mostrarTodosLosContactos().getValor(i).toString());
            }
            //Modificar un contacto
            ldc.modificarContacto("Maria","Vargas","Isla del Socorro 1085, col.las Vegas, Mazatlan, Sinaloa",
                "mariav@gmail.com","667160732","6672514532");
            //Listo los contactos
            System.out.println("LISTADO DE CONTACTOS DEPUES DE LAS ACTUALIZACIONES");
            for(int i=0; i<ldc.mostrarTodosLosContactos().getTamanio();i++) 
            {
                System.out.println(i+"-"+ldc.mostrarTodosLosContactos().getValor(i).toString());
            }
            //Buscar a un contacto existente
            Contacto con = ldc.buscarContacto("Carolina", "Sanchez");
            if (con != null){
                System.out.println("Dato Encontrado"+"\n"+con);

            }else{
                System.out.println("CONTACTO NO ENCONTRADO");
            }
            //Buscar un contacto no existente
            con = ldc.buscarContacto("Carolina", "Sanches");
            if (con != null){
                System.out.println("Dato Encontrado"+"\n"+con);

            }else{
                System.out.println("CONTACTO NO ENCONTRADO");
            }
            //Elimminar im contacto 
            if (ldc.eliminarContacto("Carolina","Sanchez")){
                System.out.println("CONTACTO ELIMINADO");
            }else{
                System.out.println("NO SE PUDO ELIMINAR CONTACTO");
            }
            //TRATAR DE ELIMINAR UN CONTACTO QUE NO EXISTE
            if (ldc.eliminarContacto("Carolina","Sanchez")){
                System.out.println("CONTACTO ELIMINADO");
            }else{
                System.out.println("NO SE PUDO ELIMINAR CONTACTO");
            }
            //Mostrar de nuevo la lista de contactos
            Lista<Contacto> listado = ldc.mostrarTodosLosContactos();
            for(int i=0;i<listado.getTamanio();i++){
                System.out.println(i+" - "+listado.getValor(i));
            }


        }catch (PosicionIlegalException e) {
            e.printStackTrace();

    
        }
    }
    
}