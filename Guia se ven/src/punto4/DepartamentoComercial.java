package punto4;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
public class DepartamentoComercial {
    Integer coidgoDepto;
    List<Empleado>empleados;
    public DepartamentoComercial(){empleados=new ArrayList<>();}
    public DepartamentoComercial(Integer coidgoDepto){
        empleados=new ArrayList<>();
        this.coidgoDepto=coidgoDepto;
    }
    public Long obtenerCantidadVendedores(){return empleados.stream().filter(empleado -> empleado instanceof Vendedor).count();}
    public Long obtenerCantidadComisionistas(){return empleados.stream().filter(empleado -> empleado instanceof Comisionista).count();}
    public Long obtenerCantidadRepartidor(){return empleados.stream().filter(empleado -> empleado instanceof Repartidor).count();}
    public void aplicarAumentos(Integer aumento){empleados.stream().forEach(empleado -> empleado.setSalarioBase(empleado.getSalarioBase()+empleado.getSalarioBase()*aumento/100));}
    public Long cantReapartidoresConSalida(Integer cantSalidas){return empleados.stream().filter(empleado -> empleado instanceof Repartidor && ((Repartidor)empleado).getSalidasPorDia()>=cantSalidas).count();}
    public Long cantVendedoresConPorcentaje(Integer porcentaje){return empleados.stream().filter(empleado -> empleado instanceof Vendedor &&((Vendedor)empleado).getPorcentajeComision()<=porcentaje).count();}
    public Long cantComisionistasConEntrega(Integer cantEntregas){return empleados.stream().filter(empleado -> empleado instanceof Comisionista &&((Comisionista)empleado).getCantEntregas()>=cantEntregas).count();}
    public Long cantVendededoresConMarca(String marca){return empleados.stream().filter(empleado -> empleado instanceof Vendedor &&((Vendedor)empleado).getCelular().getMarca().equalsIgnoreCase(marca)).count();}
    public Optional<Vendedor> vendedorMayorPorecntajeDeVenta(){return empleados.stream().filter(empleado -> empleado instanceof Vendedor).map(empleado -> (Vendedor)empleado).max(Comparator.comparing(Vendedor::getPorcentajeComision));}
    public Optional<Repartidor> repatidorMasSalidas(){return empleados.stream().filter(empleado -> empleado instanceof Repartidor).map(empleado -> (Repartidor)empleado).max(Comparator.comparing(Repartidor::getSalidasPorDia));}
    public Optional<Comisionista> comisionistaMenosEntregas(){return empleados.stream().filter(empleado -> empleado instanceof Comisionista).map(empleado -> (Comisionista)empleado).min(Comparator.comparing(Comisionista::getCantEntregas));}
    public Long vendedoresPorCarecteristicas(String numero){return empleados.stream().filter(empleado -> empleado instanceof Vendedor && empleado.getTelefono().startsWith(numero)).count();}
    @Override
    public String toString() {
        return "DepartamentoComercial{" +
                "coidgoDepto=" + coidgoDepto +
                ", empleados=" + empleados +
                '}';
    }
    public void agregarEmpleado(Empleado empleado){empleados.add(empleado);}
    public void mostrarEmpleados(){empleados.stream().forEach(empleado -> System.out.println(empleado.toString()));}
}
