package OOTechnieken.Week1.BoekOpdrachten.OpdrachtEen;

public enum Day {
    MONDAY(true),TUESDAY(true),WEDNESDAY(true),THURSDAY(true),FRIDAY(true),SATURDAY(false),SUNDAY(false);

    private boolean weekday;

    private Day(boolean weekday){
        this.weekday = weekday;

    }
    @Override
    public String toString(){
        return String.format("The day is %s and the weekdaystatus is %b",name(),weekday);
    }
}
