import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * Estudiante: Joel Antonio Jaquez López
 * Carnet: #23369
 * Fecha de inicio: 12/11/2023
 * Fecha de finalización: 13/11/2023
 * Clase principal que gestiona un sistema de reservas de vuelos.
 */
public class Main {
    private static List<Usuario> usuarios = new ArrayList<>();
    private static List<Reserva> reservas = new ArrayList<>();
    private static List<Confirmation> confirmaciones = new ArrayList<>();

    private static final String USUARIOS_CSV = "usuarios.csv";
    private static final String RESERVAS_CSV = "reservas.csv";
    private static final String CONFIRMACIONES_CSV = "confirmaciones.csv";

    /**
     * Método principal que inicia el sistema y muestra un menú de opciones al usuario.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menú principal
        while (true) {
            System.out.println("Bienvenido al sistema de reservas. Seleccione una opción:");
            System.out.println("1. Registrarse");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Realizar reserva");
            System.out.println("4. Realizar confirmación");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    registrarUsuario(scanner);
                    break;
                case 2:
                    iniciarSesion(scanner);
                    break;
                case 3:
                    realizarReserva(scanner);
                    break;
                case 4:
                    realizarConfirmacion(scanner);
                    break;
                case 5:
                    guardarUsuariosEnCSV();
                    guardarReservasEnCSV();
                    guardarConfirmacionesEnCSV();
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }

    /**
     * Registra a un nuevo usuario en el sistema.
     *
     * @param scanner Scanner para la entrada del usuario.
     */
    private static void registrarUsuario(Scanner scanner) {
        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su contraseña:");
        String contraseña = scanner.nextLine();

        System.out.println("Ingrese su correo electrónico:");
        String correo = scanner.nextLine();

        Usuario nuevoUsuario = new Usuario(nombre, contraseña, correo);
        usuarios.add(nuevoUsuario);

        System.out.println("¡Usuario registrado con éxito!");
    }

    /**
     * Inicia sesión de un usuario en el sistema.
     *
     * @param scanner Scanner para la entrada del usuario.
     */
    private static void iniciarSesion(Scanner scanner) {
        System.out.println("Ingrese su correo electrónico:");
        String correo = scanner.nextLine();

        System.out.println("Ingrese su contraseña:");
        String contraseña = scanner.nextLine();

        // Verificar las credenciales del usuario
        boolean autenticado = autenticarUsuario(correo, contraseña);

        if (autenticado) {
            System.out.println("¡Inicio de sesión exitoso!");
        } else {
            System.out.println("Inicio de sesión fallido. Verifique sus credenciales.");
        }
    }

    /**
     * Autentica las credenciales de un usuario.
     *
     * @param correo      Correo electrónico del usuario.
     * @param contraseña  Contraseña del usuario.
     * @return true si las credenciales son válidas, false de lo contrario.
     */
    private static boolean autenticarUsuario(String correo, String contraseña) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCorreoElectronico().equals(correo) && usuario.getContraseña().equals(contraseña)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Realiza una reserva de vuelo.
     *
     * @param scanner Scanner para la entrada del usuario.
     */
    private static void realizarReserva(Scanner scanner) {
        // Obtener el nombre del usuario activo (puedes implementar un sistema de sesión para esto)
        System.out.println("Ingrese su nombre de usuario:");
        String nombreUsuario = scanner.nextLine();

        Date fechaViaje = null;

        while (fechaViaje == null) {
            try {
                System.out.println("Ingrese la fecha de viaje (YYYY-MM-DD):");
                String fechaViajeStr = scanner.nextLine();
                fechaViaje = new SimpleDateFormat("yyyy-MM-dd").parse(fechaViajeStr);
            } catch (ParseException e) {
                System.out.println("Formato de fecha incorrecto. Inténtelo nuevamente.");
            }
        }

        System.out.println("Ingrese la fecha de viaje (YYYY-MM-DD):");
        String fechaViajeStr = scanner.nextLine();
        // Aquí deberías convertir la cadena 'fechaViajeStr' a un objeto Date

        System.out.println("¿Es un vuelo de ida y vuelta? (true/false):");
        boolean esIdaVuelta = scanner.nextBoolean();

        System.out.println("Ingrese la cantidad de boletos:");
        int cantidadBoletos = scanner.nextInt();

        System.out.println("Ingrese la aerolínea:");
        String aerolinea = scanner.nextLine(); // Limpiar el buffer del scanner
        aerolinea = scanner.nextLine();

        // Resto de la lógica para obtener el número de asiento y la cantidad de maletas
        System.out.println("Ingrese el número de asiento:");
        String numAsiento = scanner.nextLine();

        System.out.println("Ingrese la cantidad de maletas:");
        int cantMaletas = scanner.nextInt();

        // Crear una nueva reserva
        Reserva nuevaReserva = new Reserva(fechaViaje, esIdaVuelta, cantidadBoletos, aerolinea, nombreUsuario, numAsiento, cantMaletas);
        reservas.add(nuevaReserva);

        System.out.println("¡Reserva realizada con éxito!");
    }

