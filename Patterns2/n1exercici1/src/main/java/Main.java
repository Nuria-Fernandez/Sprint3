public class Main {
    public static void main(String[] args) {
        AgenteBolsaConcreto nuevoAgente = new AgenteBolsaConcreto(150);
        AgenciaConcreta nuevaAgencia1 = new AgenciaConcreta("Dinero SL", nuevoAgente);
        AgenciaConcreta nuevaAgencia2 = new AgenciaConcreta("Asociados SL", nuevoAgente);

        nuevoAgente.setValor(300);




    }
}
