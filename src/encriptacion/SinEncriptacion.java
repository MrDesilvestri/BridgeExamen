package encriptacion;

public class SinEncriptacion implements InterfaceEncriptar {

    @Override
    public String encriptar(String mensaje) {
        // Retorna el mensaje sin ninguna encriptación
        return mensaje;
    }
}
