package Lesson7;

public class Cat7 {

    private String name;
    private int appetite;
    private boolean full;

    public Cat7(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.full = false;
    }
    public void eat(Plate pl) {
        if( pl.decreaseFood(appetite)) {
            full = true;
        }
    }

    public boolean isFull() {
        return full;
    }

    public  void info() {
        if( full)
            System.out.println("Котик " + name + " с аппетитом " + appetite + " сыт!");
        else System.out.println("Котик " + name + " с аппетитом " + appetite + " голодный(");
    }
 }
