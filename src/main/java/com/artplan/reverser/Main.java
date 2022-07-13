package com.artplan.reverser;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String resultPattern = "%s\n%d\n%d\n%d";
        long numberOfTests1 = 1000;
        long numberOfTests2 = 10000;
        long numberOfTests3 = 100000;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Input some text:");
        String text = sc.nextLine();
        sc.close();

        Reverser reverser = new Reverser(text);
        Tester tester = new Tester(reverser);

        String result = reverser.getReverse();
        long time1 = tester.startTest(numberOfTests1);
        long time2 = tester.startTest(numberOfTests2);
        long time3 = tester.startTest(numberOfTests3);

        System.out.printf(resultPattern, result, time1, time2, time3);

    }
}
