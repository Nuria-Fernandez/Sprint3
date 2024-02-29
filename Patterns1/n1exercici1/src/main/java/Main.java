public class Main {
    public static void main(String[] args) {
        Undo nuevaInstancia = Undo.getInstance();
        Pedido pedido1 = new Pedido(1);
        Pedido pedido2 = new Pedido(2);
        Pedido pedido3 = new Pedido(3);

        nuevaInstancia.anyadirPedido(pedido1);
        nuevaInstancia.anyadirPedido(pedido2);
        nuevaInstancia.anyadirPedido(pedido3);
        nuevaInstancia.mostrarUltimoPedido();
        nuevaInstancia.borrarUltimoPedido();
        nuevaInstancia.mostrarUltimoPedido();


    }
}
