package hw.lesson6;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }
    @Override
    void run(int len) {
        if(len > 0 && len <= 500)
            super.run(len);
        else {
            System.out.println(getName() + " не пробежит " + len + " м.");
        }
     }

    void swim(int len) {
        if(len > 0 && len <= 10)
            super.swim(len);
        else {
            System.out.println(getName() + " не проплывет " + len + " м.");
        }
    }

}
