package Weken.B_EnumDatumDebug.Leden;

public enum Soort {
    GEWOON,
    STEUNEND,
    ERELID;

    @Override
    public String toString(){
        return name().toLowerCase();
    }
}
