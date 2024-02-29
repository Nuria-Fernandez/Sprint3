public class ContactoUk implements FabricaAbstracta{
    @Override
    public FabricaTelefono crearFabricaTelefono(String telefono) {
        return new TelefonoUk(telefono);
    }

    @Override
    public FabricaDireccion crearFabricaDireccion(String direccion, int numero, String planta, String ciudad, int codigoPostal) {
        return new DireccionUk(direccion, numero, planta, ciudad, codigoPostal, "UK");
    }
}
