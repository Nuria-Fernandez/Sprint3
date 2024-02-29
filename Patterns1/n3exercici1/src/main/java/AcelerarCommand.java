public class AcelerarCommand implements Command{
    private IVehiculo vehiculo;
    public AcelerarCommand(IVehiculo vehiculo){
        this.vehiculo = vehiculo;
    }
    @Override
    public void execute() {
        vehiculo.acelerar();
    }
}
