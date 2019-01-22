package OOTechnieken.Week3.SiteOpdrachten.Musician;

public class Musician {
    public void play() {
         class Instrument implements InstrumentAnon{
            public void makeSound() {
            }
        }
        Instrument instrument = new Instrument();
        instrument.makeSound();
    }

}
