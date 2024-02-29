public class Barco extends Vehiculo implements IVehiculo{
    public Barco(String marca, String modelo, String color, String numBastidor) {
        super(marca, modelo, color, numBastidor);
    }

    @Override
    public void arrancar() {
        System.out.println("El barco enciende el motor");
    }

    @Override
    public void frenar() {
        System.out.println("El barco disminuye la velocidad");
    }

    @Override
    public void acelerar() {
        System.out.println("El barco aumenta la velocidad");
    }
}
