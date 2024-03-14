package guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        String name1 = scan.nextLine();
        System.out.print("Введите имя второго игрока: ");
        String name2 = scan.nextLine();
        // Создание игроков и игры
        Player p1 = new Player(name1);
        Player p2 = new Player(name2);
        GuessNumber game = new GuessNumber(p1, p2);
        boolean isContinueTheGame = true;

        do {
            game.startGame();
            isContinueTheGame = false;
            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                String answer = scan.nextLine();
                if (answer.equals("yes")) {
                    isContinueTheGame = true;
                    break;
                } else if (answer.equals("no")) {
                    break;
                } else {
                    continue;
                }
            } while (true);
        } while (isContinueTheGame);
        
        scan.close();
        System.out.println("End game");    
    }
        
        
}

