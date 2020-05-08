public class GreeterOOP {
    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        GreeterOOP greeter = new GreeterOOP();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        greeter.greet(helloWorldGreeting);
    }
}

