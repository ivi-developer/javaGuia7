package punto4;

import java.time.LocalDate;

public class Comisionista extends Empleado{
    private Integer cantEntregas;
    public Comisionista(){super();}
    public Comisionista(String legajo, String dni, String nombre, String apellido, String mail, String telefono, LocalDate fechaDeIngreso, Double salarioBase,Integer cantEntregas){
        super(legajo, dni, nombre, apellido, mail, telefono, fechaDeIngreso, salarioBase);
        this.cantEntregas=cantEntregas;
    }
    public Integer getCantEntregas(){return cantEntregas;}
    @Override
    public Double calcularSalario(){return getSalarioBase()+cantEntregas*1000;}
    @Override
    public String toString() {
        return super.toString()+ "Comisionista{" +
                "cantEntregas=" + cantEntregas +
                '}';
    }
}
