package punto3;
import java.util.Optional;
import java.util.Vector;
public class Empleados {
    Vector<Empleado>empleados;
    public Empleados(){empleados=new Vector<>();}
    public void agregarEmpleados(String nombre,Double salario,String puesto){
        Empleado empleado=new Empleado(nombre, salario, puesto);
        empleados.add(empleado);
    }
    public void mostrarEmpleados(){empleados.forEach(Empleado::toString);}
    public void buscarYMostrar(String nombre){
       Optional <Empleado> empleado=empleados.stream().filter(empleado1 -> empleado1.getNombre().equalsIgnoreCase(nombre)).findAny();
        System.out.println(empleado.toString());
    }
    public void modificarSalario(Empleado empleado,Double nuevoSalario){empleado.setSalario(nuevoSalario);}
    public Double promedioSalario(){
        Double sumatoria= 0.0;
        for(Empleado empleado:empleados) sumatoria+= empleado.getSalario();
        return sumatoria/empleados.size();
    }
}

