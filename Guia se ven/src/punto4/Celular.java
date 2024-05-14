package punto4;
public class Celular {
    private String id;
    private String marca;
    private String modelo;
    private String numero;
    public Celular(){}
    public Celular(String id,String marca,String modelo,String numero){
        this.id=id;
        this.marca=marca;
        this.modelo=modelo;
        this.numero=numero;
    }
    @Override
    public String toString() {
        return "Celular{" +
                "id='" + id + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
    public String getMarca(){return marca;}
    public String getNumero(){return numero;}
}
