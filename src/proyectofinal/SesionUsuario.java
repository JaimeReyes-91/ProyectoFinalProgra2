
package proyectofinal;


public class SesionUsuario {
    private static int idUsuario;
    private static String usuarioActual;
    private static boolean sesionActiva = false;

    public static void iniciarSesion(int id, String usuario) {
        idUsuario = id;
        usuarioActual = usuario;
        sesionActiva = true;
    }

    public static void cerrarSesion() {
        idUsuario = 0;
        usuarioActual = null;
        sesionActiva = false;
    }

    public static boolean sesionActiva() {
        return sesionActiva;
    }

    public static String getUsuarioActual() {
        return usuarioActual;
    }
}
