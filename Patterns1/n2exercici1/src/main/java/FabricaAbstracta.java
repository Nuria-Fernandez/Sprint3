public interface FabricaAbstracta {
    FabricaTelefono crearFabricaTelefono(String telefono);
    FabricaDireccion crearFabricaDireccion(String direccion, int numero, String planta, String ciudad, int codigoPostal);
}
