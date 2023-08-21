import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RetornaRepetidos {
    public static ArrayList<Integer> listRepeat(ArrayList<Integer> l) {
        ArrayList<Integer> repetidos = new ArrayList<>();
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int elemento : l) {
            // Incrementa o contador do elemento no Map
            countMap.put(elemento, countMap.getOrDefault(elemento, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                repetidos.add(entry.getKey());
            }
        }

        return repetidos;
    }
}
