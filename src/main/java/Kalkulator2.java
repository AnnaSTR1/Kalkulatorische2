import ThisKalkulator.*;
import java.util.Scanner;

import static ThisKalkulator.Arab.operator1;
import static ThisKalkulator.Arab.operator2;

import static ThisKalkulator.Rim.resultRim;
import static ThisKalkulator.Rim.rinn;

public class Kalkulator2 {
    public static void main(String[] args) {

        char oper;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter formula");

        if(s.hasNextInt()) {

            try {
                throw new IndexOutOfBoundsException();
            }catch (IndexOutOfBoundsException pa) {
                System.out.print("enter only two numbers");
            }
            System.exit(1);
            int a = s.nextInt();
            oper = s.next().charAt(0);
            int b = s.nextInt();

            operator1(a, b);
            System.out.print(operator2(oper, a, b));

        } else if (s.hasNextLine()){
            try {
                throw new ArrayIndexOutOfBoundsException();
            }catch (ArrayIndexOutOfBoundsException pa) {
                System.out.print("enter only two numbers");
            }
            System.exit (1);

            String exp = s.nextLine();
            String[] operands = exp.split(" ");
            String r1 = operands[0];
            oper = operands[1].charAt(0);
            String r2 = operands[2];

            int num1 = rinn(r1);
            int num2 = rinn(r2);

            operator2(oper, num1, num2);

            if (num1 - num2 < 1) {
                try {
                    throw new  ArithmeticException();
                }catch (ArithmeticException jo) {
                    System.out.print("result < I");
                }
            } else if (num1 / num2 < 1) {
                try {
                    throw new  ArithmeticException();
                }catch (ArithmeticException jo) {
                    System.out.print("result < I");
                }
            }
                else {
                System.out.println(resultRim(operator2(oper, num1, num2)));
            }

        } else {
            System.out.println("enter a valid formula");
        }
    }
}

