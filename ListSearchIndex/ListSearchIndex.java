import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListSearchIndex {
    public static Integer findLastIndex(List<Integer> list, Integer value) {
        return list.lastIndexOf(value);
    }
    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        int result;
        result = list.indexOf(value);
        if (result == -1){
            return null;
        }
        return result;
    }
    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {
        List<Integer> result = new ArrayList<>();
        for (Integer val : list){
            if (Objects.equals(val, value)){
                result.add(list.indexOf(val));
            }
        }
        return result;
    }
}
