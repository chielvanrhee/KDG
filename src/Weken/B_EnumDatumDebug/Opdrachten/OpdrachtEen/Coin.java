package Weken.B_EnumDatumDebug.Opdrachten.OpdrachtEen;

public enum Coin {
    ONE_CENT(1),TWO_CENT(2),FIVE_CENT(5),TEN_CENT(10),TWENTY_CENT(20),FIDDY_CENT(50),ONE_EURO(100),TWO_EURO(200);

    private int value;

    private Coin (int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

}
