import java.util.Scanner;

public class Adivinanzas{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("¡Adivina la respuesta correcta!");
            System.out.println("1. Primera adivinanza: ¿Una vieja loca con las tripas en la boca?");
            System.out.println("   a) El violìn");
            System.out.println("   b) El Acordion");
            System.out.println("   c) La Guitarra");
            System.out.print("Tu respuesta: ");
            opcion = scanner.next().charAt(0);
            scanner.nextLine(); // Limpiar el buffer del scanner

            if (opcion != 'c') {
                System.out.println("Respuesta incorrecta. Inténtalo de nuevo.");
                continue;
            }

            System.out.println("¡Correcto! Pasemos a la siguiente.");

            System.out.println("2. Segunda adivinanza: Aunque corren más que los minutos, nunca logran llegar los primeros. ¿Qué son?");
            System.out.println("   a) Los Minutos");
            System.out.println("   b) Los Segundos");
            System.out.println("   c) Las Horas");
            System.out.print("Tu respuesta: ");
            opcion = scanner.next().charAt(0);
            scanner.nextLine(); // Limpiar el buffer del scanner

            if (opcion != 'b') {
                System.out.println("Respuesta incorrecta. Volvamos a la primera adivinanza.");
                continue;
            }

            System.out.println("¡Correcto! Pasemos a la última.");

            System.out.println("3. Tercera adivinanza: ¿Qué cosa corre más que un zorro?");
            System.out.println("   a) El tiempo");
            System.out.println("   b) El rayo");
            System.out.println("   c) El agua");
            System.out.print("Tu respuesta: ");
            opcion = scanner.next().charAt(0);
            scanner.nextLine(); // Limpiar el buffer del scanner

            if (opcion != 'b') {
                System.out.println("Respuesta incorrecta. Volvamos a la primera adivinanza.");
                continue;
            }

            System.out.println("¡Felicidades! Has acertado todas las adivinanzas.");

            break; // Salir del bucle una vez que se hayan respondido todas las adivinanzas correctamente

        } while (true);

        scanner.close(); // Cerrar el scanner al finalizar el programa
    }
}

    
