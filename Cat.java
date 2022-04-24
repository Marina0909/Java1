package hw.lesson6;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    void run(int len) {
        if (len > 0 && len <= 200)
            super.run(len);
        else{
            System.out.println(getName() + " не пробежит " + len + " м.");
        }
    }

    void swim(int len) {
        System.out.println(getName() + " не умеет плавать");
    }
}


