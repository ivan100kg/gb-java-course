package lessons.lesson7;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionSync {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        ConcurrentHashMap<String, String> cMap = new ConcurrentHashMap<>();

        Map<String,String> map = new HashMap<>();
        map = Collections.synchronizedMap(map);

        CopyOnWriteArrayList<Integer> copyList = new CopyOnWriteArrayList<>();

        ArrayBlockingQueue<String> arrayBQ = new ArrayBlockingQueue<String>(6);


    }
}

