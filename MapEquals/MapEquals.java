import java.util.Map;

public class MapEquals {
    public static boolean areMapsEqual(Map<String, Integer> map1, Map<String, Integer> map2) {
         if (map1.size() != map2.size()) {
            return false;
        }

        for (Map.Entry<String, Integer> item : map1.entrySet()){
            String key = item.getKey();
            Integer value = item.getValue();

            if (!map2.containsKey(key) || !map2.get(key).equals(value)){
                return false;
            }
        }
        return true;
    }
}
