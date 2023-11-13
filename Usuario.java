import java.io.Serializable;

/**
 * Estudiante: Joel Antonio Jaquez López
 * Carnet: #23369
 * Fecha de inicio: 12/11/2023
 * Fecha de finalización: 13/11/2023
 * La clase Usuario representa a un usuario en el sistema de reservas.
 * Implementa la interfaz Serializable para permitir la serialización de objetos.
 */
public class Usuario implements Serializable {
    private String nombre;
    private String contraseña;
    private String correoElectronico;

    /**
     * Constructor de la clase Usuario.
     *
     * @param nombre El nombre del usuario.
     * @param contraseña La contraseña del usuario.
     * @param correoElectronico El correo electrónico del usuario.
     */
    public Usuario(String nombre, String contraseña, String correoElectronico) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.correoElectronico = correoElectronico;
    }

    /**
     * Obtiene el nombre del usuario.
     *
     * @return El nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del usuario.
     *
     * @param nombre El nuevo nombre del usuario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la contraseña del usuario.
     *
     * @return La contraseña del usuario.
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * Establece la contraseña del usuario.
     *
     * @param contraseña La nueva contraseña del usuario.
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * Obtiene el correo electrónico del usuario.
     *
     * @return El correo electrónico del usuario.
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * Establece el correo electrónico del usuario.
     *
     * @param correoElectronico El nuevo correo electrónico del usuario.
     */
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
