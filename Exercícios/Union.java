import java.util.ArrayList;
import java.util.HashSet;

public class Union {
    public static ArrayList<String> union(ArrayList<String> l1, ArrayList<String> l2) {
        HashSet<String> set = new HashSet<>(l1);
        set.addAll(l2);

        return new ArrayList<>(set);
    }
}
