import encriptacion.InterfaceEncriptar;
import factory.EncriptacionFactory;
import mensaje.PuenteMensajeEncriptacion;

public class Main {
    public static void main(String[] args) {
        // Crear la instancia de encriptación a través del Factory
        InterfaceEncriptar encriptador = EncriptacionFactory.crearEncriptacion();

        // Verificar si el encriptador fue creado correctamente
        if (encriptador == null) {
            System.err.println("No se pudo crear el encriptador. Verifique el archivo de configuración.");
            return;
        }

        // Crear el puente de encriptación usando la instancia proporcionada por el Factory
        PuenteMensajeEncriptacion puente = new PuenteMensajeEncriptacion(encriptador);

        // Enviar un mensaje encriptado
        puente.enviarMensaje("Hola Mundo");
    }
}
