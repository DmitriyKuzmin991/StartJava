package Lesson_2;

public class WolfTest {
    public static void main(String[] args) {
        Wolf w = new Wolf();
        w.setAge(5);
        w.setAge(9);
        w.setNickname("Bobick");
        w.walk();
        w.run();
        w.hunt();
        w.sitdown();
        System.out.println(w.getNickName());

    }
}
