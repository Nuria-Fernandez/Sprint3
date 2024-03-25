import java.util.ArrayList;

public abstract class AgenteBolsa {

    protected int valor;
    protected ArrayList<Suscriptor> listaSuscritores;
    public AgenteBolsa(int valor){
        this.valor = valor;
        listaSuscritores = new ArrayList<>();
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
        notificar();
    }



    public void notificar() {
        for(Suscriptor suscriptor : listaSuscritores){
            suscriptor.actualizar();
        }
    }
    public void anyadirSuscriptor(Suscriptor suscriptor){
        listaSuscritores.add(suscriptor);
    }
    public void eliminarSuscriptor(Suscriptor suscriptor){
        listaSuscritores.remove(suscriptor);
    }

}
