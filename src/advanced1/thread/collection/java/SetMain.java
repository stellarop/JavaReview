package advanced1.thread.collection.java;

import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> set = new CopyOnWriteArraySet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);

        Set<Integer> objects = new ConcurrentSkipListSet<>();
        objects.add(1);
        objects.add(2);
        objects.add(3);
        System.out.println(objects);
    }
}