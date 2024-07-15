import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dictionary diccionario = new Dictionary();
        Scanner scanner = new Scanner(System.in);
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;

        // Seleccionar 5 palabras al azar del diccionario
        List<String> palabrasSeleccionadas = diccionario.seleccionarPalabrasAzar(5);

        // Pedir al usuario que ingrese las traducciones de las palabras seleccionadas
        System.out.println("¡Traduce las siguientes palabras al inglés!");
        for (String palabra : palabrasSeleccionadas) {
            System.out.print(palabra + ": ");
            String respuestaUsuario = scanner.nextLine().trim().toLowerCase();

            // Comprobar si la traducción es correcta
            if (diccionario.comprobarTraduccion(palabra, respuestaUsuario)) {
                System.out.println("¡Correcto!");
                respuestasCorrectas++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta era: " + diccionario.getTraduccion(palabra));
                respuestasIncorrectas++;
            }
        }

        // Mostrar resultados
        System.out.println("\nResumen:");
        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);

        scanner.close();
    }
}