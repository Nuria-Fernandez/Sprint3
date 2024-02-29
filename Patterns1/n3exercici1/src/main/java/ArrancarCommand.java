public class ArrancarCommand implements Command{
    private IVehiculo vehiculo;
    public ArrancarCommand(IVehiculo vehiculo){
        this.vehiculo = vehiculo;
    }
    @Override
    public void execute() {
        vehiculo.arrancar();
    }
}
