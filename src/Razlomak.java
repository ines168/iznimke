import java.util.Scanner;

public class Razlomak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String razlomak1;
        String razlomak2;
        while(true) {
            try{
                System.out.println("Unesi prvi razlomak (brojnik nazivnik):");
                razlomak1 = sc.nextLine();
                int[] razlomak1P = razlomak(razlomak1);

                System.out.println("Unesi drugi razlomak (brojnik nazivnik):");
                razlomak2 = sc.nextLine();
                int[] razlomak2P = razlomak(razlomak2);

                zbroj(razlomak1P, razlomak2P);
                razlika(razlomak1P, razlomak2P);
                mnozenje(razlomak1P, razlomak2P);
                dijeljenje(razlomak1P, razlomak2P);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Greška! Unos nisu brojevi!");
            } catch (Exception e) {
                System.out.println("Greška! " + e.getMessage());
            }
        }
    }

    public static int[] razlomak(String razlomak) throws Exception {
        String[] razlomakS = razlomak.split(" ");
        if(razlomakS.length<2) {
            throw new Exception("Unos nisu dva broja. Molim te unesi dva broja odvojena razmakom.");
        }
        int brojnik = Integer.parseInt(razlomakS[0]);
        int nazivnik = Integer.parseInt(razlomakS[1]);
        if(nazivnik==0) {
            throw new Exception("Nazivnik ne može biti 0.");
        }
        return new int[]{brojnik, nazivnik};
    }

    public static void zbroj(int [] razlomak1, int[] razlomak2) {
        int brojnikZbroj = razlomak1[0]*razlomak2[1] + razlomak2[0]*razlomak1[1];
        int nazivnikZbroj = razlomak1[1]*razlomak2[1];
        System.out.println("Zbroj: " + brojnikZbroj + "/" + nazivnikZbroj);
    }

    public static void razlika(int [] razlomak1, int[] razlomak2) {
        int brojnikRazlika = razlomak1[0]*razlomak2[1] - razlomak2[0]*razlomak1[1];
        int nazivnikRazlika = razlomak1[1]*razlomak2[1];
        System.out.println("Razlika: " + brojnikRazlika + "/" + nazivnikRazlika);
    }

    public static void mnozenje(int [] razlomak1, int[] razlomak2) {
        int brojnikMnozenje = razlomak1[0]*razlomak2[0];
        int nazivnikMnozenje = razlomak1[1]*razlomak2[1];
        System.out.println("Umnožak: " + brojnikMnozenje + "/" + nazivnikMnozenje);
    }

    public static void dijeljenje(int [] razlomak1, int[] razlomak2) {
        int brojnikDijeljenje = razlomak1[0]*razlomak2[1];
        int nazivnikDijeljenje = razlomak1[1]*razlomak2[0];
        System.out.println("Kvocjent : " + brojnikDijeljenje + "/" + nazivnikDijeljenje);
    }
}
