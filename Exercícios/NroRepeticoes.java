import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NroRepeticoes {

    public static int nroRepeat(ArrayList<String> l) {
        Map<String, Integer> ocorrencias = new HashMap<>();
        int contador = 0;

        for (String elemento : l) {
            ocorrencias.put(elemento, ocorrencias.getOrDefault(elemento, 0) + 1);
            if (ocorrencias.get(elemento) == 2) {
                contador++;
            }
        }

        return contador;
    }
}