    /**
     * Realiza una confirmación de reserva.
     *
     * @param scanner Scanner para la entrada del usuario.
     */
    private static void realizarConfirmacion(Scanner scanner) {
        // Obtener el nombre del usuario activo (puedes implementar un sistema de sesión para esto)
        System.out.println("Ingrese su nombre de usuario:");
        String nombreUsuario = scanner.nextLine();

        // Lógica similar a la reserva para obtener los detalles necesarios
        System.out.println("Ingrese el número de tarjeta:");
        String numeroTarjeta = scanner.nextLine();

        System.out.println("Ingrese la cantidad de cuotas:");
        int cuotas = scanner.nextInt();

        // Resto de la lógica para obtener el itinerario, número de asiento y cantidad de maletas
        System.out.println("Ingrese el itinerario:");
        String itinerario = scanner.nextLine(); // Limpiar el buffer del scanner
        itinerario = scanner.nextLine();

        System.out.println("Ingrese el número de asiento:");
        int numAsiento = scanner.nextInt();

        System.out.println("Ingrese la cantidad de maletas:");
        int cantMaletas = scanner.nextInt();

        // Crear una nueva confirmación
        Confirmation nuevaConfirmacion = new Confirmation(numeroTarjeta, cuotas, itinerario, numAsiento, cantMaletas, nombreUsuario);
        confirmaciones.add(nuevaConfirmacion);

        System.out.println("¡Confirmación realizada con éxito!");
    }

      /**
     * Guarda la información de los usuarios en un archivo CSV.
     */
    private static void guardarUsuariosEnCSV() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(USUARIOS_CSV))) {
            for (Usuario usuario : usuarios) {
                String linea = String.format("%s,%s,%s", usuario.getNombre(), usuario.getContraseña(), usuario.getCorreoElectronico());
                writer.write(linea);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

      /**
     * Guarda la información de los usuarios en un archivo CSV.
     */
    private static void guardarReservasEnCSV() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RESERVAS_CSV))) {
            for (Reserva reserva : reservas) {
                String linea = String.format("%s,%s,%s,%s,%s,%s,%s,%s", reserva.getFechaViaje(), reserva.isEsIdaYVuelta(),
                        reserva.getCantidadBoletos(), reserva.getAerolinea(), reserva.getNombreUsuario(),
                        reserva.getNumAsiento(), reserva.getCantMaletas());
                writer.write(linea);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

      /**
     * Guarda la información de los usuarios en un archivo CSV.
     */
    private static void guardarConfirmacionesEnCSV() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CONFIRMACIONES_CSV))) {
            for (Confirmation confirmacion : confirmaciones) {
                String linea = String.format("%s,%s,%s,%s,%s,%s,%s,%s", confirmacion.getNumeroTarjeta(),
                        confirmacion.getCantidadCuotas(), confirmacion.getItinerario(), confirmacion.getNumeroAsiento(),
                        confirmacion.getCantidadMaletas(), confirmacion.getNombreUsuario());
                writer.write(linea);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

