public class Main {
    public static void main(String[] args) {
        Agenda nuevaAgenda = Agenda.getInstancia();
        App nuevaApp = new App();
        nuevaApp.empezarPrograma(nuevaAgenda);
    }
}
