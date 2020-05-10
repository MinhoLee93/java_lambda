import java.util.function.Consumer;

public class ThisReferenceExample {
    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
        thisReferenceExample.execute();
    }

    private void execute(){
        doProcess(10, i -> System.out.println(this));
    }

    private void doProcess(int i, Consumer<Integer> consumer) {
        consumer.accept(i);
    }

    @Override
    public String toString() {
        return "This is ThisReferenceExample class";
    }
}
