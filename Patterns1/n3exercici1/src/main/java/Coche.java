public class Coche extends Vehiculo implements IVehiculo{

    public Coche(String marca, String modelo, String color, String numBastidor) {
        super(marca, modelo, color, numBastidor);
    }

    @Override
    public void arrancar() {
        System.out.println("El coche ha arrancado");
    }

    @Override
    public void frenar() {
        System.out.println("El coche disminuye la marcha");
    }

    @Override
    public void acelerar() {
        System.out.println("El coche aumenta la velocidad");
    }
}
