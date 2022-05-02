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
            int a = s.nextInt();
            oper = s.next().charAt(0);
            int b = s.nextInt();

            operator1(a, b);
            System.out.print(operator2(oper, a, b));

        } else if (s.hasNextLine()){

            String exp = s.nextLine();
            String[] operands = exp.split(" ");
            String r1 = operands[0];
            oper = operands[1].charAt(0);
            String r2 = operands[2];

            int num1 = rinn(r1);
            int num2 = rinn(r2);

            operator2(oper, num1, num2);
            System.out.println(resultRim(operator2(oper, num1, num2)));

        } else {
            System.out.println("enter a valid formula");
        }
    }
}

