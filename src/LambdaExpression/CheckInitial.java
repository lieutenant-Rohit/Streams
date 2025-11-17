package LambdaExpression;

interface Check{
    boolean check(String str);
}
public class CheckInitial {
    public static void main(String[] args) {

        Check c = str -> str.charAt(0)=='A'|| str.charAt(0)=='a';
        System.out.println(c.check("java"));
    }
}
