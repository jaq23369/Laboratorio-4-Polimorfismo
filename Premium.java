/**
 * Estudiante: Joel Antonio Jaquez López
 * Carnet: #23369
 * Fecha de inicio: 12/11/2023
 * Fecha de finalización: 13/11/2023
 * La interfaz Premium proporciona métodos para gestionar funcionalidades premium en el sistema de reservas.
 */
public interface Premium {
    /**
     * Representa la clase de vuelo premium, que es "Primera Clase".
     */
    String CLASE_VUELO = "Primera Clase";

    /**
     * Establece el número de asiento para funcionalidades premium.
     *
     * @param numAsiento El número de asiento a establecer.
     */
    void setNumAsiento(int numAsiento);

    /**
     * Establece la cantidad de maletas para funcionalidades premium.
     *
     * @param cantMaletas La cantidad de maletas a establecer.
     */
    void setCantMaletas(int cantMaletas);
}


