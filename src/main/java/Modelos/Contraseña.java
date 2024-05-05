
package Modelos;

public class Contraseña {
    private String correo;

    /**
     * Constructor por defecto de la clase Contraseña.
     */
    public Contraseña() {
    }

    /**
     * Constructor de la clase Contraseña que recibe el correo.
     * @param correo El correo electrónico asociado a la contraseña.
     */
    public Contraseña(String correo) {
        this.correo = correo;
    }

    /**
     * Obtiene el correo electrónico asociado a la contraseña.
     * @return El correo electrónico asociado a la contraseña.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Establece el correo electrónico asociado a la contraseña.
     * @param correo El nuevo correo electrónico asociado a la contraseña.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
}

