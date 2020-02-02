package OOP.Practice.Robot;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Robot {
    private int toX = 0;
    private int toY = 0;
    private Direction direction = Direction.UP;

    public void printDirection(){
        System.out.println("X " + toX);
        System.out.println("Y " + toY);
    }

    // текущее направление взгляда
    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        // текущая координата X
        return toX;
    }

    public int getY() {
        // текущая координата Y
        return toY;
    }

    public void turnLeft() {
        // повернуться на 90 градусов против часовой стрелки
        if(direction == Direction.UP)
            this.direction = Direction.LEFT;

        else if (direction == Direction.LEFT)
            this.direction = Direction.DOWN;

        else if (direction == Direction.DOWN)
            this.direction = Direction.RIGHT;

        else this.direction = Direction.UP;
    }

    public void turnRight() {
        // повернуться на 90 градусов по часовой стрелке
        if(direction == Direction.UP)
            this.direction = Direction.RIGHT;

        else if (direction == Direction.RIGHT)
            this.direction = Direction.DOWN;

        else if (direction == Direction.DOWN)
            this.direction = Direction.LEFT;

        else this.direction = Direction.UP;
    }

    public void stepForward() {
        // шаг в направлении взгляда

        // за один шаг робот изменяет одну свою координату на единицу
        if(direction == Direction.UP) this.toY++;
        if(direction == Direction.DOWN) this.toY--;
        if(direction == Direction.RIGHT) this.toX++;
        if(direction == Direction.LEFT) this.toX--;
    }
}

enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT
}