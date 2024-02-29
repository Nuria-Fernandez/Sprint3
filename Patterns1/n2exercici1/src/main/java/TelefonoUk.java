public class TelefonoUk extends Telefono implements FabricaTelefono{
    public TelefonoUk(String numTelf) {
        super("44", numTelf);
    }

    @Override
    public Telefono getTelefono() {;
        return new Telefono(getPrefijo(),getNumTelf());
    }
}
