import java.util.ArrayList;
import java.util.List;

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
        List<Integer> result = new ArrayList<>();
        if (list == null) return result;

        for (int i = 0; i < list.size(); i++){
            if (list.get(i).equals(value)){
                result.add(list.indexOf(i));
            }
        }
        return result;
    }

}
