package instruments.task_1;

public class Main {

    public static void main(String[] args) {
        Example Console = new Example();
        Example Console3 = new Example(3);
        Example Console1 = new Example("Xbox", 1);
        Example Console2 = new Example("Playstation", 2);
        Console.say();
        Console1.say();
        Console2.say();
        Console3.say();
    }
}
