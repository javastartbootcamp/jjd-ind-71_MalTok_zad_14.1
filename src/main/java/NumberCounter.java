import java.util.*;

class NumberCounter {
    public Map<Integer, Integer> createMap(List<Integer> list) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (Integer keyNumber : list) {
            if (map.containsKey(keyNumber)) {
                Integer occurence = map.get(keyNumber);
                map.put(keyNumber, occurence + 1);
            } else {
                map.put(keyNumber, 1);
            }
        }
        return map;
    }

    public List<Integer> createListFromFile(Scanner scanner) {
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            list.add(number);
        }
        return list;
    }
}
