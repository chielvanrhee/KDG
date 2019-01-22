package Weken.B_EnumDatumDebug.EnumTester;

public enum Color {
    BLACK(0x00_00_00),WHITE(0xff_ff_ff),RED(0xff_00_00),GREEN(0x00_ff_00),BLUE(0x00_00_ff),YELLOW(0xff_ff_00);

    private int rgb;
    // door de toevoeging van de constructor met een int als param kan je extra waarden meegeven (zoals rgb waarden)
    private Color(int rgb){
        this.rgb = rgb;
    }
    // deze extra waarden moet je wel ophalen dmv een getter, of via een Override van de toString methode
    public int getRgb(){
        return rgb;
    }
    @Override
    public String toString(){
        return String.format("Color = %s en de RGB waarde is %s",name(),rgb);
    }
}
