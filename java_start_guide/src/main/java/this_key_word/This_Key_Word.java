package this_key_word;

public class This_Key_Word {
    public static void main(String[] args) {
    }
}
class Human {
    int age;
    String name;
    public void setOne(int age){
        this.age = age; // "this" means that it's the object's field
    }
    public boolean equals(Human human) {
        return this == human; // this also means "The created object"
    }
}
