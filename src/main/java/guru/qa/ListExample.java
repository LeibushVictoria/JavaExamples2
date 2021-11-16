package guru.qa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("pear");
        fruits.add("kiwi");
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");

        System.out.println("all fruits: " + fruits);

        System.out.println("first fruit: " + fruits.get(0));

        fruits.remove(3);
        System.out.println("after removing the orange: " + fruits);

        System.out.println("presence of orange: " + fruits.contains("orange"));

        System.out.println("amount of fruit: " + fruits.size());

        Collections.sort(fruits);
        System.out.println("fruits sorted alphabetically: " + fruits);

        Collections.reverse(fruits);
        System.out.println("fruits sorted alphabetically (reverse): " + fruits);
    }
}
