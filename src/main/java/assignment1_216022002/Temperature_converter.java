package assignment1_216022002;

import java.util.Scanner;

public class Temperature_converter {

    public static void main(String[] args) {

        System.out.println("Welcome! This program takes in temperature as input,\n" +
                           "which can then be converted from celcius to farenheit and vice versa..");

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter \"F\" if we\'re converting from farenheit. \n" +
                            "Please enter \"C\" if we\'re converting from celsius");

        String tempType = scan.nextLine();

        System.out.println("Please enter the temperature");
        double temp_value = scan.nextDouble();

        if(tempType.equals("F"))
        {
            double result = (temp_value - 32) / 1.8;
            System.out.println("When converting " + temp_value + " from Fahrenheit to celcius, \n" +
                                "the result is " + result + " degrees Celcius");

        }
        else if (tempType.equals("C")){
            double result = temp_value * 1.8 + 32;
            System.out.println("When converting " + temp_value + " from Celcius to Fahrenheit, \n" +
                    "the result is " + result + " degrees Farenheit");

        }
        else
            {
                System.out.println("Not a valid key :( next time make sure its either F or C ");

            }


    }


}
