package calculate.homework_week_9.calculate.writing;

import calculate.Calculator;

import java.util.Locale;
import java.util.Scanner;
/**   4. Write a “main” method into main class. It has scanner that takes user
        input. Also write the logic that it ask user to “Enter first Number:”,
        “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
        enter + symbol result like “Addition of 5 and 10 is: 15” and respective
        for other symbol.
     5. With the result it’s also print one more message “Would you like to do
        more calculation Please enter “Y” or “N” :” (Hint use while loop if user
        enter Y program asking the user to enter First Number, and if user enter
        N programme should terminate)
        */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;
        do{
            System.out.println("Please enter first number :");
            int a = scanner.nextInt();
            System.out.println("Please enter second number :");
            int b = scanner.nextInt();
            System.out.println("Please enter one of the symbol +,-,/,* :");
            char symbol = scanner.next().charAt(0);
            Calculator calculator = new Calculator();
            calculator.calculateResult(a,b,symbol);
            System.out.println("Would you like to do more calculation Please enter “Y” or “N” :");
            answer = scanner.next().toLowerCase(Locale.ROOT);
        }
        while (answer.startsWith("y"));
        scanner.close();
    }
}
