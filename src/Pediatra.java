public class Pediatra {
    // tak wiem, że pediatra i rak to trochę dziwnie, jest to pediatra-onkolog
    public boolean badajRaka(Czlowiek pacjent) {
        return pacjent.getRak();
    }
    public void wylecz(Czlowiek pacjent) { // tylko false, bo nie damy raka pacjentowi
        if (pacjent.getRak()) { // tylko, jeśli pacjent ma raka
            pacjent.setRak(false);
        }
    }
    public void dajNaklejke(Czlowiek pacjent) { // dajemy naklejkę "dzielny pacjent"
        (pacjent.getUbranie()).setNaklejka(true);
    }
}
