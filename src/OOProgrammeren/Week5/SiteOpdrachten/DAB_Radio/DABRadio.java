package Week5.DAB_Radio;

public class DABRadio {

    private final String[] zenderNamen = new String[]{
            "Radio 1", "Radio 2", "Klara", "Stu Bru", "MNM",
            "Continue", "Sporza", "Nieuws+", "MNM Hits"
    };
    //att
    private boolean status;
    private int zenderNummer = 1;

    //meth

    public void aan() {
        status = true;
    }

    public void uit() {
        status = false;
    }

    public String getResponse() {
        if (status == true) {
            if (zenderNummer >= 1 && zenderNummer <= 9) {
                return zenderNamen[zenderNummer - 1];
            } else {
                return "ongeldig zendernummer";
            }
        } else {
            return "hij staat niet aan gek";
        }
    }

    public boolean getStatus() {
        return status;
    }

    public void setZender(int zenderNummer) {
        this.zenderNummer = zenderNummer;
    }
}


