public class Dom implements Budynek {

        private String adres;
        private double powierzchnia;
        private int liczbaMieszkancow;
        private int liczbaOkien;
        private KolorEnum kolorDomu;

        public Dom(String adres, double powierzchnia, int liczbaMieszkancow, int liczbaOkien, KolorEnum kolorDomu) {
            this.adres = adres;
            this.powierzchnia = powierzchnia;
            this.liczbaMieszkancow = liczbaMieszkancow;
            this.liczbaOkien = liczbaOkien;
            this.kolorDomu = kolorDomu;
        }

        public Dom() {
        }


        public String getAdres() {
            return adres;
        }

        public double getPowierzchnia() {
            return powierzchnia;
        }

        public int getLiczbaMieszkancow() {
            return liczbaMieszkancow;
        }

        public int getLiczbaOkien() {
            return liczbaOkien;
        }

        public KolorEnum getKolorDomu() {
            return kolorDomu;
        }


        @Override
        public String adresBudynku(String adres) {
            this.adres = adres;
            return adres;
        }

        public double powierzchnia(double pow) {
            this.powierzchnia = pow;
            return pow;
        }

        public void liczbaMieszkancow(int value) {
            this.liczbaMieszkancow = value;
        }

        public int liczbaOkien(int value) {
            this.liczbaOkien = value;
            return value;
        }

        public void kolorDomu(KolorEnum kolor) {
            this.kolorDomu = kolor;
        }

        public double cena(double cena_za_m2) {

            return cena_za_m2 * powierzchnia;
        }


        public void podsumowanie(double cena_za_m2) {
            java.text.DecimalFormat df=new java.text.DecimalFormat("0.00");
            System.out.println("Dom{" +
                    "adres=" + adres + ",\n" +
                    "powierzchnia=" + powierzchnia + "m2" + ",\n" +
                    "liczbaMieszkancow=" + liczbaMieszkancow + ",\n" +
                    "liczbaOkien=" + liczbaOkien + ",\n" +
                    "kolorDomu=" + kolorDomu + "\n" +
                    "CenaZaDom=" + df.format(cena(cena_za_m2)) + "zł" +  ",\n" +'}');

        }

        @Override
        public String toString() {
            return "Dom{" +
                    "adres=" + adres + ",\n" +
                    "powierzchnia=" + powierzchnia + "m2" + ",\n" +
                    "liczbaMieszkancow=" + liczbaMieszkancow + ",\n" +
                    "liczbaOkien=" + liczbaOkien + ",\n" +
                    "kolorDomu=" + kolorDomu +
                    '}';
        }
    }
