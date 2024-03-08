public class VariableTheme {
    public static void main(String[] args) {
        System.out.println("First quest");
        byte b = 4; // Count of core
        short sh = 256; // Total hardDisk space GB
        int a = 4096; // DRM GB
        long l = 3200L; // Мигагерц процессор
        double d = 5.55; // Speed of SDD
        float fl = 3.14F; // PI const
        char ch = 'a';
        boolean bool  = true; // My computer is cool?
        System.out.println(
            String.format("Мой компъютер имеет %d ядра,\n" +
             "%d гигабайт памяти на жёстком диске,\n" +
             "%d мегабайт оперативной памяти\n" +
             "%d мегагерц процессор, \n" +
             "и еслы вы меня спросите крутой ли мой комп то я отвечу %s!\n"
             ,b ,sh ,a,l ,bool )
            );
            
        System.out.println("Second quest: расчёт стоимости товара");
        int penCoast = 100;
        int bookCoast = 200;
        int discount = 11;
        double discountAmount = (penCoast + bookCoast) * (discount * 0.01 );
        System.out.println("Total price of goods without discount = " + (penCoast + bookCoast));
        System.out.println("discount amount = " + discountAmount);
        System.out.println("Total price of goods with discount = " + (int)(penCoast + bookCoast - discountAmount));
        System.out.println();

        System.out.println("Quest three: вывод слова Java");
        System.out.println("   J    a  v     v  a    ");
        System.out.println("   J   a a  v   v  a a   ");
        System.out.println("J  J  aaaaa  V V  aaaaa  ");
        System.out.println(" JJ  a     a  V  a     a ");
        System.out.println();

        System.out.println("Quest four: min and max value");
        byte fourQuestByte = Byte.MAX_VALUE;
        short fourQuestShort = Short.MAX_VALUE;
        int fourQuestInt = Integer.MAX_VALUE;
        long fourQuestLong = Long.MAX_VALUE;
        System.out.println("Начальное значение byte = " + fourQuestByte);
        System.out.println("Значение byte после инкремента = " + ++fourQuestByte );
        System.out.println("Значение byte после декремента = " + --fourQuestByte);
        System.out.println("Начальное значение short = " + fourQuestShort);
        System.out.println("Значение short после инкремента = " + ++fourQuestShort );
        System.out.println("Значение short после декремента = " + --fourQuestShort);
        System.out.println("Начальное значение int = " + fourQuestInt);
        System.out.println("Значение int после инкремента = " + ++fourQuestInt );
        System.out.println("Значение int после декремента = " + --fourQuestInt);
        System.out.println("Начальное значение long = " + fourQuestLong);
        System.out.println("Значение long после инкремента = " + ++fourQuestLong );
        System.out.println("Значение long после декремента = " + --fourQuestLong);
        System.out.println();

        System.out.println("Quest five: переставление переменных");
        int firstVariable = 2;
        int secondVariable = 5;
        int thirdVariable = 0;
        System.out.println("-----Замена значений двухпеременных с помощью третьей переменной");
        System.out.println("начальное значение первой переменной = " + firstVariable);
        System.out.println("начальное значение второй переменной = " + secondVariable);
        System.out.println("начальное значение третьей переменной = " + thirdVariable);
        System.out.println("---------->Выполняется перестановка");
        thirdVariable = firstVariable;
        firstVariable = secondVariable;
        secondVariable = thirdVariable;
        System.out.println("финальное значение первой переменной = " + firstVariable);
        System.out.println("финальное значение второй переменной = " + secondVariable);
        System.out.println("финальное значение третьей переменной = " + thirdVariable);
        System.out.println("------Замена значений двухпеременных с помощью арифметических операций");
        System.out.println("начальное значение первой переменной = " + firstVariable);
        System.out.println("начальное значение второй переменной = " + secondVariable);
        System.out.println("начальное значение третьей переменной = " + thirdVariable);
        System.out.println("---------->Выполняется перестановка");
        secondVariable = firstVariable - secondVariable + thirdVariable;
        firstVariable = secondVariable - (firstVariable - thirdVariable);
        System.out.println("финальное значение первой переменной = " + firstVariable);
        System.out.println("финальное значение второй переменной = " + secondVariable);
        System.out.println("финальное значение третьей переменной = " + thirdVariable);
        System.out.println("-------Замена значений двукх пересенных с помощью побитового сдвига");
        System.out.println("начальное значение первой переменной = " + firstVariable);
        System.out.println("начальное значение второй переменной = " + secondVariable);
        System.out.println("---------->Выполняется перестановка");
        firstVariable = firstVariable << 1 | secondVariable;
        secondVariable = secondVariable >> 1;
        System.out.println("финальное значение первой переменной = " + firstVariable);
        System.out.println("финальное значение второй переменной = " + secondVariable);
        System.out.println();

        System.out.println("Quest six: кодировка char");
        char chOne = '$';
        char chTwo = '*';
        char chThree = '@';
        char chFour = '|';
        char chFive = '~';
        System.out.println("Символу " + chOne + " соответствует код " + (int)chOne);
        System.out.println("Символу " + chTwo + " соответствует код " + (int)chTwo);
        System.out.println("Символу " + chThree + " соответствует код " + (int)chThree);
        System.out.println("Символу " + chFour + " соответствует код " + (int)chFour);
        System.out.println("Символу " + chFive + " соответствует код " + (int)chFive);
        System.out.println();

        System.out.println("Quest seven: ascii art");
        char simbolOne = '/';
        char simbolTwo = '\\';
        char simbolThree = '(';
        char simbolFour = ')';
        char simbolFive = '_';
        System.out.printf("    %1$    ");
        System.out.println("    " + simbolOne + simbolTwo + "    ");
        System.out.println("   " + simbolOne +"  "+ simbolTwo + "   ");
        System.out.println("  " + simbolOne + simbolFive + simbolThree + " " + simbolFour + simbolTwo + "  ");
        System.out.println(" " + simbolOne +"      "+ simbolTwo + " ");
        System.out.println("" + simbolOne + simbolFive+ simbolFive+ simbolFive+ simbolFive + simbolOne +
         simbolTwo + simbolFive +simbolFive +  simbolTwo);
        System.out.println();

        System.out.println("Quest eight: вывод количества сотен, десятков и единиц числа");
        int questEightNumber = 123;
        System.out.println("Число " + questEightNumber +" содержит:\n" +
        "  сотен - " + questEightNumber/100  +
        "\n  десятков - " + questEightNumber /10 % 10 + 
        "\n  едениц - " + questEightNumber % 100 % 10 + 
        "\nСумма его цифр = " + (questEightNumber/100 + questEightNumber /10 % 10 + questEightNumber % 100 % 10) + 
        "\nПроизведение = " + ((questEightNumber/100) * (questEightNumber /10 % 10) * (questEightNumber % 100 % 10)));
        System.out.println();
        
        System.out.println("Quest six: вывод времени");
        int amountSecond = 86399;
        int hours = amountSecond / 60 / 60;
        int minutes = amountSecond / 60 % 60;
        int seconds = amountSecond % 60;
        System.out.printf("Имеется %d секунд, это - %d часа, %d минут, %d секунд.\n",
         amountSecond, hours, minutes, seconds);
        System.out.printf("%d:%d:%d", hours, minutes, seconds);
        
        



    
    

        
    }
}
