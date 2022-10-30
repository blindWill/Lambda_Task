import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Phone p1 = new Phone("Google Pixel 7 Pro", 1100.0);
        Phone p2 = new Phone("Samsung S21", 1300.0);
        Phone p3 = new Phone("OnePlus 10", 1000.0);
        Phone p4 = new Phone("Asus Zenfone 9", 900.0);
        p1.setDiscountPrice(Seasons.Winter);
        p2.setDiscountPrice(Seasons.Autumn);
        p3.setDiscountPrice(Seasons.Summer);
        p4.setDiscountPrice(Seasons.Spring);
        ArrayList<Phone> phoneList = new ArrayList<>();
        phoneList.add(p1);
        phoneList.add(p2);
        phoneList.add(p3);
        phoneList.add(p4);
        phoneList.stream().sorted(Comparator.comparingDouble(Phone::getPrice)).forEach(System.out::println);
        System.out.println();
        phoneList.stream().sorted(Comparator.comparingDouble(Phone::getDiscountPrice)).forEach(System.out::println);
    }
}