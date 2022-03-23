package lessons.lesson5;

import java.util.*;
import java.util.function.Consumer;

public class MainApp {
    public static void main(String[] args) {
//        Map<String, String> map = new HashMap<>();
//        map.put("a", "rus");
//        map.put("b", "usa");
//        map.put("c", "fra");
//        System.out.println(map.keySet());
//        System.out.println(map.values());
//        System.out.println(map.size());
//        System.out.println(map.entrySet());
//
//        map.remove("a");
//        System.out.println(map.keySet());
//        System.out.println(map.values());
//        System.out.println(map.size());
//        System.out.println(map.entrySet());
//        map.putIfAbsent("a", "chi");
//        map.put("b", "kz");
//        System.out.println(map.entrySet());
//        System.out.println(map);
//        map.forEach((s1,s2)-> System.out.println(s1+":"+s2));

        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("a");

        System.out.println(set);
        set.removeIf(s -> s.equals("b"));
        System.out.println(set);
        "s".toLowerCase(Locale.ROOT);

        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "a", "a"));
//        while (list.remove("a")){}
        System.out.println(list);
        // приимущество перед foreach, можно удалять эл
        list.removeIf(s -> s.equals("a"));
//        for (String s : list) {     // the same
//            System.out.println(s);
//        }
        Iterator<String> iter = list.iterator();
        System.out.println(list);
    }
}
