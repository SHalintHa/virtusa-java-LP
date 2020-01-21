import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByKey;

public class Application {

    public static void main(String[] args) {


        Map<String, Integer> studentMap = new HashMap();

        studentMap.put("John", 90);
        studentMap.put("Sam", 45);
        studentMap.put("Bob", 50);
        studentMap.put("Marry", 60);
        studentMap.put("Watson", 70);
        studentMap.put("Smith", 40);
        studentMap.put("Kane", 65);
        studentMap.put("Henry", 95);

        System.out.println(studentMap);

        List<String> studentList = studentMap.keySet().stream()
                .filter( e -> studentMap.get(e) >= 60 )
                .sorted()
                .collect(Collectors.toList()
        );

        System.out.println(studentList);

    }

}
