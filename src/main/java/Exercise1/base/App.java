package Exercise1.base;

import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Asad merouani
 */
public class App {
    public static void main(String[] args) {
        App app = new App();

        String input = app.getInput();

        app.displayOutput(input);

    }

    private void displayOutput(String name) {

        String output = "Hello, " + name + ", nice to meet you!";
        System.out.println(output);
    }

    private String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        return name;
    }
}
