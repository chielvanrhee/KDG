package Week5.be.kdg.klassen.Punt;


public class Punten {
    Object[] puntenArray = new Object[]
            {
                    new Punt(3, 4),
                    new Punt(5, 12),
                    new Punt(7, 24),
                    new Punt(9, 40),
                    new Punt(11, 60),
                    new Punt(13, 84)
            };

    public Object getPuntenArray(int nummer) {
        return puntenArray[nummer];
    }
}


