import java.util.Scanner;

public class Actividad_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Ingreso de datos del visitante
        System.out.println("Ingrese el nombre del visitante:");
        String nombre = entrada.nextLine();

        System.out.println("Ingrese la cédula del visitante:");
        int cedula = entrada.nextInt();

        System.out.println("Ingrese la edad:");
        byte edad = entrada.nextByte();

        System.out.println("¿Es residente? (true o false):");
        boolean residente = entrada.nextBoolean();

        System.out.println("Ingrese la torre (una letra):");
        char torre = entrada.next().charAt(0);

        System.out.println("Ingrese el piso al que se dirige:");
        double piso = entrada.nextDouble();

        System.out.println("Ingrese la estatura:");
        float estatura = entrada.nextFloat();

        System.out.println("Ingrese el ID del visitante:");
        long id = entrada.nextLong();

        System.out.println("¿Cuántas visitas realizó esta semana?");
        short visitas = entrada.nextShort();

        float sumaTiempo = 0;
        for (int i = 1; i <= visitas; i++) {
            System.out.println("Ingrese la duración en minutos de la visita #" + i + ":");
            float duracion = entrada.nextFloat();
            sumaTiempo += duracion;
        }

        float promedio = sumaTiempo / visitas;

        System.out.println("\n--- Información del visitante ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cédula: " + cedula);
        System.out.println("Edad: " + edad);
        if (edad >= 18) {
            System.out.println("El visitante es mayor de edad.");
        } else {
            System.out.println("El visitante es menor de edad.");
        }
        System.out.println("Residente: " + residente);
        System.out.println("Torre: " + torre);
        System.out.println("Piso: " + piso);
        System.out.println("Estatura: " + estatura + " m");
        System.out.println("ID: " + id);
        System.out.println("Cantidad de visitas: " + visitas);
        System.out.println("Promedio de duración: " + promedio + " minutos");

        entrada.close();
    }
}