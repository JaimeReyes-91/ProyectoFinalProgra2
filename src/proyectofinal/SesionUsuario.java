package proyectofinal;

public class SesionUsuario {
    private static int usuario_id;
    private static String usuarioActual;
    private static boolean sesionActiva = false;

    public static void iniciarSesion(int id, String usuario) {
        usuario_id = id;
        usuarioActual = usuario;
        sesionActiva = true;
    }

    public static void cerrarSesion() {
        usuario_id = 0;
        usuarioActual = null;
        sesionActiva = false;
    }

    public static boolean isSesionActiva() {
        return sesionActiva;
    }

    public static String getUsuarioActual() {
        return usuarioActual;
    }

    public static int getIdUsuario() {
        return usuario_id;
    }
    
}
