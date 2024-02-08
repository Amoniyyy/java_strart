package classes_and_objects;

public class ClassesAndObjects {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();
        person.age = 20;
        person.salary = 60000;
        person.name = "Олег";
        person.surname = "Олегов";

        System.out.println("Меня зовут " + person.name + " " + person.surname);
        System.out.println("Мне " + person.age + " лет");
    }
}
class Person {
    int age;
    int salary;
    String name;
    String surname;
}
