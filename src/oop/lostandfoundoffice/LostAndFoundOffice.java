package oop.lostandfoundoffice;

import java.util.ArrayList;

public class LostAndFoundOffice {

    ArrayList<Object> things = new ArrayList<>(); // создайте список things

     void put(Object element) { // реализуйте метод put()
        if (element != null) {
            things.add(element);
        }
    }

     boolean check(Object target) { // реализуйте метод check()
        for (Object object : things) { // логика проверки вещи в списке
            if (object.equals(target)) {
                return true;
            }
        }
        return false;
    }
}