
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Z3 {
    public static void main(String[] args) {
        File f = new File("f3.txt");
        File g = new File("g.txt");
        File h = new File("h.txt");
        Random random = new Random();

        try (PrintWriter writerF = new PrintWriter(f)) {
            for (int i = 0; i < 20; i++) {
                writerF.println(random.nextInt(100));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (Scanner scanner = new Scanner(f);
             PrintWriter writerG = new PrintWriter(g);
             PrintWriter writerH = new PrintWriter(h)) {
            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num % 6 == 0) {
                    writerG.println(num);
                } else {
                    writerH.println(num);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}