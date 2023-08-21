import java.util.ArrayList;

public class Ocorrencias {
    public static int nOcorrencias(ArrayList<String> lista, String elemento) {
        int contador = 0;
        for (String item : lista) {
            if (item.equals(elemento)) {
                contador++;
            }
        }
        return contador;
    }
}