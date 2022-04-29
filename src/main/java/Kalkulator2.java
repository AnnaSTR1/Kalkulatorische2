import ThisKalkulator.*;
import java.util.Scanner;

import static ThisKalkulator.Arab.operator1;
import static ThisKalkulator.Arab.operator2;

import static ThisKalkulator.Rim.rinn;


public class Kalkulator2 {
    public static void main(String[] args) {

        char oper;


        Scanner s = new Scanner(System.in);
        System.out.println("Enter formula");


        oper = s.next().charAt(0);


        if(s.hasNextInt()) {
            int a = s.nextInt();
            int b = s.nextInt();

            operator1(a, b);
            operator2(oper, a, b);

        } else if (s.hasNextLine()){

            String r1 = s.nextLine();
            String r2 = s.nextLine();
            System.out.print(r1);
            System.out.print(r2);
          //  rinn(r1);
          //  rinn(r2);



        } else {
            System.out.println("enter a valid formula");
        }



        // String[] str = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};


    }

}

