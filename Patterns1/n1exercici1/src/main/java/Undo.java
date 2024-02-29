import java.util.ArrayList;
/*La classe 'Undo' ha de guardar les últimes comandes introduïdes.
Ha de permetre afegir o eliminar comandes, així com llistar les últimes comandes
introduïdes (semblant a la comanda 'history' en Linux).
 */

public class Undo {
    private static Undo instancia;
    private ArrayList listaPedidos;
    private Undo(){
        listaPedidos = new ArrayList<>();
    }

    public static Undo getInstance(){
        if(instancia == null){
            instancia = new Undo();
        }
        return instancia;
    }
    public void anyadirPedido(Pedido nuevoPedido){
        listaPedidos.add(nuevoPedido);
    }
    public void borrarUltimoPedido(){
        listaPedidos.remove(listaPedidos.size()-1);
    }
    public void mostrarUltimoPedido(){
        System.out.println(listaPedidos.get(listaPedidos.size()-1));
    }

}
