package guess;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int randomNumber;
    private Scanner sc = new Scanner(System.in);
    
    public GuessNumber(Player p1, Player p2) {
        player1 = p1;
        player2 = p2;

    }
    
    public void startGame() {
        randomNumber = (int)(Math.random() * 100 + 1);
        System.out.println("Игра начинается. Компьютер загадал число от 1 до 100, победит тот кто первым его отгадает.");
        
        while (true) {
            System.out.print("Ход первого игрока, введите число: ");
            int answerPlayer1 = Integer.parseInt(sc.nextLine());
            if (checkWin(answerPlayer1, player1)) break;
            System.out.print("Ход второго игрока, введите число: ");
            int answerPlayer2 = Integer.parseInt(sc.nextLine());
            if (checkWin(answerPlayer2, player2)) break;
        }
    }
    
    private boolean checkWin(int playerAnswer, Player player) {
        if (playerAnswer == randomNumber) {
            System.out.println("Поздравляю " + player.name + " победил!");
            return true;  
        } else if (playerAnswer > randomNumber) {
            System.out.println("Число " + playerAnswer + " больше того, что загадал компьютер.");
        } else {
            System.out.println("Число " + playerAnswer + " меньше того, что загадал компьютер.");
        }
        return false;
    }
}


