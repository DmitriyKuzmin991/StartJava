package Lesson_2;

public class Wolf {
    
    private String sex;
    private String nickName;
    private int weight;
    private int age;
    private String colorSkin;

    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getSex() {
        return sex;
    }
    public void setColorSkin(String color) {
        this.colorSkin = color;
    }
    public String getColorSkin() {
        return colorSkin;
    }
    public void setNickname(String nickName) {
        this.nickName = nickName;
    }
    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }
    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Ошибка, слишком большой возраст.");
        } else {
            this.age = age;
        }
    }
    public String getNickName() {
        return nickName;
    }
    public int getAge() {
        return age;
    }
    public int getWeight() {
        return weight;
    }
    public void walk() {System.out.println("Волк пошёл");}
    public void sitdown() {System.out.println("Волк сел");}
    public void run() {System.out.println("Волк побежал");}
    public void hunt() {System.out.println("Волк охотиться");}
    public void howl() {System.out.println("Волк воет");}
}
