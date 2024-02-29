public class TelefonoUsa extends Telefono implements FabricaTelefono {
    public TelefonoUsa( String numTelf) {
        super("1", numTelf);
    }

    @Override
    public Telefono getTelefono() {
        return new Telefono(getPrefijo(),getNumTelf());
    }
}

