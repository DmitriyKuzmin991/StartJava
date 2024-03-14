package Lesson_1.base;
public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("Task one: подсчёт суммы четных и нечетных чисел");
        int startRange = -10;
        int finishRange = 21;
        int sumOfEvenNumber = 0;
        int sumOfNotEvenNumber = 0;
        
        do {
            if (startRange % 2 == 0) {
                sumOfEvenNumber += startRange;
            } else {
                sumOfNotEvenNumber += startRange;
            }
            startRange++;
        } while(startRange <= finishRange);
        System.out.printf("In range [-10, 21] sum of even value = %d, and sum of not even value = %d%n",
        sumOfEvenNumber, sumOfNotEvenNumber);
        System.out.println();

        System.out.println("Task two: вывод чисел в порядке убывания");
        int firstValueTaskTwo = 10;
        int secondValueTaskTwo = 5;
        int thirdValueTaskTwo = -1;
        int maxValue = firstValueTaskTwo;
        int minValue = secondValueTaskTwo;
        if (secondValueTaskTwo > firstValueTaskTwo) {
            maxValue = secondValueTaskTwo;
            minValue = firstValueTaskTwo;
        }
        if (thirdValueTaskTwo > maxValue) maxValue = thirdValueTaskTwo; 
        else if (thirdValueTaskTwo < minValue) minValue = thirdValueTaskTwo;
        
        for (int i = maxValue; i >= minValue; i--) {
            System.out.print( i + " ");
        }
        System.out.println();
        
        System.out.println("Task three: вывод реверсивного числа и суммы его цифр");
        int taskThreeNumber = 1234;
        int sumOfNumbers = 0;
        System.out.print("Исходное число в обратном порядке: ");
        while (taskThreeNumber > 0) {
            int temp = taskThreeNumber % 10;
            System.out.print(temp);
            sumOfNumbers += temp;
            taskThreeNumber /= 10;  
        }
        System.out.println();
        System.out.println("Сумма цифр исходного числа = " + sumOfNumbers);
        System.out.println();
        
        System.out.println("Task four: вывод числа в несколько строк");
        int sizeRow = 5;
        int startIndex = 1;
        int limitIndex = 24;
        for (int i = startIndex; i < limitIndex; ) {
            for (int j = 0; j < sizeRow; j++) {
                if (i  <  limitIndex) System.out.printf("%3d", i);
                else System.out.printf("%3d", 0);
                i += 2;
            }
            System.out.println();
        }
         System.out.println();
         
        System.out.println( "Task five: проверка количества двоек числа на чётность/нечетность");
        int taskFiveValue = 3242592;
        int countOfDigitsTwo = 0;
        int temp = taskFiveValue;
        while (temp > 0) {
            if (temp%10 == 2) {
                countOfDigitsTwo++;
            }
            temp /= 10;
        }
        System.out.print("In the number " + taskFiveValue + " there is ");
        if (countOfDigitsTwo %2 == 0) System.out.print("an even "); 
        else System.out.print("not an even ");
        System.out.println("number of twos - " + countOfDigitsTwo);
        System.out.println();

        System.out.println("Task six: отображение геометрических фигур");
        int lenghtRow = 5;
        int columnHeight = 5;
        char drowSign = '*';
        for (int i = 0; i < columnHeight; i++) {
            for (int j = 0; j < lenghtRow; j++) {
                System.out.print(drowSign);
            }
            System.out.println();
        }
        System.out.println();

        int repeat = lenghtRow;
        while (repeat >  0) {
            int counterSign = repeat;
            while (counterSign > 0) {
                System.out.print("#");
                counterSign--;
            }
            System.out.println();
            repeat--;
        }
        System.out.println();
        int taskFiveNumberOfRepeat = 3;
        int startIndexTaskFive = 1;
        boolean reverse = false;
        do {
            drowFigure(startIndexTaskFive, '$');
            System.out.println();
            if (startIndexTaskFive == taskFiveNumberOfRepeat) reverse = true;
            if (reverse) startIndexTaskFive--;
            else startIndexTaskFive++;
        } while (startIndexTaskFive >= 1);
        System.out.println();

        System.out.println("Task seven: отображение ASCII символов");
        System.out.printf("%7s%12s%14s%n","DECIMAL", "CHARACTER", "DESCRIPTION");
        for (int i = 33; i < 46; i+= 2) {
            System.out.printf("  %-12d%-8s%s%n", i, (char)i, Character.getName(i));
        }
        for (int i = 98; i <= 122; i+= 2) {
            System.out.printf("  %-12d%-8s%s%n", i, (char)i, Character.getName(i));
        }
        System.out.println();

        System.out.println("Task eight: паллиндром");
        int pallindromNumber = 123321;
        int lastDigit,sumTaskEight = 0,tempTaskEight = pallindromNumber;
        while (tempTaskEight > 0) {
            lastDigit = tempTaskEight % 10;
            sumTaskEight = sumTaskEight * 10 + lastDigit;
            tempTaskEight = tempTaskEight / 10; 
        }
        System.out.print("Число " + pallindromNumber);
        if (sumTaskEight == pallindromNumber) System.out.print(" является");
        else System.out.print(" не является");
        System.out.println(" паллиндромом");
        System.out.println();
        
        System.out.println("Task nine: счастливое число");
        int luckyNumber = 819111;
        int lastDigitTaskNine, sumTaskNineFirstHalf = 0, tempTaskNine = luckyNumber, sumTaskNineSecondHalf = 0;
        int firstHalfNumber = 0, secondHalfNumber = 0;
        for (int i = 0; i < 6; i++) {
            lastDigitTaskNine = tempTaskNine % 10;
            if (i < 3) {
                sumTaskNineSecondHalf += lastDigitTaskNine;
                secondHalfNumber = (secondHalfNumber * 10) + lastDigitTaskNine;       
            } else {
                sumTaskNineFirstHalf += lastDigitTaskNine; 
                firstHalfNumber = (firstHalfNumber * 10) + lastDigitTaskNine;   
            }
            tempTaskNine /= 10;
        }
        String result = sumTaskNineFirstHalf == sumTaskNineSecondHalf ? " является " : " не является ";
        System.out.println("Число " + luckyNumber + result + "счастливым");
        System.out.printf("Сумма цифр %d = %d, а сумма %d = %d%n",
        firstHalfNumber, // цифры первой половины числа
        sumTaskNineFirstHalf, // сумма цифр первой половины числа
        secondHalfNumber, // цифры второй половины числа
        sumTaskNineSecondHalf); // сумма второй половины числа
        System.out.println();

        System.out.println("Task ten: таблица умножения Пифагора");
        System.out.printf("  |%3d%3d%3d%3d%3d%3d%3d%3d%n",2,3,4,5,6,7,8,9);
        System.out.println("--+-----------------------");
        for (int i = 2; i < 10; i++) {
            System.out.print(i + " |");
            for (int j = 2; j < 10; j++) {
                System.out.printf("%3d",i * j);
            }
            System.out.println();
        }
    }

    static void drowFigure(int count, char figure){
        while (count > 0) {
            System.out.print(figure);
            count--;
        }
    }
}
