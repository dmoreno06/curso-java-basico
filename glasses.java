/**
 * glasses
 */
public class glasses {
    enum TipoDocumento {
        CC, TI, CE, FC
    };

    public static void main(String[] args) {
        TipoDocumento documentoIdentidad;
        documentoIdentidad = TipoDocumento.CC;
        System.out.println(
                "en colombia puedes ejer ser el derecho a el voto si tiene cuentas con una " + documentoIdentidad);
    }

}