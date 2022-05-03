package Lesson8;

import java.awt.*;
import java.util.LinkedList;

public class Snake {
    private LinkedList<Cell> snake;
    private int direction;
    private Food food;
    private Poison poison;

    public Snake(int x, int y, int length, int direction) {
        snake = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            snake.add(new Cell(x - i, y, Hw8GameSnake.CELL_SIZE, Hw8GameSnake.SNAKE_COLOR));
        }
        this.direction = direction;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public void setPoison(Poison poison) {
        this.poison = poison;
    }

    public int size() {
        return snake.size();
    }

    public void setDirection(int direction) {
        if ((direction >= Hw8GameSnake.KEY_LEFT) && (direction <= Hw8GameSnake.KEY_DOWN)) {
            if (Math.abs(this.direction - direction) != 2) {
                this.direction = direction;
            }
        }
    }

    public boolean isInSnake(int x, int y) {
        for (Cell cell : snake) {
            if ((cell.getX() == x) && (cell.getY() == y)) {
                return true;
            }
        }
        return false;
    }

    public void move() {
        int x = snake.getFirst().getX();
        int y = snake.getFirst().getY();
        switch (direction) {
            case Hw8GameSnake.KEY_LEFT: x--;
                if (x < 0)
                    x = Hw8GameSnake.CANVAS_WIDTH - 1;
                break;
            case Hw8GameSnake.KEY_RIGHT: x++;
                if (x == Hw8GameSnake.CANVAS_WIDTH)
                    x = 0;
                break;
            case Hw8GameSnake.KEY_UP: y--;
                if (y < 0)
                    y = Hw8GameSnake.CANVAS_HEIGHT - 1;
                break;
            case Hw8GameSnake.KEY_DOWN: y++;
                if (y == Hw8GameSnake.CANVAS_HEIGHT)
                    y = 0;
                break;
        }
        if (isInSnake(x, y) ||           // if the snake crosses itself
                poison.isPoison(x, y)) { // or if it eats poison
            Hw8GameSnake.gameOver = true;
            return;
        }
        snake.addFirst(new Cell(x, y, Hw8GameSnake.CELL_SIZE, Hw8GameSnake.SNAKE_COLOR)); // new head of snake
        if (food.isFood(x, y)) {
            food.eat();
        } else {
            snake.removeLast();
        }
    }

    public void paint(Graphics2D g) {
        for (Cell cell : snake) {
            cell.paint(g);
        }
    }
}
