/**
 * Estudiante: Joel Antonio Jaquez López
 * Carnet: #23369
 * Fecha de inicio: 12/11/2023
 * Fecha de finalización: 13/11/2023
 * Clase que representa a un usuario premium en el sistema de reservas de vuelos.
 * Extiende la clase base Usuario e implementa la interfaz Premium.
 */
public class UsuarioPremium extends Usuario implements Premium {
    private String claseVuelo;
    private int numeroAsiento;
    private int cantidadMaletas;

    /**
     * Constructor que inicializa un nuevo UsuarioPremium con el nombre, contraseña y correo especificados.
     *
     * @param nombre     Nombre del usuario premium.
     * @param contraseña Contraseña del usuario premium.
     * @param correo     Correo electrónico del usuario premium.
     */
    public UsuarioPremium(String nombre, String contraseña, String correo) {
        super(nombre, contraseña, correo);
        this.claseVuelo = Premium.CLASE_VUELO;
    }

    /**
     * Establece el número de asiento para el usuario premium.
     *
     * @param numAsiento Número de asiento a establecer.
     */
    @Override
    public void setNumAsiento(int numAsiento) {
        this.numeroAsiento = numAsiento;
    }

    /**
     * Establece la cantidad de maletas para el usuario premium.
     *
     * @param cantMaletas Cantidad de maletas a establecer.
     */
    @Override
    public void setCantMaletas(int cantMaletas) {
        this.cantidadMaletas = cantMaletas;
    }

    /**
     * Establece la clase de vuelo para el usuario premium.
     *
     * @param claseVuelo Clase de vuelo a establecer.
     */
    public void setClaseVuelo(String claseVuelo) {
        this.claseVuelo = claseVuelo;
    }

    /**
     * Obtiene el número de asiento del usuario premium.
     *
     * @return Número de asiento del usuario premium.
     */
    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    /**
     * Obtiene la cantidad de maletas del usuario premium.
     *
     * @return Cantidad de maletas del usuario premium.
     */
    public int getCantidadMaletas() {
        return cantidadMaletas;
    }
}

