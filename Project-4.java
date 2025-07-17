import java.util.*;

public class MultiplesCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input in format {1, 2, 3, ...}: ");
        String inputStr = scanner.nextLine();

        inputStr = inputStr.replaceAll("[{}\\s]", "");
        String[] parts = inputStr.split(",");

        int[] input = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            input[i] = Integer.parseInt(parts[i]);
        }

        Map<Integer, Integer> countMap = new LinkedHashMap<>();
        for (int i = 1; i <= 9; i++) {
            countMap.put(i, 0);
        }

        for (int num : input) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    countMap.put(i, countMap.get(i) + 1);
                }
            }
        }

        System.out.print("{");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + ": " + countMap.get(i));
            if (i < 9) System.out.print(", ");
        }
        System.out.println("}");
    }
}
