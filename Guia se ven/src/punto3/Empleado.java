package punto3;
public class Empleado {
    private String nombre;
    private Double salario;
    private String puesto;
    public Empleado(String nombre,Double salario,String puesto){
        this.nombre=nombre;
        this.salario=salario;
        this.puesto=puesto;
    }
    public String getNombre(){return nombre;}
    public void setSalario(Double salario){this.salario = salario;}
    public Double getSalario(){return salario;}
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", puesto='" + puesto + '\'' +
                '}';
    }
}
