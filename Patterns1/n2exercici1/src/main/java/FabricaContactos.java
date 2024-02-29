public class FabricaContactos {
    public FabricaAbstracta getFactoryPais(String nombrePais){
        FabricaAbstracta tipoFabrica = null;
        switch (nombrePais.toUpperCase()){
            case "ES":
                tipoFabrica = new ContactoSpain();
                break;
            case "UK":
                tipoFabrica = new ContactoUk();
                break;
            case "USA":
                tipoFabrica = new ContactoUsa();
                break;
            default:
                System.out.println("Ningún país introducido es correcto");
        }
        return tipoFabrica;
    }
}
