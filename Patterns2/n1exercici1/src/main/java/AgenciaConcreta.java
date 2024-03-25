public class AgenciaConcreta extends Suscriptor{
    private String name;

    public AgenciaConcreta(String name, AgenteBolsa agenteBolsa){
        this.name = name;
        this.agenteBolsa = agenteBolsa;
        this.agenteBolsa.anyadirSuscriptor(this);
    }
    public void actualizar(){
        System.out.println("Agencia de bolsa " + name + " el estado de la bolsa es de " + agenteBolsa.getValor());
    }


}
