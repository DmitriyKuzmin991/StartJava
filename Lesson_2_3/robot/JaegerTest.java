package robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger HorizonBrave = new Jaeger();
        HorizonBrave.setModelName("HorizonBrave");
        HorizonBrave.setOrigin("China");
        HorizonBrave.setMark("Mark-1");
        HorizonBrave.setArmor(6);
        HorizonBrave.setHeight(72.54f);
        HorizonBrave.setWeight(7.890f);
        HorizonBrave.setStrenght(8);

        Jaeger jaegar2 = new Jaeger("Romeo Blue","Mark-1","United States of America",
         77.72f, 7.775f, 7, 6); 

         HorizonBrave.drift();
         jaegar2.drift();
         HorizonBrave.move();
         jaegar2.move();
    }
}
