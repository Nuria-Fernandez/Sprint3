public class FrenarCommand implements Command{
    private IVehiculo vehiculo;
    public FrenarCommand(IVehiculo vehiculo){
        this.vehiculo = vehiculo;
    }
    @Override
    public void execute() {
        vehiculo.frenar();
    }
}
