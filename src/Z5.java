
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class Z5 {
    public static void main(String[] args) {
        File file = new File("f5.txt");

        try (PrintWriter writer = new PrintWriter(file)) {
            for (int i = 1; i <= 10; i++) {
                writer.println(i * 3);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        int count = 0;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextInt()) {
                if (scanner.nextInt() % 9 == 0) {
                    count++;
                }
            }
            System.out.println("Количество чисел кратных 9: " + count);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}