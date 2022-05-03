package Lesson8;

import java.util.Random;

public class Poison extends Cell {
    private Snake snake;
    private Food food;
    private Random random1;
    public Poison(Snake snake) { // constructor
        super(-1, -1, Hw8GameSnake.CELL_SIZE, Hw8GameSnake.POISON_COLOR);
        random1 = new Random();
        this.snake = snake;
    }
    public boolean isPoison(int x, int y) {
        return (getX() == x) && (getY() == y);
    }
    public void add() {
        int x, y;
        do {
            x = random1.nextInt(Hw8GameSnake.CANVAS_WIDTH);
            y = random1.nextInt(Hw8GameSnake.CANVAS_HEIGHT);
        } while (snake.isInSnake(x, y) || food.isFood(x, y));
        set(x, y);
    }

    public void setFood(Food food) {
        this.food = food;
    }
}
