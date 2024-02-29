public class Bicicleta extends Vehiculo implements IVehiculo {

    public Bicicleta(String marca, String modelo, String color, String numBastidor) {
        super(marca, modelo, color, numBastidor);
    }

    @Override
    public void arrancar() {
        System.out.println("La bicicleta ha arrancado");
    }

    @Override
    public void frenar() {
        System.out.println("La bicicleta disminuye la velocidad");
    }

    @Override
    public void acelerar() {
        System.out.println("La bicicleta aumenta la velocidad");
    }
}
