package hw.lesson6;

public class HomeWorkApp6 {

    public static void main(String[] args){

        Cat catS = new Cat("Алиса");
        System.out.println(catS.toString());
        catS.run(100);
        catS.swim(5);
        Cat catCh = new Cat("Соня");
        catCh.run(300);
        catCh.swim(20);
        Dog dogD = new Dog("Дружок");
        dogD.run(400);
        dogD.swim(15);
        Dog dogK = new Dog("Лесси");
        dogK.run(700);
        dogK.swim(10);

        System.out.println("Создано животных: " + Animal.count);
    }

}