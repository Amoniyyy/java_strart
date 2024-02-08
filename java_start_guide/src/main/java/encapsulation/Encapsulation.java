package encapsulation;

import java.util.Objects;

public class Encapsulation {
    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        Encapsulation a = new Encapsulation();
        e.setAge(32);
        a.setAge(32);
        System.out.println(e.isEquals(a));
        System.out.println();
    }
    private int age; // should be private
    private String name;
    private int salary;
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setName(int salary){
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return this.name;
    }
    public int getSalary() {
        return this.salary;
    }
    boolean isEquals(Encapsulation e){
        return this == e;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Encapsulation that = (Encapsulation) o;

        if (age != that.age) return false;
        if (salary != that.salary) return false;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + salary;
        return result;
    }
}
