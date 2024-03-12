package Lesson_2;

public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int strenght;
    private int armor;

    Jaeger(){}
    Jaeger(String modelName, String mark, String origin,float height,float weight,int strenght,int armor){
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.strenght = strenght;
        this.armor = armor;
    }

    void setModelName(String name) {
        modelName = name;
    }

    String getModelName() {
        return modelName;
    }

    void setMark(String mark) {
        this.mark = mark;
    }

    String getMark() {
        return mark;
    }

    void setOrigin(String origin) {
        this.origin = origin;
    }

    String getOrigin() {
        return origin;
    }

    void setHeight(float height) {
        this.height = height;
    }
    float getHeight() {
        return height;
    }

    void setWeight(float weight) {
        this.weight = weight;
    }

    float getWeight() {
        return weight;
    }

    void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    int getStrenght() {
        return strenght;
    }

    void setArmor(int armor) {
        this.armor = armor;
    }

    int getArmour() {
        return armor;
    }

    boolean drift() {
        return true;
    }

    void move() {
        System.out.println(modelName + " moving");
    }

    String scanKaiju() {
        return modelName + " scanning";
    }

    void useVortexCannon() {
        System.out.println(modelName + " activated");
    }
}
