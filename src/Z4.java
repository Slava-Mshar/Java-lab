
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class Z4 {
    public static void main(String[] args) {
        File file = new File("f4.txt");

        try (PrintWriter writer = new PrintWriter(file);
             Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < 12; i++) {
                writer.println(scanner.nextDouble());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        double sum = 0;
        int count = 0;
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextDouble()) {
                sum += fileScanner.nextDouble();
                count++;
            }
            if (count > 0) {
                System.out.println("Средняя мощность: " + (sum / count));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}