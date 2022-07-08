package Address;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // список адресов
        MyClass adress1 = new MyClass("Lviv", "Lvovskaya", 24);
        MyClass adress2 = new MyClass("Kyiv", "Khreschatyk", 5);
        MyClass adress3 = new MyClass("Odessa", "Deribasovskaya", 5);

        System.out.println("Available addresses: ");
        System.out.println(adress1);
        System.out.println(adress2);
        System.out.println(adress3);
        System.out.println("__________________________");

        // сравнение адресов по параметрам
        System.out.println("Comparison of 1 and 2 addresses for the similarity of cities: " +
                adress1.MyCityEquals(adress2));
        System.out.println("Comparison of 2 and 3 addresses for the similarity of cities: " +
                adress2.MyCityEquals(adress3));
        System.out.println("Comparison of 1 and 2 addresses for the similarity of streets: " +
                adress1.MyStreetEquals(adress2));
        System.out.println("Comparison of 2 and 3 addresses for the similarity of streets: " +
                adress2.MyStreetEquals(adress3));
        System.out.println("Comparison of 1 and 2 addresses for the similarity of house numbers: " +
                adress1.myEquals(adress2));
        System.out.println("Comparison of 2 and 3 addresses for the similarity of house numbers: " +
                adress2.myEquals(adress3));
        System.out.println("__________________________");

        // наполнение коллекции адресами
        Set<MyClass> addresses = new HashSet<>();
        addresses.add(adress1);
        addresses.add(adress2);
        addresses.add(adress3);
        // добавление нового адреса
        addresses.add(new MyClass("Kharkiv", "Sumskaya", 56));
        System.out.println("New address added: " + new MyClass("Kharkiv", "Sumskaya", 56));


        System.out.println("Number of addresses: " + addresses.size());
        System.out.println("List of addresses (displayed randomly in HashSet): " + "\n" + addresses);
        System.out.println("Removing a second address: " + addresses.remove(adress2));
        System.out.println("Check - Is there a second address?: " + addresses.contains(adress2));
        System.out.println("Check - Number of addresses: " + addresses.size());

        // удаление всех адресов
        addresses.clear();
        System.out.println("Check - Are all addresses removed?: " + addresses + " " + addresses.isEmpty());
    }
}
