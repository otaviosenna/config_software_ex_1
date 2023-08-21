import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Repeticoes {
    public static boolean hasRepeat(ArrayList<String> l) {
        Set<String> set = new HashSet<>();
        for (String elemento : l) {
            if (set.contains(elemento)) {
                return true;
            }
            set.add(elemento);
        }
        return false;
    }
}