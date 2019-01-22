package Game;


public class Pokemon {
    private int health;
    private int XP;
    private int range;
    private int speed;
    private State state = State.None;
    private Move moveOne = Move.None;
    private Element typeOne;
    private Element typeTwo;

    public Pokemon(){
        new Pokemon(100,1,1,1,State.None);
    }

    public Pokemon(int health, int XP, int range, int speed, State state){
        this.health = health;
        this.XP = XP;
        this.range = range;
        this.speed = speed;
        this.state = state;

    }
}
