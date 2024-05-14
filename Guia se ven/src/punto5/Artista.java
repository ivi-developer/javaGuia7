package punto5;
public class Artista {
    private String nombre;
    private Integer edad;
    private String nacionalidad;
    public Artista(){}
    public Artista(String nombre,Integer edad,String nacionalidad){
        this.nombre=nombre;
        this.edad=edad;
        this.nacionalidad=nacionalidad;
    }
    @Override
    public String toString() {
        return "Artista{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", nacionalidad='" + nacionalidad + '\'' +
                '}';
    }
}
