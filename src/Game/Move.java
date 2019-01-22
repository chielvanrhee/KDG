package Game;

public enum Move {
    None(0,Element.NORMAL,0),
    //Water moves
    Hydropump(100,Element.WATER,5),
    //normal moves
    Tackle(20,Element.NORMAL,20),
    //fire moves
    Flamethrower(50,Element.FIRE,10),
    Ember(20,Element.FIRE,20),
    Firepunch(35,Element.FIRE,20);



    private int damage;
    private Element element;
    private int pp;

    Move(int damage, Element element,int pp){
    this.damage = damage;
    this.element = element;
    this.pp = pp;
    }
}
