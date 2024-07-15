import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Dictionary {

    private HashMap<String, String> diccionario;

    // Constructor que inicializa el diccionario con algunas palabras
    public Dictionary() {
        diccionario = new HashMap<>();
        diccionario.put("casa", "house");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("agua", "water");
        diccionario.put("manzana", "apple");
        diccionario.put("ordenador", "computer");
        diccionario.put("libro", "book");
        diccionario.put("juego", "game");
        diccionario.put("amigo", "friend");
        diccionario.put("familia", "family");
        diccionario.put("trabajo", "work");
        diccionario.put("escuela", "school");
        diccionario.put("comida", "food");
        diccionario.put("ciudad", "city");
        diccionario.put("viaje", "trip");
        diccionario.put("dinero", "money");
        diccionario.put("tiempo", "time");
        diccionario.put("amor", "love");
    }

    // Método para seleccionar palabras al azar del diccionario
    public List<String> seleccionarPalabrasAzar(int cantidad) {
        List<String> palabras = new ArrayList<>(diccionario.keySet());
        Collections.shuffle(palabras);
        return palabras.subList(0, cantidad);
    }

    // Método para comprobar la traducción de una palabra
    public boolean comprobarTraduccion(String palabraEspañol, String traduccionUsuario) {
        if (diccionario.containsKey(palabraEspañol)) {
            String traduccionCorrecta = diccionario.get(palabraEspañol);
            return traduccionCorrecta.equalsIgnoreCase(traduccionUsuario);
        }
        return false;
    }
    // Método para obtener la traducción de una palabra
    public String getTraduccion(String palabraEspañol) {
        return diccionario.get(palabraEspañol);
    }
    // Getter para obtener el tamaño del diccionario
    public int getSize() {
        return diccionario.size();
    }
}
