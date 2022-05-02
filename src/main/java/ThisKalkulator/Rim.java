package ThisKalkulator;

import java.util.HashMap;
import java.util.Map;

public class Rim {

    public static Integer rinn(String  r2){
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

       return rinn.get(r2);

    }

    public static String resultRim(int number) {
        int[] massArab = new int[]{100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] massRim = new String[]{"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < massArab.length; i += 1) {
            while (number >= massArab[i]) {
                number -= massArab[i];
                res.append(massRim[i]);
            }
        }
        return res.toString();

    }










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
