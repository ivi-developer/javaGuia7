import punto4.*;
import punto5.Cancion;
import punto5.Genero;
import punto5.Spotify;
import java.time.LocalDate;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.println("ingrese el ejercicio");
            switch(scanner.nextInt()){
                case 4:
                    punto4();
                    break;
                case 5:
                    punto5();
                    break;
                default:
                    System.out.println("wachin");
                    break;
            }
            System.out.println("n para cortar");
        }while(!scanner.next().equalsIgnoreCase("n"));
    }
    public static void punto4(){
        DepartamentoComercial departamentoComercial=new DepartamentoComercial(1);
        Celular celular=new Celular("1","Samsung","ultimo","2236249833");
        Celular celular1=new Celular("1","motorola","ultimo","2236249833");
        Empleado ivi=new Repartidor("1","43317328","ivi","ivi","ivi","2236249833", LocalDate.now(),100000.0,10,celular);
        Empleado luchi=new Repartidor("2","43317330","luchi","luchi","luchi","luchi",LocalDate.now(),100000.0,4,celular1);
        Empleado marcos=new Comisionista("3","43317329","marcos","marcos","marcos","2236249833",LocalDate.now(),100000.0,10);
        Empleado peke=new Comisionista("4","43317331","peke","peke","peke","peke",LocalDate.now(),100000.0,20);
        Empleado pablo=new Vendedor("5","43317327","pablo","pablo","pablo","223tu veija en tanga",LocalDate.now(),100000.0,20,celular1);
        Empleado roque=new Vendedor("6","43317332","roque","roque","roque","2236249833",LocalDate.now(),100000.0,3,celular);
        departamentoComercial.agregarEmpleado(ivi);departamentoComercial.agregarEmpleado(luchi);departamentoComercial.agregarEmpleado(marcos);departamentoComercial.agregarEmpleado(peke);departamentoComercial.agregarEmpleado(pablo);departamentoComercial.agregarEmpleado(roque);
        departamentoComercial.mostrarEmpleados();
        System.out.println("reparitodes con mas de 5 salidas= "+departamentoComercial.cantReapartidoresConSalida(5));
        System.out.println("vendedores con porcentaje menor a 5= "+departamentoComercial.cantVendedoresConPorcentaje(5));
        System.out.println("comisionistas con mas de 20 entregas= "+departamentoComercial.cantComisionistasConEntrega(20));
        System.out.println("cuantos vendedores con samsung= "+departamentoComercial.cantVendededoresConMarca("samsung"));
        System.out.println("el vendedor con mayor porcentaje de venta= " +departamentoComercial.vendedorMayorPorecntajeDeVenta().toString());
        System.out.println("el repartidor con mas salidad por dia= "+departamentoComercial.repatidorMasSalidas().toString());
        System.out.println("el comisionista con menos entregas= "+departamentoComercial.comisionistaMenosEntregas().toString());
        System.out.println("vendedores con caracteristica 223= "+departamentoComercial.vendedoresPorCarecteristicas("223"));

    }
    public static void punto5(){
        Cancion cancion=new Cancion("el callejon de los milagros", 180, Genero.ROCK);
        Cancion cancion1=new Cancion("black russian", 160,Genero.ROCK,"El pity");
        Spotify spotify=new Spotify();
        spotify.aniadirCancion(cancion);
        spotify.aniadirCancion(cancion1);
        spotify.reproducir();
        spotify.eliminarCancion();
        System.out.println("la lista despues de eliminar");
        spotify.verMiLista();
    }
}