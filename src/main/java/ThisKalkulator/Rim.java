package ThisKalkulator;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.Key;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;

public class Rim {

   //  public static int strToSting(String r1) {
    //    try {
     //       if (r1.equals("I")) {
     //           return 1;
      //      } else if (r1.equals("II")) {
     //           return 2;
      //      } else if (r1.equals("III")) {
      //          return 3;
      //      } else if (r1.equals("IV")) {
      //          return 4;
      //      } else if (r1.equals("V")) {
      //          return 5;
      //      } else if (r1.equals("VI")) {
      //          return 6;
      //      } else if (r1.equals("VII")) {
      //          return 7;
       //     } else if (r1.equals("VIII")) {
       //         return 8;
       //     } else if (r1.equals("IX")) {
        //        return 9;
       //     } else if (r1.equals("X")) {
       //         return 10;
      //      }
    //    }catch(InputMismatchException e){
   //         throw new InputMismatchException("enter a valid number");
   //     }
   //     return 0;
 //   }



    public static void rin(String r1) {
        Map<String, Integer> rin = new HashMap<String, Integer>();
        rin.put("I", 1);
        rin.put("II", 2);
        rin.put("III", 3);
        rin.put("IV", 4);
        rin.put("V", 5);
        rin.put("VI", 6);
        rin.put("VII", 7);
        rin.put("VIII", 8);
        rin.put("IX", 9);
        rin.put("X", 10);

       System.out.println(rin.get(r1));




    }

    public static void rinn(String r2){
        Map<String, Integer> rinn = new HashMap<String, Integer>();
        rinn.put("I", 1);
        rinn.put("II", 2);
        rinn.put("III", 3);
        rinn.put("IV", 4);
        rinn.put("V", 5);
        rinn.put("VI", 6);
        rinn.put("VII", 7);
        rinn.put("VIII", 8);
        rinn.put("IX", 9);
        rinn.put("X", 10);

      // System.out.println(rinn.get(r2));

    }




    // Map.Entry<String, Integer> item: rin.entrySet()
    //      String key = item.getKey();
    //       r1.equals(key);
    //      System.out.println(r1);



    // public static void rrr() {
   // Map<String, Integer> rnum = new HashMap<String, Integer>();

    //    rnum.put("I", 1);
     //   rnum.put("V", 5);
    //    rnum.put("X", 10);
    //    rnum.put("L", 50);
    //    rnum.put("C", 100);





    //  public int toInt() {
    //    return Integer.parseInt(toString());

}
