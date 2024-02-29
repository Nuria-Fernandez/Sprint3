import java.util.HashMap;
//invoker
public class Controlador{
    private Command command;
    private HashMap<String, Command> acciones;
    public Controlador(){
        acciones = new HashMap<>();
    }
    public void setCommand(String accion, Command command){
        acciones.put(accion, command);
    }
    public void ejecutar(String accion){
        if(acciones.containsKey(accion)){
            acciones.get(accion).execute();
        }else{
            System.out.println("Acción no válida");
        }
    }
}
