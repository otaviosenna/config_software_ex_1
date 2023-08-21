import java.util.ArrayList;
import java.util.HashSet;

public class Intersec {
    public static ArrayList<String> intersect(ArrayList<String> l1, ArrayList<String> l2) {
        HashSet<String> set1 = new HashSet<>(l1);
        HashSet<String> set2 = new HashSet<>(l2);

        set1.retainAll(set2);

        return new ArrayList<>(set1);
    }
}