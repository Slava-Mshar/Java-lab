
import java.util.HashMap;
import java.util.Map;

public class Z1 {
    public static void main(String[] args) {
        Map<String, Music> map = new HashMap<>();

        map.put("Rock1", new Rock("Rock1", 1, 180, true));
        map.put("Rock2", new Rock("Rock2", 2, 200, false));
        map.put("Rock3", new Rock("Rock3", 3, 210, true));

        map.put("Classic1", new Classical("Classic1", 4, 300, true));
        map.put("Classic2", new Classical("Classic2", 5, 400, false));
        map.put("Classic3", new Classical("Classic3", 6, 350, true));

        map.put("Jazz1", new Jazz("Jazz1", 7, 250, true));
        map.put("Jazz2", new Jazz("Jazz2", 8, 280, true));

        for (Map.Entry<String, Music> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
    }
}