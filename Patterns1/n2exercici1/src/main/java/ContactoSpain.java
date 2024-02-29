public class ContactoSpain implements FabricaAbstracta{


    @Override
    public FabricaTelefono crearFabricaTelefono(String telefono) {
        return new TelefonoSpain(telefono);
    }

    @Override
    public FabricaDireccion crearFabricaDireccion(String direccion, int numero, String planta, String ciudad, int codigoPostal) {
        return new DireccionSpain(direccion, numero, planta, ciudad, codigoPostal, "Espanya");
    }
}
