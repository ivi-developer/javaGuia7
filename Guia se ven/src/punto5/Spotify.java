package punto5;
import java.util.ArrayList;
import java.util.Scanner;

public class Spotify implements Reproduccion {
    private ArrayList<Cancion>cancions;
    public Spotify(){cancions=new ArrayList<>();}
    @Override
    public void reproducir(){System.out.println("Reproduciendo= "+cancions.get(0));}
    @Override
    public void aniadirCancion(Cancion cancion){cancions.add(cancion);}
    @Override
    public void eliminarCancion(){
        Scanner scanner=new Scanner(System.in);
        verMiLista();
        System.out.println("elija el numero de la cancion a eliminar: ");
        cancions.remove(scanner.nextInt()-1);
    }
    @Override
    public void verMiLista(){cancions.forEach(cancion -> System.out.println(cancion.toString()));}
}
