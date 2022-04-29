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
    public static void operator2(char oper, int a, int b){
        int c;
        switch (oper) {
            case '+' -> {
                c = a + b;
                System.out.print("ans " + c);
            }
            case '-' -> {
                c = a- b;
                System.out.print("ans " + c);
            }
            case '*' -> {
                c = a * b;
                System.out.print("ans " + c);
            }
            case '/' -> {
                c = a / b;
                System.out.print("ans " + c);
            }
            default -> {
                System.out.print("Error! Enter correct operator");
            }
        }
    }
}
