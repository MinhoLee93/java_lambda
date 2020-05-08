public class GreeterLambda {
    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        GreeterOOP greeter = new GreeterOOP();
        greeter.greet(() -> System.out.println("Hello World!"));
    }
}
