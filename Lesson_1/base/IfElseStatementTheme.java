package Lesson_1.base;
class IfElseStatementTheme {
    public static void main(String[] args) {
        /*System.out.println("Task one: перевод псевдокода");
        boolean isItMale = false;
        int age = 18;
        double height = 1.9;
        if (!isItMale) {
            System.out.println("This is female");
        } else {
            System.out.println("This is male");
        }

        if (age > 18) {
            System.out.println("This is an adult");
        } else {
            System.out.println("This is not an adult");
        }

        if (height < 1.8) {
            System.out.println("This is a short man");
        } else {
            System.out.println("This is a tall man");
        }

        char firstNameLetter = "Dmitriy".charAt(0);
        if (firstNameLetter == 'M') {
            System.out.println("This name starts with the letter M");
        } else if (firstNameLetter == 'I') {
            System.out.println("This name starts with the letter I");
        } else {
            System.out.println("This name does not start from letters 'M' and 'I'");
        }
        System.out.println();

        System.out.println("Task two: сравнение чисел");
        int firstNumber = 55;
        int secondNumber = 66;
        if (firstNumber > secondNumber) {
            System.out.printf("The first number %d is greater than the second number %d",firstNumber, secondNumber);
        } else if (firstNumber == secondNumber){
            System.out.printf("The first number %d equals second numbers %d", firstNumber, secondNumber);
        } else {
            System.out.printf("The first number %d is less than the second number %d", firstNumber, secondNumber);
        }
        System.out.println();*/

        System.out.println("Task three: Проверка числа");
        int checkNumber = 556;
        if (checkNumber == 0) {
            System.out.println("This number is zero");
        } else if (checkNumber > 0) {
            System.out.printf("%d является положительным числом ", checkNumber);
            if (checkNumber % 2 == 0) {
                System.out.print("и чётным");
            } else {
                System.out.print("и не чётным");
            }
        } else {
            System.out.printf("%d является отрицательным числом ", checkNumber);
            if (checkNumber % 2 == 0) {
                System.out.print("и чётным");
            } else {
                System.out.print("и не чётным");
            }
        }
    }
}