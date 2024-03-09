package Lesson_2;

public class WolfTest {
    public static void main(String[] args) {
        Wolf w = new Wolf();
        w.nickName = "Seeker";
        w.age = 5;
        w.colorSkin = "black";
        w.sex = "male";
        w.weight = 35;
        System.out.printf("The %s wolf is %d years old and has %s skin%n", w.nickName, w.age, w.colorSkin);
        w.walk();
        w.run();
        w.hunt();
        w.sitdown();

    }
}
