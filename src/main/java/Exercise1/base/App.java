package Exercise1.base;

import java.util.Scanner;

/*
Exercise 1 - Saying Hello
Create a program that prompts for your name and prints a greeting using your name.

Example Output
What is your name? Brian
Hello, Brian, nice to meet you!
Constraint
Keep the input, string concatenation, and output separate.
Challenges
Write a new version of the program without using any variables.
Write a version of the program that displays different greetings for different people.
Write a version of the program that displays the greeting in a GUI window.\\\\\
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
