public class Syn extends Czlowiek {
    private boolean rak;
    private Ubranko ubranie;

    // konstruktory
    public Syn() {
        super("zielony", 1, "kolorowanie");
        this.rak = false;
        this.ubranie = new Ubranko();
    }
    public Syn(String ulubionyKolor, int wiek, String ulubionaZabawa, boolean rak) {
        super(ulubionyKolor, wiek, ulubionaZabawa);
        this.rak = rak;
        this.ubranie = new Ubranko(false, this.getUlubionyKolor());
    }


    // set i get
    public boolean getRak() { return rak; }
    public void setRak(boolean rak) { this.rak = rak; }
    public Ubranko getUbranie() { return ubranie; }

    public void zabawa() {
        System.out.println("ulubiona zabawa syna to " + this.getUlubionaZabawa());
    }
    public void turlanie() {
        System.out.println("ałć, syn wturlał się w szafkę");
    }
}
