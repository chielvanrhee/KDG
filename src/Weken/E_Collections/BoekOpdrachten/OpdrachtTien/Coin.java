package Weken.E_Collections.BoekOpdrachten.OpdrachtTien;

public enum Coin {
    één_cent(1),
    twee_cent(2),
    vijf_cent(5),
    tien_cent(10),
    twintig_cent(20),
    vijftig_cent(50),
    euro(100),
    twee_euro(200);

    public int getWaarde() {
        return waarde;
    }

    private int waarde;
    private Coin(int waarde){
        this.waarde = waarde;
    }


}
