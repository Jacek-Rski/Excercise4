package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<String> city = new ArrayList<>();
        List<Integer> temps = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop;
        continueLoop = true;

        while (continueLoop) {
            System.out.println("Type in cities and type END when finished");
            String newCity = scanner.nextLine();
            city.add(newCity);


            if (newCity.equals("END")) {
                //System.out.println("Please enter the temperature for the next 5 days for ", );
            }


        }

    }
}