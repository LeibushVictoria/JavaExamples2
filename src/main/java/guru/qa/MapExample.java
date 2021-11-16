package guru.qa;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {

        Map<Integer, String> pet = new HashMap<>();

        pet.put(1, "dog");
        pet.put(2, "cat");
        pet.put(3, "parrot");
        pet.put(4, "hamster");
        pet.put(5, "turtle");

        System.out.println("all keys and values:");
        for (Map.Entry entry : pet.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        pet.remove(2);
        System.out.println("pets left after remove cat: " + pet.size());

        System.out.println("presence of key=3: " + pet.containsKey(3));

        System.out.println("presence of parrot: " + pet.containsValue("cat"));

        System.out.println("amount of pet: " + pet.size());

        System.out.println("all keys: ");
        List<Integer> keys = new ArrayList<>(pet.keySet());
        for (int i : keys) {
            System.out.print(i + " ");
        }

        System.out.println("\nall values:");
        List<String> values = new ArrayList<>(pet.values());
        for (String s : values) {
            System.out.print(s + " ");
        }
    }
}
