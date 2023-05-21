import java.util.*;

public class SortLinkedHashMapUsingIfElseBasedComparator {
    public static void main(String[] args) {

        // create a LinkedHashMap
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 10);
        map.put("Mary", 20);
        map.put("Alice", 5);
        map.put("Bob", 15);

        // print the original map
        System.out.println("Original LinkedHashMap: " + map);

        // Entries of the map used for creating a list
        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());

        // sort the list by value in ascending form
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                Integer o1Value = o1.getValue();
                Integer o2Value = o2.getValue();
                if (o1Value < o2Value) {
                    return -1;
                }
                if (o1Value > o2Value) {
                    return 1;
                }
                return 0;
            }
        });

        // create a new LinkedHashMap and add the sorted entries to it
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // print the sorted map
        System.out.println("LinkedHashMap sorted by value in ascending order: " + sortedMap);
    }

}
