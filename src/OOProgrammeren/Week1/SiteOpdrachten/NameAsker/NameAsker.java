package Week1.NameAsker;

import java.util.Scanner;

public class NameAsker {
    public static void main(String[] Args) {

        //nameasker 5

//        String name;
//
//        Scanner keyboard = new Scanner(System.in);
//        System.out.println("whats your name? Fill it in below:");
//        name = keyboard.nextLine();
//        System.out.println("Welcome " + name +"!");
//
//        keyboard.close();

        //first and lastname asker

        String firstname;
        String lastname;

        Scanner keyboard2 = new Scanner(System.in);
        System.out.println("whats your first name? Fill it in below:");
        firstname = keyboard2.nextLine();
        System.out.println("whats your last name? Fill it in below:");
        lastname = keyboard2.nextLine();
        System.out.println("Welcome " + firstname + " " + lastname + "!");
        keyboard2.close();

    }
}
