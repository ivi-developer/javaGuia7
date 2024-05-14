package punto5;
public class Cancion {
    private String nombre;
    private Integer duracion;
    private Genero genero;
    private String artistaInvitado;
    public Cancion(){}
    public Cancion(String nombre,Integer duracion,Genero genero){
        this.nombre=nombre;
        this.duracion=duracion;
        this.genero=genero;
    }
    public Cancion(String nombre,Integer duracion,Genero genero,String artistaInvitado){
        this.nombre=nombre;
        this.duracion=duracion;
        this.genero=genero;
        this.artistaInvitado=artistaInvitado;
    }
    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("Cancion{ ").append("nombre= '").append(nombre).append('\'').append(", duracion= ").append(duracion).append(", genero= ").append(genero);
        if(artistaInvitado!=null)sb.append(", artista invitado= '").append(artistaInvitado).append("\'");
        sb.append('}');
        return sb.toString();
    }
}
