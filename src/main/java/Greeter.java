public class Greeter {
    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args) {
        // instance
        Greeter greeter = new Greeter();

        // lambda
        greeter.greet(()->System.out.println("Hello World!"));

        // interface implementation
        greeter.greet(new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello World!");
            }
        });
    }
}
