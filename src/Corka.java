public class Corka extends Czlowiek {
    private boolean rak;
    public Corka() {
        super("niebieski", 1, "skakanie");
        this.rak = false;
    }
    public Corka(String ulubionyKolor, int wiek, String ulubionaZabawa, boolean rak) {
        super(ulubionyKolor, wiek, ulubionaZabawa);
        this.rak = rak;
    }
    // set i get
    public boolean getRak() { return rak; }
    public void setRak(boolean rak) { this.rak = rak; }


    public void turlanie() {
        System.out.println("Turu Turlu");
    }
}
