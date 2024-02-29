public class Avion extends Vehiculo implements IVehiculo{
    public Avion(String marca, String modelo, String color, String numBastidor) {
        super(marca, modelo, color, numBastidor);
    }

    @Override
    public void arrancar() {
        System.out.println("El avión se pone en ruta");
    }

    @Override
    public void frenar() {
        System.out.println("El avión reduce la velocidad");

    }

    @Override
    public void acelerar() {
        System.out.println("El avión aumenta la velocidad");
    }
}
