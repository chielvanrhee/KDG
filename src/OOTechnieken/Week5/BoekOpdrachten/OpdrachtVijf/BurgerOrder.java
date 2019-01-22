package OOTechnieken.Week5.BoekOpdrachten.OpdrachtVijf;

public class BurgerOrder implements Comparable {

    // vars
    private String name;
    private int number;

    //constructors
    public BurgerOrder(String name, int number) {
        this.name = name;
        this.number = number;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    //functions


    @Override
    public String toString() {
        return String.format("Naam is: %s, nummer is %d",getName(),getNumber());
    }

    @Override
    public boolean equals(Object obj) {
        return (this == obj);
    }

    @Override
    public int hashCode(){
        return (number);
    }

    @Override
    public int compareTo(Object o) {
        if (this.hashCode() > o.hashCode()) return 1;
        if (this.hashCode() < o.hashCode()) return -1;
        else  return 0;
    }
}
