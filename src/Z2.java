
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class Z2 {
    public static void main(String[] args) {
        File file = new File("f2.txt");

        try (PrintWriter writer = new PrintWriter(file); Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < 10; i++) {
                writer.println(scanner.nextInt());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        int count = 0;
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextInt()) {
                int num = fileScanner.nextInt();
                System.out.print(num + " ");
                if (num > 0 && num < 100) {
                    count++;
                }
            }
            System.out.println("\nКоличество чисел > 0 и < 100: " + count);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}