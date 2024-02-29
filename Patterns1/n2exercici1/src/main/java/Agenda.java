import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contacto> listaContactos;
    private static Agenda instancia; //IMPLEMENTO SINGLETON YA QUE VOY A TENER SIEMPRE UNA UNICA AGENDA.

    public Agenda(){
        listaContactos = new ArrayList<>();
    }
    public static Agenda getInstancia (){ //CREO ESTE METODO PARA NO INSTANCIAR NUEVAS AGENDAS. ASÍ SIEMPRE INSTANCIO LA MISMA Y ACCIONO SIEMPRE LA MISMA.
        if (instancia==null) {
            instancia = new Agenda();
        }
        return instancia;
    }
    public void anyadirContacto(Contacto nuevoContacto){
        listaContactos.add(nuevoContacto);
    }
    public void eliminarContacto(String nombreContacto, String apellidoContacto){
        String nombre ="";
        int indice = buscarNombreContacto(nombreContacto);
        int i = buscarApellidoContacto(apellidoContacto);
        if(indice > -1 && nombreContacto.equalsIgnoreCase(listaContactos.get(indice).getNombre())
                && apellidoContacto.equalsIgnoreCase(listaContactos.get(i).getApellido())){
           nombre = listaContactos.get(indice).getNombre();
           listaContactos.remove(indice);
            System.out.println("El contacto eliminado es: " + nombre);
        }else if(indice == -1){
            System.out.println("El nombre indicado no consta en nuestra agenda");
        }

    }

    public void mostrarContacto(String nombreContacto){
        int indice = buscarNombreContacto(nombreContacto);
        if(indice > -1 && nombreContacto.equalsIgnoreCase(listaContactos.get(indice).getNombre())){
            System.out.println(listaContactos.get(indice));
        }else if(indice == -1){
            System.out.println("No constas en nuestro directorio");

        }
    }
    public int buscarApellidoContacto(String apellidoContacto){
        int indice = -1;
        int i = 0;
        boolean seguirBucle = true;

        while(i < listaContactos.size() && seguirBucle) {

            if(apellidoContacto.equalsIgnoreCase(listaContactos.get(i).getApellido())) {
                indice = i;
                seguirBucle = false;
            }
            i++;
        }
        return indice;
    }

    public int buscarNombreContacto(String nombreContacto){
        int indice = -1;
        int i = 0;
        boolean seguirBucle = true;

        while(i < listaContactos.size() && seguirBucle) {

            if(nombreContacto.equalsIgnoreCase(listaContactos.get(i).getNombre())) {
                indice = i;
                seguirBucle = false;
            }
            i++;
        }
        return indice;
    }
}
