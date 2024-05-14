package punto4;
import java.time.LocalDate;
public class Vendedor extends Empleado{
    private Integer porcentajeComision;
    private Celular celular;
    public Vendedor(){super();}
    public Vendedor(String legajo, String dni, String nombre, String apellido, String mail, String telefono, LocalDate fechaDeIngreso, Double salarioBase,Integer porcentajeComision,Celular celular){
        super(legajo, dni, nombre, apellido, mail, telefono, fechaDeIngreso, salarioBase);
        this.porcentajeComision=porcentajeComision;
        this.celular=celular;
    }
    public Integer getPorcentajeComision(){return porcentajeComision;}
    public Celular getCelular(){return celular;}
    @Override
    public Double calcularSalario(){return getSalarioBase()+getSalarioBase()*porcentajeComision/100;}
    @Override
    public String toString() {
        return super.toString()+ "Vendedor{" +
                "porcentajeComision=" + porcentajeComision +
                ", celular=" + celular +
                '}';
    }
}
