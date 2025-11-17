package LambdaExpression;

@FunctionalInterface
interface EvenChecker {
    boolean check(int n);
}

public class EvenCheck {
    public static void main(String[] args) {

        // Lambda expression without Predicate
        EvenChecker isEven = n -> n % 2 == 0;

        // Testing
        System.out.println(isEven.check(10)); // true
        System.out.println(isEven.check(5));  // false
    }
}