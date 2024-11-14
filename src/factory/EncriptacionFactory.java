package factory;

import encriptacion.EncriptacionAES;
import encriptacion.EncriptacionDES;
import encriptacion.InterfaceEncriptar;
import encriptacion.SinEncriptacion;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class EncriptacionFactory {

    // Método para crear la instancia de encriptación según el archivo de configuración
    public static InterfaceEncriptar crearEncriptacion() {
        Properties properties = new Properties();

        // Cargar el archivo de configuración
        try (FileInputStream input = new FileInputStream("src/config.properties")) {
            properties.load(input);
        } catch (IOException e) {
            System.err.println("Error al cargar el archivo de configuración: " + e.getMessage());
            return null;
        }

        // Leer el tipo de encriptación del archivo de configuración
        String tipoEncriptacion = properties.getProperty("encriptacion.tipo");

        // Seleccionar y devolver la instancia correspondiente
        if ("AES".equalsIgnoreCase(tipoEncriptacion)) {
            return new EncriptacionAES();
        } else if ("DES".equalsIgnoreCase(tipoEncriptacion)) {
            return new EncriptacionDES();
        } else if ("SinEncriptacion".equalsIgnoreCase(tipoEncriptacion)) {
            return new SinEncriptacion();
        } else {
            System.err.println("Tipo de encriptación no válido en el archivo de configuración.");
            return null;
        }
    }
}
