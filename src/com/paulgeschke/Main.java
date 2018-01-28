package com.paulgeschke;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int temperature;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Temperature: ");
        temperature = scanner.nextInt();

        if (temperature < 97.5) {
            System.out.println("Temperature is Low");
        }
        else if (temperature < 99.5) {
            System.out.println("Temperature is Normal");
        }
        else {
            System.out.println("Temperature is High");
        }
    }
}
