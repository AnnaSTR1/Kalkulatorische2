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

        if (s.hasNextInt()) {

            String expo = s.nextLine();
            String[] operand = expo.split(" ");
            String ar = operand[0];
            oper = operand[1].charAt(0);
            String br = operand[2];

            int a = Integer.parseInt(ar);
            int b = Integer.parseInt(br);

            if (operand.length != 3) {
                throw new ArrayIndexOutOfBoundsException("enter exactly 2 numbers");
            }

            operator1(a, b);
            System.out.print(operator2(oper, a, b));

        } else if (s.hasNextLine()) {

            String exp = s.nextLine();
            String[] operands = exp.split(" ");
            String r1 = operands[0];
            oper = operands[1].charAt(0);
            String r2 = operands[2];

            int num1 = rinn(r1);
            int num2 = rinn(r2);

            if (operands.length != 3) {
                throw new ArrayIndexOutOfBoundsException("enter exactly 2 numbers");
            }

            if (operator2(oper, num1, num2) < 1) {
                throw new ArithmeticException("result < I");
            } else {
                System.out.println(resultRim(operator2(oper, num1, num2)));
            }

        } else
            System.out.println("enter a valid formula");
    }
}

