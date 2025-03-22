package instruments.task3;


public class task3 {
    public static void main(String[] args) {
        robot robot = new robot(5,5, instruments.task3.robot.Direction.Up);
        System.out.println("X= " + robot.getX() + " Y= " + robot.getY());
        robot.turnLeft();
        System.out.println("X= " + robot.getX() + " Y= " + robot.getY());
        robot.stepForward();
        System.out.println("X= " + robot.getX() + " Y= " + robot.getY());
        robot.moveRobot(robot, 7,-4);
        System.out.println("X= " + robot.getX() + " Y= " + robot.getY());
    }
}
