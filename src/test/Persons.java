package test;

import java.util.ArrayList;
import java.util.HashMap;

public class Persons {
    public String firstName;
    public String lastName;

    public Persons(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

 class Practicums {
    public static void main(String[] args) {
        ArrayList<Persons> persons = new ArrayList<>(); // список имён и фамилий
        HashMap<Persons, String> contacts = new HashMap<>(); // хеш-таблица контактов

        String firstName = "Стив";
        String lastName = "Джобс";
        String phoneNumber = "8 (988) 123-45-67";

        persons.add(new Persons(firstName, lastName)); // добавляем элемент в список

        contacts.put(new Persons(firstName, lastName), phoneNumber); // добавляем элемент в таблицу

        System.out.println("Количество людей в списке: " + persons.size() +
                ", контактов: " + contacts.size()); // проверяем наличие элементов

        if(persons.contains(new Persons(firstName, lastName))) { // ищем элемент в списке
            System.out.println("Человек с именем " + firstName +
                    " и фамилией " + lastName + " найден в списке.");
        } else {
            System.out.println("Метод equals у класса Person реализован неверно!");
        }

        // ищем элемент в таблице по ключу:
        if (contacts.containsKey(new Persons(firstName, lastName))) {
            System.out.println("Человек с именем " + firstName + " и фамилией " +
                    lastName + " найден в таблице контактов. Его телефонный номер: " +
                    contacts.get(new Persons(firstName, lastName)));
        } else {
            System.out.println("Метод hashCode у класса Person реализован неверно!");
        }
    }
}
