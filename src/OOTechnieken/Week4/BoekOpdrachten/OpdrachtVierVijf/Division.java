package OOTechnieken.Week4.BoekOpdrachten.OpdrachtVierVijf;

import java.util.Scanner;

public class Division {
    public static void main(String[]args) {
        Scanner keyboard = null;
        try {
            keyboard = new Scanner(System.in);
            int num = Integer.parseInt(keyboard.next());
            int den = Integer.parseInt(keyboard.next());
            int div = num / den;
            System.out.printf("%d/%d =  %d \n", num, den, div);

            if (num == 3) {
                throw new CustomException();
            }
        } catch (NumberFormatException | ArithmeticException nfe) {
            System.out.println("that is uncalled for... " + nfe);
        } catch (RuntimeException re) {
            re.getMessage();
        } catch (CustomException e) {
            System.out.println("Heel goed, dit is een custom exception");
        } finally {
            keyboard.close();
            System.out.println("keyboard closed, finally block executed");
        }


    }

}
