import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListSearchIndex {
    public static Integer findLastIndex(List<Integer> list, Integer value) {
        if (list == null) return null;
        int valueIndex = list.lastIndexOf(value);
        if (valueIndex == -1) return null;
        return valueIndex;
    }

    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        if (list == null) return null;
        int valueIndex = list.indexOf(value);
        if (valueIndex == -1) return null;
        return valueIndex;
    }

    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {
        if (list == null) return null;
        int valueIndex = list.indexOf(value);
        if (valueIndex == -1) return null;
        List<Integer> result = new ArrayList<>();
        for (Integer val : list){
            if (Objects.equals(val, value)){
                result.add(list.indexOf(val));
            }
        }
        return result;
    }

}
