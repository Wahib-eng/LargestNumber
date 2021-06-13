package bankapp;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Number> nums = new ArrayList<>();
         nums.add(45);
         nums.add(3445.53);
        // اضافة رقم كبير add big intgeger
         nums.add(new BigInteger("3432323234344343101"));
         // اضافة رقم عشري add dicmal number
         nums.add(new BigDecimal("2.0909090989091343433344343"));

        System.out.println("The largest number is " +
                 getLargestNumber( nums ));
        }

         public static Number getLargestNumber(ArrayList<Number> list) {
        if (list == null || list.size() == 0)
             return null;

         Number number = list.get(0);
         for (int i = 1; i < list.size(); i++)
             if (number.doubleValue() < list.get(i).doubleValue())
             number = list.get(i);

         return number;
         }
}