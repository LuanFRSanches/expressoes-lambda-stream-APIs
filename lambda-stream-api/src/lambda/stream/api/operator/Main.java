package lambda.stream.api.operator;


public class Main {
    public static void main(String[] args) {
        Operator op = (x, y) -> x * y;
        System.out.println(op.execute(5, 2));
    }

}
