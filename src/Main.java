import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testNum = 0;

        //nastavi petlju
        while (true) {
            long faktorijel = 1;
            try {
                System.out.println("Upiši broj za koji želiš izračunati faktorijel: ");
                testNum = sc.nextInt();

                //provjeri je li negativan
                if (testNum < 0) {
                    throw new Exception("Broj ne smije biti negativan!");
                }
                for (int i = 1; i <= testNum; i++) {
                    faktorijel *= i;
                    //provjeri je li prevelik za long
                    if(faktorijel>Long.MAX_VALUE/i) {
                        throw new Exception("Faktorijel je prevelik za izračunati!");
                    }
                }
                System.out.println("Faktorijel broja " + testNum + " je " + faktorijel);
                //prekini while
                break;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Greška! Unos nije broj!");
            } catch (Exception e) {
                System.out.println("Greška! " + e.getMessage());
            }
        }

    }
}
