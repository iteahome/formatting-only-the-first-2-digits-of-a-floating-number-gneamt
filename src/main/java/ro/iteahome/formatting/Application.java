package ro.iteahome.formatting;

import java.util.Scanner;

public class Application {

    public static void main(String args[]){

        //Using String.format() method, please display in the console
        //the first 2 digits of a floating number (float or double: e.g. 1.93211 -> display only 1.93)

        double a = 1.93211;
        float b = 2.356f;
        double c = 0.0111111;
        float d = 11111.00f;
        double scanned;

        format(a);
        format(b);
        format(c);
        format(d);
    }

    private static void format(double d)
    {
            String formatted = String.format("%.02f", d);
            System.out.println("formatted " + d + " into " + formatted);
    }
}
