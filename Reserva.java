import java.util.Date;

/**
 * Estudiante: Joel Antonio Jaquez López
 * Carnet: #23369
 * Fecha de inicio: 12/11/2023
 * Fecha de finalización: 13/11/2023
 * La clase Reserva representa una reserva de vuelo en el sistema.
 */
public class Reserva {
    private Date fechaViaje;
    private boolean esIdaYVuelta;
    private int cantidadBoletos;
    private String aerolinea;
    private String nombreUsuario;
    private String numAsiento;
    private int cantMaletas;

    /**
     * Constructor de la clase Reserva.
     *
     * @param fechaViaje       La fecha del viaje.
     * @param esIdaYVuelta      Indica si la reserva es para un vuelo de ida y vuelta.
     * @param cantidadBoletos   La cantidad de boletos reservados.
     * @param aerolinea         La aerolínea seleccionada.
     * @param nombreUsuario     El nombre del usuario que realiza la reserva.
     * @param numAsiento        El número de asiento seleccionado durante la reserva.
     * @param cantMaletas       La cantidad de maletas seleccionadas durante la reserva.
     */
    public Reserva(Date fechaViaje, boolean esIdaYVuelta, int cantidadBoletos, String aerolinea, String nombreUsuario, String numAsiento, int cantMaletas) {
        this.fechaViaje = fechaViaje;
        this.esIdaYVuelta = esIdaYVuelta;
        this.cantidadBoletos = cantidadBoletos;
        this.aerolinea = aerolinea;
        this.nombreUsuario = nombreUsuario;
        this.numAsiento = numAsiento;
        this.cantMaletas = cantMaletas;
    }

    // Setters y getters

    /**
     * Obtiene la fecha del viaje.
     *
     * @return La fecha del viaje.
     */
    public Date getFechaViaje() {
        return fechaViaje;
    }

    /**
     * Establece la fecha del viaje.
     *
     * @param fechaViaje La nueva fecha del viaje.
     */
    public void setFechaViaje(Date fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    /**
     * Verifica si la reserva es para un vuelo de ida y vuelta.
     *
     * @return true si es un vuelo de ida y vuelta, false en caso contrario.
     */
    public boolean isEsIdaYVuelta() {
        return esIdaYVuelta;
    }

    /**
     * Establece si la reserva es para un vuelo de ida y vuelta.
     *
     * @param esIdaYVuelta true si es un vuelo de ida y vuelta, false en caso contrario.
     */
    public void setEsIdaYVuelta(boolean esIdaYVuelta) {
        this.esIdaYVuelta = esIdaYVuelta;
    }

    /**
     * Obtiene la cantidad de boletos reservados.
     *
     * @return La cantidad de boletos reservados.
     */
    public int getCantidadBoletos() {
        return cantidadBoletos;
    }

    /**
     * Establece la cantidad de boletos reservados.
     *
     * @param cantidadBoletos La nueva cantidad de boletos reservados.
     */
    public void setCantidadBoletos(int cantidadBoletos) {
        this.cantidadBoletos = cantidadBoletos;
    }

    /**
     * Obtiene la aerolínea seleccionada.
     *
     * @return La aerolínea seleccionada.
     */
    public String getAerolinea() {
        return aerolinea;
    }

    /**
     * Establece la aerolínea seleccionada.
     *
     * @param aerolinea La nueva aerolínea seleccionada.
     */
    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    /**
     * Obtiene el nombre del usuario que realiza la reserva.
     *
     * @return El nombre del usuario que realiza la reserva.
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Establece el nombre del usuario que realiza la reserva.
     *
     * @param nombreUsuario El nuevo nombre del usuario que realiza la reserva.
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * Obtiene el número de asiento seleccionado durante la reserva.
     *
     * @return El número de asiento seleccionado durante la reserva.
     */
    public String getNumAsiento() {
        return numAsiento;
    }

    /**
     * Establece el número de asiento seleccionado durante la reserva.
     *
     * @param numAsiento El nuevo número de asiento seleccionado durante la reserva.
     */
    public void setNumAsiento(String numAsiento) {
        this.numAsiento = numAsiento;
    }

    /**
     * Obtiene la cantidad de maletas seleccionadas durante la reserva.
     *
     * @return La cantidad de maletas seleccionadas durante la reserva.
     */
    public int getCantMaletas() {
        return cantMaletas;
    }

    /**
     * Establece la cantidad de maletas seleccionadas durante la reserva.
     *
     * @param cantMaletas La nueva cantidad de maletas seleccionadas durante la reserva.
     */
    public void setCantMaletas(int cantMaletas) {
        this.cantMaletas = cantMaletas;
    }
}

