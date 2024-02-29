public class ContactoUsa implements FabricaAbstracta{
    @Override
    public FabricaTelefono crearFabricaTelefono(String telefono) {
        return new TelefonoUsa(telefono);
    }

    @Override
    public FabricaDireccion crearFabricaDireccion(String direccion, int numero, String planta, String ciudad, int codigoPostal) {
        return new DireccionUsa(direccion, numero, planta, ciudad, codigoPostal, "USA");
    }
}
