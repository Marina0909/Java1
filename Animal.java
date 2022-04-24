package hw.lesson6;

public class Animal {
    private String name;
    static int count = 0;

    public Animal(String name) {
        this.name = name;
        ++Animal.count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '}';
    }

    void run(int len) {
        System.out.println(name + " пробежал " + len + " м.");
    }

    void swim(int len) {
        System.out.println(name + " проплыл " + len + " м.");
    }
}
