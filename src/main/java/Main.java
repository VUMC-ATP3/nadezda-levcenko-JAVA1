public class Main {
    public static void main(String[] args) {
        int vecumsSuns = 3; // Veselais skaitlis
        String vardsSuns = "Reksis"; // Teksts
        double svarsSuns = 15.8; // Dailskaitlis
        double augstums = 60.456; // Daiļskaitlis
        boolean isHungry = true; // true = 1; false = 0
        boolean isBreedDog = false;
        char dzimumsSuns = 'M';
        char dzimumsKakis = 'F';

        System.out.println("Mans suns");
        System.out.println("Kaķa vārds: " + vardsSuns);
        System.out.println("Kaķa vecums: " + vecumsSuns);
        System.out.println("Kaķa dzimums: " +dzimumsKakis);
        System.out.println("Suņa svars: " +svarsSuns + " kg" + "\n");
        System.out.println("Vai mans suns ir izsalcis? " +isHungry);
        System.out.println("Suņa dzimums: " +dzimumsSuns);

        int vecumsKakis = 8;
        String vardsKakis = "Chanel";

        System.out.println("Mans kaķis");
        System.out.println("Vārds: " + vardsKakis);
        System.out.println("Vecums: " + vecumsKakis);
        System.out.println("Suņa un kaķa kopējais vecums: "+ (vecumsKakis+vecumsSuns));

        //(mainīgā tipa) (mainīgā nosaukums) = (vērtība)
        int gadaApgrozijumsDollaros = 2147483647;
        byte monthInYear = 12;
        short autoPrice = 12312;
        long netIncome = 2147483699L;
        System.out.println(gadaApgrozijumsDollaros + "\n" + monthInYear + "\n" + autoPrice + "\n" + netIncome);

        int summa;
        int starpiba;
        int reizinajums;
        double dalijums;
        int atlikums;

        int x = 5;
        int y = 10;
        double z = 5;
        double q = 10;
        double w = 12;

        summa = x + y;
        starpiba = x - y;
        reizinajums = x * y;
        dalijums = z / q;
        atlikums = 12%5;

        int skaitlis = 6542131;
        System.out.println("Ja atbilde ir 0, šis ir para skaitlis " + skaitlis%2);

        System.out.println("SUMMA: " +summa);
        System.out.println("STARPĪBA: " +starpiba);
        System.out.println("REIZĪNĀJUMS: " +reizinajums);
        System.out.println("DALĪJUMS: " + dalijums);
        System.out.println("ATLIKUMS: " + atlikums);

        char vaditajaApliecibasKategorija = 'A'; // Laba prakse
        char vaditajaapliecibaskategorija = 'B'; // Nav laba prakse
        System.out.println(vaditajaApliecibasKategorija);
    }

}
