package OOTechnieken.Week5.BoekOpdrachten.OpdrachtVijf;

public class SimpleObject implements Comparable{

    int getal;

    public SimpleObject (int getal){
        this.getal = getal;
    }


    @Override
    public int hashCode(){
        return getal;
    }

    @Override
    public int compareTo(Object o) {
        if (this.hashCode()>o.hashCode()){return 1;}
        if (this.hashCode()<o.hashCode()){return -1;}
        else return 0;
    }

    @Override
    public String toString(){
        return String.format("%d",getal);
    }
}
