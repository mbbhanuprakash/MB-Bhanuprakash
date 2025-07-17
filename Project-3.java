import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConditionalOddSeriesGenerator {

    public static List<Integer> generateOddNumbers(int count) {
        List<Integer> oddSeries = new ArrayList<>();
        if (count < 0) {
            return oddSeries;
        }
        for (int i = 0; i < count; i++) {
            oddSeries.add(2 * i + 1);
        }
        return oddSeries;
    }

    public static void printSeriesForSingleInputX(int x) {
        List<Integer> finalSeries;

        if (x % 2 != 0) {
            finalSeries = generateOddNumbers(x);
        } else {
            finalSeries = generateOddNumbers(x - 1);
        }

        String output = finalSeries.toString()
                                   .replace("[", "")
                                   .replace("]", "");
        System.out.println("Output : "+output);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer value for 'x': ");
        int inputX = scanner.nextInt();

        printSeriesForSingleInputX(inputX);

        scanner.close();
    }
}
