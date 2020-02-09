package Exceptions.theory.Robot;

public class Main {
    public static void main(String[] args) {

    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        // your implementation here
        int count = 0;
        boolean isRun = false;
        while (count < 3){
            try (RobotConnection con = robotConnectionManager.getConnection()){
                con.moveRobotTo(toX, toY);
                isRun = true;
                count = 3; //if robot run, then set cont == 3 and exit from loop
            } catch (RobotConnectionException rce) {
                if (isRun) {
                    //if robot run, then set cont == 3 and exit from loop
                    count = 3;
                }
                else {
                    count++;
                    if (count == 3) {
                        throw new RobotConnectionException("3", rce);
                    }
                }
            } catch (Throwable e) {
                throw e;
            }
        }
    }
}
