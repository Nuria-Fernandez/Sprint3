public class TelefonoSpain extends Telefono implements FabricaTelefono{

    public TelefonoSpain(String numTelf) {
        super("34", numTelf);
    }

    @Override
    public Telefono getTelefono() {
        return new Telefono(getPrefijo(),getNumTelf());
    }
}
