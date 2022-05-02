package ThisKalkulator;

public class Arab{

    public static void operator1(int a, int b){
        if (0 < a) {
        } else {
            System.out.print("enter a valid number");
            return;
        }
        if (10 >= a) {
        } else {
            System.out.print("enter a valid number");
            return;
        }
        if (0 < b) {
        } else {
            System.out.print("enter a valid number");
            return;
        }
        if (10 >= b) {
        } else {
            System.out.print("enter a valid number");
            return;
        }
    }
    public static int operator2(char oper, int a, int b){
        switch (oper) {
            case '+' -> {
                return a + b;
                            }
            case '-' -> {
                return a- b;
                            }
            case '*' -> {
                return a * b;
                            }
            case '/' -> {
                return a / b;
                           }
            default ->
                    throw new IllegalArgumentException();

        }
    }
}
