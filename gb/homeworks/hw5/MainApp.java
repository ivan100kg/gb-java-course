package homeworks.hw5;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        // task #1
        String[] arr = {"a", "b", "c", "d", "d", "c", "b", "a", "c", "f", "g"};
        HashSet<String> set = new HashSet<>(List.of(arr));
        System.out.println(set);
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }
        System.out.println(map);

        // task #2
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivan", "+7-903-908-0055");
        phoneBook.add("Egor", "+7-917-508-0782");
        phoneBook.add("Ivan", "+7-919-345-3356");
        phoneBook.add("Ilya", "+7-902-454-9009");
        phoneBook.add("Ilya", "+7-927-000-2712");

        System.out.println(phoneBook.get("Ilya"));
        System.out.println(phoneBook.get("Arkady"));
        System.out.println(phoneBook.get("Ivan"));
        System.out.println(phoneBook.get("Egor"));

    }
}

class PhoneBook {
    private HashMap<String, String> map = new HashMap<>();

    void add(String name, String phoneNumber) {
        if (map.containsKey(name)) {
            map.put(name, map.get(name) + " " + phoneNumber);
        } else {
            map.put(name, phoneNumber);
        }
    }

    String get(String name) {
        return map.getOrDefault(name, "name \"" + name + "\" is not found");
    }
}
