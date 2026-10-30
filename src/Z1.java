
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;

public class Z1 {
    public static void main(String[] args) {
        File file = new File("holiday.txt");

        try (FileWriter writer = new FileWriter(file)) {
            writer.write("Мой любимый праздник - Новый год.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Имя файла: " + file.getName());
        System.out.println("Путь: " + file.getAbsolutePath());
        System.out.println("Размер: " + file.length() + " байт");

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}