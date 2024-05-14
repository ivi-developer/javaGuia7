package punto1;
public class Producto {
    private String nombre;
    private Double precio;
    private Integer cantidad;
    public Producto(String nombre, Double precio, Integer cantidad){
        this.nombre= nombre;
        this.precio= precio;
        this.cantidad= cantidad;
    }
    public Producto(){}

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                '}';
    }
    public String getNombre(){return nombre;}
    public void setCantidad(Integer cantidad){this.cantidad=cantidad;}

    public Double getPrecio() {
        return precio;
    }
    public Integer getCantidad() {
        return cantidad;
    }
}
