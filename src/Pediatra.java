public class Pediatra {

    public boolean SprawdzZdrowie(Czlowiek pacjent) {
        return pacjent.getInfekcja();
    }
    public void wylecz(Czlowiek pacjent) { // tylko false, bo nie damy choroby pacjentowi
        if (pacjent.getInfekcja()) {
            pacjent.setInfekcja(false);
        }
    }
    public void dajNaklejke(Czlowiek pacjent) { // dajemy naklejkę "dzielny pacjent"
        (pacjent.getUbranie()).setNaklejka(true);
    }
}
