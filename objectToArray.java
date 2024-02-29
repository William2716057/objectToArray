import java.util.*;

public class ObjectToArray {
    public static List<Object[]> objectToArray(Map<String, Object> obj) {
        List<Object[]> keyValuePairs = new ArrayList<>();

        for (Map.Entry<String, Object> entry : obj.entrySet()) {
            Object[] pair = new Object[]{entry.getKey(), entry.getValue()};
            keyValuePairs.add(pair);
        }

        return keyValuePairs;
    }

    public static void main(String[] args) {
        Map<String, Object> obj1 = new HashMap<>();
        obj1.put("D", 1);
        obj1.put("B", 2);
        obj1.put("C", 3);

        Map<String, Object> obj2 = new HashMap<>();
        obj2.put("eggs", 2);
        obj2.put("bread", 3);
        obj2.put("cheese", 10);

        List<Object[]> result1 = objectToArray(obj1);
        List<Object[]> result2 = objectToArray(obj2);

        // Print the contents of the arrays
        System.out.println(Arrays.deepToString(result1.toArray()));
        System.out.println(Arrays.deepToString(result2.toArray()));
    }
}
