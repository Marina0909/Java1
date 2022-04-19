package ru.geekbrains.lesson5;

public class HomeWorkApp5 {
    public static void main(String[] args) {
        Worker[] workersArr = new Worker[5];
        workersArr[0] = new Worker("Mirnyj", "Andrey", "Andreevich",
                "Director", "dir@mailwork.ru", "89001112288", 100000, 40);
        workersArr[1] = new Worker("Ivanov", "Ivan", "Inanovich",
                "Main Engineer", "m_ing@mailwork.ru", "89003332288", 80000, 52);
        workersArr[2] = new Worker("Solovej", "Irina", "Anatolievna",
                "Financial Director", "findir@mailwork.ru", "89005552288", 75000, 45);
        workersArr[3] = new Worker("Pastuchov", "Sergey", "Petrovich",
                "Engineer", "ing_pastuchov@mailwork.ru", "89001882288", 40000, 26);
        workersArr[4] = new Worker("Danilov", "Stepan", "Arkadjevich",
                "Engineer", "ing_danilov@mailwork.ru", "89001112288", 50000, 42);

        for(int i = 0; i < workersArr.length; i++){
            if(workersArr[i].getAge() > 40){
                workersArr[i].info();
            }
        }
    }

}
