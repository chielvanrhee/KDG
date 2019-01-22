package Week5.DAB_Radio;

public class DAB_RadioDemo {
    public static void main(String[] args) {
        String response;
        DABRadio radio = new DABRadio();
        response = radio.getResponse();
        System.out.println(response);
        radio.aan();
        response = radio.getResponse();
        System.out.println(response);
        radio.setZender(10);
        response = radio.getResponse();
        System.out.println(response);
        radio.setZender(0);
        response = radio.getResponse();
        System.out.println(response);
        radio.setZender(5);
        response = radio.getResponse();
        System.out.println(response);
        radio.uit();
        System.out.println("De radio is "
                + (radio.getStatus() ? "aan" : "uit"));
    }
}

