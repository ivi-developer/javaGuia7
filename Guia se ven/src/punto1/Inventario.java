package punto1;
import java.util.ArrayList;
import java.util.Optional;

public class Inventario {
    ArrayList<Producto> listaProductos;
    public Inventario(){listaProductos=new ArrayList<>();}
    public void agregarProducto(Producto producto){listaProductos.add(producto);}
    public void mostrarProductos(){listaProductos.forEach(Producto::toString);}
    public Optional<Producto> buscarPorNombre(String nombre){
       Optional<Producto> producto=listaProductos.stream().filter(producto1 -> producto1.getNombre().equalsIgnoreCase(nombre)).findFirst();
       System.out.println(producto);

       return producto;
    }
    public void modificarCantidad(Producto aModificar, Integer nuevaCant){

        aModificar.setCantidad(nuevaCant);
    }
    public Double valorTotalInventario(){
        Double precioTotal=0.0;
        for(Producto producto:listaProductos)precioTotal+=(producto.getPrecio()* producto.getCantidad());
        return precioTotal;
    }


}
