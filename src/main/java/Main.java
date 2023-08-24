import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String fileName = "liczby.txt";
        try (
                Scanner scanner = new Scanner(new File(fileName))
        ) {
            NumberCounter numberCounter = new NumberCounter();
            List<Integer> listFromFile = numberCounter.createListFromFile(scanner);
            Map<Integer, Integer> numbersMap = numberCounter.createMap(listFromFile);
            Set<Map.Entry<Integer, Integer>> entries = numbersMap.entrySet();
            showResult(entries);
        } catch (FileNotFoundException e) {
            System.err.println("Nie odnaleziono pliku " + fileName);
        }
    }

    private static void showResult(Set<Map.Entry<Integer, Integer>> entries) {
        for (Map.Entry<Integer, Integer> entry : entries) {
            System.out.printf("%3d - liczba wystąpień %d\n", entry.getKey(), entry.getValue());
        }
    }
}
