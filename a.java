//RAFAEL TEIXEIRA MACHADO
// Metodo que retorna quantas ocorrencias de um elemento estao na lista
// int nOcorrencias(ArrayList<Integer> l, Integer el)

import java.util.ArrayList;

public class a {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(2);
        lista.add(4);
        lista.add(2);
        lista.add(5);

        int elemento = 2;

        int ocorrencias = contarOcorrencias(lista, elemento);
        System.out.println("O elemento " + elemento + " ocorre " + ocorrencias + " vezes na lista.");
    }

    public static <T> int contarOcorrencias(ArrayList<T> lista, T elemento) {
        int count = 0;
        for (T item : lista) {
            if (item.equals(elemento)) {
                count++;
            }
        }
        return count;
    }
}
