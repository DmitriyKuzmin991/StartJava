package Lesson_2;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.print("Введите первое число: ");
            int firstNumber = scan.nextInt();
            System.out.println();

            System.out.print("Введите знак математической операции: ");
            String simbol = scan.next();
            System.out.println();

            System.out.print("Введите второе число: ");
            int secondNumber = scan.nextInt();
            System.out.println();
            // вычитсления
            int result = calc.calculate(firstNumber, secondNumber, simbol);
            System.out.printf("Выражение %d%s%d = %d",firstNumber,simbol,secondNumber,result);
            System.out.println();
                while (true) {
                    System.out.println("Хотите продолжить вычисление? [yes/no] ");
                    String answer = scan.next();
                    if (answer.equals("yes")) break;
                    else if (answer.equals("no")) {
                        flag = false;
                        break;
                    }
                }
        }
        scan.close();
    }
}
