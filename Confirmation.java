/**
 * Estudiante: Joel Antonio Jaquez López
 * Carnet: #23369
 * Fecha de inicio: 12/11/2023
 * Fecha de finalización: 13/11/2023
 * La clase Confirmation representa una confirmación de reserva en el sistema, con funcionalidades Premium.
 */
public class Confirmation implements Premium {
    private String numeroTarjeta;
    private int cantidadCuotas;
    private final String claseVuelo = CLASE_VUELO;  // Premium
    private String itinerario;
    private int numeroAsiento;  // Premium
    private int cantidadMaletas;  // Premium
    private String nombreUsuario;  // Información relevante para mostrar en confirmación

    /**
     * Constructor de la clase Confirmation.
     *
     * @param numeroTarjeta     El número de tarjeta utilizado para la confirmación.
     * @param cantidadCuotas    La cantidad de cuotas seleccionadas para el pago.
     * @param itinerario        El itinerario de vuelo confirmado.
     * @param numeroAsiento     El número de asiento asignado durante la confirmación (Premium).
     * @param cantidadMaletas   La cantidad de maletas asignadas durante la confirmación (Premium).
     * @param nombreUsuario     El nombre del usuario asociado a la confirmación.
     */
    public Confirmation(String numeroTarjeta, int cantidadCuotas, String itinerario,
                        int numeroAsiento, int cantidadMaletas, String nombreUsuario) {
        this.numeroTarjeta = numeroTarjeta;
        this.cantidadCuotas = cantidadCuotas;
        this.itinerario = itinerario;
        this.numeroAsiento = numeroAsiento;
        this.cantidadMaletas = cantidadMaletas;
        this.nombreUsuario = nombreUsuario;
    }

    // Setters y getters

    /**
     * Obtiene el número de tarjeta asociado a la confirmación.
     *
     * @return El número de tarjeta asociado a la confirmación.
     */
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    /**
     * Establece el número de tarjeta asociado a la confirmación.
     *
     * @param numeroTarjeta El nuevo número de tarjeta asociado a la confirmación.
     */
    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    /**
     * Obtiene la cantidad de cuotas seleccionadas para el pago.
     *
     * @return La cantidad de cuotas seleccionadas para el pago.
     */
    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    /**
     * Establece la cantidad de cuotas seleccionadas para el pago.
     *
     * @param cantidadCuotas La nueva cantidad de cuotas seleccionadas para el pago.
     */
    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    /**
     * Obtiene el itinerario de vuelo confirmado.
     *
     * @return El itinerario de vuelo confirmado.
     */
    public String getItinerario() {
        return itinerario;
    }

    /**
     * Establece el itinerario de vuelo confirmado.
     *
     * @param itinerario El nuevo itinerario de vuelo confirmado.
     */
    public void setItinerario(String itinerario) {
        this.itinerario = itinerario;
    }

    /**
     * Obtiene el número de asiento asignado durante la confirmación (Premium).
     *
     * @return El número de asiento asignado durante la confirmación (Premium).
     */
    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    /**
     * Establece el número de asiento asignado durante la confirmación (Premium).
     *
     * @param numeroAsiento El nuevo número de asiento asignado durante la confirmación (Premium).
     */
    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    /**
     * Obtiene la cantidad de maletas asignadas durante la confirmación (Premium).
     *
     * @return La cantidad de maletas asignadas durante la confirmación (Premium).
     */
    public int getCantidadMaletas() {
        return cantidadMaletas;
    }

    /**
     * Establece la cantidad de maletas asignadas durante la confirmación (Premium).
     *
     * @param cantidadMaletas La nueva cantidad de maletas asignadas durante la confirmación (Premium).
     */
    public void setCantidadMaletas(int cantidadMaletas) {
        this.cantidadMaletas = cantidadMaletas;
    }

    /**
     * Obtiene el nombre del usuario asociado a la confirmación.
     *
     * @return El nombre del usuario asociado a la confirmación.
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Establece el nombre del usuario asociado a la confirmación.
     *
     * @param nombreUsuario El nuevo nombre del usuario asociado a la confirmación.
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    // Métodos de la interfaz Premium

    /**
     * {@inheritDoc}
     */
    @Override
    public void setNumAsiento(int numAsiento) {
        this.numeroAsiento = numAsiento;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setCantMaletas(int cantMaletas) {
        this.cantidadMaletas = cantMaletas;
    }
}

