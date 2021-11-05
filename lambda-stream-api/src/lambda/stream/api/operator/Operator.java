package lambda.stream.api.operator;
@FunctionalInterface
public interface Operator {

    int execute(int x, int y);

    default void m() {
        System.out.println("I am the operator!");
    }
}
