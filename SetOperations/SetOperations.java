import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> s =  new HashSet<>();
        s.addAll(set1);
        s.addAll(set2);
        return s;
    }

    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> returnSet = new HashSet<>();
        for (Integer integer : set1) {
            if (set2.contains(integer)) {
                returnSet.add(integer);
            }
        }
        return returnSet;
    }
}
