public class Rodzinka {
    public static void main(String[] args) {

        Czlowiek syn1 = new Syn("czerwony", 1, "kolorowanie", false, "Piotrek");
        Czlowiek syn2 = new Syn("niebieski", 2, "skakanie", false, "Krzysiek");
        Czlowiek corka = new Corka("granatowy", 3, "skakanie", true, "Marysia");
        Pediatra pediatra = new Pediatra();
        // co robi rodzinka:
        syn1.turlanie();
        corka.turlanie();
        syn2.turlanie();


        if (pediatra.SprawdzZdrowie(syn1)) {
            System.out.println(syn1.getImie()+" ma infekcje");
            pediatra.wylecz(syn1);
            System.out.println("infekcja wyleczona");
            pediatra.dajNaklejke(syn1);
        }
        else System.out.println(syn1.getImie()+" jest zdrowy");

        if (pediatra.SprawdzZdrowie(syn2)) {
            System.out.println(syn2.getImie()+" ma infekcje");
            pediatra.wylecz(syn2);
            System.out.println("infekcja wyleczona");
            pediatra.dajNaklejke(syn2);
        }
        else System.out.println(syn2.getImie()+" jest zdrowy");

        if (pediatra.SprawdzZdrowie(corka)) {
            System.out.println( corka.getImie() +" ma infekcje");
            pediatra.wylecz(corka);
            System.out.println("infekcja wyleczona");
            pediatra.dajNaklejke(corka);
        }
        else System.out.println(corka.getImie()+ " jest zdrowa");

        syn1.zabawa();
        corka.zabawa();
        syn2.zabawa();
        System.out.println("Szczęśliwcy którzy mają naklejke to:");
        if (syn1.getUbranie().getNaklejka()) { System.out.println(syn1.getImie()); }
        if (syn2.getUbranie().getNaklejka()) { System.out.println(syn2.getImie()); }
        if (corka.getUbranie().getNaklejka()) { System.out.println(corka.getImie()); }

    }

}
