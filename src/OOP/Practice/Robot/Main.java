package OOP.Practice.Robot;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        int toX = 10;
        int toY = -30;

        robot.printDirection();
        moveRobot(robot, toX, toY);
        robot.printDirection();
    }

    public static void moveRobot(Robot robot, int toX, int toY) {

        //if 0 < toY
        //robot direction get ↑
        if (robot.getY() < toY){
            while (robot.getDirection() != Direction.UP) robot.turnLeft();
            while (robot.getY() < toY) robot.stepForward();
        }

        //if 0 < toX
        //robot direction get ->
        if (robot.getX() < toX){
            while (robot.getDirection() != Direction.RIGHT) robot.turnLeft();
            while (robot.getX() < toX) robot.stepForward();
        }

        //Negative numbers toY
        if (robot.getY() > toY){
            while (robot.getDirection() != Direction.DOWN) robot.turnRight();
            while (robot.getY() > toY) robot.stepForward();
        }

        //Negative numbers toX
        if (robot.getX() > toX){
            while (robot.getDirection() != Direction.LEFT) robot.turnRight();
            while (robot.getX() > toX) robot.stepForward();
        }
    }
}
