package hash;

public class Ciudad {
    private String nombre;
    private int poblacion;
    private String Estado;
    private String pais;
    public Ciudad(String nombre, int poblacion, String Estado, String pais){
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.Estado = Estado;
        this.pais = pais;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getPoblacion() {
        return poblacion;
    }
    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }
    public String getEstado() {
        return Estado;
    }
    public void setEstado(String estado) {
        Estado = estado;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    @Override
    public String toString() {
        return " nombre=" + nombre + ", poblacion=" + poblacion + ", Estado=" + Estado + ", pais=" + pais ;

    }
    
    
}
