package guess;

public class Player {
    String name;

    Player(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
