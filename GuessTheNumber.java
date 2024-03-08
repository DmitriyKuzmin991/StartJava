public class GuessTheNumber {
    public static void main(String[] args) {
        int randomNumber = (int)(Math.random() * 100 + 1);
        int startNumber = 50;
        int startRange = 1;
        int limitRange = 100;
        boolean win = false;
        while (!win) {
            if (startNumber == randomNumber) win = true;
            else {
                if (startNumber > randomNumber) {
                    System.out.printf("Число %d больше чем загадал компьютер%n",startNumber);
                    limitRange = startNumber; // 88 55/
                } else {
                    System.out.printf("Число %d меньше чем загадал компьютер%n",startNumber);
                    startRange = startNumber; // 12 66
                }
                startNumber = ((limitRange - startRange) / 2) + startRange;
            }
        }
        System.out.println("Вы победили это число " + startNumber);
    }
}
