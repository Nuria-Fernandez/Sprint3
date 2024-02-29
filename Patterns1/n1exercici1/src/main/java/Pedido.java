public class Pedido {
    private int precioTotal;
    private String nombreCliente;
    private String dniCliente;
    private int numEmpleado;
    private int numPedido;

    public Pedido(int numPedido){
        this.numPedido = numPedido;

    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "precioTotal=" + precioTotal +
                ", nombreCliente='" + nombreCliente + '\'' +
                ", dniCliente='" + dniCliente + '\'' +
                ", numEmpleado=" + numEmpleado + '\'' +
                ", numPedido=" + numPedido + '\'' +
                '}';
    }
}
