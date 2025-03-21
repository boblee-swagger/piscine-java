import java.util.ArrayList;
import java.util.List;

public class ListSearchIndex {
    public static Integer findLastIndex(List<Integer> list, Integer value) {
        return list.lastIndexOf(value);
    }
    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        return list.indexOf(value);
    }
    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {
        List<Integer> result = new ArrayList<>();
        for (Integer val : list){
            if (val == value){
                result.add(list.indexOf(val));
            }
        }
        return result;
    }
}
