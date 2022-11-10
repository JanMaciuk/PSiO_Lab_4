public class Rodzinka {
    public static void main(String[] args) {

        Czlowiek syn = new Syn();
        Czlowiek corka = new Corka();
        Pediatra pediatra = new Pediatra();
        // co robi rodzinka:
        syn.turlanie();
        corka.turlanie();

        /* badamy czy dzieci mają raka mimo tego, że pediatra sprawdzi to przed leczeniem,
         zakładam, że tak postąpiłaby rodzinka, lepiej sprawdzić dwa razy niż niepotrzebnie leczyć,
         w każdym razie, nie jest to przeoczenie w kodzie */
        if (pediatra.badajRaka(syn)) {
            System.out.println("syn ma raka");
            pediatra.wylecz(syn);
            System.out.println("rak syna wyleczony");
            pediatra.DajNaklejke(syn);
        }
        else System.out.println("syn nie ma raka");
        if (pediatra.badajRaka(corka)) {
            System.out.println("córka ma raka");
            pediatra.wylecz(corka);
            System.out.println("rak córki wyleczony");
            pediatra.DajNaklejke(corka);
        }
        else System.out.println("córka nie ma raka");

        syn.zabawa();
        corka.zabawa();

    }
}
