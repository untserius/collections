package Map;

import java.util.*;
import java.util.stream.Collectors;

public class Comparingbyvalue {
    public static void main(String[] args) {
        Map<String, String> details = new LinkedHashMap<>();

        details.put("First Name", "Sudhir");
        details.put("Last Name", "Das");
        details.put("Designation", "Software Developer");
        details.put("Contact", "+91 9777-959-123");
        details.put("Email", "Sudhirdas1999@gmail.com");
        details.put("Address", "Zurich");

        Set<Map.Entry<String, String>> d = details.entrySet();

        d.stream().sorted(Map.Entry.comparingByValue()).forEach(e -> System.out.println(e.getValue()));

        System.out.println();

        d.stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach( (e) -> {
            System.out.println(e.getValue());
        });
    }
}
