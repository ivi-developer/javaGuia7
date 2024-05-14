package punto4;

import java.time.LocalDate;

public abstract class Empleado {
    private String legajo;
    private String dni;
    private String nombre;
    private String apellido;
    private String mail;
    private String telefono;
    private LocalDate fechaDeIngreso;
    private Double salarioBase;
    public Empleado(){}
    public Empleado(String legajo,String dni,String nombre,String apellido,String mail,String telefono,LocalDate fechaDeIngreso,Double salarioBase){
        this.legajo=legajo;
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.mail=mail;
        this.telefono=telefono;
        this.fechaDeIngreso=fechaDeIngreso;
        this.salarioBase=salarioBase;
    }
    public Double getSalarioBase(){return salarioBase;}
    public void setSalarioBase(Double salarioBase){this.salarioBase = salarioBase;}
    public String getLegajo(){return legajo;}
    @Override
    public int hashCode(){return 1;}
    @Override
    public boolean equals(Object obj){
        if(obj!=null)if(obj instanceof Empleado empleado)if(empleado.getLegajo().equals(getLegajo()))return true;
        return false;
    }
    public abstract Double calcularSalario();
    @Override
    public String toString() {
        return "Empleado{" +
                "legajo='" + legajo + '\'' +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", mail='" + mail + '\'' +
                ", telefono='" + telefono + '\'' +
                ", fechaDeIngreso=" + fechaDeIngreso +
                ", salarioBase=" + salarioBase +
                '}';
    }
    public String getTelefono(){return telefono;}
}
