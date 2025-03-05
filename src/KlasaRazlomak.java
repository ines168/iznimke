public class KlasaRazlomak{
    int brojnik;
    int nazivnik;

    public KlasaRazlomak(int brojnik, int nazivnik) throws Exception {
        if(nazivnik == 0) {
            throw new Exception("Nazivnik ne može biti 0.");
        }
        this.brojnik = brojnik;
        this.nazivnik = nazivnik;
    }

    public static KlasaRazlomak zbroj(KlasaRazlomak razlomak1, KlasaRazlomak razlomak2) throws Exception {
        int brojnik = razlomak1.brojnik*razlomak2.nazivnik + razlomak2.brojnik*razlomak1.nazivnik;
        int nazivnik = razlomak1.nazivnik*razlomak2.nazivnik;
        return new KlasaRazlomak(brojnik, nazivnik);
    }

    public static KlasaRazlomak razlika(KlasaRazlomak razlomak1, KlasaRazlomak razlomak2) throws Exception {
        int brojnik = razlomak1.brojnik*razlomak2.nazivnik - razlomak2.brojnik*razlomak1.nazivnik;
        int nazivnik = razlomak1.nazivnik*razlomak2.nazivnik;
        return new KlasaRazlomak(brojnik, nazivnik);
    }

    public static KlasaRazlomak mnozenje(KlasaRazlomak razlomak1, KlasaRazlomak razlomak2) throws Exception {
        int brojnik = razlomak1.brojnik*razlomak2.brojnik;
        int nazivnik = razlomak1.nazivnik*razlomak2.nazivnik;
        return new KlasaRazlomak(brojnik, nazivnik);
    }

    public static KlasaRazlomak dijeljenje(KlasaRazlomak razlomak1, KlasaRazlomak razlomak2) throws Exception {
        int brojnik = razlomak1.brojnik*razlomak2.nazivnik;
        int nazivnik = razlomak1.nazivnik*razlomak2.brojnik;
        return new KlasaRazlomak(brojnik, nazivnik);
    }

    @Override
    public String toString() {
        return brojnik + "/" + nazivnik;
    }
}
