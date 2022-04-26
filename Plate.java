package Lesson7;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int n) {
        if(n <= food) {
            food -= n;
            return true;
        }
        return false;
    }
    public void addFood(int n) {
        food += n;
    }
    public void info() {
        System.out.println("Тарелка: еды "+ food);
    }

}
