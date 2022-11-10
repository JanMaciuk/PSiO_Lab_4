public class Corka extends Czlowiek {
    private boolean rak;
    private Ubranko ubranie;

    // konstruktory
    public Corka() {
        super("niebieski", 1, "skakanie");
        this.rak = true;
        this.ubranie = new Ubranko();
    }
    public Corka(String ulubionyKolor, int wiek, String ulubionaZabawa, boolean rak) {
        super(ulubionyKolor, wiek, ulubionaZabawa);
        this.rak = rak;
        this.ubranie = new Ubranko();
    }


    // set i get
    public boolean getRak() { return rak; }
    public void setRak(boolean rak) { this.rak = rak; }
    public Ubranko getUbranie() { return ubranie; }

    public void zabawa() {
        System.out.println("ulubiona zabawa córki to " + this.getUlubionaZabawa());
    }
    public void turlanie() {
        System.out.println("Turu Turlu");
    }
}
