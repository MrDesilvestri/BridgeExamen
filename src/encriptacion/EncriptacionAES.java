package encriptacion;

public class EncriptacionAES implements InterfaceEncriptar {

    @Override
    public String encriptar(String mensaje) {
        // Simula una encriptación AES
        return "AES(" + mensaje + ")";
    }
}
