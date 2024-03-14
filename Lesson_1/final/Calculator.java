package Lesson_1;
public class Calculator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        char[] arraySign = {'+','-','/','*','^','%'};
        int random = (int)(Math.random() * 6);
        char sign = arraySign[random];
        int rersult = 0;
        if (sign ==  '+') rersult = a + b;
        else if (sign ==  '-') rersult = a - b;
        else if (sign ==  '/') rersult = a / b;
        else if (sign ==  '*') rersult = a * b;
        else if (sign ==  '%') rersult = a % b;
        else  {
            rersult = a;
            for (int i = 0; i < b; i++) {
                rersult *= a ;
            }
        }
        System.out.printf("%d %s %d = %d",a,sign,b,rersult);
    }
}
