public class Syn extends Czlowiek {
    private boolean infekcja;
    private Ubranko ubranie;

    // konstruktory
    public Syn() {
        super("zielony", 1, "kolorowanie","Piotrek");
        this.infekcja = false;
        this.ubranie = new Ubranko();
    }
    public Syn(String ulubionyKolor, int wiek, String ulubionaZabawa, boolean infekcja, String imie) {
        super(ulubionyKolor, wiek, ulubionaZabawa,imie);
        this.infekcja = infekcja;
        this.ubranie = new Ubranko(false, this.getUlubionyKolor());
    }


    // set i get
    public boolean getInfekcja() { return infekcja; }
    public void setInfekcja(boolean infekcja) { this.infekcja = infekcja; }
    public Ubranko getUbranie() { return ubranie; }

    public void zabawa() {
        System.out.println("ulubiona zabawa syna to " + this.getUlubionaZabawa());
    }
    public void turlanie() {
        if (this.getWiek() > 1) {
            System.out.println("Turu Turlu");
        }
        else {System.out.println(this.getImie()+ " jest za mały żeby się turlać");}
    }
}
