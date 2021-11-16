package guru.qa;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {

        Set<String> car = new HashSet<>();

        car.add("Kia");
        car.add("BMW");
        car.add("Opel");
        car.add("Audi");
        car.add("Reno");

        System.out.println("all " + car.size() + " cars: ");
        for (String element : car) {
            System.out.println(element);
        }

        car.remove("Opel");
        System.out.println("amount of car after removing Opel: " + car.size());

        System.out.println("presence of Audi: " +car.contains("Audi"));

        Set<String> otherCar = new HashSet<>();
        otherCar.add("Ford");
        otherCar.add("Porsche");

        car.addAll(otherCar);
        System.out.println("amount of car after adding two more: " + car.size());

        Iterator<String> itr = car.iterator();
        System.out.println("all " + car.size() + " cars: ");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
