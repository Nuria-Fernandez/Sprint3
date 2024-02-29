public class Direccion {
    protected String calle;
    protected int num;
    protected String planta;
    protected String ciudad;
    protected int codigoPostal;
    protected final String pais;
    public Direccion(String calle, int num, String planta, String ciudad, int codigoPostal, String pais){
        this.calle = calle;
        this.num = num;
        this.planta = planta;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.pais = pais;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPlanta() {
        return planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }


    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getPais() {
        return pais;
    }

    @Override
    public String toString() {
        return "Calle: " + calle + "\n" +
                "Num: " + num + "\n" +
                "Planta:" + planta + "\n" +
                "Ciudad: " + ciudad + "\n" +
                "Codigo Postal: " + codigoPostal + "\n" +
                "Pais: " + pais + "\n";
    }
}
