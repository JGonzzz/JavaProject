import java.util.Scanner;

public class JuegoNumerico {
    
    public static void main(String[] args) {
        //
        Scanner scanner = new Scanner(System.in);

        //
        String pregunta1 = "¿Cual es el Valor de π (pi)?";
        String opcion1A = "A. 3.12";
        String opcion1B = "B. 3.14";
        String opcion1C = "C. 3.16";
        String opcion1D = "D. 3.18";
        char respuesta1Correcta = 'B';

        String pregunta2 = "¿Cual es el resultado de 5 + 3 X 2?";
        String opcion2A = "A. 16";
        String opcion2B = "B. 11";
        String opcion2C = "C. 13";
        String opcion2D = "D. 10";
        char respuesta2Correcta = 'B';

        String pregunta3 = "¿Cuantos lados tiene un hexagono?";
        String opcion3A = "A. 5";
        String opcion3B = "B. 6";
        String opcion3C = "C. 7";
        String opcion3D = "D. 8";
        char respuesta3Correcta = 'B';

        String pregunta4 = "¿Cual es la raiz cuadrada de 64?";
        String opcion4A = "A. 6";
        String opcion4B = "B. 7";
        String opcion4C = "C. 8";
        String opcion4D = "D. 9";
        char respuesta4Correcta = 'B';

        //
        int puntuacion = 0;

        //
        System.out.println(pregunta1);
        System.out.println(opcion1A);
        System.out.println(opcion1B);
        System.out.println(opcion1C);
        System.out.println(opcion1D);
        System.out.print("Introduce tu respuesta (A, B, C, D)");
        char respuesta1 = scanner.next().toUpperCase().charAt(0);

        if (respuesta1 == respuesta1Correcta) {
            System.out.println("¡Correcto!");
            puntuacion++;
        } else {
            System.out.println("Incorrecto. La respuesta correcta es " + respuesta1Correcta);
        }

        //
        System.out.println(pregunta2);
        System.out.println(opcion2A);
        System.out.println(opcion2B);
        System.out.println(opcion2C);
        System.out.println(opcion2D);
        System.out.print("Introduce tu respuesta (A, B, C, D)");
        char respuesta2 = scanner.next().toUpperCase().charAt(0);

        if (respuesta2 == respuesta2Correcta) {
            System.out.println("Correcto");
            puntuacion++;
        } else {
            System.out.println("Incorrecto. La respuesta correcta es " + respuesta2Correcta);
        }

        //
        System.out.println(pregunta3);
        System.out.println(opcion3A);
        System.out.println(opcion3B);
        System.out.println(opcion3C);
        System.out.println(opcion3D);
        System.out.print("Introduce tu respuesta (A, B, C, D)");
        char respuesta3 = scanner.next().toUpperCase().charAt(0);

        if (respuesta3 == respuesta3Correcta) {
            System.out.println("¡Correcto!");
            puntuacion++;
        } else {
            System.out.println("Incorrecto. La respuesta correcta es " + respuesta3Correcta);  
        }

        //
        System.out.println(pregunta4);
        System.out.println(opcion4A);
        System.out.println(opcion4B);
        System.out.println(opcion4C);
        System.out.println(opcion4D);
        System.out.print("Introduce tu respuesta (A, B, C, D)");
        char respuesta4 = scanner.next().toUpperCase().charAt(0);

        if (respuesta4 == respuesta4Correcta) {
            System.out.println("¡Correcto!");
            puntuacion++;
        } else {
            System.out.println("Incorrecto. La respuesta correcta es " + respuesta4Correcta);
        }

        //Mostrar la puntuacion final
        System.out.println("Tu puntuación final es: " + puntuacion + "/4");

        //Cerrar el escáner
        scanner.close();
    }
}
