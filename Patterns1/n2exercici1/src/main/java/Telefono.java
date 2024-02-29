import java.sql.Struct;

public class Telefono {
    protected final String PREFIJO;
    protected String numTelf;
    public Telefono(String prefijo, String numTelf){
        this.PREFIJO = prefijo;
        this.numTelf = numTelf;
    }

    public String getPrefijo() {
        return this.PREFIJO;
    }

    public String getNumTelf() {
        return numTelf;
    }


    public void setNumTelf(String numTelf) {
        this.numTelf = numTelf;
    }
    public String toString(){
        return " +" + PREFIJO + numTelf;
    }
}
