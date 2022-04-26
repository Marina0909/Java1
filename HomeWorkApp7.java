package Lesson7;

public class HomeWorkApp7 {
    public static void main(String[] args) {
        Cat7[] cat = new Cat7[4];
        cat[0] = new Cat7("Фунтик", 20);
        cat[1] = new Cat7("Багира", 15);
        cat[2] = new Cat7("Мурзик", 30);
        cat[3] = new Cat7("Ашка", 10);

        Plate plate  = new Plate(60);
        plate.info();

        for (int i = 0; i < cat.length; i++) {
            if( !(cat[i].isFull())) cat[i].eat(plate);
            cat[i].info();
        }
        plate.info();
        plate.addFood(50);
        plate.info();

        for (int i = 0; i < cat.length; i++) {
            if( !(cat[i].isFull())) cat[i].eat(plate);
            cat[i].info();
        }

        plate.info();
    }


}
