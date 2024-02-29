import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    static Scanner input = new Scanner (System.in);
    Agenda nuevaAgenda = Agenda.getInstancia();
    public void empezarPrograma(Agenda nuevaAgenda){
        boolean seguirBucle;
        do{
            seguirBucle = menu(pedirDato("Indica el número de la opción que deseas realizar:\n" + "0.Salir del menú\n"
                    + "1.Crear contacto\n"
                    + "2.Eliminar contacto\n"
                    + "3.Mostrar contacto\n"), nuevaAgenda);
        } while (seguirBucle);
    }
    public boolean menu(int opcion, Agenda nuevaAgenda) {
        boolean seguirBucle = true;
        switch (opcion){
            case 1: crearContacto(nuevaAgenda);
            break;
            case 2: eliminarContacto(nuevaAgenda);
            break;
            case 3: mostrarContacto(nuevaAgenda);
            break;
        }
        return seguirBucle;

    }
    public void crearContacto(Agenda nuevaAgenda){
        String nombre = pedirNombreSoloLetras("Introduce el nombre");
        String apellido = pedirNombreSoloLetras("Introduce el apellido");
        String telefono = pedirNombre("Introduce el numero de telefono");
        String calle = pedirNombreSoloLetras("Introduce la calle");
        int numCalle = pedirDato("número de calle");
        String planta = pedirNombre("número de puerta");
        String ciudad = pedirNombreSoloLetras("Indica la ciudad");
        int codigoPostal = pedirDato("Código Postal");
        FabricaContactos nuevaFabrica = new FabricaContactos();
        FabricaAbstracta paisContacto = nuevaFabrica.getFactoryPais(pedirNombre("Indica si es España(ES), Inglaterra(UK) o Estados Unidos(USA)"));
        nuevaAgenda.anyadirContacto(new Contacto(nombre, apellido, (Direccion)paisContacto.crearFabricaDireccion(calle,numCalle,planta,ciudad,codigoPostal),
                                                (Telefono)paisContacto.crearFabricaTelefono(telefono)));
    }
    public void eliminarContacto(Agenda nuevaAgenda){
        nuevaAgenda.eliminarContacto(pedirNombreSoloLetras("Introduce el nombre del contacto "),
                                        pedirNombreSoloLetras("Introduce el apellido del contacto"));

    }
    public void mostrarContacto(Agenda nuevaAgenda){
        nuevaAgenda.mostrarContacto(pedirNombreSoloLetras("Introduce el nombre del contacto "));
    }

    static int pedirDato(String mensaje) {
        boolean correcto = true;
        int opcion = 0;
        while (correcto) {
            try {
                System.out.println(mensaje);
                opcion = input.nextInt();
                correcto = false;
            } catch (InputMismatchException e) {
                System.out.println("Introduce numeros enteros");
            }input.nextLine();

        }

        return opcion;
    }

    static String pedirNombreSoloLetras(String mensaje) {
        boolean seguirBucle = true;
        String nombre = "";
        while (seguirBucle) {
            try {
                System.out.println(mensaje);
                nombre = input.nextLine();
                for(int i = 0; i < nombre.length(); i++) {
                    char comprobante = nombre.charAt(i);
                    if (!Character.isAlphabetic(comprobante)) {//Compruebo que cada caracter sean letras
                        throw new Exception();
                    }
                }
                seguirBucle = false;
            } catch (Exception e) {
                System.out.println("Introduce solo letras");
            }
        }
        return nombre;
    }

    static String pedirNombre(String mensaje) {
        Scanner input = new Scanner(System.in);
        System.out.println(mensaje);
        String nombre = input.nextLine();
        return nombre;
    }
}
