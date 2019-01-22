package Weken.B_EnumDatumDebug.Leden;

public class Leden {
    final int MAX_AANTAL = 100;
    private int aantal;
    private Lid[] leden = new Lid[MAX_AANTAL];

    public void voegLidToe(Lid lid){
        int ledenteller = size();
        leden[ledenteller] = lid;
    }
    public Lid getLid(int index){
        return leden[index];
    }
    public int size(){
        int ledenteller = 0;
        for (Lid x : leden){
            if(x != null) {
            ledenteller++;}
        }
        return ledenteller;
    }
}
