public interface Budynek {

        String adresBudynku(String adres);
        double powierzchnia(double pow);
        void liczbaMieszkancow(int value);
        int liczbaOkien(int value);
        void kolorDomu(KolorEnum kolor);
        String toString();

}
