package punto4;

import java.time.LocalDate;

public class Repartidor extends Empleado{
    private Integer salidasPorDia;
    private Celular celular;
    public Repartidor(){super();}
    public Repartidor(String legajo, String dni, String nombre, String apellido, String mail, String telefono, LocalDate fechaDeIngreso, Double salarioBase,Integer salidasPorDia,Celular celular){
        super(legajo, dni, nombre, apellido, mail, telefono, fechaDeIngreso, salarioBase);
        this.salidasPorDia=salidasPorDia;
        this.celular=celular;
    }
    public Integer getSalidasPorDia(){return salidasPorDia;}
    @Override
    public Double calcularSalario(){return getSalarioBase()+salidasPorDia*1250;}
    @Override
    public String toString() {
        return super.toString()+ "Repartidor{" +
                "salidasPorDia=" + salidasPorDia +
                ", celular=" + celular +
                '}';
    }
}
