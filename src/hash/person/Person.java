package hash.person;

import java.time.Period;
import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        int hash = 38;
        if (firstName != null) {
            hash = hash + firstName.hashCode();
        }
        hash = hash * 37;
        if (lastName != null) {
            hash = hash + lastName.hashCode();
        }
        return hash;
    }
}
class Practicum {
    public static void main(String[] args) {
        Person person1 = new Person("Лю", "Чен");
        Person person2 = new Person("Чен","Лю");
        System.out.println("person1.hashCode() = "
                + person1.hashCode()
        + "\nperson2.hashCode() = " + person2.hashCode());
    }
}