import java.util.List;

public class ListEquals{
    public static boolean areListsEqual(List<String> list1, List<String> list2) {

        if (list1 != null && list2 != null){
            return list1.equals(list2);
        }
        if (!list1.isEmpty() && !list2.isEmpty()){
            return false;
        }

        return false;

    }
}