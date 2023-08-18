//RAFAEL TEIXEIRA MACHADO
// Metodo que retorna uma lista de elementos repetidos de l
// ArrayList<Integer> listRepeat(ArrayList< Integer > l)
import java.util.ArrayList;

public class d {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(2);
        lista.add(4);
        lista.add(2);
        lista.add(5);

        ArrayList<Integer> elementosRepetidos = listRepeat(lista);
        System.out.println("Elementos repetidos na lista: " + elementosRepetidos);
    }

    public static ArrayList<Integer> listRepeat(ArrayList<Integer> l) {
        ArrayList<Integer> repetidos = new ArrayList<>();
        
        for (int i = 0; i < l.size(); i++) {
            int elemento = l.get(i);
            boolean repetido = false;
            
            for (int j = i + 1; j < l.size(); j++) {
                if (elemento == l.get(j)) {
                    repetido = true;
                    break;
                }
            }
            
            if (repetido && !repetidos.contains(elemento)) {
                repetidos.add(elemento);
            }
        }

        return repetidos;
    }
}
