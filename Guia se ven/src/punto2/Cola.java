package punto2;

import java.util.LinkedList;

public class Cola{
    private LinkedList<Integer> listaVinculada;
    public Cola(){listaVinculada=new LinkedList<>();}
    public void enqueue(Integer integer){listaVinculada.add(integer);}
    public Integer dequeue(){
       Integer h= listaVinculada.getFirst();
        listaVinculada.remove(0);
        return h;
    }
    public Integer peek(){return listaVinculada.getFirst();}
    public Boolean isEmpty(){return listaVinculada.isEmpty();}
    public Integer size(){return listaVinculada.size();}




}
