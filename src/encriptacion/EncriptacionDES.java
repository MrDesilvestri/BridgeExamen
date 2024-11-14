package encriptacion;

public class EncriptacionDES implements InterfaceEncriptar {

    @Override
    public String encriptar(String mensaje) {
        // Simula una encriptación DES
        return "DES(" + mensaje + ")";
    }
}
