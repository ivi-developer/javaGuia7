package punto5;
public class Disco {
    private Integer anioDePublicacion;
    private String titulo;
    private Artista artista;
    public Disco(){}
    public Disco(Integer anioDePublicacion,String titulo,Artista artista){
        this.anioDePublicacion=anioDePublicacion;
        this.titulo=titulo;
        this.artista=artista;
    }
    @Override
    public String toString() {
        return "Disco{" +
                "anioDePublicacion=" + anioDePublicacion +
                ", titulo='" + titulo + '\'' +
                ", artista=" + artista +
                '}';
    }
}
