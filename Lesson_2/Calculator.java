package Lesson_2;
public class Calculator {
    public int calculate(int firstNumber, int secondNumber, String simbol) throws IllegalArgumentException {
        switch (simbol) {
            case "+":
                return firstNumber + secondNumber;
            case "-":
                return firstNumber - secondNumber;
            case "*":
                return firstNumber * secondNumber;
            case "/":
                return firstNumber / secondNumber;
            case "^":
                int result = firstNumber;
                for (int i = 0; i < secondNumber; i++) {
                    result *= firstNumber;
                }
                return result;
            case "%":
                return firstNumber % secondNumber;
            default:
                System.out.println("Ошибка, данная операция не поддерживается.");
                throw new IllegalArgumentException();
                
        }
    }
    
}
 //System.out.printf("%d %s %d = %d",a,sign,b,rersult);
