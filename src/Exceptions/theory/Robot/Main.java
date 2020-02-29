package Exceptions.theory.Robot;

public class Main {
    public static void main(String[] args) {

    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        boolean isRun = false;
        for (int i = 0; i < 3; ) {
            try (RobotConnection con = robotConnectionManager.getConnection()) {
                con.moveRobotTo(toX, toY);
                isRun = true;
                i = 3; //if robot run, then set cont == 3 and exit from loop
            } catch (RobotConnectionException rce) {
                if (isRun) {
                    //if robot run, then set cont == 3 and exit from loop
                    i = 3;
                } else {
                    try {

                        i++;
                        if (i == 3) {
                            throw new RobotConnectionException("3", rce);
                            //   }
                        }
                    } catch (Throwable e) {
                        throw e;
                    }
                }
            }
        }
    }
}