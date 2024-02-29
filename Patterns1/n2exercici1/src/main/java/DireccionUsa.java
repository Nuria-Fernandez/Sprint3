public class DireccionUsa extends Direccion implements FabricaDireccion{
    public DireccionUsa(String calle, int num, String planta, String ciudad, int codigoPostal, String pais) {
        super(calle, num, planta, ciudad, codigoPostal, pais);
    }

    @Override
    public Direccion getDireccion() {
        return new Direccion(getCalle(), getNum(), getPlanta(), getCiudad(), getCodigoPostal(), getPais());
    }
}
