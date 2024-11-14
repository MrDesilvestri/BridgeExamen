package mensaje;

import encriptacion.InterfaceEncriptar;

public class PuenteMensajeEncriptacion implements InterfaceMensajeEncriptacion {
    private InterfaceEncriptar encriptador;

    // Constructor que recibe una implementación de InterfaceEncriptar
    public PuenteMensajeEncriptacion(InterfaceEncriptar encriptador) {
        this.encriptador = encriptador;
    }

    @Override
    public void enviarMensaje(String mensaje) {
        // Encripta el mensaje usando la implementación proporcionada y lo envía
        String mensajeEncriptado = encriptador.encriptar(mensaje);
        System.out.println("Enviando mensaje: " + mensajeEncriptado);
    }
}
