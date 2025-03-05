import java.util.Scanner;

public class RazlomakTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Unesi prvi razlomak (brojnik nazivnik):");
                KlasaRazlomak razlomak1 = kreirajRazlomak(sc.nextLine());

                System.out.println("Unesi drugi razlomak (brojnik nazivnik):");
                KlasaRazlomak razlomak2 = kreirajRazlomak(sc.nextLine());

                System.out.println("Zbroj: " + KlasaRazlomak.zbroj(razlomak1, razlomak2));
                System.out.println("Razlika: " + KlasaRazlomak.razlika(razlomak1, razlomak2));
                System.out.println("Umnožak: " + KlasaRazlomak.mnozenje(razlomak1, razlomak2));
                System.out.println("Kvocjent: " + KlasaRazlomak.dijeljenje(razlomak1, razlomak2));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Greška! Unos nisu brojevi!");
            } catch (Exception e) {
                System.out.println("Greška! " + e.getMessage());
            }
        }
    }

    //unos je string, splitamo ga po razmaku u dva člana polja: brojnik i nazivnik
    public static KlasaRazlomak kreirajRazlomak(String razlomak) throws Exception {
        String[] razlomakS = razlomak.split(" ");
        //provjeri ima li dva broja za brojnik i nazivnik
        if (razlomakS.length < 2) {
            throw new Exception("Unos nisu dva broja. Molim te unesi dva broja odvojena razmakom.");
        }
        int brojnik = Integer.parseInt(razlomakS[0]);
        int nazivnik = Integer.parseInt(razlomakS[1]);
        //provjeri nazivnik
        if (nazivnik == 0) {
            throw new Exception("Nazivnik ne može biti 0.");
        }
        return new KlasaRazlomak(brojnik, nazivnik);
    }

}

