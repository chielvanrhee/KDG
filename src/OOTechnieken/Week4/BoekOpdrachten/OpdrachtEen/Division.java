package OOTechnieken.Week4.BoekOpdrachten.OpdrachtEen;

import java.util.Scanner;

public class Division {
    public static void main(String[]args){
        try {
            Scanner keyboard = new Scanner(System.in);
            int num = Integer.parseInt(keyboard.next());
            int den = Integer.parseInt(keyboard.next());
            int div = num / den;
            System.out.printf("%d/%d = %d \n", num, den, div);
            keyboard.close();
            if (num == 2){
                throw new CustomException();
            }
        }
        catch (NumberFormatException e){
            System.out.println("that is uncalled for... " + e);
        }
        catch (ArithmeticException e){
            System.out.println("That is also uncalled for "+e.getMessage());
        }
        catch (CustomException e){
            System.out.println("Heel goed, dit is een custom exception");
        }


    }

}
