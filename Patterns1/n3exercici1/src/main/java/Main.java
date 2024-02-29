public class Main {
    public static void main(String[] args) {
        IVehiculo coche = new Coche("BMW", "X6", "Azul", "B14587");
        IVehiculo bicicleta = new Bicicleta("Orbea", "gm2", "Gris", "L45789");
        IVehiculo avion = new Avion("Iberia", "Boing747", "Blanco", "PO784569");
        IVehiculo barco = new Barco("Pvloka", "Moveo789", "Gris y rojo", "7854LOI");




        Controlador controlador = new Controlador();
        controlador.setCommand("arrancarCoche", new ArrancarCommand(coche));
        controlador.setCommand("acelerarCoche", new AcelerarCommand(coche));
        controlador.setCommand("frenarCoche", new FrenarCommand(coche));
        controlador.ejecutar("arrancarCoche");
        controlador.ejecutar("acelerarCoche");
        controlador.ejecutar("frenarCoche");
        System.out.println("");
        controlador.setCommand("arrancarBici", new ArrancarCommand(bicicleta));
        controlador.setCommand("acelerarBici", new AcelerarCommand(bicicleta));
        controlador.setCommand("frenarBici", new FrenarCommand(bicicleta));
        controlador.ejecutar("arrancarBici");
        controlador.ejecutar("acelerarBici");
        controlador.ejecutar("frenarBici");


    }
}
