package instruments.task_2;

public class task2 {

    public static void main(String[] args) {
        Person person = new Person("Tom", 50);
        String speech = "Hello";
        String destination = "home";
        person.talk(speech);
        person.move(destination);
    }
}

