package Weken.B_EnumDatumDebug.Leden;
import static Weken.B_EnumDatumDebug.Leden.Soort.*;

public class TestLeden {
    public static void main(String[] args) {
        Leden leden = new Leden();
        leden.voegLidToe(new Lid("Jos", GEWOON));
        leden.voegLidToe(new Lid("Bart", ERELID));
        leden.voegLidToe(new Lid("Helmut", STEUNEND));
        leden.voegLidToe(new Lid("Marie", GEWOON));
        leden.voegLidToe(new Lid("Emma", GEWOON));
        leden.voegLidToe(new Lid("Hagar", ERELID));

        int activeLeden = 0;
        for (int teller = 0; teller < leden.size() ; teller++){
               if (leden.getLid(teller).getLidnummer()>1000){
                activeLeden++;}
                    }
        System.out.printf("Aantal actieve leden: %d \n",activeLeden);


        for (int teller = 0; teller < leden.size() ; teller++){
            if (leden.getLid(teller).getLidnummer()>1000){
                System.out.println(leden.getLid(teller));}
        }




    }
}

